package com.bugrahanuslu.counterproject

import android.media.AudioManager
import android.media.ToneGenerator
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Abstract Class




        }

        fun tenSec(view: View){

            Toast.makeText(this@MainActivity,"Timer Started !!!",Toast.LENGTH_LONG).show()
            val toneGen1 = ToneGenerator(AudioManager.STREAM_MUSIC, 100)



            object : CountDownTimer(10000,1000) {
                override fun onTick(p0: Long) {

                    if (p0/1000<=5){
                        toneGen1.startTone(ToneGenerator.TONE_CDMA_PIP, 150)
                        textView.text="Kalan:${p0/1000}"
                    }
                    else{
                        textView.text="Kalan:${p0/1000}"
                    }

                }

                override fun onFinish() {
                    Toast.makeText(this@MainActivity,"Time is over !!!",Toast.LENGTH_LONG).show()
                    toneGen1.startTone(ToneGenerator.TONE_CDMA_EMERGENCY_RINGBACK,500)
                    textView.text="SET THE TIMER"

                }
            }.start()




        }

        fun twentySec(view:View){
            Toast.makeText(this@MainActivity,"Timer Started !!!",Toast.LENGTH_LONG).show()
            val toneGen1 = ToneGenerator(AudioManager.STREAM_MUSIC, 100)

            object : CountDownTimer(20000,1000) {
                override fun onTick(p0: Long) {
                    if (p0/1000<=5){
                        toneGen1.startTone(ToneGenerator.TONE_CDMA_PIP, 150)
                        textView.text="Kalan:${p0/1000}"
                    }
                    else{
                        textView.text="Kalan:${p0/1000}"
                    }

                }

                override fun onFinish() {

                    Toast.makeText(this@MainActivity,"Time is over !!!",Toast.LENGTH_LONG).show()
                    toneGen1.startTone(ToneGenerator.TONE_CDMA_EMERGENCY_RINGBACK,500)
                    textView.text="SET THE TIMER"

                }
            }.start()

        }
    fun thirtySec(view:View){
        Toast.makeText(this@MainActivity,"Timer Started !!!",Toast.LENGTH_LONG).show()
        val toneGen1 = ToneGenerator(AudioManager.STREAM_MUSIC, 100)

        object : CountDownTimer(30000,1000) {
            override fun onTick(p0: Long) {
                if (p0/1000<=5){
                    toneGen1.startTone(ToneGenerator.TONE_CDMA_PIP, 150)
                    textView.text="Kalan:${p0/1000}"
                }
                else{
                    textView.text="Kalan:${p0/1000}"
                }
            }

            override fun onFinish() {
                Toast.makeText(this@MainActivity,"Time is over !!!",Toast.LENGTH_LONG).show()
                toneGen1.startTone(ToneGenerator.TONE_CDMA_EMERGENCY_RINGBACK,500)
                textView.text="SET THE TIMER"

            }
        }.start()

    }


    }
