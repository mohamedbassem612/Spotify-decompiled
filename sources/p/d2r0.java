package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d2r0 implements c2r0 {
    public final k8h1 a;
    public final n6h1 b;
    public final q7h1 c;
    public final z6r0 d;
    public final yqg e;
    public final h2r0 f;
    public final otq g;
    public final p7h1 h;

    public d2r0(k8h1 k8h1Var, n6h1 n6h1Var, q7h1 q7h1Var, z6r0 z6r0Var, yqg yqgVar, h2r0 h2r0Var, otq otqVar, p7h1 p7h1Var) {
        this.a = k8h1Var;
        this.b = n6h1Var;
        this.c = q7h1Var;
        this.d = z6r0Var;
        this.e = yqgVar;
        this.f = h2r0Var;
        this.g = otqVar;
        this.h = p7h1Var;
    }

    @Override // p.c2r0
    public final qhe0 a(n6r0 n6r0Var, qir0 qir0Var, nar0 nar0Var, xj61 xj61Var, boolean z, g6h1 g6h1Var, boolean z2, u8h1 u8h1Var) {
        return new qhe0(n6r0Var, qir0Var, nar0Var, this.d, this.a, this.b, this.e, i(), xj61Var, this.g.a(z), g6h1Var, z2, u8h1Var);
    }

    @Override // p.c2r0
    public final b2r0 f(qe41 qe41Var, p6r0 p6r0Var, qir0 qir0Var, nar0 nar0Var, g6h1 g6h1Var) {
        return new g2r0(qe41Var, p6r0Var, qir0Var, nar0Var, this.d, this.a, this.b, this.e, i(), this.g.a(true), g6h1Var, true);
    }

    @Override // p.c2r0
    public final wnh1 g(p6r0 p6r0Var, qir0 qir0Var, g6h1 g6h1Var) {
        return new wnh1(p6r0Var, qir0Var, null, this.d, this.a, this.b, this.e, i(), null, this.g.a(false), g6h1Var, false, e8h1.b().i());
    }

    @Override // p.c2r0
    public final b2r0 h(qe41 qe41Var, n6r0 n6r0Var, qir0 qir0Var, nar0 nar0Var, boolean z, g6h1 g6h1Var) {
        return new g2r0(qe41Var, n6r0Var, qir0Var, nar0Var, this.d, this.a, this.b, this.e, i(), this.g.a(z), g6h1Var, false);
    }

    public final r6r0 i() {
        boolean zA = this.f.a.a();
        yqg yqgVar = this.e;
        q7h1 q7h1Var = this.c;
        p7h1 p7h1Var = this.h;
        return zA ? new p410(new ffe1(p7h1Var), q7h1Var, yqgVar) : new p1f0(new ffe1(p7h1Var), q7h1Var, yqgVar);
    }
}
