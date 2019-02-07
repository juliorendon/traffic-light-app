package org.jotace.trafficlightapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickRedButton(target: View) {
        redButton.setBackgroundResource(R.drawable.round_red);
        yellowButton.setBackgroundResource(R.drawable.round_yellow_off);
        greenButton.setBackgroundResource(R.drawable.round_green_off);

        activeColor.setColorFilter(ContextCompat.getColor(baseContext, R.color.red));
    }

    fun clickYellowButton(target: View) {
        redButton.setBackgroundResource(R.drawable.round_red_off);
        yellowButton.setBackgroundResource(R.drawable.round_yellow);
        greenButton.setBackgroundResource(R.drawable.round_green_off);

        activeColor.setColorFilter(ContextCompat.getColor(baseContext, R.color.yellow));
    }

    fun clickGreenButton(target: View) {
        redButton.setBackgroundResource(R.drawable.round_red_off);
        yellowButton.setBackgroundResource(R.drawable.round_yellow_off);
        greenButton.setBackgroundResource(R.drawable.round_green);

        activeColor.setColorFilter(ContextCompat.getColor(baseContext, R.color.green));
    }

}
