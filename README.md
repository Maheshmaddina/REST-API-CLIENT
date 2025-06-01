# INTERACTIVE-QUIZ-APPLICATION

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: MAHESH MADDINA

*INTERN ID*: CT06DF1416

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 6 WEEKS

*MENTOR*: NEELA SANTOSH

# DESCRIPTION
 Description of WeatherApp.java:
This Java program demonstrates how to consume a public REST API to fetch and display current weather data in a structured format. It uses Java 11’s built-in HttpClient class, so no external libraries are required. The app is simple and designed to run easily in VS Code.

# FLATFORM : VISUAL SUDIO CODE

 Key Features:
Public API Used:
The app uses the Open-Meteo API, which provides free weather data without requiring an API key. It fetches the current temperature and wind speed for a specific location.

HTTP Request:
The program constructs a GET request using HttpClient and sends it to Open-Meteo's API using the latitude and longitude of London.
URL example:

https://api.open-meteo.com/v1/forecast?latitude=51.5074&longitude=-0.1278&current_weather=true
Response Handling:
The server responds with a JSON string that includes the current weather. The program prints this raw JSON to the console for reference.

Data Extraction (Manual Parsing):
Instead of using a full JSON parsing library like org.json or Gson, the app uses a basic helper method (extractValue) to extract values from the JSON string using string indexing. This allows the app to remain lightweight and library-free.

Output Format:
After extracting values like temperature and wind speed, the program prints a clean, structured weather summary for the user.

 Program Flow:
Set location coordinates (latitude and longitude for London).

Build the API request URL.

Use HttpClient to send the request and get the response.

Print the raw JSON data.

Extract temperature and wind speed from the JSON using simple string operations.

Print a formatted summary of the weather data.

No setup or API key required.

Works with just the Java standard library.

🔁 Limitations:
Only works for hardcoded coordinates.

Basic JSON parsing (may break if format changes).

No error handling for city input or invalid responses.


# OUTPUT:

