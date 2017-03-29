CREATE TABLE `msa_sample` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL,
  `name` varchar(50) COLLATE utf8_bin NOT NULL,
  `description` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `creatorId` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `dateCreated` date DEFAULT NULL,
  `modifierId` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `dateModified` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='实例代码表';