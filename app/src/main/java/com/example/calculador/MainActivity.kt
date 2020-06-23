package com.example.calculador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt_calcular.setOnClickListener {
            var banda_1="0"
            var banda_2="0"
            var banda_3=0.0
            var banda_4="0"
            val comb: String
            if (rb_1.isChecked) banda_1 = "1"
            if (rb_2.isChecked) banda_1 = "2"
            if (rb_3.isChecked) banda_1 = "3"
            if (rb_4.isChecked) banda_1 = "4"
            if (rb_5.isChecked) banda_1 = "5"
            if (rb_6.isChecked) banda_1 = "6"
            if (rb_7.isChecked) banda_1 = "7"
            if (rb_8.isChecked) banda_1 = "8"
            if (rb_9.isChecked) banda_1 = "9"
            if (rb_10.isChecked) banda_2 = "0"
            if (rb_11.isChecked) banda_2 = "1"
            if (rb_12.isChecked) banda_2 = "2"
            if (rb_13.isChecked) banda_2 = "3"
            if (rb_14.isChecked) banda_2 = "4"
            if (rb_15.isChecked) banda_2 = "5"
            if (rb_16.isChecked) banda_2 = "6"
            if (rb_17.isChecked) banda_2 = "7"
            if (rb_18.isChecked) banda_2 = "8"
            if (rb_19.isChecked) banda_2 = "9"
            if (rb_20.isChecked) banda_3 = 1.0
            if (rb_21.isChecked) banda_3 = 10.0
            if (rb_22.isChecked) banda_3 = 100.0
            if (rb_23.isChecked) banda_3 = 1000.0
            if (rb_24.isChecked) banda_3 = 10000.0
            if (rb_25.isChecked) banda_3 = 100000.0
            if (rb_26.isChecked) banda_3 = 1000000.0
            if (rb_27.isChecked) banda_3 = 10000000.0
            if (rb_28.isChecked) banda_3 = 100000000.0
            if (rb_29.isChecked) banda_3 = 1000000000.0
            if (rb_30.isChecked) banda_4 = "1"
            if (rb_31.isChecked) banda_4 = "2"
            if (rb_32.isChecked) banda_4 = "0.5"
            if (rb_33.isChecked) banda_4 = "0.25"
            if (rb_34.isChecked) banda_4 = "0.1"
            if (rb_35.isChecked) banda_4 = "0.05"
            if (rb_36.isChecked) banda_4 = "5"
            if (rb_37.isChecked) banda_4 = "10"
            comb = banda_1.plus(banda_2)
            val op_comb: Double = comb.toDouble()
            var resistencia: Double
            resistencia = op_comb * banda_3
            if (resistencia == 0.0){
                tv_resultado.text="Resistencia de 1 ohmio"
            }
            else{
                if (resistencia>=1000000000){
                    resistencia /= 1000000000
                    resistencia = Math.round(resistencia * 100.0) / 100.0
                    tv_resultado.text=" Resistencia de $resistencia Gigaohmios \n Tolerancia de $banda_4 %"
                }
                else {
                    if (resistencia>=1000000){
                        resistencia /= 1000000
                        resistencia = Math.round(resistencia * 100.0) / 100.0
                        tv_resultado.text=" Resistencia de $resistencia Megaohmios \n Tolerancia de $banda_4 %"
                    }
                    else {
                        if (resistencia>=1000){
                            resistencia /= 1000
                            resistencia = Math.round(resistencia * 100.0) / 100.0
                            tv_resultado.text=" Resistencia de $resistencia Kiloohmios \n Tolerancia de $banda_4 %"
                        }
                        else{
                            tv_resultado.text=" Resistencia de $resistencia Ohmios \n Tolerancia de $banda_4 %"
                        }
                    }
                }
            }
        }
    }
}