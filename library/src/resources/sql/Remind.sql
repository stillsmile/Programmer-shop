-- auto Generated on 2020-07-20
-- DROP TABLE IF EXISTS remind;
CREATE TABLE remind(
	id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	`uid` INT (11) NOT NULL DEFAULT -1 COMMENT 'uid',
	bid INT (11) NOT NULL DEFAULT -1 COMMENT 'bid',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'remind';
