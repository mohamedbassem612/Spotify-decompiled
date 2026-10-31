package p;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zym0 implements ajg {
    public final String a;
    public final String b;
    public final idd1 c;
    public final idd1 d;
    public final idd1 e;

    public zym0(Application application, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = new idd1(new ft0(this, application, (byte) 15));
        this.d = new idd1(new dvg0(this, application, (byte) 25));
        this.e = new idd1(new zz40(this, application));
    }

    public static String d(PackageManager packageManager, String str) {
        try {
            return Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(str).getInstallingPackageName() : packageManager.getInstallerPackageName(str);
        } catch (PackageManager.NameNotFoundException e) {
            Logger.l(e, "Failed to get installer package", new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    public final Uri b() {
        String str;
        String strC = c();
        if (strC == null) {
            str = null;
        } else {
            int iHashCode = strC.hashCode();
            if (iHashCode != -1859733809) {
                if (iHashCode != -1225090538) {
                    if (iHashCode == -1046965711 && strC.equals("com.android.vending")) {
                        str = "market://details?id=";
                    } else {
                        str = null;
                    }
                } else if (strC.equals("com.sec.android.app.samsungapps")) {
                    str = "samsungapps://ProductDetail/";
                } else {
                    str = null;
                }
            } else if (strC.equals("com.amazon.venezia")) {
                str = "https://www.amazon.com/gp/mas/dl/android?p=";
            } else {
                str = null;
            }
        }
        if (str == null) {
            return null;
        }
        return Uri.parse(str + ((PackageInfo) this.c.getValue()).packageName);
    }

    public final String c() {
        return (String) this.d.getValue();
    }

    public final String e() {
        String str = ((PackageInfo) this.c.getValue()).versionName;
        str.getClass();
        return str;
    }
}
