package com.example.helanewsreporting

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.helanewsreporting.ViewReportActivity
import com.example.helanewsreporting.ApprovedReportActivity
import  com.example.helanewsreporting.NewReportActivity
import com.example.helanewsreporting.PendingReportActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Ensure this XML file exists

        findViewById<View>(R.id.btn_add_report).setOnClickListener {
            startActivity(Intent(this, NewReportActivity::class.java))
        }

        findViewById<View>(R.id.btn_pending_reports).setOnClickListener {
            startActivity(Intent(this, PendingReportActivity::class.java))
        }

        findViewById<View>(R.id.btn_approved_reports).setOnClickListener {
            startActivity(Intent(this, ApprovedReportActivity::class.java))
        }

        findViewById<View>(R.id.btn_view_reports).setOnClickListener {
            startActivity(Intent(this, ViewReportActivity::class.java))
        }
    }
}
