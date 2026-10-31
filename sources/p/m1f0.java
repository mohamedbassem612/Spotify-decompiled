package p;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m1f0 {
    public static final ScheduledExecutorService d = Executors.newSingleThreadScheduledExecutor();
    public final String a;
    public final ouz b;
    public final String c;

    public m1f0(Context context, String str) {
        PackageInfo packageInfo;
        this.a = str;
        this.b = new ouz(new rm5(context, str), (byte) 17);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final void a(String str, String str2) {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            Bundle bundleO = qtg.o("");
            bundleO.putString("2_result", "error");
            bundleO.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            bundleO.putString("3_method", str2);
            this.b.p(bundleO, str);
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }
}
