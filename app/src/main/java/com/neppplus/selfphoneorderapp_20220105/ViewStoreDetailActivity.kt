package com.neppplus.selfphoneorderapp_20220105

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.neppplus.selfphoneorderapp_20220105.models.StoreData
import kotlinx.android.synthetic.main.activity_view_store_detail.*

class ViewStoreDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)

        val storeData = intent.getSerializableExtra("store") as StoreData

        txtStoreName.text = storeData.Name
        txtPhoneNum.text = storeData.phoneNum
        Glide.with(this).load(storeData.logoUrl).into(imgLogo)
    }
}