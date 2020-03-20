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

 Date: 20/03/2020 11:11:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '用于和存档记录表联查',
  `user_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL COMMENT '微信用户的userid',
  `user_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL COMMENT '用户的游戏名称',
  `age` int(0) NULL DEFAULT NULL COMMENT '年龄',
  `sex` varchar(1) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL COMMENT '性别 0：女；1：男',
  `qq` varchar(20) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL COMMENT 'QQ',
  `email` varchar(20) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL COMMENT '邮箱',
  `ts` time(0) NULL DEFAULT NULL COMMENT '初次登录的时间',
  `dr` varchar(1) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL COMMENT '是否禁用 0：正常 ；1：禁用',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_croatian_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
