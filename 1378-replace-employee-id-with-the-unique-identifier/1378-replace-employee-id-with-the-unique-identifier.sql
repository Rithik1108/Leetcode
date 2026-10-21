select em.unique_id, e.name
from employeeuni as em
right join employees e
on em.id=e.id;