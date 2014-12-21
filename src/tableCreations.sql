/* Create a table for managing the customer information */
create table customer (
	c_id	 	varchar(10)	PRIMARY KEY,
	c_name		varchar(15),
	c_address	varchar(20),
	c_age		integer,
	c_contactNumber	integer
)

/* Insert values into customer table */
update customer set c_id = '12051' where c_age = 19
insert into customer values ('12051', 'Harish Navnit', 'Pune, Maharashtra', 19, 252352)
insert into customer values ('12047', 'Tony Thomas', 'Calicut, Kerala', 20, 452532)
insert into customer values ('12023', 'Karthikeyan J', 'Amritapuri', 21, 4524532)

/* View the contents of the table customer */
select * from customer

/* Create a table for managing infromation about stores */
create table stores (
	s_id 		integer		PRIMARY KEY,
	s_name		varchar(15),
	s_address	varchar(20),
	s_manager	varchar(15),
	s_contactNo	integer
)

/* Inserting values into stores */
insert into stores values (001, 'Sunny Sports', 'Pune, Maharashtra', 'Sunil Gavaskar', 341321412)
insert into stores values (002, 'Peter England', 'Palam, Delhi', 'Peter John', 24534235)
insert into stores values (003, 'Lotus Clothing', 'Colaba, Mumbai', 'Mithun Bhaskar', 3542642)

/* View the table after insertions */
select * from stores 

/* Creating a table for cloth */
create table cloth(
	store_id		integer		references 	stores,
	cloth_id		integer		PRIMARY KEY,
	cloth_type		varchar(15),
	cloth_color		varchar(15),
	cloth_size		varchar(5),
	cloth_price		integer
)

/* Inserting values into table cloth */
insert into cloth values (1, 3432,'Sports Wear', 'Red/White', 'XL', 699)
insert into cloth values (2, 52532, 'Formal Wear', 'Black/White', 'L', 1099)

/* View the content of the table */
select * from cloth

/* Creating a table for the purchase history of a customer from a store */
create table purchase_history (
	customer_id		varchar(10)		references  	customer,
	store_id		integer			references 	stores
)
