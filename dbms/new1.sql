DELIMITER $$
create procedure new1(csname varchar(20))
begin
select VOTES from CONST where  csname=CNAME;
end$$

