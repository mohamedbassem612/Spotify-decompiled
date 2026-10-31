package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o2n0 implements tyq {
    public final /* synthetic */ byte a = 0;
    public final d0r b;
    public final boolean c;
    public final o3r d;
    public final js20 e;
    public final psw f;
    public final Object g;
    public final rqw h;

    public o2n0(d0r d0rVar, vbs vbsVar) {
        this.b = d0rVar;
        this.c = vbsVar.g;
        jd11 jd11Var = rc11.a;
        this.d = w3p1.m(new l4r(new wlu(jd11Var.b(jo70.class)), 1, czm0.N0, new j4r(czm0.i), czm0.O0), new l4r(new wlu(jd11Var.b(mtl.class)), 2, czm0.t, new j4r(new n2n0(this, (byte) 1)), czm0.X), new l4r(jd0.h, 2, czm0.Y, new j4r(new n2n0(this, (byte) 2)), czm0.Z), gce0.b1);
        this.g = new iik0(this, (byte) 5);
        this.e = z0o1.j(new n2n0(this, (byte) 0), dbm0.Y0, (iu30) null, 12);
        this.h = new eih1();
        j2i j2iVar = new j2i(-1985496699, new hmk0(this, (byte) 13), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.h;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.f;
    }

    public final d0r e() {
        byte b = this.a;
        return this.b;
    }

    public void f(l2n0 l2n0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1808147812);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(l2n0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String strY = cev0.y(l2n0Var.b, l2n0Var.a, x340Var.k(t4k.n) == flb0.b);
            uwr uwrVar = cbx.a;
            uwo1.e(strY, (qim0) null, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1722);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(this, l2n0Var, i, (byte) 14);
        }
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }

    public final f4r getData() {
        switch (this.a) {
            case 0:
                return (iik0) this.g;
            default:
                return this.d;
        }
    }

    public o2n0(xh71 xh71Var, d0r d0rVar, o8n o8nVar, boolean z) {
        this.g = xh71Var;
        this.b = d0rVar;
        this.c = z;
        jd11 jd11Var = rc11.a;
        this.d = w3p1.n(new l4r(new xv00(jd11Var.b(jo70.class)), 2, rq61.Y0, new j4r(rq61.W0), rq61.Z0), new l4r(new xv00(jd11Var.b(vn71.class)), 3, rq61.a1, new j4r(rq61.X0), rq61.b1), new v371(this, (byte) 1));
        this.e = d1o1.o(new u371(this, (byte) 0), new v371(this, (byte) 0), o8nVar, new u371(this, (byte) 1));
        j2i j2iVar = zgj.a;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
        this.h = n3o1.q(this).a(vy61.h, vy61.i);
    }
}
