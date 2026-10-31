package p;

import android.os.Build;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.notifications.permissionsimpl.reinstallprompt.NotificationPermissionRequestActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tso0 implements iyf0 {
    public static final bma1 h;
    public static final bma1 i;
    public static final bma1 t;
    public final dg30 a;
    public final dto0 b;
    public final dma1 c;
    public final dma1 d;
    public final z8c0 e;
    public final yqg f;
    public final eso0 g;

    static {
        nbc nbcVar = bma1.b;
        h = nbcVar.k("allboarding_notification_permission_screen_shown");
        i = nbcVar.k("notification_permission_os_system_prompt_requested_count");
        t = nbcVar.q("notification_permission_education_screen_shown_timestamp");
    }

    public tso0(dg30 dg30Var, dto0 dto0Var, dma1 dma1Var, dma1 dma1Var2, z8c0 z8c0Var, yqg yqgVar, eso0 eso0Var) {
        this.a = dg30Var;
        this.b = dto0Var;
        this.c = dma1Var;
        this.d = dma1Var2;
        this.e = z8c0Var;
        this.f = yqgVar;
        this.g = eso0Var;
    }

    @Override // p.iyf0
    public final void c() {
        if (this.e.g()) {
            this.g.getClass();
            bma1 bma1VarH = bma1.b.h();
            boolean zH = bma1VarH != null ? this.d.h(bma1VarH, false) : false;
            bma1 bma1Var = h;
            dma1 dma1Var = this.c;
            boolean z = zH || dma1Var.h(bma1Var, false);
            Logger.g("Reinstall prompt check - onboarding completed: " + z, new Object[0]);
            dg30 dg30Var = this.a;
            long j = dg30Var.getPackageManager().getPackageInfo(dg30Var.getPackageName(), 0).firstInstallTime;
            long j2 = dg30Var.getPackageManager().getPackageInfo(dg30Var.getPackageName(), 0).lastUpdateTime;
            yqg yqgVar = this.f;
            bma1 bma1Var2 = t;
            if (z) {
                l1d.B(yqgVar, dma1Var.edit(), bma1Var2);
                return;
            }
            Logger.g("Reinstall prompt check - reinstall check: " + (j == j2), new Object[0]);
            if (j != j2 || dma1Var.g(bma1Var2, 0L) != 0 || this.b.a.g(dg30Var) || ag0.C0(dg30Var, "android.permission.POST_NOTIFICATIONS") || Build.VERSION.SDK_INT < 33) {
                return;
            }
            Logger.g("Reinstall prompt check - attempt to start activity", new Object[0]);
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.c(bma1Var2, yqgVar.b());
            hma1VarEdit.h();
            int i2 = NotificationPermissionRequestActivity.h1;
            flo1.r(dg30Var);
        }
    }

    @Override // p.iyf0
    public final void d() {
    }

    @Override // p.iyf0
    public final void g(ViewGroup viewGroup) {
    }
}
