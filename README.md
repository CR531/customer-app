# Customer Application
A sample application with GraphQL, Spring Boot, and PostgresSQL

# Pre-Requisities
IDE (IntelliJ, STS, Eclipse)
PostgresSQL

# Step to run locally
Clone the repositiry or download the zip file.
Perform "mvn clean install" and Run the application.

After running the application successfully please navigate to "http://localhost:8080/graphiql" to create or read the data

# Testing using graphql
mutation {
  createCustomer(customer_id:"9",first_name: "chakri", last_name: "reddy", email_id: "c",phone_number:9090909091, creation_date: "2016-08-12") {
    customer_id
  }
}
**RESPONSE**:
{
  "data": {
    "createCustomer": {
      "customer_id": "1299"
    }
  }
}

**To get all customer data**
query {
  customerDetails
  {
    customer_id,
    first_name,
    last_name,
    email_id,
    phone_number,
    creation_date,
    addressDetails{
      address_id,
      address1,
      address2,
      city,
      state,
      postal_code,
      last_update_date
    }
}
}

**To get Customers data with limit**
query {
  customers(count: 2) 
  {
    customer_id,
    first_name,
    last_name,
    email_id,
    phone_number,
    creation_date,
    addressDetails{
      address_id,
      address1,
      address2,
      city,
      state,
      postal_code,
      last_update_date
    }
}
}

**To get customers with specific id**
query {
  customerbyId(customer_id: "1002") 
  {
     customer_id,
    first_name,
    last_name,
    email_id,
    phone_number,
    creation_date,
    addressDetails{
      address_id,
      address1,
      address2,
      city,
      state,
      postal_code,
      last_update_date
    }
}
}

# Testing using postman
POST:http://localhost:8080/api/customers/
Body:
{
    "customer_id":"1090", 
    "first_name":"Test", 
    "last_name":"Test", 
    "email_id":"Test",
    "phone_number":9090909090,
    "creation_date":"2021-10-12"
}

GET: http://localhost:8080/api/v1/customers/
GET: http://localhost:8080/api/v1/customers?limit=3

# Tables to create in Postgres
customers(customer_id:text PK, first_name:text, last_name:text, email_id:text, phone_number:bigint, creation_date:text)
address(address_id:text PK, customer_id:text FK, address1:text, address2:text, city:text, state:text, postal_code:text, last_update_date:text)
