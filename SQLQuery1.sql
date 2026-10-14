SELECT *
FROM Ticket
WHERE Price = (
    SELECT MAX(Price)
    FROM Ticket
);