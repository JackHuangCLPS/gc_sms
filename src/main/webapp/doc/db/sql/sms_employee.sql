/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : clps_sms

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-11-08 09:57:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sms_employee
-- ----------------------------
DROP TABLE IF EXISTS `sms_employee`;
CREATE TABLE `sms_employee` (
  `em_id` varchar(50) NOT NULL COMMENT '主键id',
  `em_name` varchar(50) NOT NULL COMMENT '职员姓名',
  `em_sex` varchar(50) NOT NULL COMMENT '职员性别',
  `em_age` varchar(50) NOT NULL COMMENT '职员年龄',
  `em_role` varchar(50) NOT NULL COMMENT '职员角色',
  `em_departmentId` varchar(50) NOT NULL COMMENT '部门id',
  `em_startime` varchar(50) NOT NULL COMMENT '入职时间',
  `em_positionid` varchar(50) NOT NULL COMMENT '员工职位',
  `em_levelid` varchar(50) NOT NULL COMMENT '员工级别',
  `em_address` varchar(50) NOT NULL COMMENT '员工地址',
  `em_phone` varchar(50) NOT NULL COMMENT '员工电话',
  `em_del` varchar(50) NOT NULL COMMENT '员工状态',
  PRIMARY KEY (`em_id`),
  KEY `em_departmentId` (`em_departmentId`),
  CONSTRAINT `em_departmentId` FOREIGN KEY (`em_departmentId`) REFERENCES `sms_department` (`dt_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sms_employee
-- ----------------------------
