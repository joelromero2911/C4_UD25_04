DROP table IF EXISTS peliculas;
DROP table IF EXISTS salas;

create table peliculas(
    codigo int auto_increment,
    nombre varchar(100),
    calificacion_edad int,
    primary key (codigo)
);

create table salas(
    codigo int auto_increment,
    nombre varchar(100),
    pelicula int,
    primary key (codigo),
    constraint salas_fk foreign key (pelicula) references peliculas(codigo)
    on update cascade on delete set null
);

insert into peliculas (nombre, calificacion_edad)values('Marvel', 18);
insert into peliculas (nombre, calificacion_edad)values('DC', 18);
insert into peliculas (nombre, calificacion_edad)values('Peli1', 18);
insert into peliculas (nombre, calificacion_edad)values('Peli2', 18);
insert into peliculas (nombre, calificacion_edad)values('Peli3', 18);

insert into salas (nombre, pelicula)values('A1', 1);
insert into salas (nombre, pelicula)values('A2', 2);
insert into salas (nombre, pelicula)values('A3', 3);
insert into salas (nombre, pelicula)values('A4', 4);
insert into salas (nombre, pelicula)values('A5', 5);