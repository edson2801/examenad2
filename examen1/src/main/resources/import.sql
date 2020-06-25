/* Populate tabla clientes */

INSERT INTO regiones (id, nombre) VALUES (1, 'Africa');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamérica');

INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(1, 'eda', 'guz', 'jedaguz@gmail.com', '2020-06-13');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(2, 'lili', 'guz', 'liliguz@gmail.com', '2020-06-13');


/* Creamos algunos usuarios con sus roles */
INSERT INTO `usuarios` (username, password, enabled, nombreusu, apellidousu, email) VALUES ('david','$2a$10$C3Uln5uqnzx/GswAGURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq',1, 'david', 'rey','davisrey@gmail.com');
INSERT INTO `usuarios` (username, password, enabled, nombreusu, apellidousu, email) VALUES ('reyna','$2a$10$RmdEsvEfhI4Rcm9f/uZXPebZVCcPC5ZXZwV51efAvMAp1rIaRAfPK',1, 'reyna', 'rey','reynarey@gmail.com');

INSERT INTO `roles` (nombrerol) VALUES ('ROL_USER');
INSERT INTO `roles` (nombre) VALUES ('ROL_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, rol_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, rol_id) VALUES (2, 2);