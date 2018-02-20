package uu.pss_group.f.codechat.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ScrollView;
import uu.pss_group.f.codechat.R;

public class ConversationActivity extends AppCompatActivity {
    //Attributes
    private ScrollView scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversation);
        scroll = findViewById(R.id.scroll);
        ViewController cont = new ViewController(this);
        scroll.addView(cont.loadConversation());
        scroll.post(new Runnable() {
            @Override
            public void run() {
                scroll.fullScroll(ScrollView.FOCUS_DOWN);
            }
        });
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }
}
