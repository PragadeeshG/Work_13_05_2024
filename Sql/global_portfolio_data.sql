create table if not exists global_portfolio_data(
portfolio_code varchar(255) not null,
portfolio_name varchar(255) null,
local_currency varchar(255) null,
trade_currency varchar(255) null,
short_desaccess_requestiption varchar(255) null,
data_indicator varchar(255) null,
consumed_by varchar(255) null,
params varchar(255) null,
filter varchar(255) null,
status varchar(255) null,
constraint global_portfolio_data_pk primary key(portfolio_code));
