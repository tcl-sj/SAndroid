package com.ss.sandroid;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import io.reactivex.disposables.Disposable;

public class MainActivity extends MBaseActivity {

    @Override
    public int getContentLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    public void initTitleBar() {
        initTitleView();
        setTitleTextLeft("返回", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "返回", Toast.LENGTH_SHORT).show();
            }
        });
        setTitle(R.string.app_name);
    }

    @Override
    public void onInit(Bundle savedInstanceState) {
        showLoadingDialog(true, new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                Toast.makeText(MainActivity.this, "dismiss", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onAttachView(Disposable d) {

    }
}
