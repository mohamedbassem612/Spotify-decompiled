package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lcs {
    public final z8c0 a;
    public final kly0 b;

    public lcs(z8c0 z8c0Var, caq caqVar) {
        this.a = z8c0Var;
        this.b = caqVar;
    }

    public final void a(Context context, hxy0 hxy0Var, int i) {
        if (hxy0Var != hxy0.R0 && i != 5) {
            ((nto0) this.b.get()).a(hxy0Var.a(), ywx0.d(i), ywx0.e(3));
        }
        if (this.a.c()) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            x74.r0(context, intent);
            return;
        }
        Intent intent2 = new Intent();
        intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        if (Build.VERSION.SDK_INT >= 26) {
            intent2.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else {
            intent2.putExtra("app_package", context.getPackageName());
            intent2.putExtra("app_uid", context.getApplicationInfo().uid);
        }
        x74.r0(context, intent2);
    }
}
