package fx;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class BTN extends Button {
	
	public BTN() {
		this("");
	}
	public BTN(String text) {
		this(text, FX.DEFAULT_COLOR, FX.DEFAULT_FONT);
	}
	public BTN(String text, Color color) {
		this(text, color, FX.DEFAULT_FONT);
	}
	public BTN(String text, double font) {
		this(text, FX.DEFAULT_COLOR, font);
	}
	public BTN(String text, Color color, double font) {
		super(text);
		setFont(font, false);
		this.setTextFill(color);
		this.setAlignment(Pos.CENTER);
	}
	
	public void makeWidth(double width) {
		FX.makeWidth(this, width);
	}
	public void makeHeight(double height) {
		FX.makeHeight(this, height);
	}
	public void makeDim(double width, double height) {
		FX.makeDim(this, width, height);
	}
	
	public void setFont(double size, boolean bold ) {
		setFont(Font.font(null, bold ? FontWeight.BOLD : FontWeight.NORMAL, size));
	}
	public void setBold(boolean value) {
		this.setFont(this.getFont().getSize(), value);
	}
	public void setFont(double value) {
		this.setFont(new Font(value));
	}
}
