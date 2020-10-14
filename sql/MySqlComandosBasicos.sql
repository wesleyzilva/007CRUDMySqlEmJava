CREATE DATABASE bancoCasamento;
use bancoCasamento;
grant all privileges on bancoCasamento.* to root@localhost;

CREATE TABLE pessoas(
   nome varchar (50) null,
   dataNascimento date null,
   sexo varchar (1),
   estadoCivil varchar (1)
);

drop table pessoas;
select * from pessoas;

insert into pessoas values ("Daiana Ferraz", "1981-04-10", "F", "C");
insert into pessoas values ("Wesley Silva", "1984-01-18", "M", "C");
insert into pessoas values ("Heitor Ferraz", "2013-07-19", "M", "S");
insert into pessoas values ("Samuel Silva", "2015-07-20", "M", "S");