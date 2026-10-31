package p;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.protobuf.h;
import com.spotify.contexts.ApplicationAndroid;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wz5 implements r900 {
    public final long a;
    public final String b;

    public wz5(Context context, zq4 zq4Var) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            zq4Var.e("Error in retrieving package information.", e);
            packageInfo = null;
        }
        if (packageInfo == null) {
            this.a = 0L;
            this.b = "";
        } else {
            this.a = packageInfo.versionCode;
            String str = packageInfo.versionName;
            this.b = str != null ? str : "";
        }
    }

    @Override // p.r900
    public final String a() {
        return "context_application_android";
    }

    @Override // p.r900
    public final h getData() {
        vz5 vz5VarN = ApplicationAndroid.n();
        vz5VarN.n(this.a);
        vz5VarN.q(this.b);
        return vz5VarN.build();
    }
}
