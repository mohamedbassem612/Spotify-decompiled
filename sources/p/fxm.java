package p;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class fxm {
    public static final long a = jhc1.c(140.0f, 14.0f);
    public static final long b = jhc1.c(100.0f, 10.0f);
    public static final long c = jhc1.c(180.0f, 10.0f);
    public static final float d = 4.0f;

    public static final void a(vwm vwmVar, List list, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        x340 x340Var;
        long j;
        String str;
        vwm vwmVar2 = vwmVar;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1531449908);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(vwmVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var2.i(iu30Var2) ? 256 : 128;
        } else {
            iu30Var2 = iu30Var;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            u7h u7hVar = vwmVar2.h;
            if (u7hVar == null && (u7hVar = vwmVar2.k) == null) {
                uwr uwrVar = cbx.a;
                j = ((yex) zex.a.d).e;
            } else {
                j = u7hVar.a;
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarN = anm1.N("contributor-sheet-blend-card", uyn1.B(qim0VarZ, 0.0f, 12.0f, 0.0f, 0.0f, 13));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bxm.W0;
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF2, true, (iu30) objT);
            ogx ogxVar = ogx.e;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            zzq0 zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
            cua cuaVar = cbx.b(x340Var2).f;
            cr31 cr31VarB = er31.b(8.0f);
            String strO0 = cwl1.o0(x340Var2, 2131954575);
            boolean zF = ((i2 & 896) == 256) | ((i2 & 14) == 4) | x340Var2.f(j);
            Object objT2 = x340Var2.T();
            if (zF || objT2 == m4cVar) {
                long j2 = j;
                str = strO0;
                au0 au0Var = new au0(iu30Var2, vwmVar2, j2, (byte) 3);
                vwmVar2 = vwmVar2;
                x340Var2.s0(au0Var);
                objT2 = au0Var;
            } else {
                str = strO0;
            }
            Function0 function0 = (Function0) objT2;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                cwl1.b(qim0VarB, (tl3) null, cr31VarB, ogxVar, zzq0Var, (max) null, false, (idn0) null, ny3.a, new gbx(new y50(str), function0), (gbx) null, apo.r(1220889791, new e6j(list, vwmVar2, (byte) 13), x340Var2), x340Var2, 100666368, 48, 1250);
                x340Var = x340Var2;
                x340Var.r(true);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok(vwmVar2, list, iu30Var, i, (byte) 16);
        }
    }

    public static final void b(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2068077509);
        j06 j06Var = x340Var.a;
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(8.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("contributor-sheet-blend-card-skeleton", uyn1.B(qim0VarZ, 0.0f, 12.0f, 0.0f, 0.0f, 13));
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar2 = cbx.b(x340Var).f;
            qim0 qim0VarF3 = dug.f(qim0VarF2, jA, er31.b(8.0f));
            cua cuaVar3 = cbx.b(x340Var).f;
            qim0Var2 = qim0Var3;
            qim0 qim0VarL0 = cwl1.l0(qim0VarF3, 0L, er31.b(8.0f), 13);
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarL0, 16.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            cvx cvxVar4 = cbx.b(x340Var).b;
            mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0Var2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            fra fraVar = een.N0;
            cvx cvxVar5 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var, 48);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0Var2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            e(x340Var, 0);
            cvx cvxVar6 = cbx.b(x340Var).b;
            mbh mbhVarA3 = jbh.a(new d36(2.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0Var2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA3, x340Var, lljVar);
            nko1.H(xos0VarM5, x340Var, lljVar2);
            x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar4);
            long j = a;
            t1c.a(cwl1.l0(dug.f(u291.n(qim0Var2, s3v.b(j), s3v.a(j)), cbx.a(x340Var).a.b.a(), cr31VarB), 0L, cr31VarB, 13), x340Var, 0);
            long j2 = b;
            t1c.a(cwl1.l0(dug.f(u291.n(qim0Var2, s3v.b(j2), s3v.a(j2)), cbx.a(x340Var).a.b.a(), cr31VarB), 0L, cr31VarB, 13), x340Var, 0);
            x340Var.r(true);
            x340Var.r(true);
            long j3 = c;
            t1c.a(cwl1.l0(dug.f(u291.n(qim0Var2, s3v.b(j3), s3v.a(j3)), cbx.a(x340Var).a.b.a(), cr31VarB), 0L, cr31VarB, 13), x340Var, 0);
            x340Var.r(true);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var2, i, (byte) 3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(ywm ywmVar, d0r d0rVar, o3r o3rVar, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(280951996);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(ywmVar) : x340Var.i(ywmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(d0rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(o3rVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.b0();
        } else if (ywmVar.equals(wwm.a)) {
            x340Var.i0(-588064913);
            b(null, x340Var, 0);
            x340Var.r(false);
        } else if (ywmVar.equals(xwm.a)) {
            x340Var.i0(-588063488);
            x340Var.r(false);
        } else {
            if (!(ywmVar instanceof vwm)) {
                throw p3d1.k(x340Var, -588065619, false);
            }
            x340Var.i0(-1050060378);
            vwm vwmVar = (vwm) ywmVar;
            c380 c380Var = vwmVar.l;
            int i3 = i2 & 1008;
            a(vwmVar, f46.i0(new String[]{g((String) o7h.t0(0, c380Var), d0rVar, o3rVar, x340Var, i3), g((String) o7h.t0(1, c380Var), d0rVar, o3rVar, x340Var, i3)}), iu30Var, x340Var, ((i2 >> 3) & 896) | (i2 & 14));
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, ywmVar, d0rVar, o3rVar, iu30Var, (byte) 15);
        }
    }

    public static final void d(vwm vwmVar, b0k b0kVar, int i) {
        long j;
        long j2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1820734697);
        int i2 = (x340Var.g(vwmVar) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            u7h u7hVar = vwmVar.h;
            if (u7hVar != null) {
                j = u7hVar.a;
            } else {
                uwr uwrVar = cbx.a;
                j = ((yex) zex.a.d).e;
            }
            u7h u7hVar2 = vwmVar.k;
            if (u7hVar2 != null) {
                j2 = u7hVar2.a;
            } else {
                uwr uwrVar2 = cbx.a;
                j2 = ((yex) zex.a.d).e;
            }
            long j3 = j2;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = u291.n(nim0Var, 84.0f, 48.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String str = vwmVar.f;
            String str2 = vwmVar.c;
            boolean z = vwmVar.g;
            qim0 qim0VarX = lrn1.x(nim0Var, 1.0f);
            gra graVar = een.g;
            h2c h2cVar = h2c.a;
            w2g0.k(str, str2, 48.0f, h2cVar.a(qim0VarX, graVar), new u7h(j), z, x340Var, 384, 0);
            w2g0.k(vwmVar.i, vwmVar.d, 48.0f, h2cVar.a(nim0Var, een.i), new u7h(j3), vwmVar.j, x340Var, 384, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h1m(vwmVar, i, (byte) 19);
        }
    }

    public static final void e(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1803031333);
        if (x340Var.Y(i & 1, i != 0)) {
            boolean z = x340Var.k(t4k.n) == flb0.b;
            jw31 jw31VarA = ew31.a(new d36(-12.0f, true, new g21(een.Q0, (byte) 29)), een.N0, x340Var, 54);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            qim0 qim0VarX = lrn1.x(u291.r(nim0Var, 48.0f), 1.0f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cr31 cr31Var = er31.a;
            t1c.a(cwl1.l0(dug.f(qim0VarX, jA, cr31Var), 0L, cr31Var, 13), x340Var, 0);
            qim0 qim0VarR = u291.r(nim0Var, 48.0f);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bxm.X0;
                x340Var.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0VarR, (iu30) objT);
            boolean zH = x340Var.h(z);
            Object objT2 = x340Var.T();
            if (zH || objT2 == m4cVar) {
                objT2 = new gy((byte) 16, z);
                x340Var.s0(objT2);
            }
            t1c.a(cwl1.l0(dug.f(exd0.s(qim0VarC, (iu30) objT2), cbx.a(x340Var).a.b.a(), cr31Var), 0L, cr31Var, 13), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sqk((byte) 5, i, false);
        }
    }

    public static final void f(List list, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-49309756);
        int i2 = (x340Var.g(list) ? 4 : 2) | i;
        if (!x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.b0();
        } else {
            if (list.isEmpty()) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new qm0(list, i, (byte) 3);
                    return;
                }
                return;
            }
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(2.0f, true, new um5(false)), een.Z, x340Var, 0);
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
            uwo1.e(cwl1.o0(x340Var, 2131954577), (qim0) null, cbx.d(x340Var).k, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1778);
            uwo1.e(o7h.y0(list, " • ", (String) null, (String) null, (iu30) null, 62), (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 1572864, 0, 1714);
            x340Var.r(true);
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new qm0(list, i, (byte) 4);
        }
    }

    public static final String g(String str, d0r d0rVar, o3r o3rVar, b0k b0kVar, int i) {
        jo70 jo70Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1448357284);
        String str2 = null;
        if (str == null) {
            x340Var.r(false);
            return null;
        }
        boolean z = (((i & 14) ^ 6) > 4 && x340Var.g(str)) || (i & 6) == 4;
        Object objT = x340Var.T();
        if (z || objT == m4cVar) {
            objT = d0rVar.c(o3rVar.a(str));
            x340Var.s0(objT);
        }
        c0r c0rVar = (c0r) objT;
        boolean zI = x340Var.i(c0rVar);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new exm(c0rVar, (byte) 0);
            x340Var.s0(objT2);
        }
        qxd0.i(c0rVar, (iu30) objT2, x340Var);
        ien0 ien0VarA = c0rVar.a();
        x340Var.f0(-874494126, ien0VarA);
        ven0 ven0VarG = rwq.g(ien0VarA.a(), ien0VarA.getValue(), (o8n) null, x340Var, 0, 2);
        x340Var.r(false);
        i1r i1rVar = (k1r) ven0VarG.getValue();
        i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
        if (i1rVar2 != null && (jo70Var = (jo70) i1rVar2.a) != null) {
            str2 = jo70Var.a;
        }
        x340Var.r(false);
        return str2;
    }
}
