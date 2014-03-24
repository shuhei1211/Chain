
package jp.shuhei.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

import jp.shuhei.chain.ChainIntent;
import jp.shuhei.chain.R;
import jp.shuhei.model.ChCon;

public class Demo extends Activity {

    ChainIntent chainIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        chainIntent = new ChainIntent(this);


        findViewById(R.id.button1).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                chainIntent.actionSpecificPackage(ChCon.YAHOO, null);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.demo, menu);
        return true;
    }

}
