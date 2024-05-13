create table if not exists base_migration_object(
access_flow_code Integer not null,
access_flow_type varchar(255) null,
reference_id varchar(255) null,
access_request_type varchar(255) null,
access_request_id Integer null,
access_request_type_code Integer null,
user_id Integer null,
key_atttribute varchar(255) null,
ket_attribute_value varchar(255) null,
access_request_creation_date varchar(255) null,
access_request_modified_date varchar(255) null,
entity_state varchar(255) null,
constraint base_migration_object_pk primary key(access_flow_code));