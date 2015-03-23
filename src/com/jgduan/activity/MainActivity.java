package com.jgduan.activity;

import com.jgduan.activity.R;
import com.jgduan.utils.CustomDialog;
import com.jgduan.utils.ValueUtil;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
	private Button myBtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		// 鏍规嵁id鍦ㄥ竷灞�涓壘鍒版帶浠跺璞�
		myBtn = (Button) findViewById(R.id.test);
		
		// 涓烘帶浠剁粦瀹氱偣鍑讳簨浠剁洃鍚櫒
		myBtn.setOnClickListener((OnClickListener) this);
	}

	public void onClick(View v) {
        switch (v.getId()) {
        case R.id.test:
            CustomDialog dialog=new CustomDialog(this, R.style.mystyle, R.layout.customdialog);
            dialog.show();
        default:
            break;
        }
    }

	/* (non-Javadoc)
	 * @see android.app.Activity#onResume()
	 */
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		ValueUtil.mActivity = this ;
	}
	
}
