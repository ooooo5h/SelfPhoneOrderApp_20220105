package com.neppplus.selfphoneorderapp_20220105.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.neppplus.selfphoneorderapp_20220105.R
import com.neppplus.selfphoneorderapp_20220105.models.StoreData

class StoreAdapter(
    val mContext : Context,
    val mList : List<StoreData>) : RecyclerView.Adapter<StoreAdapter.MyViewHolder>() {

    inner class MyViewHolder(row : View) : RecyclerView.ViewHolder(row){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val row = LayoutInflater.from(mContext).inflate(R.layout.store_list_item, parent, false)
        return MyViewHolder(row)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return mList.size
    }
}