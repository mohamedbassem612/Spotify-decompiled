package p;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wl5 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final rm5 h;

    public wl5(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, rm5 rm5Var) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = rm5Var;
    }

    public static wl5 a(Context context, dm70 dm70Var, String str, String str2, ArrayList arrayList, rm5 rm5Var) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strA = dm70Var.a.a(dm70Var.b);
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String string = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new wl5(str, str2, arrayList, strA, packageName, string, str3, rm5Var);
    }
}
