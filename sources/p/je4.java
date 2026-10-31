package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class je4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new wb4(this, (byte) 25));

    public je4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
    }

    public final boolean a() {
        je4 je4Var = (je4) this.e.getValue();
        return je4Var != null ? je4Var.a() : this.a;
    }

    public final boolean b() {
        je4 je4Var = (je4) this.e.getValue();
        return je4Var != null ? je4Var.b() : this.b;
    }

    public final boolean c() {
        je4 je4Var = (je4) this.e.getValue();
        return je4Var != null ? je4Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_continuation_cluster", "android-engagesdk-engagecontinuationcluster", a()), new fpb("observe_recently_played", "android-engagesdk-engagecontinuationcluster", b()), new fpb("schedule_on_start", "android-engagesdk-engagecontinuationcluster", c()));
    }
}
