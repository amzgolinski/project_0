package com.example.android.myappportfolio;

import android.os.Bundle;
import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
          .setAction("Action", null).show();
      }
    });
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  public void mediaStreamerToast(View view) {
    this.showToast(getResources().getString(R.string.media_streamer_app_toast));
  }

  public void scoresToast(View view) {
    this.showToast(getResources().getString(R.string.scores_app_toast));
  }

  public void libraryToast(View view) {
    this.showToast(getResources().getString(R.string.library_app_toast));
  }

  public void buildItBiggerToast(View view) {
    this.showToast(getResources().getString(R.string.build_it_bigger_toast));
  }

  public void xyzReaderToast(View view) {
    this.showToast(getResources().getString(R.string.xyz_app_toast));
  }

  public void capstoneToast(View view) {
    this.showToast(getResources().getString(R.string.capstone_app_toast));
  }

  private void showToast(CharSequence toastToShow) {
    Context context = getApplicationContext();
    int duration = Toast.LENGTH_SHORT;
    Toast toast = Toast.makeText(context, toastToShow, duration);
    toast.setGravity(Gravity.CENTER, 0, 0);
    toast.show();
  }
}
