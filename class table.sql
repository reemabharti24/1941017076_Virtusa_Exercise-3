CREATE TABLE `class` (
  `class_id` int(11) NOT NULL AUTO_INCREMENT,
  `class_name` varchar(255) NOT NULL,
  `class_code` varchar(255) NOT NULL,
  `class_description` text NOT NULL,
  `class_size` int(11) NOT NULL,
  `class_room` varchar(255) NOT NULL,
  `class_time` time NOT NULL,
  `class_date` date NOT NULL,
  PRIMARY KEY (`class_id`)
)
