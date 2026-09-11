# Write your MySQL query statement below
SELECT v.customer_id, COUNT(v.visit_id) count_no_trans FROM Visits v
LEFT JOIN Transactions t ON v.visit_id = t.visit_id
Where t.transaction_id  IS null group by v.customer_id;
