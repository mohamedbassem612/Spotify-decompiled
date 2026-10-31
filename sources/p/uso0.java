package p;

import android.app.Activity;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uso0 {
    public static final bma1 c;
    public static final bma1 d;
    public final Activity a;
    public final dma1 b;

    static {
        nbc nbcVar = bma1.b;
        c = nbcVar.k("allboarding_notification_permission_screen_shown");
        d = nbcVar.k("notification_permission_rationale_requested");
    }

    public uso0(Activity activity, dma1 dma1Var) {
        this.a = activity;
        this.b = dma1Var;
    }

    public final int a() {
        if (Build.VERSION.SDK_INT < 33) {
            return 1;
        }
        Activity activity = this.a;
        if (x74.j(activity, "android.permission.POST_NOTIFICATIONS") == 0) {
            return 5;
        }
        boolean zC0 = ag0.C0(activity, "android.permission.POST_NOTIFICATIONS");
        bma1 bma1Var = d;
        dma1 dma1Var = this.b;
        if (!zC0) {
            return dma1Var.h(bma1Var, false) ? 4 : 2;
        }
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.a(bma1Var, true);
        hma1VarEdit.g();
        return 3;
    }
}
