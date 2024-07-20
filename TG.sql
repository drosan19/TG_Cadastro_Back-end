drop schema if exists spring;

drop user if exists 'user'@'localhost';

create schema spring;

create user 'user'@'localhost' identified by 'pass123';

grant select, insert, delete, update on spring.* to user@'localhost';

use spring;

create table tg_cadastro (
 tg_id BIGINT PRIMARY KEY AUTO_INCREMENT,
 tg_aluno varchar(100) not null,
 tg_orientador varchar(200),
 tg_nota float,
 tg_data_hora_apresentacao datetime not null
);

INSERT INTO tg_cadastro (tg_id, tg_aluno, tg_orientador, tg_nota, tg_data_hora_apresentacao)
VALUES
  (1,'Sandro de Araújo', 'Masanori', 6.5, '2024-03-15 10:00:00'),
  (2,'Nikolas Luiz', 'Mineda', 7.5, '2024-03-15 10:30:00'),
  (3,'Fernando Souza', 'Arakaki', 0, '2024-03-15 11:00:00');
