CREATE DATABASE  IF NOT EXISTS `movie-tickets-db`;
USE `movie-tickets-db`;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `movies`;

CREATE TABLE `movies` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `imageUrl` varchar(200) DEFAULT NULL,
  `tag` varchar(45) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `releaseDate` varchar(45) DEFAULT NULL,
   `runtime` int(10) NOT NULL ,
   `interested` int(10) NOT NULL,
   `runtime` FLOAT(10) NOT NULL

  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

