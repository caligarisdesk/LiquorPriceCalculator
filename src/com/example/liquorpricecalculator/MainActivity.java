package com.example.liquorpricecalculator;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView mPrice;
	private EditNumber mBase;
	private EditNumber mBottle;
	
	/**
	 * @author Jack
	 *
	 */
	public class FieldChangedWatcher implements TextWatcher {

		/* (non-Javadoc)
		 * @see android.text.TextWatcher#afterTextChanged(android.text.Editable)
		 */
		@Override
		public void afterTextChanged(Editable arg0) {
			// TODO Auto-generated method stub
		}

		/* (non-Javadoc)
		 * @see android.text.TextWatcher#beforeTextChanged(java.lang.CharSequence, int, int, int)
		 */
		@Override
		public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
				int arg3) {
			// TODO Auto-generated method stub

		}

		/* (non-Javadoc)
		 * @see android.text.TextWatcher#onTextChanged(java.lang.CharSequence, int, int, int)
		 */
		@Override
		public void onTextChanged(CharSequence s, int start, int before,
				int count) {
			if(s == null) return;
		
			try
			{
				mPrice.setText(String.valueOf(PriceCalculator.calcPrice(mBase.getNumber(), mBottle.getNumber())));
			}
			catch (NumberFormatException e){}
			catch (Exception e)
			{
				mPrice.setError("Error: " + e.getLocalizedMessage());
			}
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		mPrice = (TextView)findViewById(R.id.price);
		mBase = (EditNumber)findViewById(R.id.baseprice);
		mBottle = (EditNumber)findViewById(R.id.bottlesize);
		mBase.addTextChangedListener(new FieldChangedWatcher());
		mBottle.addTextChangedListener(new FieldChangedWatcher());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
