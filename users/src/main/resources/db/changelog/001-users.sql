CREATE TABLE public."user_info"
(
    id bigint NOT NULL,
    username varchar(255) NOT NULL,
    passwordhash varchar(255) NOT NULL,
    role varchar(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE SEQUENCE public.users_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

ALTER TABLE public.users_id_seq OWNER TO postgres;
ALTER SEQUENCE public.users_id_seq OWNED BY public.user_info.id;
ALTER TABLE ONLY public.user_info ALTER COLUMN id SET DEFAULT nextval('public.users_id_seq'::regclass);
SELECT pg_catalog.setval('public.users_id_seq', 1, false);

insert into public."user_info"(id, username, passwordhash, role) values (nextval('public.users_id_seq'), 'admin', '$2a$10$LeoOqGsAv8wOMEE2XYWJiueXRkvBtTfq2lxE/vuGFfQKLVP8aytca', 'ADMIN');
