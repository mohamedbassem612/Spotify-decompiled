package p;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s2s0 {
    public final Context a;
    public final Handler b;

    public s2s0(Context context, Handler handler) {
        this.a = context;
        this.b = handler;
    }

    public final boolean a(e3s0 e3s0Var) {
        Object next;
        Iterator<T> it = this.a.getPackageManager().getInstalledPackages(0).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((PackageInfo) next).packageName, e3s0Var.a()));
        PackageInfo packageInfo = (PackageInfo) next;
        if (packageInfo != null) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            Boolean boolValueOf = applicationInfo != null ? Boolean.valueOf(applicationInfo.enabled) : null;
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
        }
        return false;
    }
}
