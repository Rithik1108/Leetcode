# Write your MySQL query statement below

select p.product_id, ROUND(
        IFNULL(SUM(p.price * s.units) / SUM(s.units), 0),
        2
    ) as average_price
from prices as p
left join unitssold as s
on p.product_id = s.product_id
and s.purchase_date between p.start_date and p.end_date
group by product_id;
