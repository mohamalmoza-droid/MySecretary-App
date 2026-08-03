package com.mysecretary.app

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // إنشاء واجهة الويب لعرض التصميم
        val webView = WebView(this)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()
        // تحميل الملف الرئيسي الذي رفعته سابقاً
        webView.loadUrl("file:///android_asset/index.html")
        setContentView(webView)
    }
}
