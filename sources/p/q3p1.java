package p;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class q3p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(ez0 ez0Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        Long l = ez0Var.d;
        long j = ez0Var.b;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1635106763);
        j06 j06Var = ((x340) b0kVar2).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar2.g(ez0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= b0kVar2.i(iu30Var) ? 256 : 128;
        }
        if (b0kVar2.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean zF = b0kVar2.f(j);
            Object objT = b0kVar2.T();
            if (zF || objT == m4cVar) {
                objT = p3d1.m(j, b0kVar2);
            }
            frr0 frr0Var = (frr0) objT;
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var3);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            long jS = frr0Var.s();
            long j2 = ez0Var.c;
            int i4 = i3 & 896;
            boolean zI = b0kVar2.i(frr0Var) | (i4 == 256);
            Object objT2 = b0kVar2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new d4((Object) iu30Var, (Object) frr0Var, (byte) 11);
                b0kVar2.s0(objT2);
            }
            iu30 iu30Var2 = (iu30) objT2;
            boolean zI2 = (i4 == 256) | b0kVar2.i(frr0Var);
            Object objT3 = b0kVar2.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new y4(iu30Var, frr0Var, (byte) 13);
                b0kVar2.s0(objT3);
            }
            int i5 = i3;
            i(jS, j2, iu30Var2, (Function0) objT3, ez0Var.e, b0kVar2, 0);
            b0kVar2 = b0kVar2;
            qim0 qim0VarZ = uyn1.z(3.0f, 0.0f, 2, u291.f(qim0Var3, 1.0f));
            jw31 jw31VarA = ew31.a(h36.a, een.Z, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarZ);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            c(frr0Var.s(), b0kVar2, 6);
            if (l != null) {
                b0kVar2.i0(129403864);
                e(l.longValue(), frr0Var.s(), b0kVar2, 6);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(129550897);
                b0kVar2.r(false);
            }
            h(ez0Var, b0kVar2, ((i5 << 3) & 112) | 6);
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(ez0Var, qim0Var2, iu30Var, i, (byte) 3);
        }
    }

    public static final void b(int i, int i2, Function0 function0, b0k b0kVar, boolean z) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && x340Var.H()) {
            x340Var.b0();
        } else {
            if (i4 != 0) {
                z = true;
            }
            ven0 ven0VarS = v8r.s(function0, x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new xt9(ven0VarS, z);
                x340Var.s0(objT);
            }
            xt9 xt9Var = (xt9) objT;
            boolean z2 = (i3 & 14) == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new wt9(xt9Var, z);
                x340Var.s0(objT2);
            }
            qxd0.S((Function0) objT2, x340Var);
            s1q0 s1q0VarA = vfe0.a(x340Var);
            if (s1q0VarA == null) {
                eg.m("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
                return;
            }
            r1q0 r1q0VarJ = s1q0VarA.J();
            kiv kivVar = AndroidCompositionLocals_androidKt.a;
            iac0 iac0Var = (iac0) x340Var.k(jfe0.a);
            boolean zI = x340Var.i(r1q0VarJ) | x340Var.i(iac0Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new oo6(r1q0VarJ, iac0Var, xt9Var, (byte) 9);
                x340Var.s0(objT3);
            }
            qxd0.h(iac0Var, r1q0VarJ, (iu30) objT3, x340Var);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new au2(i, i2, function0, z);
        }
    }

    public static final void c(long j, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1900586250);
        int i3 = i & 6;
        pw31 pw31Var = pw31.a;
        if (i3 == 0) {
            i2 = (x340Var.i(pw31Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarA = pw31Var.a(0.15f, nim0.a, true);
            String strP = n3p1.p(j);
            uwr uwrVar = cbx.a;
            uwo1.e(strP, qim0VarA, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(1), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jz0(j, i);
        }
    }

    public static final void d(d0r d0rVar, hvp0 hvp0Var, c380 c380Var, tyq tyqVar, iu30 iu30Var, vzq0 vzq0Var, qim0 qim0Var, p3v p3vVar, vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        hvp0 hvp0Var2;
        iu30 iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(244189501);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(d0rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            hvp0Var2 = hvp0Var;
            i2 |= x340Var.i(hvp0Var2) ? 32 : 16;
        } else {
            hvp0Var2 = hvp0Var;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(c380Var) : x340Var.i(c380Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(tyqVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var.i(iu30Var2) ? 16384 : 8192;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(vzq0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(qim0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.g(p3vVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= x340Var.i(vu30Var) ? 67108864 : 33554432;
        }
        if (!x340Var.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            x340Var.b0();
        } else if (((Boolean) b2u.t(x340Var).getValue()).booleanValue()) {
            x340Var.i0(-1024631732);
            dgo1.b(hvp0Var2, c380Var, tyqVar, iu30Var2, vzq0Var, anm1.N("map_grid_root", qim0Var), vu30Var, x340Var, ((i2 >> 3) & 65534) | ((i2 >> 6) & 3670016));
            x340Var.r(false);
        } else {
            x340Var.i0(-1024167414);
            int i3 = i2 & 14;
            int i4 = i2 >> 3;
            pxd0.a(d0rVar, c380Var, tyqVar, iu30Var, vzq0Var, anm1.N("map_grid_root", qim0Var), p3vVar, vu30Var, x340Var, (i4 & 29360128) | i3 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (i4 & 3670016));
            x340Var = x340Var;
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ne00(d0rVar, hvp0Var, c380Var, tyqVar, iu30Var, vzq0Var, qim0Var, p3vVar, vu30Var, i);
        }
    }

    public static final void e(long j, long j2, b0k b0kVar, int i) {
        b0k b0kVar2;
        String strN0;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1553583680);
        int i2 = i | (b0kVar3.f(j) ? 32 : 16) | (b0kVar3.f(j2) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            if (0.7f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarN = e9k.n(62, new wnb0(0.7f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.7f, true));
            long j3 = j - (j2 / 1000);
            if (j3 <= 0) {
                b0kVar3.i0(885603780);
                b0kVar3.r(false);
                strN0 = "";
            } else if (j3 > 60) {
                b0kVar3.i0(885643152);
                ytw0 ytw0Var = jfv.b;
                long jMax = Math.max(0L, j3);
                ngv ngvVar = ngv.e;
                long jL0 = fdg1.l0(jMax, ngvVar);
                ngv ngvVar2 = ngv.f;
                long jU = jfv.u(jL0, ngvVar2);
                strN0 = cwl1.n0(2131952011, new Object[]{cwl1.n0(2131952009, new Object[]{Long.valueOf(jU), Long.valueOf(jfv.u(jfv.p(jL0, fdg1.l0(jU, ngvVar2)), ngvVar))}, b0kVar3)}, b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(885961367);
                strN0 = cwl1.n0(2131952011, new Object[]{cwl1.n0(2131952010, new Object[]{Long.valueOf(j3)}, b0kVar3)}, b0kVar3);
                b0kVar3.r(false);
            }
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            uwo1.e(strN0, qim0VarN, cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.b, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2016);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kz0(j, j2, i, (byte) 0);
        }
    }

    public static final void f(v220 v220Var, qim0 qim0Var, b0k b0kVar, int i) {
        lee1 lee1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-646910946);
        int i2 = i | (x340Var.g(v220Var) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int iC = l1d.C(v220Var.b);
            if (iC == 0) {
                x340Var.i0(1088844391);
                uwr uwrVar = cbx.a;
                lee1Var = cbx.d(x340Var).j;
                x340Var.r(false);
            } else if (iC == 1) {
                x340Var.i0(1088846728);
                uwr uwrVar2 = cbx.a;
                lee1Var = cbx.d(x340Var).g;
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, 1088841905, false);
                }
                x340Var.i0(1088848998);
                uwr uwrVar3 = cbx.a;
                lee1Var = cbx.d(x340Var).m;
                x340Var.r(false);
            }
            uwo1.e(v220Var.a, qim0Var, lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, i2 & 112, 0, 2040);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sdb1(v220Var, qim0Var, i, (byte) 23);
        }
    }

    public static final void g(fb91 fb91Var, boolean z, b0k b0kVar, int i) {
        fb91 fb91Var2;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1248493412);
        int i2 = (x340Var.i(fb91Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            fb91Var2 = fb91Var;
            z2 = z;
            x340Var.b0();
        } else {
            if (!z) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new lz0(fb91Var, z, i, (byte) 0);
                    return;
                }
                return;
            }
            lb91 lb91Var = lb91.a;
            qim0 qim0VarC = eqr0.C(nim0.a, 2.0f, 4.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ktd.n(x340Var);
            }
            fb91Var2 = fb91Var;
            z2 = z;
            lb91Var.a((idn0) objT, qim0VarC, fb91Var2, z2, jhc1.c(8.0f, 8.0f), x340Var, (i2 << 6) & 8064, 0);
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new lz0(fb91Var2, z2, i, (byte) 1);
        }
    }

    public static final void h(ez0 ez0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1098673175);
        int i3 = i & 6;
        pw31 pw31Var = pw31.a;
        if (i3 == 0) {
            i2 = (x340Var.i(pw31Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(ez0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarA = pw31Var.a(0.15f, nim0.a, true);
            String strP = n3p1.p(ez0Var.c);
            uwr uwrVar = cbx.a;
            uwo1.e(strP, qim0VarA, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(2), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new du0((Object) ez0Var, i, (byte) 1);
        }
    }

    public static final void i(long j, long j2, iu30 iu30Var, Function0 function0, boolean z, b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1672006470);
        int i2 = i | (x340Var2.f(j) ? 4 : 2) | (x340Var2.f(j2) ? 32 : 16) | (x340Var2.i(iu30Var) ? 256 : 128) | (x340Var2.i(function0) ? 2048 : 1024) | (x340Var2.h(z) ? 16384 : 8192);
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            lb91 lb91Var = lb91.a;
            long j3 = u7h.f;
            uwr uwrVar = cbx.a;
            long j4 = ((vex) zex.a.e).i;
            fb91 fb91VarE = lb91.e(j3, j3, 0L, j4, 0L, j3, j3, 0L, j4, 0L, x340Var2, 660);
            qim0 qim0VarH = u291.h(nim0.a, 16.0f);
            float f = j;
            jsg jsgVar = new jsg(0.0f, j2);
            boolean z2 = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                objT = new qj(iu30Var, (byte) 17);
                x340Var2.s0(objT);
            }
            rb91.a(f, (iu30) objT, qim0VarH, z, function0, (fb91) null, (idn0) null, 0, apo.r(-2130633218, new mz0(fb91VarE, z), x340Var2), apo.r(-253364323, new mz0(z, fb91VarE, (byte) 1), x340Var2), jsgVar, x340Var2, ((i2 >> 3) & 7168) | 905969664 | ((i2 << 3) & 57344), 0, 224);
            x340Var = x340Var2;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nz0(j, j2, iu30Var, function0, z, i);
        }
    }

    public static final void j(int i, long j, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1479581790);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.f(j) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            xpx xpxVar = xpx.c;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131963768));
            long j2 = u7h.f;
            gra graVar2 = een.h;
            h2c h2cVar = h2c.a;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarA = h2cVar.a(nim0Var, graVar2);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(xpxVar, jslVar, u291.r(qim0VarA, 24.0f), j2, 0L, false, x340Var, xpx.d, 48);
            qim0 qim0VarY = uyn1.y(dug.f(uyn1.x(h2cVar.a(nim0Var, een.Y), 6.0f), u7h.b(u7h.b, 0.6f, 0.0f, 0.0f, 0.0f, 14), er31.b(4.0f)), 4.0f, 2.0f);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarY);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            uwo1.e(String.format((j / 60) + ":%02d", Arrays.copyOf(new Object[]{Long.valueOf(j % 60)}, 1)), null, cbx.d(x340Var).n, j2, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e82(j, qim0Var, i, (byte) 9);
        }
    }

    public static final Object l(d0r d0rVar, n4r n4rVar, iu30 iu30Var, Object obj, a8d1 a8d1Var) {
        return b5p1.j(new zo51(d0rVar.c(n4rVar).a().a, obj, (byte) 17), new nsm0(2, iu30Var, t890.class, "suspendConversion0", "awaitLoaded$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 25), a8d1Var);
    }

    public static final k1k0 m(kak0 kak0Var, w0k0 w0k0Var) {
        lhg1 lhg1VarA;
        tv80 tv80Var;
        lhg1 lhg1Var = kak0Var.S0;
        lhg1 lhg1Var2 = kak0Var.h;
        if (u890.j(lhg1Var, lhg1Var2) && u890.j(kak0Var.W0, j8w0.a)) {
            lhg1VarA = null;
        } else if (lhg1Var.a.a == b8w0.b) {
            lhg1VarA = lhg1.a(lhg1Var, q6w0.a(lhg1Var.a, (buk1) null, (hez) null, (fa20) null, (px30) null, (taa0) null, (k7f0) null, (s69) null, (s69) null, (gez) null, (gez) null, (r920) null, (r920) null, (ox30) null, (ox30) null, (x6b) null, 40929), ruq0.a(lhg1Var.b, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 1, (Float) null, Float.valueOf(1.0f), 0, false, 0.0f, 0.0f, 0.0d, 0.0d, 393471), false, false, 12);
        } else {
            lhg1VarA = lhg1Var;
        }
        ruq0 ruq0Var = lhg1Var.b;
        ruq0 ruq0Var2 = lhg1Var.b;
        if (u890.j(ruq0Var.b, kak0Var.T0) && u890.j(ruq0Var2.h, kak0Var.U0)) {
            return new x0k0(lhg1VarA, w0k0Var, kak0Var.Q0, lhg1Var2);
        }
        String str = ruq0Var2.h;
        z0k0 z0k0Var = str.length() > 0 ? new z0k0(str) : new y0k0(ruq0Var2.b);
        lhg1 lhg1Var3 = kak0Var.Q0;
        lhg1 lhg1Var4 = lhg1VarA;
        lhg1 lhg1Var5 = kak0Var.V0;
        lhg1 lhg1Var6 = kak0Var.h;
        double d = ruq0Var2.S0;
        if (w0k0Var instanceof v0k0) {
            tv80Var = ((v0k0) w0k0Var).a;
        } else if (w0k0Var instanceof u0k0) {
            tv80Var = ((u0k0) w0k0Var).a;
        } else {
            if (!(w0k0Var instanceof t0k0)) {
                eg.o();
                return null;
            }
            tv80Var = ((t0k0) w0k0Var).a;
        }
        return new b1k0(lhg1Var4, w0k0Var, lhg1Var3, lhg1Var5, lhg1Var6, d, z0k0Var, tv80Var != null ? tv80Var.a : null);
    }

    public static final o3r n(List list, iu30 iu30Var) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((o3r) it.next()).a.size()));
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((o3r) it2.next()).b);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            r7h.W(((o3r) it3.next()).a, arrayList3);
        }
        o3r o3rVar = new o3r(arrayList3, new m3n(arrayList2, iu30Var, arrayList, (byte) 5), false);
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                if (((o3r) it4.next()).c) {
                    return new o3r(o3rVar.a, o3rVar.b, true);
                }
            }
        }
        return o3rVar;
    }

    public static o5e0 o(Throwable th) {
        boolean z = th instanceof IOException;
        g7o0 g7o0Var = g7o0.d;
        if (z) {
            return new i5e0(th, g7o0Var);
        }
        if (!(th instanceof HttpException)) {
            return new m5e0(th);
        }
        int i = ((HttpException) th).a;
        if (i != 404) {
            return (i == 503 || i == 504) ? new i5e0(th, g7o0Var) : new m5e0(th);
        }
        dj20.o();
        return j5e0.a;
    }

    public static final Map p(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            evb1 evb1Var = (evb1) it.next();
            mvb1 mvb1Var = evb1Var.c;
            mmr0 mmr0Var = mvb1Var != null ? new mmr0(new jvb1(evb1Var.a), mvb1Var) : null;
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        return sqg0.T(arrayList);
    }

    public static boolean q(n94 n94Var) {
        return n94Var.a();
    }

    public static final r091 r(zau0 zau0Var, r091 r091Var) {
        if (r091Var != null) {
            if (((Boolean) r091Var.e.b.getValue()).booleanValue()) {
                r091Var = null;
            }
            if (r091Var != null) {
                return r091Var;
            }
        }
        return zau0Var.a();
    }

    public static final void s(y36 y36Var, iu30 iu30Var) {
        y36 y36Var2 = new y36(999);
        int i = ((jv81) y36Var).c;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            y36Var2.put(y36Var.f(i2), y36Var.i(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                iu30Var.invoke(y36Var2);
                y36Var2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            iu30Var.invoke(y36Var2);
        }
    }
}
