INSERT INTO users (user_id,username,password,email,enabled) VALUES (1001,'user','$2a$10$859.xbwxuCv66VDGMGJ3COPkdMryYI0bmDLht5L44uKkagBSeetIu','user@example.com',true);
INSERT INTO users (user_id,username,password,email,enabled) VALUES (1002,'thomas','$2a$10$k.VqsRE2kLznTfTPVLE79u/Dl7exm3KndE1Pf0ECD/6w4hGA/Ueca','thomas@example.com',true);
INSERT INTO users (user_id,username,password,email,enabled) VALUES (1003,'admin','$2a$10$LnvMkWIe2SF6S0VmZRX8V.4ztCHmxHKPs511tAlN9jesg4duqUOBK','admin@example.com',true);
INSERT INTO authorities (id,username,authority) values (101,'user','USER');
INSERT INTO authorities (id,username,authority)  values (102,'admin','ADMIN');
INSERT INTO authorities  (id,username,authority) values (103,'thomas','ADMIN');