# NEU Course Wiki

Group Name: DarkHorse
Group Members: Sixin Li, Zixin Zhao, Jiayan Ma

## Introduction

This is a web application that NEU students can post their comments on courses and view other course info. This is now limited to Seattle campus of NEU. This project uses MongoDB for the local database, express for the connection and GraphQL for the api.

There are mainly four parts on this website:

- Courses
- Instructors
- Reviews
- Projects

## Functionalities

1. Search by course ID  
   -Links to the corresponding course page if course exists.  
   -Pop up a window to alert user that course not found.
2. Display course introduction, syllabus, reviews and projects  
   -Introduction is the same as the course introduction in official NEU course schedule.
3. Request to upload syllabus for each course
4. Reviews:  
   -All users can see reviews while only logged in users can add reviews.  
   -When a not logged in user try to add a review, a notification pop up will remind them to login.  
   -All users can upvote and downvote a review.  
   -Users can filter reviews by semester and instructors: Semesters are written in the files.  
   -Use pagination component to see all reviews for a course.
5. Projects:  
   -All users can see all projects.  
   -Users can filter projects by semester and instructors: Semesters are written in the files.  
   -All users can click the link to view the project.  
   -Load more button and back to the top button can help you view the projects.

## Contribution

#### Sixin Li

- ​ Set up project, and built connection with MongoDB database (index.js and server.js)
- ​ Created APIs for reviews (reviews.controller.js and reviewsDAO.js)
  - ​ query: getReviewsByCourse, getReviewsByUser, getReviewsByInstructor, getReviewsBySemester
  - ​ mutation: addReview, updateReviewVotes, deleteReview
- Designed and Implemented​ review cards and modals that pop out to create new review
  - Made addReview Modal only show when user is logged in
  - ​Users can upvote or down-vote a review and filter by semester and instructors
  - ​Added pagination for review
  - ​Added media query for reviewCard

## Pages

- Home Page:  
  ![home page](neucoursewiki-frontend/public/screenshots/homepage3.png)

- Course Page:
  ![course page](neucoursewiki-frontend/public/screenshots/coursepage4.png)  
  ![course page](neucoursewiki-frontend/public/screenshots/coursepage5.png)

- Project Page:  
  ![project page](neucoursewiki-frontend/public/screenshots/projectpage3.png)

## Database

#### Courses

Courses include four parts of information.

- course_id
- name
- introduction
- timeline

#### Reviews

Reviews include nine parts of information.

- course_id
- user_id
- content
- creationDate
- rating_difficultiness
- rating_usefulness
- semester
- instructor
- isRecommended

#### Instructors

Courses include two parts of information.

- name
- courses(which is a list to save all the courses taught by the instructor)

#### Projects

Projects include five parts of information

- course_id
- semester
- instructor
- description
- link
