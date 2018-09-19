package app.akexorcist.bluetoothspp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class Main extends Activity implements OnClickListener {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btnSimple = findViewById(R.id.btnSimple);
        btnSimple.setOnClickListener(this);

        Button btnListener = findViewById(R.id.btnListener);
        btnListener.setOnClickListener(this);

        Button btnDeviceList = findViewById(R.id.btnDeviceList);
        btnDeviceList.setOnClickListener(this);

        Button btnTerminal = findViewById(R.id.btnTerminal);
        btnTerminal.setOnClickListener(this);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void onClick(View v) {
        int id = v.getId();
        Intent intent;
        switch (id) {
            case R.id.btnSimple:
                intent = new Intent(getApplicationContext(), LoginActivity.class);//身份验证活动
                startActivity(intent);
                break;
            case R.id.btnListener:
                intent = new Intent(getApplicationContext(), ListenerActivity.class);//消息管理活动
                startActivity(intent);
                break;

            case R.id.btnDeviceList:
                intent = new Intent(getApplicationContext(), DeviceListActivity.class);//资料上传活动
                startActivity(intent);
                break;
            case R.id.btnTerminal:
                intent = new Intent(getApplicationContext(), TerminalActivity.class);//请假单活动
                startActivity(intent);
                break;
        }
    }
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };
}
