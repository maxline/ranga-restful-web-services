insert into user_details(id, birth_date, name)
values (1001, current_date(), 'Serhii');

insert into user_details(id, birth_date, name)
values (1002, current_date()-1, 'Dmytro');

insert into user_details(id, birth_date, name)
values (1003, current_date()-2, 'Andrii');

insert into post(id, description, user_id)
values (2001, 'I want to learn AWS1', 1001);

insert into post(id, description, user_id)
values (2002, 'I want to learn AWS2', 1001);

insert into post(id, description, user_id)
values (2003, 'I want to learn AWS3', 1001);

insert into post(id, description, user_id)
values (2004, 'I want to learn AWS4', 1002);