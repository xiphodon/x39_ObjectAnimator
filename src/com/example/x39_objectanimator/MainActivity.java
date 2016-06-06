package com.example.x39_objectanimator;

import android.os.Bundle;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView iv;
	private ObjectAnimator oa1;
	private ObjectAnimator oa2;
	private ObjectAnimator oa3;
	private ObjectAnimator oa4;


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        iv = (ImageView) findViewById(R.id.iv);
    }

    
    //ƽ��
    public void click1(View v){
    	// 						    1, �������        2, �ı�ʲô����                      3, �ƶ����
    	oa1 = ObjectAnimator.ofFloat(iv, "translationX", 10,70,20,90,50,100);
    	oa1.setDuration(3000);
    	oa1.setRepeatCount(1);
    	oa1.setRepeatMode(ValueAnimator.REVERSE);
    	oa1.start();
    }
    
    
    //����
    public void click2(View v){
    	oa2 = ObjectAnimator.ofFloat(iv, "scaleX", 1,0.5f,1.5f,2);
    	oa2.setDuration(3000);
    	oa2.start();
    }
    
    
    //͸��
    public void click3(View v){
    	oa3 = ObjectAnimator.ofFloat(iv, "alpha", 0,0.8f,0.4f,1);
    	oa3.setDuration(3000);
    	oa3.start();
    }
    
    
    //��ת
    public void click4(View v){
    	//      ˳ʱ����ת
    	oa4 = ObjectAnimator.ofFloat(iv, "rotation", 0,90,-90,360);
    	oa4.setDuration(3000);
    	oa4.start();
    }

    
    //����һ������
    public void click5(View v){
    	AnimatorSet as = new AnimatorSet();
//    	//���ð���ִ��
//    	as.playSequentially(oa1,oa2,oa3,oa4);
    	//����һ��ִ��
    	as.playTogether(oa1,oa2,oa3,oa4);
    	as.start();
    }
    
    
    //xmlƽ��
    public void click6(View v){
    	//���xml
    	Animator at = AnimatorInflater.loadAnimator(this, R.animator.objectanimator);
    	//�����������ĸ����
    	at.setTarget(iv);
    	at.start();
    }
    
    
    
    
    
    
    
    
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
