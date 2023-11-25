@uploadfile
Feature: Upload files on Demo Guru99
  As a PO
  I want to upload file to application
  So that verify upload file function work well

  Scenario: Upload file to application
  Given I get login page url
  When Upload file
  Then Verify upload file successful
  When Click to "I accept terms of service" checkbox
  And Click to "Submit File" button
  Then Verify "1 file has been successfully uploaded."
  
    