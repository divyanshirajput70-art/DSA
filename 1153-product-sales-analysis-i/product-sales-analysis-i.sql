# Write your MySQL query statement below
SELECT P.product_name,
      S.year,
      S.price
      #S.sale_id,
FROM Sales S
JOIN Product P 
ON S.product_id = P.product_id ;   