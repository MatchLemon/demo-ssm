CREATE TABLE `user` (
  `userId` int(11) primary key NOT NULL auto_increment,
  `username` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;