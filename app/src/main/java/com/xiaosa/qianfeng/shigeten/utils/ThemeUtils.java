package com.xiaosa.qianfeng.shigeten.utils;

import com.xiaosa.qianfeng.shigeten.R;
import com.xiaosa.qianfeng.shigeten.app.App;

/**
 * Created by hasee on 2016/11/3.
 */

public class ThemeUtils {
    public static class MainTheme{
        public static int[] getCriticButtonImage(){
            int[] resId = new int[2];
            switch (App.THEME){
                case DARK:
                    resId[0] = R.drawable.home_critic_night;
                    resId[1] = R.drawable.home_critic_focus_night;
                    break;
                case LIGHT:
                default:
                    resId[0] = R.drawable.home_critic;
                    resId[1] = R.drawable.home_critic_focus;
                    break;
            }
            return resId;
        }
        public static int[] getNovelButtonImage(){
            int[] resId = new int[2];
            switch (App.THEME){
                case DARK:
                    resId[0] = R.drawable.home_novel_night;
                    resId[1] = R.drawable.home_novel_focus_night;
                    break;
                case LIGHT:
                default:
                    resId[0] = R.drawable.home_novel;
                    resId[1] = R.drawable.home_novel_focus;
                    break;
            }
            return resId;
        }
        public static int[] getDidgramButtonImage(){
            int[] resId = new int[2];
            switch (App.THEME){
                case DARK:
                    resId[0] = R.drawable.home_diagram_night;
                    resId[1] = R.drawable.home_diagram_focus_night;
                    break;
                case LIGHT:
                default:
                    resId[0] = R.drawable.home_diagram;
                    resId[1] = R.drawable.home_diagram_focus;
                    break;
            }
            return resId;
        }
        public static int[] getPersonalButtonImage(){
            int[] resId = new int[2];
            switch (App.THEME){
                case DARK:
                    resId[0] = R.drawable.home_personal_night;
                    resId[1] = R.drawable.home_personal_focus_night;
                    break;
                case LIGHT:
                default:
                    resId[0] = R.drawable.home_personal;
                    resId[1] = R.drawable.home_personal_focus;
                    break;
            }
            return resId;
        }
    }
}
