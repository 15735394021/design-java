/*
 Navicat Premium Data Transfer

 Source Server         : 个人服务器2
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : 47.104.80.127:3306
 Source Schema         : design

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 20/03/2020 11:09:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for userid_archivesid
-- ----------------------------
DROP TABLE IF EXISTS `userid_archivesid`;
CREATE TABLE `userid_archivesid`  (
  `user_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_croatian_ci NOT NULL COMMENT 'user表的user_id字段',
  `archives_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_croatian_ci NOT NULL COMMENT 'archives表的archives_id字段',
  `dr` varchar(1) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL COMMENT '该档案是否禁用 0：正常 ；1：禁用',
  PRIMARY KEY (`user_id`, `archives_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_croatian_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
