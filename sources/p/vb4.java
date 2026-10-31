package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vb4 implements pdy0 {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final luk e;
    public final idd1 f = new idd1(new u74(this, (byte) 29));

    public vb4(boolean z, int i, int i2, int i3, luk lukVar) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = lukVar;
    }

    public final boolean a() {
        vb4 vb4Var = (vb4) this.f.getValue();
        return vb4Var != null ? vb4Var.a() : this.a;
    }

    public final int b() {
        vb4 vb4Var = (vb4) this.f.getValue();
        return vb4Var != null ? vb4Var.b() : this.b;
    }

    public final int c() {
        vb4 vb4Var = (vb4) this.f.getValue();
        return vb4Var != null ? vb4Var.c() : this.c;
    }

    public final int d() {
        vb4 vb4Var = (vb4) this.f.getValue();
        return vb4Var != null ? vb4Var.d() : this.d;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enabled", "android-crash-reporting-anr-watchdog", a()), new fpb("max_stalls_per_hour", "android-crash-reporting-anr-watchdog", b(), 1, 30), new fpb("poll_interval_ms", "android-crash-reporting-anr-watchdog", c(), 500, 2000), new fpb("stall_threshold_ms", "android-crash-reporting-anr-watchdog", d(), 500, 10000)});
    }
}
