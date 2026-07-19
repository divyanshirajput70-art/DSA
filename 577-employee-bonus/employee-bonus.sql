# Write your MySQL query statement below
SELECT e.name , b.bonus
FROM employee as e
 LEFT join bonus as b
 ON e.empId = b.empId
 WHERE b.bonus  < 1000 or b.bonus IS NULL;

