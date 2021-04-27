package com.example.movieton

import android.app.ActionBar
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.movieton.R
import com.example.movieton.data.Customer
import com.example.movieton.data.CustomerInit
import com.google.android.material.button.MaterialButton


class MainActivity : AppCompatActivity() {
    private lateinit var btn: MaterialButton;
    private lateinit var txtView: TextView;
    private lateinit var listOfCustomers: ArrayList<Customer>;
    private var copyCustomerObj = Customer("Bruce", 21);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView();
    }

    private fun initView() {
        btn = findViewById(R.id.btnClick);
        txtView = findViewById(R.id.textView);
        btn.setOnClickListener {
            CustomerInit.addCustomer(copyCustomerObj);
            CustomerInit.addCustomer(copyCustomerObj.copy(name = "Rally", age = 22));
            CustomerInit.addCustomer(copyCustomerObj.copy(name = "Mark", age = 33));
            listOfCustomers = CustomerInit.getCustomer();
            for (customer in listOfCustomers) {
                txtView.text = customer.name
                Log.i("Log", customer.name + " " + customer.age);
            }

        }

    }

}