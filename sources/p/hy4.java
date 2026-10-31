package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hy4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new sx4(this, (byte) 12));

    public hy4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        hy4 hy4Var = (hy4) this.c.getValue();
        return hy4Var != null ? hy4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("enable_sleeptimer_nudge", "android-podcastexperience-sleeptimernudge", a()));
    }
}
