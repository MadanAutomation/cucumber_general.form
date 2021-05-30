Feature: login functionality test

   Scenario Outline: Enter the general form
    Given First start page
      And I enter the name a first_name '<first_name>'
      And I enter the name a Middle_Name '<middle_Name>'
      And I enter the name a Last_Name '<last_Name>'
     When I enter the name a phone_number '<phone_number>'
     When I enter the name a Address_One '<address_One>'
     When I enter the Address_Two '<address_Two>'
     When I enter the pin_code '<pin_code>'
     When I enter the continent '<continent>'
     And browser quit

    Examples:
      | first_name| middle_Name| last_Name| phone_number|         address_One          | address_Two   |pin_code  |continent|
      | madan     |    mohan   |  reddy   |0899679102   |Flat no 2, kingsmill court    |bolton street  |   D01N520| Europe |



	