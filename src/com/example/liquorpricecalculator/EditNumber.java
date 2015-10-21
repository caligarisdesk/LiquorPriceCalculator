package com.example.liquorpricecalculator;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

public class EditNumber extends EditText {

	private static final String DEFAULT_FORMAT = "%.2f";
	
	/**
	 * @param context
	 */
	public EditNumber(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param context
	 * @param attrs
	 */
	public EditNumber(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param context
	 * @param attrs
	 * @param defStyle
	 */
	public EditNumber(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}
	
	public void setNumber(double n)
	{
		super.setText(
				String.format(DEFAULT_FORMAT, n));
	}
	public double getNumber()
	{
		return Double.valueOf(getText().toString());
	}
	public void clear()
	{
		setText("");
	}
}
