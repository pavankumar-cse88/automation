Problem Statement:
==================

“James Cameron” has directed many movies.
He wants to compare his movie details with his own data source which is in json format.

He wants the ability to pick and choose movies to compare data with in csv format


Solution :
==========

1. Query OMDB API to get movies of “James Cameron”
2. Get List of Movies in MovieData.json file
3. For every movie in csv, compare the movie details of OMDB and json

Project Details:
================

1. Languages Used - JAVA
2. Rest Client - REST ASSURED
3. Build Tool - Gradle
4. Unit Test Framework - TestNg

Project Structure:
===================
1. main/java/entities - Entities to hild movie information
2. main/java/services -  Services to interact with various data sources - omdb, json and csv sources
3. main/java/utils -  Constants and helper functions

4. test/java/apiTests - DataDriven TestNG test
5. test/java/TestUtils - Test utilities for reporting and hooks
6. test/java/resources - TestData


Steps to Run tests:
===================
gradew clean test

Test Reports:
=============
Once execution completes reports are stored in - src/test/resources/
File name - CompareMovieDetailsReport.html


