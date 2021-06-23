set projectLocation=E:\ASISH FOLDER\Software Testing\AUTOMATION TESTING\JAVA\Selenioum
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml