package be.pxl.ja2.game.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.h2.tools.Server;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.SQLException;
import java.time.LocalDateTime;

@WebListener
public class EntityManagerUtil implements ServletContextListener {
    private static final Logger LOGGER = LogManager.getLogger(be.pxl.ja2.game.util.EntityManagerUtil.class);

    private static EntityManagerFactory emf;
    private final String[] args = new String[] {
            "-tcpPort", "9092",
            "-tcpAllowOthers" };
    private static Server server;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        emf = Persistence.createEntityManagerFactory("games_pu");
        LOGGER.debug("*** Persistence started at " + LocalDateTime.now());
        try {
            server = Server.createTcpServer(args).start();
        } catch (SQLException e) {
            LOGGER.error("Could not create server", e);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        if (emf != null) {
            emf.close();
            LOGGER.error("*** Persistence finished at " + LocalDateTime.now());
        }
        if (server != null) {
            server.stop();
        }

    }

    public static EntityManager createEntityManager() {
        if (emf != null) {
            return emf.createEntityManager();
        }
        return null;
    }


}
