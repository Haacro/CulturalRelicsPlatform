DROP TABLE IF EXISTS `users_manage`;
CREATE TABLE users_manage (
  id INT NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  name VARCHAR(255) COMMENT '用户姓名', 
  username VARCHAR(255) COMMENT '用户登录名', 
  password VARCHAR(255) COMMENT '用户登录密码', 
  email VARCHAR(255) COMMENT '用户电子邮箱', 
  phone VARCHAR(255) COMMENT '用户手机号码', 
  created_at DATETIME COMMENT '用户创建时间', 
  last_login_at DATETIME COMMENT '用户上次登录时间', 
  status INT COMMENT '用户状态（例如：启用/禁用）' ,
  PRIMARY KEY (`id`) USING BTREE
);