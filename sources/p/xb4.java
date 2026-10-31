package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xb4 implements pdy0 {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final luk e;
    public final idd1 f = new idd1(new wb4(this, (byte) 0));

    public xb4(boolean z, int i, int i2, int i3, lw21 lw21Var) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = lw21Var;
    }

    public final boolean a() {
        xb4 xb4Var = (xb4) this.f.getValue();
        return xb4Var != null ? xb4Var.a() : this.a;
    }

    public final int b() {
        xb4 xb4Var = (xb4) this.f.getValue();
        return xb4Var != null ? xb4Var.b() : this.b;
    }

    public final int c() {
        xb4 xb4Var = (xb4) this.f.getValue();
        return xb4Var != null ? xb4Var.c() : this.c;
    }

    public final int d() {
        xb4 xb4Var = (xb4) this.f.getValue();
        return xb4Var != null ? xb4Var.d() : this.d;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enabled", "android-crash-reporting-process-load-monitor", a()), new fpb("importance_sampling_frequency", "android-crash-reporting-process-load-monitor", b(), 1, 600), new fpb("resource_sampling_interval_ms", "android-crash-reporting-process-load-monitor", c(), 1000, 600000), new fpb("stall_sampling_interval_ms", "android-crash-reporting-process-load-monitor", d(), 100, 60000)});
    }
}
