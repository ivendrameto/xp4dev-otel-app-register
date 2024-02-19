CREATE SEQUENCE client_id
    START WITH 1
    INCREMENT BY 1;

-- Table: cars
CREATE TABLE clients
(
    client_id INT NOT NULL,

    name VARCHAR(200) NOT NULL,
    document VARCHAR(50) NOT NULL,

    active boolean default true,
    create_date_time timestamp with time zone,
    update_date_time timestamp with time zone,

    CONSTRAINT clients_pkey PRIMARY KEY (client_id)
);
