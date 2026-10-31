package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class do40 implements co40 {
    public final Context a;

    public do40(Context context) {
        this.a = context;
    }

    public final okb0 a() {
        Context context = this.a;
        String strB = b();
        if (strB == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(strB, 0);
            if ((applicationInfo.flags & 1) != 0) {
                return null;
            }
            return new okb0(strB, context.getPackageManager().getApplicationLabel(applicationInfo).toString(), Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(strB, PackageManager.PackageInfoFlags.of(0L)).versionName : context.getPackageManager().getPackageInfo(strB, 0).versionName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final String b() {
        ActivityInfo activityInfo;
        try {
            ResolveInfo resolveInfoResolveActivity = this.a.getPackageManager().resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 65536);
            if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null) {
                return activityInfo.packageName;
            }
        } catch (SecurityException unused) {
        }
        return null;
    }
}
