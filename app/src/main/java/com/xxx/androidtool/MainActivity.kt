package com.xxx.androidtool

import android.content.Context
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tv)?.text = getText(this)
    }

    private fun getText(context: Context): String {
        val sb = StringBuffer()
        sb.append("手机制造商: ")
        sb.append(AndroidInfo.phoneManufacturer)
        sb.append("\n")

        sb.append("手机品牌: ")
        sb.append(AndroidInfo.phoneBrand)
        sb.append("\n")

        sb.append("手机型号: ")
        sb.append(AndroidInfo.phoneModel)
        sb.append("\n")

        sb.append("手机 Android 版本: ")
        sb.append(AndroidInfo.androidSystemVersion)
        sb.append("\n")

        sb.append("手机 Android SDK: ")
        sb.append(AndroidInfo.androidSDKVersion)
        sb.append("\n")

        sb.append("This App TargetSDK: ")
        sb.append(AndroidInfo.getAppTargetSdk(this))
        sb.append("\n")

        sb.append("This App 包名: ")
        sb.append(AndroidInfo.getPackageName(context))
        sb.append("\n")

        sb.append("App VersionName: ")
        sb.append(AndroidInfo.getVersionName(context))
        sb.append("\n")

        sb.append("App VersionCode: ")
        sb.append(AndroidInfo.getVersionCode(context))
        sb.append("\n")

        sb.append("Density: ")
        sb.append(AndroidInfo.getDensity(context))
        sb.append("\n")

        sb.append("(DensityDpi / 160): ")
        sb.append(AndroidInfo.getDensityDpi(context) / 160.0F)
        sb.append("\n")

        sb.append("DensityDpi: ")
        sb.append(AndroidInfo.getDensityDpi(context))
        sb.append("\n")

        sb.append("WidthPx: ")
        sb.append(AndroidInfo.getWidthPx(context))
        sb.append("\n")

        sb.append("HeightPx: ")
        sb.append(AndroidInfo.getHeightPx(context))
        sb.append("\n")

        sb.append("WidthDp: ")
        sb.append(AndroidInfo.getWidthDp(context))
        sb.append("\n")

        sb.append("WidthDp2: ")
        sb.append(AndroidInfo.getWidthDp2(context))
        sb.append("\n")

        sb.append("HeightDp: ")
        sb.append(AndroidInfo.getHeightDp(context))
        sb.append("\n")

        return sb.toString()
    }

}