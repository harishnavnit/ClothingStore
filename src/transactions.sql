SELECT * FROM transactions;

CREATE TABLE transactions (
    b_name          varchar(15),
    u_name          varchar(15),
    c_num           varchar(15)     PRIMARY KEY,
    cv_num          varchar(15)
);

INSERT INTO transactions VALUES ('Axis', 'Harish', '12345', '98765')
INSERT INTO transactions VALUES ('Union', 'test', '1234', '1234')
