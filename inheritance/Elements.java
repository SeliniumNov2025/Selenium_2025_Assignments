package org.inheritance;

public class Elements extends Button {

	public static void main(String[] args) {

		Elements element = new Elements();
		//Element class(Execution class) Inherits Button class(Sub class) and also Inherits Webelement class(Base class)
		//Access to call methods from execution class to Element, Button and WebElement class 
		element.click();
		element.setText("Sparrow");
		element.submit();

		Button button = new Button();
		//Access to call methods from Button class to Button and WebElement class 
		button.click();
		button.setText("Jack");
		button.submit();

		TextField text = new TextField();
		//Access to call methods from TextField class to TextField and WebElement class 
		text.click();
		text.setText("Jack Sparrow");
		text.getText();

		CheckBoxButton checkBox = new CheckBoxButton();
		//Access to call methods from CheckBoxButton class to CheckBoxButton, Button and WebElement class 
		checkBox.click();
		checkBox.setText("Harry Potter");
		checkBox.submit();
		checkBox.clickCheckButton();

		RadioButton radio = new RadioButton();
		//Access to call methods from RadioButton class to RadioButtonButton, Button and WebElement class 
		radio.click();
		radio.setText("Pirates of Caribean");
		radio.submit();
		radio.selectRadioButton(); 




	}

}
