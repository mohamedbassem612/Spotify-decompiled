package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kx4 implements pdy0 {
    public final boolean a;
    public final int b;
    public final int c;
    public final luk d;
    public final idd1 e = new idd1(new fv4(this, (byte) 25));

    public kx4(boolean z, int i, int i2, luk lukVar) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = lukVar;
    }

    public final boolean a() {
        kx4 kx4Var = (kx4) this.e.getValue();
        return kx4Var != null ? kx4Var.a() : this.a;
    }

    public final int b() {
        kx4 kx4Var = (kx4) this.e.getValue();
        return kx4Var != null ? kx4Var.b() : this.b;
    }

    public final int c() {
        kx4 kx4Var = (kx4) this.e.getValue();
        return kx4Var != null ? kx4Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("playback_instrumentation_enabled", "android-play-telemetry-playback-oops-instrumentation-impl", a()), new fpb("playback_start_baseline_oops_sampling_bps", "android-play-telemetry-playback-oops-instrumentation-impl", b(), 0, 10000), new fpb("playback_start_detailed_oops_sampling_bps", "android-play-telemetry-playback-oops-instrumentation-impl", c(), 0, 10000));
    }
}
