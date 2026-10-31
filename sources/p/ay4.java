package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ay4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new sx4(this, (byte) 5));

    public ay4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        ay4 ay4Var = (ay4) this.c.getValue();
        return ay4Var != null ? ay4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("enable_podcast_charts_page", "android-podcast-charts-chartsv2", a()));
    }
}
