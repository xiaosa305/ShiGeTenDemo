package com.xiaosa.qianfeng.shigeten.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.xiaosa.qianfeng.shigeten.R;
import com.xiaosa.qianfeng.shigeten.custom.bean.TabEntity;
import com.xiaosa.qianfeng.shigeten.custom.message.HideMessage;
import com.xiaosa.qianfeng.shigeten.custom.message.ShowMessage;
import com.xiaosa.qianfeng.shigeten.test.TestFragment;
import com.xiaosa.qianfeng.shigeten.utils.ThemeUtils;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private ArrayList<Fragment> mFragments;
    private ArrayList<CustomTabEntity> mActionBarEntity;
    @BindView(R.id.lay_actionBar)CommonTabLayout mActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initData();
        mActionBar.setTabData(mActionBarEntity,this,R.id.lay_main,mFragments);

    }

    private void initData() {
        mFragments = new ArrayList<>();
        mActionBarEntity = new ArrayList<>();
        for (int i = 0;i < 4;i++){
            mFragments.add(TestFragment.newInstance(null,null));
        }
        int[] criticResId = ThemeUtils.MainTheme.getCriticButtonImage();
        int[] novelResId = ThemeUtils.MainTheme.getNovelButtonImage();
        int[] didgramResId = ThemeUtils.MainTheme.getDidgramButtonImage();
        int[] personalResId = ThemeUtils.MainTheme.getPersonalButtonImage();
        mActionBarEntity.add(new TabEntity(criticResId[1],criticResId[0]));
        mActionBarEntity.add(new TabEntity(novelResId[1],novelResId[0]));
        mActionBarEntity.add(new TabEntity(didgramResId[1],didgramResId[0]));
        mActionBarEntity.add(new TabEntity(personalResId[1],personalResId[0]));
    }

    private void init() {
        mContext = this;
        ButterKnife.bind(this);
        EventBus.getDefault().register(this);
    }

    @Subscribe
    /**
     * @Date:       2016/11/3 14:14
     * @Creator:    hasee
     * @Description:显示下方功能栏
     * @Method:     showActionBar
     * @Param:      [message]
     * @Return:     void
    */
    public void showActionBar(ShowMessage message){
        ObjectAnimator showActionBar = ObjectAnimator.ofFloat(mActionBar,"Alpha",0,1);
        showActionBar.setDuration(500);
        showActionBar.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                mActionBar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                mActionBar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
        if (mActionBar.getVisibility() == View.INVISIBLE) {
            showActionBar.start();
        }
    }

    @Subscribe
    /**
     * @Date:       2016/11/3 14:21
     * @Creator:    hasee
     * @Description:隐藏下方功能栏
     * @Method:     hideActionBar
     * @Param:      [message]
     * @Return:     void
    */
    public void hideActionBar(HideMessage message){
        ObjectAnimator hideActionBar = ObjectAnimator.ofFloat(mActionBar,"Alpha",1,0);
        hideActionBar.setDuration(500);
        hideActionBar.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                mActionBar.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                mActionBar.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
        if (mActionBar.getVisibility() == View.VISIBLE){
            hideActionBar.start();
        }
    }
}
