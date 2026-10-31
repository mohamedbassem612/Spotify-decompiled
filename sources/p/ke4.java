package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ke4 implements pdy0 {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final luk d;
    public final idd1 e;

    public ke4(int i, luk lukVar, boolean z, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = lukVar;
        this.e = new idd1(new wb4(this, (byte) 26));
    }

    public final boolean a() {
        ke4 ke4Var = (ke4) this.e.getValue();
        return ke4Var != null ? ke4Var.a() : this.a;
    }

    public final int b() {
        ke4 ke4Var = (ke4) this.e.getValue();
        return ke4Var != null ? ke4Var.b() : this.b;
    }

    public final boolean c() {
        ke4 ke4Var = (ke4) this.e.getValue();
        return ke4Var != null ? ke4Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_recommendations_cluster", "android-engagesdk-engagerecommendationscluster", a()), new fpb("publish_cadence_hours", "android-engagesdk-engagerecommendationscluster", b(), 1, 24), new fpb("schedule_on_start", "android-engagesdk-engagerecommendationscluster", c()));
    }

    public ke4(luk lukVar) {
        this(12, lukVar, false, false);
    }
}
