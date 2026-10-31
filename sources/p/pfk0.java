package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pfk0 implements xpw {
    public final v0j a;
    public final vek0 b;
    public final lfq c;
    public final kfq d;
    public final mfq e;
    public final rey0 f = new rey0(new mbj0(this, (byte) 17));
    public final ia00 g = n3o1.q(this).a(w7k0.V0, w7k0.W0);
    public final psw h;

    public pfk0(v0j v0jVar, vek0 vek0Var, lfq lfqVar, kfq kfqVar, mfq mfqVar) {
        this.a = v0jVar;
        this.b = vek0Var;
        this.c = lfqVar;
        this.d = kfqVar;
        this.e = mfqVar;
        j2i j2iVar = new j2i(385002154, new y3i0(this, (byte) 27), true);
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.h;
    }

    public final void e(bek0 bek0Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-288425739);
        int i2 = i | (x340Var2.i(bek0Var) ? 4 : 2) | (x340Var2.i(function0) ? 32 : 16) | (x340Var2.i(function1) ? 256 : 128) | (x340Var2.i(qim0Var) ? 2048 : 1024) | (x340Var2.i(this) ? 16384 : 8192);
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            mgx mgxVar = mgx.e;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            cr31 cr31VarB = er31.b(16.0f);
            float f = cbx.b(x340Var2).e.b;
            float f2 = cbx.b(x340Var2).e.a;
            cwl1.b(qim0VarF2, een.h, cr31VarB, mgxVar, new zzq0(f, f2, f, f2), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-227712488, new x9g0(bek0Var, function1, (byte) 29), x340Var2), x340Var2, 0, 48, 2016);
            String strO0 = cwl1.o0(x340Var2, 2131958846);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new kek0(function0, (byte) 4);
                x340Var2.s0(objT);
            }
            Function0 function2 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function2);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = m2j0.b1;
                x340Var2.s0(objT2);
            }
            wro1.h(gbxVar, new hdx(0, (vu30) null, (vu30) objT2, (vu30) null, (hw61) null, 27), anm1.N("reorder_education_dismiss", eqr0.C(h2c.a.a(nim0Var, een.f), cbx.b(x340Var2).e.b, -cbx.b(x340Var2).e.b)), (max) null, yla.s(x340Var2), (vzq0) null, false, (idn0) null, (ga80) null, g2j.b, x340Var2, 0, 6, 984);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e9g0((byte) 8, i, this, bek0Var, function0, function1, qim0Var);
        }
    }

    public final void f(mfk0 mfk0Var, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) {
        int i2;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1155635678);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(mfk0Var) : x340Var.i(mfk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zJ = u890.j(mfk0Var, lfk0.a);
            rih1 rih1Var = rih1.a;
            if (zJ) {
                x340Var.i0(915545580);
                Object objT = x340Var.T();
                if (objT == obj) {
                    qej0 qej0Var = new qej0(new stj0(iu30Var, (byte) 29), this.c.a.b.A5);
                    x340Var.s0(qej0Var);
                    objT = qej0Var;
                }
                otw.c((qej0) objT, rih1Var, (qim0) null, (ipb1) null, x340Var, 48, 12);
                x340Var.r(false);
            } else {
                x340Var.i0(915718560);
                x340Var.r(false);
            }
            if (u890.j(mfk0Var, kfk0.a)) {
                x340Var.i0(915779630);
                Object objT2 = x340Var.T();
                if (objT2 == obj) {
                    mej0 mej0Var = new mej0(new nfk0(iu30Var, (byte) 0), this.e.a.b.A5);
                    x340Var.s0(mej0Var);
                    objT2 = mej0Var;
                }
                otw.c((mej0) objT2, rih1Var, (qim0) null, (ipb1) null, x340Var, 48, 12);
                x340Var.r(false);
            } else {
                x340Var.i0(915950688);
                x340Var.r(false);
            }
            if (u890.j(mfk0Var, jfk0.a)) {
                x340Var.i0(916046354);
                Object objT3 = x340Var.T();
                if (objT3 == obj) {
                    objT3 = new maj0(1, new jjv(iu30Var, iu30Var2, (byte) 4), this.d.a.b.A5);
                    x340Var.s0(objT3);
                }
                otw.c((maj0) objT3, rih1Var, (qim0) null, (ipb1) null, x340Var, 48, 12);
                x340Var.r(false);
            } else {
                x340Var.i0(917013120);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(i, this, mfk0Var, iu30Var, iu30Var2, (byte) 7);
        }
    }

    public final mqw getBehavior() {
        return this.f;
    }
}
