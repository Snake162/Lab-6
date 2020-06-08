CSCI-2467 Lab 6 – Inheritance – Address, PersonAddress, BusinessAddress Classes

Assignment
Download the Lab6.zip starter file. Use 7zip to unzip the file using ‘Extract Here’. Open the project folder in IntelliJ. 
Examine the Main and Address classes. You are going to add two classes derived from Address: BusinessAddress and PersonAddress.
Create BusinessAddress class
1)	Select package edu.cscc and create a new Java class called BusinessAddress
2)	Make the class extend the Address class
3)	Add two private String fields businessName and address2
4)	Generate constructor and all getters and setters
5)	Add a printLabel() method
The printLabel method should print (using System.out.println())
First line – the businessName field
Second line – the address2 field if it is not null or empty
Third line – the StreetAddress field if it is not null or empty
Fourth line – city field followed by a comma and space, the state field followed by two spaces, and the zip field

Create PersonAddress class
1)	Select package edu.cscc and create a new Java class called PersonAddress
2)	Make the class extend the Address class
3)	Add a private String field personName
4)	Generate constructor and all getters and setters
5)	Add a printLabel() method
The printLabel method should print (using System.out.println())
First line – the personName field
Second line – the StreetAddress field
Third line – city field followed by a comma and space, the state field followed by two spaces, and the zip field

 
Modify Main class
Add the following three BusinessAddress objects to the list.
BusinessName	Address2	StreetAddress	City	State	Zip
Columbus State	Eibling 302B	550 East Spring St.	Columbus	OH	43215
AEP	P.O. Box 2075	null	Columbus	OH	43201
Bill’s Coffee	null	2079 N. Main St.	Columbus	OH	43227

Add the following three PersonAddress objects to the list.
PersonName	StreetAddress	City	State	Zip
Saul Goodman	1200 N. Fourth St.	Worthington	OH	43217
Mike Ehrmentraut	207 Main St.	Reynoldsburg	OH	43211
Gustavo Fring	2091 Elm St.	Pickerington	OH	43191

Example Output
Columbus State
Eibling 302B
550 East Spring St.
Columbus, OH  43215
====================
AEP
P.O. Box 2075
Columbus, OH  43201
====================
Bill's Coffee
2079 N. Main St.
Columbus, OH  43227
====================
Saul Goodman
1200 N. Fourth St.
Worthington, OH  43217
====================
Mike Ehrmentraut
207 Main St.
Reynoldsburg, OH  43211
====================
Gustavo Fring
2091 Elm St.
Pickerington, OH  43191
====================
