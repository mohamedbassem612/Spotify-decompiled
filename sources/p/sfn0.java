package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sfn0 {
    public final p410 a;
    public final rgn0 b;

    public sfn0(p410 p410Var, rgn0 rgn0Var, u9c0 u9c0Var) {
        this.a = p410Var;
        this.b = rgn0Var;
        fn31.T(u9c0Var, (o8n) null, 0, new uug0(this, (lnm) null, (byte) 20), 3);
    }

    public final void a(String str) {
        this.b.a.m((Object) null, new ogn0(true));
        p410 p410Var = this.a;
        p410Var.D();
        fn31.T((u9c0) p410Var.c, (o8n) null, 0, new ary(p410Var, str, (lnm) null), 3);
    }

    public final void b(String str, String str2, m6n0 m6n0Var, n6n0 n6n0Var, tv80 tv80Var) {
        if (this.b.b.getValue() instanceof ngn0) {
            return;
        }
        p410 p410Var = this.a;
        fn31.T((u9c0) p410Var.c, (o8n) null, 0, new isc0(p410Var, str, str2, n6n0Var, m6n0Var, tv80Var, null), 3);
    }

    public final void c() {
        this.a.D();
    }
}
