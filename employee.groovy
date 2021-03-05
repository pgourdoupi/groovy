import groovy.sql.Sql

def url ='jdbc:postgresql://localhost/vasi'
def user = 'postgres'
def password = '12345'
def driver = 'org.postgresql.Driver'
def sql = Sql.newInstance(url, user, password, driver)

println 'Employees and rows'
sql.eachRow('select * from employee') { row ->
    println "$row.id ${row.name.padRight(10)} $row.dob "
}
sql.close()

