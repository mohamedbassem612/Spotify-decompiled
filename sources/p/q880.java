package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q880 implements xpw {
    public static final o3r Z = w3p1.o(new l4r(new xv00(rc11.a.b(dd8.class)), 1, vu70.d1, new j4r(vu70.a1), vu70.e1), vu70.b1);
    public final psw Y;
    public final r880 a;
    public final cir0 b;
    public final ujp c;
    public final ri41 d;
    public final a4d e;
    public final cx0 f;
    public final ts50 g;
    public final w8r0 h;
    public final d0r i;
    public final ljm0 t = h7w.B(vu70.c1, (o8n) null, (iu30) null, new p880(this, 0), 6);
    public final ia00 X = n3o1.q(this).a(oe60.Y0, new p880(this, 1));

    public q880(r880 r880Var, cir0 cir0Var, ujp ujpVar, ri41 ri41Var, a4d a4dVar, cx0 cx0Var, ts50 ts50Var, w8r0 w8r0Var, d0r d0rVar) {
        this.a = r880Var;
        this.b = cir0Var;
        this.c = ujpVar;
        this.d = ri41Var;
        this.e = a4dVar;
        this.f = cx0Var;
        this.g = ts50Var;
        this.h = w8r0Var;
        this.i = d0rVar;
        j2i j2iVar = new j2i(-1668496523, new wv60(this, (byte) 9), true);
        ien0 ien0Var = qsw.a;
        this.Y = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.X;
    }

    public final jsw c() {
        return this.Y;
    }

    public final void e(ji41 ji41Var, b0k b0kVar, int i) {
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(448179962);
        int i2 = (x340Var.g(ji41Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).b.b, 0.0f, 2, qim0VarF);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (u890.j(ji41Var, gi41.d)) {
                strK = x0d.k(x340Var, -1359123930, 2131956666, x340Var, false);
            } else if (u890.j(ji41Var, gi41.e)) {
                strK = x0d.k(x340Var, -1359120345, 2131956667, x340Var, false);
            } else {
                strK = u890.j(ji41Var, gi41.f) ? x0d.k(x340Var, -1359116729, 2131956668, x340Var, false) : x0d.k(x340Var, -1359114554, 2131956666, x340Var, false);
            }
            qqn1.a(0, strK, (String) null, x340Var, (qim0) null);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o880(this, ji41Var, i);
        }
    }

    public final String f(i880 i880Var, n880 n880Var) {
        m880 m880Var = n880Var instanceof m880 ? (m880) n880Var : null;
        if (m880Var == null) {
            return null;
        }
        boolean z = m880Var.b;
        qdg1 qdg1Var = i880Var.a;
        String str = new y6b1(qdg1Var.b, false).e;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        r880 r880Var = this.a;
        String str3 = r880Var.a;
        return z ? dj20.b(str3, str2, qdg1Var.d, qdg1Var.f, r880Var.c) : dj20.f(str3, str2, qdg1Var.d, qdg1Var.f, r880Var.c);
    }

    public final mqw getBehavior() {
        return this.t;
    }
}
