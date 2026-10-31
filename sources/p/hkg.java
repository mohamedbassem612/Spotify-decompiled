package p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class hkg {
    public static boolean a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            try {
                return u890.j(context.getPackageManager().getInstallSourceInfo(str).getUpdateOwnerPackageName(), "com.sec.android.app.samsungapps");
            } catch (PackageManager.NameNotFoundException e) {
                n57.t("Failed to get installer package", e);
            }
        }
        return false;
    }
}
