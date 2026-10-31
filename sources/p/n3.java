package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n3 implements wpw {
    public final d0r a;
    public final gap b;
    public final l0x0 c;
    public final gw70 d;
    public final f1n0 e;
    public final js20 f;
    public final idd1 g;
    public final ia00 h;
    public final nsw i;
    public final o3r t;

    public n3(d0r d0rVar, gap gapVar, l0x0 l0x0Var, gw70 gw70Var, f1n0 f1n0Var) {
        fns fnsVar = igu.a;
        this.a = d0rVar;
        this.b = gapVar;
        this.c = l0x0Var;
        this.d = gw70Var;
        this.e = f1n0Var;
        byte b = 0;
        this.f = d1o1.o(new d3(this, (byte) 0), e3.b, fnsVar, new d3(this, (byte) 1));
        this.g = new idd1(new g3(this, b));
        this.h = n3o1.q(this).a(n1.d, n1.e);
        this.i = jch0.j(new m3(this, b));
        jd11 jd11Var = rc11.a;
        this.t = w3p1.l(new l4r(new xv00(jd11Var.b(jo70.class)), 2, l1.d1, new j4r(l1.Z0), l1.e1), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, h3.b, new j4r(l1.a1), h3.c), new l4r(new xv00(jd11Var.b(hll.class)), 2, h3.d, new j4r(l1.b1), h3.e), new l4r(new xv00(jd11Var.b(a7q0.class)), 2, h3.f, new j4r(l1.c1), h3.g), n1.c);
    }

    public final rqw a() {
        return this.h;
    }

    public final rsw c() {
        return this.i;
    }

    public final mqw getBehavior() {
        return this.f;
    }
}
