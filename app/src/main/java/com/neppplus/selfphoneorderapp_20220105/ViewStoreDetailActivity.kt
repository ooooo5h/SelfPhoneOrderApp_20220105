package com.neppplus.selfphoneorderapp_20220105

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.normal.TedPermission
import com.neppplus.selfphoneorderapp_20220105.models.StoreData
import kotlinx.android.synthetic.main.activity_view_store_detail.*
import java.util.jar.Manifest

class ViewStoreDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)

        val storeData = intent.getSerializableExtra("store") as StoreData

        txtStoreName.text = storeData.Name
        txtPhoneNum.text = storeData.phoneNum
        Glide.with(this).load(storeData.logoUrl).into(imgLogo)
        txtLink.text = storeData.website

        btnMoveWebSite.setOnClickListener {

            val myIntent = Intent(Intent.ACTION_VIEW, Uri.parse(storeData.website))
            startActivity(myIntent)

        }

        btnCall.setOnClickListener {

            val pl = object : PermissionListener {
                override fun onPermissionGranted() {

                    val myUri = Uri.parse("tel:${storeData.phoneNum}")
                    val myIntent = Intent(Intent.ACTION_CALL, myUri)
                    startActivity(myIntent)
                }


                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {

                    Toast.makeText(this@ViewStoreDetailActivity, "권한이 거절되었습니다.", Toast.LENGTH_SHORT).show()
                }
            }

            TedPermission.create()
                .setPermissionListener(pl)
                .setPermissions(android.Manifest.permission.CALL_PHONE)
                .check()

        }
    }
}