package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bbh {
    public final hrr0 a;
    public final hrr0 b;
    public final hrr0 c;
    public final hrr0 d;
    public final hrr0 e;
    public final hrr0 f;
    public final hrr0 g;
    public final hrr0 h;
    public final hrr0 i;
    public final hrr0 j;
    public final hrr0 k;
    public final hrr0 l;
    public final hrr0 m;

    public bbh(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        u7h u7hVar = new u7h(j);
        kcx0 kcx0Var = kcx0.R0;
        this.a = new hrr0(u7hVar, kcx0Var);
        this.b = new hrr0(new u7h(j2), kcx0Var);
        this.c = new hrr0(new u7h(j3), kcx0Var);
        this.d = new hrr0(new u7h(j4), kcx0Var);
        this.e = new hrr0(new u7h(j5), kcx0Var);
        this.f = new hrr0(new u7h(j6), kcx0Var);
        this.g = new hrr0(new u7h(j7), kcx0Var);
        this.h = new hrr0(new u7h(j8), kcx0Var);
        this.i = new hrr0(new u7h(j9), kcx0Var);
        this.j = new hrr0(new u7h(j10), kcx0Var);
        this.k = new hrr0(new u7h(j11), kcx0Var);
        this.l = new hrr0(new u7h(j12), kcx0Var);
        this.m = new hrr0(Boolean.TRUE, kcx0Var);
    }

    public final long a() {
        return ((u7h) this.k.getValue()).a;
    }

    public final long b() {
        return ((u7h) this.a.getValue()).a;
    }

    public final long c() {
        return ((u7h) this.f.getValue()).a;
    }

    public final boolean d() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final String toString() {
        String strH = u7h.h(b());
        String strH2 = u7h.h(((u7h) this.b.getValue()).a);
        String strH3 = u7h.h(((u7h) this.c.getValue()).a);
        String strH4 = u7h.h(((u7h) this.d.getValue()).a);
        String strH5 = u7h.h(((u7h) this.e.getValue()).a);
        String strH6 = u7h.h(c());
        String strH7 = u7h.h(((u7h) this.g.getValue()).a);
        String strH8 = u7h.h(((u7h) this.h.getValue()).a);
        String strH9 = u7h.h(((u7h) this.i.getValue()).a);
        String strH10 = u7h.h(((u7h) this.j.getValue()).a);
        String strH11 = u7h.h(a());
        String strH12 = u7h.h(((u7h) this.l.getValue()).a);
        boolean zD = d();
        StringBuilder sbN = gvg.n("Colors(primary=", strH, ", primaryVariant=", strH2, ", secondary=");
        bb00.j(sbN, strH3, ", secondaryVariant=", strH4, ", background=");
        bb00.j(sbN, strH5, ", surface=", strH6, ", error=");
        bb00.j(sbN, strH7, ", onPrimary=", strH8, ", onSecondary=");
        bb00.j(sbN, strH9, ", onBackground=", strH10, ", onSurface=");
        bb00.j(sbN, strH11, ", onError=", strH12, ", isLight=");
        return l1d.r(sbN, zD, ")");
    }
}
