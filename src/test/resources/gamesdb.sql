CREATE TABLE `games` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `numberOfPlayers` int(11) NOT NULL,
  `playingTime` int(11) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `game_evaluations` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `evaluatedBy` varchar(255) DEFAULT NULL,
  `motivation` varchar(255)  DEFAULT NULL,
  `score` int(11) NOT NULL,
  `timestamp` datetime DEFAULT NULL,
  `game_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_game_id` FOREIGN KEY (`game_id`) REFERENCES `games` (`id`)
);
