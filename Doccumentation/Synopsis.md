# Synopsis -

## Project Title -
Computer Service Centre management system (Desktop Application)

## Team Details –
1. Shelke Aditya Sanjay (PPA7)
2. Borhade Pratik Ashok (PPA7)
3. Bhakare Mahesh Santosh (PPA8)

## Aim / Objective – 
The main objective of the Computer Service Centre management system is to manage the details of
parts,computers,services,Repairs.The project is totally built as administrative end and thus only the administrator is
guaranteed the access.The purpose of the project is to built as application program to reduce manual work for managing the
part,Customers,Services.It track all the details about the services, Repairs.

## Technologies used –
- JAVA
- MySQL
- IDE: Eclipse 

## Functionalities:
1. Provides the searching facilities based on various factor. Such as Parts, Services, Repairs.
2. It tracks all the information of computer sales,computer,Repairs etc.
3. Shows the information and description of the parts,Services. 

## Advantages of new system -
 1) It Connects main office, repair engineer and product office under a single system.
 2) Easy to maintain and retrieve all records like (components record, billing record, etc) .
 3) Easy to provide each and every detail to customer. 
 
## Disadvantages of traditional system –
 1) In traditional system, it is difficult to main all details.
 2) Much more time consuming.
 3) In traditional system, there is no any facility to check the work status. 
 
## MySQL Tables Structure: 

Repair Engineer Details - |
---|

ID | NAME | AADHAR NO | ADDRESS | CONTACT NO. | EMAIL | JOIN DATE
--- | --- | --- | --- | --- | --- | ---
PRIMARY KEY | NOTNULL | NOT NULL/UNIQUE | NOT NULL | UNIQUE/NOT NULL | UNIQUE/NOTNULL | NOT NULL 

---

CUSTOMER DETAILS - |
--- |

ID | NAME | AADHAR NO | ADDRESS | CONTACT NO. | EMAIL | JOIN DATE
---|---|---|---|---|---|---|
PRIMARY KEY | NOT NULL | NOT NULL/UNIQUE | NOT NULL | UNIQUE/NOT NULL | UNIQUE | NOT NULL

---

PRODUCT OFFICE DETAILS - |
---|

ID | OFFICE NAME | GSTN | ADDRESS | EMAIL | CONTACT NO.
---|---|---|---|---|---|
PRIMARY KEY | NOT NULL | NOT NULL/UNIQUE | NOT NULL | UNIQUE/NOT NULL |UNIQUE/NOT NULL 

---

AVAILABLE COMPONANTS DETAILS - |
---|

COMPONANT ID | COMPONANT NAME | QUANTITY | PRICE PER COMPONANT |
---|---|---|---|
PRIMARY KEY | NOT NULL | NOT NULL | NOT NULL |

---

ORDERED DETAIL TABLE - |
---|

ORDER ID | COMPONANT ID | PEODUCT OFFICE ID | ORDERED DATE | ORDER SHIPMENT DATE | ORDER RECEIVED DATE | STATUS 
---|---|---|----|---|---|---|
PRIMARY KEY | FOREIGN KEY | FOREIGN KEY | | | | NOT NULL (MULTI VALUE) 

---

DEVICE SHIPMENT DETAILS - |
---|

DEVICE ID | REPAIR ENGINEER ID | DATE OF SHIPMENT FOR REPAIR |  DATE OF RECEIVED FOR REPAIR | DATE OF SHIPMENT TO MAIN OFFICE  | DATE OF RECEIVED AT MAIN OFFICE | STATUS |
---|---|---|---|---|---|---|
PRIMARY KEY | FOREIGN KEY | | | | | NOT NULL |
