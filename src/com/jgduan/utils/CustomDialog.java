package com.jgduan.utils;

import com.jgduan.activity.R;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * <p>
 * Title: CustomDialog
 * </p>
 * <p>
 * Description:鑷畾涔塂ialog锛堝弬鏁颁紶鍏ialog鏍峰紡鏂囦欢锛孌ialog甯冨眬鏂囦欢锛�
 * </p>
 * <p>
 * Copyright: Copyright (c) 2013
 * </p>
 * 
 * @author archie
 * @version 1.0
 */
public class CustomDialog extends Dialog implements android.view.View.OnClickListener {
	int layoutRes;// 甯冨眬鏂囦欢
	Context context;
	/** 纭畾鎸夐挳 **/
	private Button confirmBtn;
	/** 鍙栨秷鎸夐挳 **/
	private Button cancelBtn;

	public CustomDialog(Context context) {
		super(context);
		this.context = context;
	}

	/**
	 * 鑷畾涔夊竷灞�鐨勬瀯閫犳柟娉�
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
	 * 鑷畾涔変富棰樺強甯冨眬鐨勬瀯閫犳柟娉�
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
		
		// 鏍规嵁id鍦ㄥ竷灞�涓壘鍒版帶浠跺璞�
		confirmBtn = (Button) findViewById(R.id.confirm_btn);
		cancelBtn = (Button) findViewById(R.id.cancel_btn);
		
		// 璁剧疆鎸夐挳鐨勬枃鏈鑹�
		confirmBtn.setTextColor(0xff1E90FF);
		cancelBtn.setTextColor(0xff1E90FF);
		
		// 涓烘寜閽粦瀹氱偣鍑讳簨浠剁洃鍚櫒
		confirmBtn.setOnClickListener(this);
		cancelBtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.confirm_btn:
			ValueUtil.mActivity.finish();
			break;
		case R.id.cancel_btn:
			CustomDialog.this.dismiss();
			break;
		}
	}
	
}