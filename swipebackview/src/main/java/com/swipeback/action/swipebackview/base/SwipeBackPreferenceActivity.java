
package com.swipeback.action.swipebackview.base;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.View;
import com.swipeback.action.swipebackview.util.SwipeBackLayout;

/**
 * SwipeBackActivityBase
 *
 * @author pujiang
 * @date 2017-9-3 21:54
 * @mail 515210530@qq.com
 * @Description:
 */
public class SwipeBackPreferenceActivity extends PreferenceActivity implements SwipeBackActivityBase {
    private SwipeBackActivityHelper mHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mHelper = new SwipeBackActivityHelper(this);
        mHelper.onActivityCreate();
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mHelper.onPostCreate();
    }

    @Override
    public View findViewById(int id) {
        View v = super.findViewById(id);
        if (v == null && mHelper != null)
            return mHelper.findViewById(id);
        return v;
    }

    @Override
    public SwipeBackLayout getSwipeBackLayout() {
        return mHelper.getSwipeBackLayout();
    }

    @Override
    public void setSwipeBackEnable(boolean enable) {
        getSwipeBackLayout().setEnableGesture(enable);
    }

    @Override
    public void scrollToFinishActivity() {
        getSwipeBackLayout().scrollToFinishActivity();
    }
}
