DELIMITER //
create procedure abc(IN VID CHAR(10),IN VNAME VARCHAR(20),IN AGE INT(10),IN CITY VARCHAR(20))
begin
declare msg varchar(20);
if age>=18 then
insert into VOTER (VID,VNAME,AGE,ADDR)values(VID,VNAME,AGE,CITY);
set msg="row inserted";
else
set msg="voter not eligible";
end if;
select msg;
end //

DELIMITER ;
