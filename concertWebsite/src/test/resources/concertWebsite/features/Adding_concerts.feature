Feature: Adding concerts
  
  As a concert organiser
  I want to be able to add concerts
  So people interested in my concerts can see them

  Scenario: Adding a concert
    Given a concert organizer
    When the organizer adds a concert named "Metallica goes Cucumber"
    Then the organizer will see "Metallica goes Cucumber" listed
