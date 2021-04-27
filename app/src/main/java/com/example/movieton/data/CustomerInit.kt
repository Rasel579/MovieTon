package com.example.movieton.data

class CustomerInit {
    companion object {
        private var listOfCustomer: ArrayList<Customer> = ArrayList();
        fun addCustomer(customer: Customer) {
            listOfCustomer.add(customer);
        }

        fun getCustomer() = listOfCustomer;
    }

}