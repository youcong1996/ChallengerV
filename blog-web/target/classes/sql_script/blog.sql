/*
SQLyog Ultimate v8.32 
MySQL - 5.7.20-log : Database - blog_test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`blog_test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `blog_test`;

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `comment_id` int(8) NOT NULL AUTO_INCREMENT COMMENT '评论ID',
  `comment_content` varchar(500) NOT NULL COMMENT '评论内容',
  `post_id` int(8) NOT NULL COMMENT '评论文章',
  `user_id` int(8) NOT NULL COMMENT '评论人ID(用户ID)',
  `create_time` datetime NOT NULL COMMENT '评论创建时间',
  `update_time` datetime NOT NULL COMMENT '评论更新时间',
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comment` */

/*Table structure for table `post` */

DROP TABLE IF EXISTS `post`;

CREATE TABLE `post` (
  `post_id` int(8) NOT NULL AUTO_INCREMENT COMMENT '文章ID',
  `user_id` int(8) NOT NULL COMMENT '用户ID',
  `title` varchar(20) NOT NULL COMMENT '文章标题',
  `content` text NOT NULL COMMENT '文章内容',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  `post_status` int(2) NOT NULL DEFAULT '1' COMMENT '文章状态 0:未发布 1:已发布 2:放入回收站 3:删除',
  PRIMARY KEY (`post_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `post` */

/*Table structure for table `tag` */

DROP TABLE IF EXISTS `tag`;

CREATE TABLE `tag` (
  `tag_id` int(8) NOT NULL AUTO_INCREMENT COMMENT '标签ID',
  `tag_name` varchar(20) NOT NULL COMMENT '标签名字',
  `user_id` int(8) NOT NULL COMMENT '用户ID',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tag` */

/*Table structure for table `type` */

DROP TABLE IF EXISTS `type`;

CREATE TABLE `type` (
  `type_id` int(8) NOT NULL AUTO_INCREMENT COMMENT '类型ID',
  `type_name` varchar(20) NOT NULL COMMENT '类型名字',
  `user_id` int(8) NOT NULL COMMENT '用户ID',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `type` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(8) NOT NULL AUTO_INCREMENT COMMENT '用户主键',
  `login_code` varchar(20) NOT NULL COMMENT '用户编码(登录账户) 手机号 邮箱号',
  `user_name` varchar(20) NOT NULL COMMENT '用户名',
  `password` varchar(40) NOT NULL COMMENT '密码',
  `sex` int(2) NOT NULL COMMENT '性别',
  `identity_card` varchar(20) DEFAULT NULL COMMENT '身份证',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `create_by` varchar(10) NOT NULL COMMENT '创建人',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  `update_by` varchar(10) NOT NULL COMMENT '更新人',
  `status` int(2) NOT NULL DEFAULT '0' COMMENT '状态:0注册新用户 1邮件认证用户 2管理员 3黑名单',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
