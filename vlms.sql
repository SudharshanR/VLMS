CREATE TABLE `user` (

  `userid` int(11) NOT NULL auto_increment,

  `email` varchar(45) NOT NULL,

  `password` varchar(45) NOT NULL,

  `firstname` varchar(45) NOT NULL,

  `lastname` varchar(45) NOT NULL,

  `address` varchar(45) NOT NULL,

  `city` varchar(45) NOT NULL,

  `state` varchar(45) NOT NULL,

  `zipcode` varchar(45) NOT NULL,

  `membertype` varchar(45) NOT NULL,

  `membershipnumber` varchar(45) DEFAULT NULL,

  `subscriptionfee` varchar(45) DEFAULT NULL,

  `balance` varchar(45) DEFAULT NULL,

  PRIMARY KEY (`userid`)
);

CREATE TABLE  transaction (
  `transactionID` int(10) unsigned NOT NULL auto_increment,
  `userID` int(11) unsigned NOT NULL default '0',
  `movieID` int(10) unsigned NOT NULL default '0',
  `issueDate` varchar(45) NOT NULL default '',
  `returndate` varchar(45) NOT NULL default '0',
  PRIMARY KEY  (`transactionID`),
  KEY `FK_transaction_1` (`movieID`),
  CONSTRAINT `FK_transaction_1` FOREIGN KEY (`movieID`) REFERENCES `movie` (`id`)
)


CREATE TABLE  `vlms`.`movie` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL default '',
  `production` varchar(45) NOT NULL default '',
  `releaseDate` varchar(45) NOT NULL default '',
  `rentAmount` float NOT NULL default '0',
  `category` varchar(45) NOT NULL default '',
  `availableCopies` int(10) unsigned NOT NULL default '0',
  PRIMARY KEY  (`id`)
)