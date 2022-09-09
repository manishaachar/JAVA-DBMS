DELIMITER $$
create trigger new1
after insert on VOTER for each row
begin
update CONST set 
CONST.VOTES =CONST.VOTES 
+3 where COID=new.COID;
end $$


