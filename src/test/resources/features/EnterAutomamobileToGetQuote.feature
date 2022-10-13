@Feature @FillVehicleData
Feature: Entering Vehicle Data Until Successfully send the quate

  @smoke1
  Scenario: A user populates vehicle data fields with information
    Given User navigated to the Tricentis website
    And User clicks on Automobile
    And User clicks on the Make as "Honda"
    And Fill in the Engine Performance [kW] field: "22"
    And Enter a Date of Manufacture: "07/23/2019"
    And User clicks on the Number of Seats "5" option
    And User clicks on the option Fuel Type: "Gas"
    And Enter a List Price [$]: "600"
    And Enter a License Plate Number: "ABC 123"
    And Enter a Annual Mileage [mi]: "1500"
    Then User clicks on Vehicle Data Next button and Navigated successfully to Insurance Page
    And User enters First Name "Carlos"
    And User enters Last Name "Silva"
    And fill in the Date of Birth field "07/09/1993"
    And User inform or Gender: Male
    And fill in the Street Address field "Av. A"
    And User selects the option: "Brazil"
    And fill in the Zip Code field "12345678"
    And fill the City "São Paulo"
    And User clicks on the Occupation: "Farmer" option
    And inform the Hoobies
    And fill in the Website: "www.carlosweb.com.br"
    Then User clicks on Insurance Data Next button to navigate to the Product data page
    And User informs the Start Date more than one month into the future
    And User I clicks on the Insurance Sum [$] "3.000.000,00" option
    And User clicks on the Merit Rating: "Super Bonus" option
    And User clicks on the option Damage Insurance: "Full Coverage"
    And User selects information Optional Products: Euro Protection
    And User clicks on the option Courtesy Car: "Yes"
    Then User clicks on Car Next button to land on Price Option Page
    And User selects the price option
    Then User click on the Next button to land on Send Quote Page
    And User enters the E-mail: "mlungisi.khumalo93@gamil.com"
    And User enters in the Phone field: "679358837"
    And User enters in the Username field: "Mlungis"
    And User enters in the Password field: "Mlungisi1234!"
    And User confirms the Password field: "Mlungisi1234!"
    And User enters comment as "testing end to end"
    Then User must click on Send
    And checks the message: "Sending e-mail success!"