package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s1 implements tyq {
    public final js20 X;
    public final ia00 Y;
    public final psw Z;
    public final lzn0 a;
    public final a1r0 b;
    public final gw70 c;
    public final l6s d;
    public final f2p e;
    public final gri0 f;
    public final xf4 g;
    public final d0r h;
    public final y0 i;
    public final o3r t;

    public s1(lzn0 lzn0Var, a1r0 a1r0Var, gw70 gw70Var, l6s l6sVar, f2p f2pVar, gri0 gri0Var, xf4 xf4Var, d0r d0rVar, y0 y0Var) {
        this.a = lzn0Var;
        this.b = a1r0Var;
        this.c = gw70Var;
        this.d = l6sVar;
        this.e = f2pVar;
        this.f = gri0Var;
        this.g = xf4Var;
        this.h = d0rVar;
        this.i = y0Var;
        jd11 jd11Var = rc11.a;
        this.t = w3p1.h(new l4r(new xv00(jd11Var.b(jo70.class)), 1, l1.V0, new j4r(l1.b), l1.W0), new l4r(new xv00(jd11Var.b(hzy.class)), 1, l1.X0, new j4r(l1.c), l1.Y0), new l4r(new xv00(jd11Var.b(pnt.class)), 2, l1.Z, new j4r(l1.d), l1.N0), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, l1.O0, new j4r(l1.e), l1.P0), new l4r(new xv00(jd11Var.b(a7q0.class)), 2, l1.Q0, new j4r(l1.f), l1.R0), new l4r(new xv00(jd11Var.b(zoy0.class)), 2, l1.S0, new j4r(l1.g), l1.T0), new l4r(new xv00(jd11Var.b(uio.class)), 2, l1.U0, new j4r(l1.h), l1.t), new l4r(new xv00(jd11Var.b(pn30.class)), 2, l1.X, new j4r(l1.i), l1.Y), m1.b);
        byte b = 0;
        this.X = z0o1.j(new i1(this, b), new j1(2, this, s1.class, "stateMapper", "stateMapper(Lcom/spotify/about/aboutcarddataelement/AboutCardDataElement$Props;Lcom/spotify/about/aboutcarddataelementimpl/AboutCardDataElementImpl$MetadataState;)Lcom/spotify/about/aboutcarddataelementimpl/AboutCardDataElementImpl$State;", 0, (byte) 0), new i1(this, (byte) 1), 4);
        this.Y = n3o1.q(this).a(n1.b, new yxl1(this, (byte) 20));
        j2i j2iVar = new j2i(1542439992, new r1(this, b), true);
        ien0 ien0Var = qsw.a;
        this.Z = new psw(j2iVar, (byte) 0);
    }

    public static String f(b1 b1Var, String str) {
        if (b1Var instanceof a1) {
            return ((a1) b1Var).a;
        }
        if (b1Var instanceof z0) {
            return f4i1.e(str, ":about");
        }
        eg.o();
        return null;
    }

    public final rqw a() {
        return this.Y;
    }

    public final jsw c() {
        return this.Z;
    }

    public final d0r e() {
        return this.h;
    }

    public final mqw getBehavior() {
        return this.X;
    }

    public final f4r getData() {
        return this.t;
    }
}
