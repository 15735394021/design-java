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

 Date: 20/03/2020 19:45:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for prop
-- ----------------------------
DROP TABLE IF EXISTS `prop`;
CREATE TABLE `prop`  (
  `prop_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_croatian_ci NOT NULL COMMENT '药品id',
  `prop_type_id` varchar(10) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL COMMENT '药品的类别id，用来和前端的药品图片一一对应',
  `prop_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL COMMENT '药品名称',
  `hp_reply` varchar(10) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL COMMENT '生命值回复量',
  `mp_reply` varchar(10) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL COMMENT '魔法值回复量',
  PRIMARY KEY (`prop_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_croatian_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
