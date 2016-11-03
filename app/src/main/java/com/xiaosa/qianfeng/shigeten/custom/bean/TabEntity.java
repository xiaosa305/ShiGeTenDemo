package com.xiaosa.qianfeng.shigeten.custom.bean;

import com.flyco.tablayout.listener.CustomTabEntity;

/**
 * Created by hasee on 2016/10/29.
 */

public class TabEntity implements CustomTabEntity {
    private int selectedIcon;
    private int unselectedIcon;

    public TabEntity(int selectedIcon, int unselectedIcon) {
        this.selectedIcon = selectedIcon;
        this.unselectedIcon = unselectedIcon;
    }

    @Override
    public String getTabTitle() {
        return null;
    }

    @Override
    public int getTabSelectedIcon() {
        return this.selectedIcon;
    }

    @Override
    public int getTabUnselectedIcon() {
        return this.unselectedIcon;
    }
}
