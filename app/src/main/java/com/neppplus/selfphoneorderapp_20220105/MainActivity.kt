package com.neppplus.selfphoneorderapp_20220105

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.neppplus.selfphoneorderapp_20220105.adapters.StoreAdapter
import com.neppplus.selfphoneorderapp_20220105.models.StoreData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStoreList = ArrayList<StoreData>()

    lateinit var mStoreAdapter : StoreAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStoreList.add(StoreData("피자헛", "1588-5588", "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg", "https://www.pizzahut.co.kr/main"))
        mStoreList.add(StoreData("파파존스", "1577-8080", "http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800", "https://pji.co.kr/w_main"))
        mStoreList.add(StoreData("미스터 피자", "1577-0077", "https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200", "https://www.mrpizza.co.kr/"))
        mStoreList.add(StoreData("도미노 피자", "1577-3082", "https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png", "https://web.dominos.co.kr/main"))
        mStoreList.add(StoreData("피자애", "1899-7600", "https://media.istockphoto.com/vectors/italian-pizza-logo-taste-of-italy-symbol-for-pizzeria-circular-with-vector-id1129190754?s=612x612", "http://www.pizzalove.co.kr/"))
        mStoreList.add(StoreData("피자에땅", "1688-3651", "https://mblogthumb-phinf.pstatic.net/20160530_214/ppanppane_1464617804922knKn4_PNG/%C7%C7%C0%DA%BF%A1%B6%A5_%B7%CE%B0%ED_%282%29.png?type=w800", "https://www.pizzaetang.com/intro.asp"))

        mStoreAdapter = StoreAdapter(this, mStoreList)
        storeRecyclerView.adapter = mStoreAdapter
        storeRecyclerView.layoutManager = LinearLayoutManager(this)

    }
}