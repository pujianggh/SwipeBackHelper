package com.swipeback.action;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

/**
 * @author pujiang
 * @date 2017-9-3 22:09
 * @mail 515210530@qq.com
 * @Description:
 */

public class TwoActivity extends BaseSwipeBackActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_two);
    }
}
