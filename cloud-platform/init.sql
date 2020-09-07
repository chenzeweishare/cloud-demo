
CREATE TABLE `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(255) DEFAULT NULL,
  `commodity_code` varchar(255) DEFAULT NULL COMMENT '商品code',
  `count` int(11) DEFAULT '0' COMMENT '购买数量',
  `money` int(11) DEFAULT '0' COMMENT '购买金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;


INSERT INTO `tx-order`.`order`(`id`, `user_id`, `commodity_code`, `count`, `money`) VALUES (1, '1000', '9999', 1, 1);
INSERT INTO `tx-order`.`order`(`id`, `user_id`, `commodity_code`, `count`, `money`) VALUES (3, '1000', '9999', 1, 1);
INSERT INTO `tx-order`.`order`(`id`, `user_id`, `commodity_code`, `count`, `money`) VALUES (5, '1000', '9999', 1, 1);
INSERT INTO `tx-order`.`order`(`id`, `user_id`, `commodity_code`, `count`, `money`) VALUES (7, '1000', '9999', 1, 1);
INSERT INTO `tx-order`.`order`(`id`, `user_id`, `commodity_code`, `count`, `money`) VALUES (9, '1000', '9999', 1, 1);



CREATE TABLE `storage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `commodity_code` varchar(255) DEFAULT NULL COMMENT '商品code',
  `count` int(11) DEFAULT '0' COMMENT '商品总数量',
  PRIMARY KEY (`id`),
  UNIQUE KEY `commodity_code` (`commodity_code`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `tx-storage`.`storage`(`id`, `commodity_code`, `count`) VALUES (1, '9999', 95);

CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(255) DEFAULT NULL COMMENT '用户id',
  `money` int(11) DEFAULT '0' COMMENT '总金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `tx-account`.`account`(`id`, `user_id`, `money`) VALUES (1, '1000', 95);
