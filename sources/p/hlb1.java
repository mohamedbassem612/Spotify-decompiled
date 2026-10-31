package p;

import android.app.ActivityManager;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hlb1 implements vgn {
    public final ActivityManager a;
    public final q8n b;
    public final idd1 c = new idd1(l4b1.Q0);
    public final idd1 d = new idd1(l4b1.P0);

    public hlb1(ActivityManager activityManager, q8n q8nVar) {
        this.a = activityManager;
        this.b = q8nVar;
    }

    @Override // p.vgn
    public final mr20 b() {
        return Build.VERSION.SDK_INT < 35 ? r6x.a : x4p1.h(u4p1.b0(hu20.d(new mr20[]{(wen0) this.c.getValue(), (wen0) this.d.getValue()}), new glb1(this, (lnm) null)), new bi61((byte) 1));
    }
}
