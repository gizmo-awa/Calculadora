package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var operationText: TextView? = null
    private var num1: Double = 0.0
    private var num2: Double = 0.0
    private var result: Double = 0.0
    private var operation: Int = 0
    private var PushDecimal: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnZero: Button = findViewById<Button>(R.id.button_0);
        val btnOne: Button = findViewById<Button>(R.id.button_1);
        val btnTwo: Button = findViewById<Button>(R.id.button_2);
        val btnThree: Button = findViewById<Button>(R.id.button_3);
        val btnFour: Button = findViewById<Button>(R.id.button_4);
        val btnFive: Button = findViewById<Button>(R.id.button_5);
        val btnSix: Button = findViewById<Button>(R.id.button_6);
        val btnSeven: Button = findViewById<Button>(R.id.button_7);
        val btnEight: Button = findViewById<Button>(R.id.button_8);
        val btnNine: Button = findViewById<Button>(R.id.button_9);
        val btnPlus: Button = findViewById<Button>(R.id.button_plus)
        val btnMinus: Button = findViewById<Button>(R.id.button_minus)
        val btnEqual: Button = findViewById<Button>(R.id.button_equal)
        val btnDecimal: Button = findViewById<Button>(R.id.button_decimal)
        val btnDivision: Button = findViewById(R.id.button_division)
        val btnProduct: Button = findViewById<Button>(R.id.button_product)
        val btnClear: Button = findViewById<Button>(R.id.button_clear)

        operationText = findViewById<TextView>(R.id.Result)

        btnZero.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?){
                if(operationText?.text=="0"){
                    operationText?.text = ""
                }
                operationText?.text = "${operationText?.text}0"
            }

        })

        btnOne.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?){
                if(operationText?.text=="0"){
                    operationText?.text = ""
                }
                operationText?.text = "${operationText?.text}1"
            }

        })

        btnTwo.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?){
                if(operationText?.text=="0"){
                    operationText?.text = ""
                }
                operationText?.text = "${operationText?.text}2"
            }

        })

        btnThree.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?){
                if(operationText?.text=="0"){
                    operationText?.text = ""
                }
                operationText?.text = "${operationText?.text}3"
            }

        })

        btnFour.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?){
                if(operationText?.text=="0"){
                    operationText?.text = ""
                }
                operationText?.text = "${operationText?.text}4"
            }

        })

        btnFive.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?){
                if(operationText?.text=="0"){
                    operationText?.text = ""
                }
                operationText?.text = "${operationText?.text}5"
            }

        })

        btnSix.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?){
                if(operationText?.text=="0"){
                    operationText?.text = ""
                }
                operationText?.text = "${operationText?.text}6"
            }

        })

        btnSeven.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?){
                if(operationText?.text=="0"){
                    operationText?.text = ""
                }
                operationText?.text = "${operationText?.text}7"
            }

        })

        btnEight.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?){
                if(operationText?.text=="0"){
                    operationText?.text = ""
                }
                operationText?.text = "${operationText?.text}8"
            }

        })

        btnNine.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?){
                if(operationText?.text=="0"){
                    operationText?.text = ""
                }
                operationText?.text = "${operationText?.text}9"
            }

        })

        btnPlus.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?){
                num1 = operationText?.text.toString().toDouble()
                operation = 1
                operationText?.text = "0"
                PushDecimal = false


            }

        })

        btnMinus.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?){
                num1 = operationText?.text.toString().toDouble()
                operation = 2
                operationText?.text = "0"
                PushDecimal = false
            }

        })


        btnDecimal.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?){
                if(!PushDecimal){
                    operationText?.text = "${operationText?.text}."
                    PushDecimal = true
                }
            }

        })

        btnDivision.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?){
                num1 = operationText?.text.toString().toDouble()
                operation = 4
                operationText?.text = "0"
                PushDecimal = false
            }

        })

        btnProduct.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?){
                num1 = operationText?.text.toString().toDouble()
                operation = 3
                operationText?.text = "0"
                PushDecimal = false
            }

        })
        btnClear.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?){
                num1 = 0.0
                num2 = 0.0
                operation = 0
                operationText?.text = "0"
                PushDecimal = false
            }

        })

        btnEqual.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?){
                if(operation != 0)
                    num2 = operationText?.text.toString().toDouble()
                result = when (operation){
                    1 -> num1 + num2
                    2 -> num1 - num2
                    3 -> num1 * num2
                    else -> num1 / num2
                }
                operation = 0;
                operationText?.text = result.toString()
                PushDecimal = false


            }

        })


        

    }

}