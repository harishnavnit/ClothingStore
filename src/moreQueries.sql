select * from stores 
select * from customer
select * from cloth

/* Create table to store the purchase history */
create table purchase_history (
	from_store_id		integer		references stores,
	by_customer_id		varchar(10)	references customer
)

select * from purchase_history 

/* Select name and store_id from stores table */
select s_id, s_name from stores

/* Select cloth_type and cloth_price from cloth table */
select cloth_type, cloth_price from cloth