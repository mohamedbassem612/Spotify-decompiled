package p;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ugx0 implements tyq {
    public static final hix0 g = new hix0(false, 0);
    public final d0r a;
    public final boolean b;
    public final o3r c;
    public final ljm0 d;
    public final eih1 e;
    public final psw f;

    public ugx0(d0r d0rVar, boolean z) {
        this.a = d0rVar;
        this.b = z;
        ewq0 ewq0Var = new ewq0((Object) this, (byte) 17);
        this.c = w3p1.n(new l4r(hjx0.a, 2, kex0.X, new j4r(ewq0Var), kex0.Y), new l4r(new xv00(rc11.a.b(hll.class)), 2, kex0.Z, new j4r(new ewq0((Object) this, (byte) 18)), kex0.N0), gbw0.N0);
        kex0 kex0Var = kex0.t;
        fns fnsVar = igu.a;
        this.d = h7w.B(kex0Var, pyf0.a, null, new ixt0(this, (byte) 14), 4);
        this.e = new eih1();
        j2i j2iVar = new j2i(1408703046, new qsu0(this, (byte) 13), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public static float k(iix0 iix0Var) {
        if (iix0Var instanceof gix0) {
            gix0 gix0Var = (gix0) iix0Var;
            long j = gix0Var.b;
            if (j > 0) {
                long j2 = gix0Var.c;
                if (j2 > j) {
                    j2 = j;
                }
                return j2 / j;
            }
        } else {
            if (!(iix0Var instanceof hix0)) {
                eg.o();
                return 0.0f;
            }
            if (((hix0) iix0Var).a) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static rle1 l(iix0 iix0Var, b0k b0kVar) throws NoWhenBranchMatchedException {
        boolean z = iix0Var instanceof gix0;
        ngv ngvVar = ngv.d;
        if (z) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(909107465);
            ogv ogvVar = new ogv((Resources) x340Var.k(AndroidCompositionLocals_androidKt.c), (byte) 0);
            ytw0 ytw0Var = jfv.b;
            gix0 gix0Var = (gix0) iix0Var;
            rle1 rle1Var = (rle1) ogvVar.invoke(new jfv(fdg1.l0(gix0Var.b - gix0Var.c, ngvVar)));
            x340Var.r(false);
            return rle1Var;
        }
        if (!(iix0Var instanceof hix0)) {
            throw p3d1.k((x340) b0kVar, 909105759, false);
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(909111767);
        ogv ogvVar2 = new ogv((Resources) x340Var2.k(AndroidCompositionLocals_androidKt.c), (byte) 1);
        ytw0 ytw0Var2 = jfv.b;
        rle1 rle1Var2 = (rle1) ogvVar2.invoke(new jfv(fdg1.l0(((hix0) iix0Var).b, ngvVar)));
        x340Var2.r(false);
        return rle1Var2;
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    public final d0r e() {
        return this.a;
    }

    public final void f(iix0 iix0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1882532830);
        int i2 = (x340Var.i(iix0Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            rle1 rle1VarL = l(iix0Var, x340Var);
            boolean zI = x340Var.i(rle1VarL);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new wfv(rle1VarL, (byte) 1);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(nim0.a, false, (iu30) objT);
            String str = rle1VarL.a;
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0VarB, cbx.d(x340Var).g, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ogx0(this, iix0Var, i, (byte) 0);
        }
    }

    public final void g(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-199072818);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131959498);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50((Object) this, i, (byte) 20);
        }
    }

    public final mqw getBehavior() {
        return this.d;
    }

    public final f4r getData() {
        return this.c;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void h(gix0 gix0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-432271200);
        int i2 = (x340Var.i(gix0Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            rle1 rle1VarL = l(gix0Var, x340Var);
            String strN0 = cwl1.n0(2131959493, new Object[]{Integer.valueOf((int) yoi1.o((float) Math.ceil(k(gix0Var) * 100.0f), 0.0f, 100.0f))}, x340Var);
            String strF = f4i1.f(rle1VarL.b, ", ", strN0);
            boolean zG = x340Var.g(strF);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new zqu0(strF, (byte) 22);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(nim0.a, false, (iu30) objT);
            String strF2 = f4i1.f(rle1VarL.a, " • ", strN0);
            uwr uwrVar = cbx.a;
            uwo1.e(strF2, qim0VarB, cbx.d(x340Var).g, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kpw0(this, gix0Var, i, (byte) 3);
        }
    }

    public final void i(iix0 iix0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-522397177);
        int i2 = (x340Var.i(iix0Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            tto1.d(k(iix0Var), 0, 12, 0L, 0L, x340Var, anm1.N("progress_element_progress_bar", u291.v(nim0.a, 88.0f)));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ogx0(this, iix0Var, i, (byte) 1);
        }
    }

    public final void j(iix0 iix0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1635734385);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.i(iix0Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            boolean z2 = iix0Var instanceof gix0;
            boolean z3 = z2 || ((iix0Var instanceof hix0) && ((hix0) iix0Var).a);
            boolean z4 = this.b;
            if (z4 && z3) {
                x340Var.i0(-737574545);
                i(iix0Var, x340Var, i2 & 126);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                x0d.s(nim0Var, 16.0f, x340Var, false);
            } else {
                x340Var.i0(-737459225);
                x340Var.r(false);
            }
            fra fraVar = een.N0;
            d36 d36Var = new d36(4.0f, true, new um5(false));
            qim0 qim0VarN = anm1.N("progress_element_duration_text", nim0Var);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarN);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            boolean z5 = iix0Var instanceof hix0;
            if (z5 && ((hix0) iix0Var).a) {
                x340Var.i0(-2098463675);
                g(x340Var, (i2 >> 3) & 14);
                x340Var.r(false);
            } else if (z5) {
                x340Var.i0(-2098461422);
                f(iix0Var, x340Var, i2 & 126);
                x340Var.r(false);
            } else if (z2) {
                x340Var.i0(-2098458764);
                h((gix0) iix0Var, x340Var, i2 & 126);
                x340Var.r(false);
            } else {
                x340Var.i0(-627674453);
                x340Var.r(false);
            }
            x340Var.r(true);
            if (z4 || !z3) {
                x340Var.i0(-736839225);
                x340Var.r(false);
            } else {
                x340Var.i0(-736954545);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 16.0f));
                i(iix0Var, x340Var, i2 & 126);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ogx0(this, iix0Var, i, (byte) 2);
        }
    }
}
