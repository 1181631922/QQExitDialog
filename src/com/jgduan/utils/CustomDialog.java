package com.jgduan.utils;

import com.jgduan.activity.R;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * <p>
 * </p>
 * <p>
 * </p>
 * <p>
 * Copyright: Copyright (c) 2013
 * </p>
 * 
 * @version 1.0
 */
public class CustomDialog extends Dialog implements android.view.View.OnClickListener {
	int layoutRes;
	Context context;
	private Button confirmBtn;
	private Button cancelBtn;

	public CustomDialog(Context context) {
		super(context);
		this.context = context;
	}

	/**
	 * 
	 * @param context
	 * @param resLayout
	 */
	public CustomDialog(Context context, int resLayout) {
		super(context);
		this.context = context;
		this.layoutRes = resLayout;
	}

	/**
	 * 
	 * @param context
	 * @param theme
	 * @param resLayout
	 */
	public CustomDialog(Context context, int theme, int resLayout) {
		super(context, theme);
		this.context = context;
		this.layoutRes = resLayout;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(layoutRes);
		
		confirmBtn = (Button) findViewById(R.id.confirm_btn);
		cancelBtn = (Button) findViewById(R.id.cancel_btn);
		
		confirmBtn.setTextColor(0xff1E90FF);
		cancelBtn.setTextColor(0xff1E90FF);
		
		confirmBtn.setOnClickListener(this);
		cancelBtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.confirm_btn:
			ValueUtil.mActivity.finish();
//			Intent it_my_activity = new Intent(Intent.ACTION_CALL);
//            it_my_activity.setClass(context, AboutActivity.class);
//            ((Activity) context).finish();
			CustomDialog.this.dismiss();
			break;
		case R.id.cancel_btn:
			CustomDialog.this.dismiss();
			break;
		}
	}
	
}