create database db_redeSocial;
use db_redeSocial;

create table tb_usuarios(
id bigint auto_increment,
nome_completo varchar (255) not null, -- not null pois estes campos são essenciais e não pode ser vazio
email varchar (255) not null,         -- not null pois estes campos são essenciais e não pode ser vazio
nome_usuario varchar (255) not null,  -- not null pois estes campos são essenciais e não pode ser vazio
senha varchar (255) not null,         -- not null pois estes campos são essenciais e não pode ser vazio
profissional_saude_id bigint,         -- criação do atributo profissonal da saude para criar a foreign key
primary key (id),
foreign key (profissional_saude_id) references tb_usuarios (id)
);


-- Aqui vai os inserts


create table tb_postagem(
id bigint auto_increment,
conteudo_postagem text, -- usou text pois a postagem será muito grande
criado_em datetime,
atualizado_em datetime,
emergencia boolean, 
tema_postagem bigint, -- criação do atributo da foreign key que liga tb_postagem com tb_tema 
usuario_postagem bigint, -- criação do atributo da foreign key que liga tb_postagem com tb_usuario 
primary key (id),
foreign key (tema_postagem) references tb_tema (id), -- Esta foreign key referencia a tabela postagem com a tb tema pelo (id)
foreign key (usuario_postagem) references tb_usuarios (id) -- Esta foreign key referencia a tb postagem com a tb usuario  pelo (id)
);


-- Aqui vai os inserts


create table tb_tema(
id bigint auto_increment,
nome_postagem varchar(500),
descricao_tema varchar(255),
palavras_chave varchar(255),
primary key (id) 
);


-- Aqui vai os inserts