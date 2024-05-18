DROP TABLE IF EXISTS `user_permissions`;
CREATE TABLE user_permissions (
	id INT NOT NULL AUTO_INCREMENT COMMENT '记录唯一标识',
    user_id INT DEFAULT NULL COMMENT '用户名' ,
    login_permission BOOLEAN DEFAULT TRUE COMMENT '登录权限',
    like_permission BOOLEAN DEFAULT TRUE COMMENT '点赞权限',
    comment_permission BOOLEAN DEFAULT TRUE COMMENT '评论权限',
    `del` INT NULL DEFAULT 0 COMMENT '逻辑删除（数据恢复）',
	PRIMARY KEY (`id`) USING BTREE
);

