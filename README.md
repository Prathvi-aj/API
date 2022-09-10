# Hotel Booking API Back End 



How to Run:
- Download api Repositary
- open api folder on eclipse
- install mysql 8 version
- execute ApiApplication.java file as java application or spring boot app



Technologies
- Spring Boot (JPA, Web)
- Spring Framework
- MySQL
- Maven
- Javax

Application starts on localhost port 8080, URI and Method TYpe:

POST- [http://localhost:8080/hotelbooking/hotels]

PUT- [http://localhost:8080/api/hotelbooking/update-hotel-info]

POST- [http://localhost:8080/hotelbooking/add-hotel]

DELETE- [http://localhost:8080/hotelbooking/delete-hotel-by-id/{hotel_id}]

GET- [http://localhost:8080/hotelbooking/user]

PUT- [http://localhost:8080/api/hotelbooking/update-user-info*]

POST- [http://localhost:8080/hotelbooking/add-user]

DELETE- [http://localhost:8080/hotelbooking/delete-user-by-id/{user_id}]

GET- [http://localhost:8080/hotelbooking/review]

PUT- [http://localhost:8080/api/hotelbooking/update-review-info*]

POST- [http://localhost:8080/hotelbooking/add-review]

DELETE- [http://localhost:8080/hotelbooking/delete-review-by-id/{review_id}]
 




Postman collections


• Search hotels by city and date (to check availability), number of rooms required/number of travelers, search criteria might include number of stars
that a hotel has, facilities like WIFI, restaurant available, air conditioning, meals included etc. Show sorted hotels based on the rating score, relevance or the cost of stay.
Method : POST
URI : localhost:8082/hotelbooking/hotels
 
Request:

    {
        "rooms": 10,
        "stars": 4,
        "wifiFacility": "true",
        "resaturent": "true",
        "airConditinor": "true",
        "meal": "true",
        "room_charge": 1000,
        "date": "2022-09-09",
        "city":"Jabalpur"
    }
		
		Response :
		[
    {
        "hotel_id": 1001,
        "hotel_name": "orbit",
        "rooms": 25,
        "stars": 4,
        "wifiFacility": "true",
        "resaturent": "true",
        "airConditinor": "true",
        "meal": "true",
        "room_charge": 1000,
        "city": "Jabalpur",
        "date": "2022-09-09"
    }
]
		



• Show rating (out of 10) for a hotel and user comments/reviews. There might be filters like gender, residential city of the traveler or if not just the
overall rating.
Method : GET
URI :localhost:8082/hotelbooking/review

Response:

[
    {
        "review_id": 10,
        "comment": "Very good room",
        "rating": 8,
        "hotel_id": 1001,
        "hotel_name": "orbit",
        "user_id": 101,
        "user_name": "abhi"
    }
]


• Service to add/update hotel information in the system.
1. Update Hotel
Method : PUT
URI : http://localhost:8080/api/hotelbooking/update-hotel-info

Request:

    {
        "rooms": 10,
        "stars": 4,
        "wifiFacility": "true",
        "resaturent": "true",
        "airConditinor": "true",
        "meal": "true",
        "room_charge": 1000,
        "date": "2022-09-09",
        "city":"Jabalpur"
    }
		
		
                
  Response :
		[
    {
        "hotel_id": 1001,
        "hotel_name": "orbit",
        "rooms": 25,
        "stars": 4,
        "wifiFacility": "true",
        "resaturent": "true",
        "airConditinor": "true",
        "meal": "true",
        "room_charge": 1000,
        "city": "Jabalpur",
        "date": "2022-09-09"
    }
]


2. Add Hotel:
Method : Post
URI: http://localhost:8080/hotelbooking/add-hotel

Request :
		
    {
        "hotel_id": 1001,
        "hotel_name": "orbit",
        "rooms": 25,
        "stars": 4,
        "wifiFacility": "true",
        "resaturent": "true",
        "airConditinor": "true",
        "meal": "true",
        "room_charge": 1000,
        "city": "Jabalpur",
        "date": "2022-09-09"
    }


Response :
		[
    {
        "hotel_id": 1001,
        "hotel_name": "orbit",
        "rooms": 25,
        "stars": 4,
        "wifiFacility": "true",
        "resaturent": "true",
        "airConditinor": "true",
        "meal": "true",
        "room_charge": 1000,
        "city": "Jabalpur",
        "date": "2022-09-09"
    }
]


• Service to add/update user information in the system.
1.Add User :
Method : POST
URI: localhost:8081/hotelbooking/add-user



Request :

    {
        "user_id": 101,
        "first_name": "abhi",
        "last_name": "shek",
        "user_city": "Indor",
        "email_id": "abhishek@gmail.com"
    }



Response:
[
    {
        "user_id": 101,
        "first_name": "abhi",
        "last_name": "shek",
        "user_city": "Indor",
        "email_id": "abhishek@gmail.com"
    }
]



2. Update user:
Method: PUT
URI:http://localhost:8080/api/hotelbooking/update-user-info



Request:

    {
        "user_id": 101,
        "first_name": "abhi",
        "last_name": "shek",
        "user_city": "Indor",
        "email_id": "abhishek@gmail.com"
    }




Response
[
    {
        "user_id": 101,
        "first_name": "abhi",
        "last_name": "shek",
        "user_city": "Indor",
        "email_id": "abhishek@gmail.com"
    }
]



• Service for a user to add reviews for a hotel. A review will include rating and comments.
Method:POST
URI:localhost:8081/hotelbooking/add-review

Request:

    
    {
        "review_id": 11,
        "comment": "Very good room",
        "rating": 9,
        "hotel_id": 1002,
        "hotel_name": "shawn",
        "user_id": 101,
        "user_name": "abhi"
    }


Response:
[
    
    {
        "review_id": 11,
        "comment": "Very good room",
        "rating": 9,
        "hotel_id": 1002,
        "hotel_name": "shawn",
        "user_id": 101,
        "user_name": "abhi"
    }
]


• Delete information of a hotel, user or delete a review. You might have to think of the data associated with each hotel and user. All this information
will be stored in an RDBMS like MySQL.
Method: DELETE

Delete Hotel by hotel ID:[http://localhost:8080/hotelbooking/delete-hotel-by-id/{hotel_id}]


Delete User by user ID:[http://localhost:8080/hotelbooking/delete-user-by-id/{user_id}]


Delete Review by review ID:[http://localhost:8080/hotelbooking/delete-review-by-id/{review_id}]
