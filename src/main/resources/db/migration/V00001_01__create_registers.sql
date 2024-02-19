CREATE SEQUENCE register_id
    START WITH 1
    INCREMENT BY 1;

-- Table: cars
CREATE TABLE registers
(
    register_id INT NOT NULL,

    client_id INT,
    car_id INT,

    register_date_time timestamp with time zone,

    CONSTRAINT registers_pkey PRIMARY KEY (register_id)
);
