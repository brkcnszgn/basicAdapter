package com.brkcnszgn.basicadapter.ui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.brkcnszgn.BaseAdapter
import com.brkcnszgn.basicadapter.model.UserModel
import com.brkcnszgn.basicadapter.util.MockData
import com.brkcnszgn.basicadapter.util.RecyclerViewMargin
import com.brkcnszgn.basicadapter.util.Util
import com.brkcnszgn.basicadapter.util.extIsNullOrEmpty
import com.google.android.material.card.MaterialCardView
import com.mtek.basicadapter.R
import com.mtek.basicadapter.databinding.ActivityMainBinding
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {


    private var adapter: BaseAdapter<UserModel>? = null
    private var adapterList: ArrayList<UserModel> = arrayListOf()

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        adapterList = MockData.getMockData()
        setAdapter()

    }

    private fun setAdapter() {
        adapter =
            BaseAdapter(this, R.layout.row_item_main_layout, adapterList) { v, item, position ->
                val layoutRoot = v!!.findViewById(R.id.layoutRoot) as LinearLayout
                val imageView = v!!.findViewById(R.id.imageView) as ImageView
                val txtName = v!!.findViewById(R.id.txtName) as TextView
                val txtSubTitle = v!!.findViewById(R.id.txtSubTitle) as TextView

                Util.loadImage(
                    imageView,
                    item.imageUrl,
                    Util.getProgressDrawable(imageView.context)
                )
                txtName.extIsNullOrEmpty(item.name)
                txtSubTitle.extIsNullOrEmpty(item.subTitle)
                val rnd = Random()
                val colors: Int =
                    Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))

                layoutRoot.setBackgroundColor(colors)

                layoutRoot.setOnClickListener {
                    val rnd = Random()
                    val colors: Int =
                        Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))

                    layoutRoot.setBackgroundColor(colors)
                }


            }
        val decoration = RecyclerViewMargin(6, android.R.attr.numColumns)
        binding.recyclerView.addItemDecoration(decoration)
        binding.recyclerView.adapter = adapter
    }


}