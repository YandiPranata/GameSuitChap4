package com.example.suitsuit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iv_refresh.setOnClickListener {
            clear_score()
        }

        iv_gunting.setOnClickListener {
            iv_player.setImageDrawable(getResources().getDrawable(R.drawable.gunting))

            val computer_move = (1..4).random()

            if (computer_move == 1) {

                iv_com.setImageDrawable(getResources().getDrawable(R.drawable.batu));


                iv_vs.setImageDrawable(getResources().getDrawable(R.drawable.p2win))


            } else if (computer_move == 2) {


                iv_com.setImageDrawable(getResources().getDrawable(R.drawable.kertas));


                iv_vs.setImageDrawable(getResources().getDrawable(R.drawable.p1win))



            } else {


                iv_com.setImageDrawable(getResources().getDrawable(R.drawable.gunting));


                iv_vs.setImageDrawable(getResources().getDrawable(R.drawable.draw))
            }
        }

        iv_kertas.setOnClickListener {
            iv_player.setImageDrawable(getResources().getDrawable(R.drawable.kertas))

            val computer_move = (1..4).random()

            if (computer_move == 1) {

                iv_com.setImageDrawable(getResources().getDrawable(R.drawable.batu));


                iv_vs.setImageDrawable(getResources().getDrawable(R.drawable.p1win))


            } else if (computer_move == 2) {


                iv_com.setImageDrawable(getResources().getDrawable(R.drawable.kertas));


                iv_vs.setImageDrawable(getResources().getDrawable(R.drawable.draw))



            } else {


                iv_com.setImageDrawable(getResources().getDrawable(R.drawable.gunting));


                iv_vs.setImageDrawable(getResources().getDrawable(R.drawable.p2win))
            }
        }

        iv_batu.setOnClickListener {
            iv_player.setImageDrawable(getResources().getDrawable(R.drawable.batu))

            val computer_move = (1..4).random()

            if (computer_move == 1) {

                iv_com.setImageDrawable(getResources().getDrawable(R.drawable.batu));


                iv_vs.setImageDrawable(getResources().getDrawable(R.drawable.draw))


            } else if (computer_move == 2) {


                iv_com.setImageDrawable(getResources().getDrawable(R.drawable.kertas));


                iv_vs.setImageDrawable(getResources().getDrawable(R.drawable.p2win))


            } else {


                iv_com.setImageDrawable(getResources().getDrawable(R.drawable.gunting));


                iv_vs.setImageDrawable(getResources().getDrawable(R.drawable.p1win))
            }
        }
    }


        fun clear_score() {

            iv_player.setImageDrawable(getResources().getDrawable(R.drawable.restart))
            iv_com.setImageDrawable(getResources().getDrawable(R.drawable.restart))
        }
    }
