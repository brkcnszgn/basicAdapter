package com.brkcnszgn.basicadapter.util


import android.widget.TextView


fun TextView.extIsNullOrEmpty(getString : String?){
    text = if (getString != null && getString != "") getString else ""
}










