package p;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mbo1 {
    public static final hdn1 c = new hdn1("AgeSignalsService");
    public final Context a;
    public final hzo1 b;

    public mbo1(Context context) {
        this.a = context;
        hdn1 hdn1Var = s5p1.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (s5p1.a(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        this.b = new hzo1(context, c, xan1.a);
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    hdn1Var.h("Play Store package is not found.", new Object[0]);
                }
            } else {
                hdn1Var.h("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            hdn1Var.h("Play Store package is not found.", new Object[0]);
        }
        this.b = null;
    }
}
