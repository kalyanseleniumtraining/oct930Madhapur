package practice;

public class notes {
	
	Set
	---

	1. List stores duplicates

	2.List stores values based on index
	the first value in the list will be at index "0"

	3.List remembers order of insertion


	1. Set Doesnot store duplicates

	2.set doesnot store values based on index
	set used hashmap and hashcode concepts to store the values

	3.set does not remember order of insertion
	(output cannot be predicted)

	Note: when we use set it is recomended to use "Foreach" loop instead
	of forloop

	Naukri
	amazon
	techmahindra
	lnt




	Set=foreach

	ForEach
	--------

	for(datatype variablename: list/set name)
	{


	}

	WIndow Handles
	----------------

	Go to Naukri.com and close the naukri main page we use 
	driver.close();

	If we want to close all the windows opened by selenium then 
	we use driver.quit();

	.//*[@alt='Tech Mahindra']


	selenium can perform actions only on active page, to perform 
	actions on inactive pages we need to make inactive page as 
	active page


	Actions are close,click,sendkeys

	To make inactive window as active window we should use
	window handles concept


	Whenever selenium webdriver opens a browser/tab/window it will provide 
	a unique id to each

	The id will be internal cannot be seen outside

	These id's are  alpha numeric i.e. string

	print all the ids of browsers opened by webdriver


	Frames
	------

	frame is a small webpage inside a main webpage

	we cannot perform action on frame without switching to it

	To verify whether an object is inside a frame or not 
	we should use right click and see "Frame" word in the context 
	menu

	Every frame is designed using "iframe" tag

	How to Switch to a frame?

	1. driver.switchTo().frame(int index);
	---------------------------------------
	Index starts from 0, the first frame would be at index "0"



	2. driver.swithTo().frame(String name or id);
	------------------------------------------------
	Name or id should be taken from the parent iframe

	Right click on the objext and inspect scroll up slowly, identify 
	the iframe tag and use the iframe tag "name" or "id"

	3. driver.switchTo().frame(Webelement ele);
	------------------------------------------
	Right click on the objext and inspect scroll up slowly, identify 
	the iframe tag and use the iframe tag any attribute to identify 
	as webelement

	Practice Example
	----------------
	Goto "https://www.quackit.com/javascript/javascript_alert_box.cfm"
	click on "Click Me" button using
	1. driver.swithTo().frame(String name or id);
	2. driver.swithTo().frame(Webelement ele);

	AlertBox
	---------

	There are 2 types of alertbox available

	1. Information alert box
	It contains only one butto
	Yes Or OK

	2. Confirmation alert box
	It contains two buttons

	1. Yes Or No
	2. Ok or Cancel

	We cannot perform action on alertbox, because alert box belongs to
	computer not to application

	Alert box is window component

	To perform action on alert box we should use the below


	driver.switchTo().alert();

	To click on Ok button in the alertbox 
	we need to use the below code

	driver.switchTo().alert().accept();


	To click on Cancel button in the alertbox 
	we need to use the below code


	driver.switchTo().alert().dismiss();


	To get the text on the alertbox we need to use
	the below code


	driver.switchTo().alert().getText();

	Practice Example:
	----------------

	Goto "https://www.quackit.com/javascript/javascript_alert_box.cfm"
	click on "Click Me" button using
	1. driver.swithTo().frame(String name or id);
	2. driver.swithTo().frame(Webelement ele);

	Get the text on the alertbox and print on to the console
	Click on Ok button in the alert box and close the alert box


	Practice Example
	----------------

	Go to paytm webpage click on login link
	popup screen will be opened
	click on "X" button  to close the popup


	Debugging
	------------
	If a prog failed then we should investigate the reason for the
	failure, to investigate the reason fro the failure we should use
	debugging concept


	To debug the code we should set the breakpoint

	breakpoint is used to pause the code

	to set a breakpoint use control+shift+b

	Once we put breakpoint right click->Debug as ->Java Application

	F6: Go to the next line

	F5: Step In to the calling method

	F7: Step Out of the method

	F8: Run the prog






































































































































}
