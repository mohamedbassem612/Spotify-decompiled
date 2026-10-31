package p;

import android.content.Context;
import android.os.Vibrator;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class d5p1 {
    public static b180 a;
    public static b180 b;

    public static final hn20 a(long j) {
        return new hn20(j);
    }

    public static final void b(z9e0 z9e0Var, iu30 iu30Var, yqg yqgVar, zja1 zja1Var, sip sipVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        String upperCase;
        z9e0 z9e0Var2;
        m4c m4cVar = fkj0.X;
        x9e0 x9e0Var = z9e0Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1006085772);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(z9e0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(yqgVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(zja1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(sipVar) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            klz0 klz0Var = (klz0) x340Var.k(llz0.a);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new ijd0(iu30Var, (byte) 4);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z2 = i4 == 32;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new ijd0(iu30Var, (byte) 3);
                x340Var.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
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
            j6p1.d(z9e0Var.a + 1, z9e0Var.b, 0, x340Var, u291.f(qim0Var3, 1.0f));
            u9e0 u9e0Var = u9e0.a;
            if (x9e0Var.equals(u9e0Var)) {
                upperCase = x0d.k(x340Var, 1368058148, 2131959040, x340Var, false);
            } else {
                x340Var.i0(1368153969);
                x340Var.r(false);
                upperCase = z9e0Var.e.toUpperCase(Locale.ROOT);
            }
            String upperCase2 = upperCase.toUpperCase(Locale.ROOT);
            uwr uwrVar = cbx.a;
            gxo1.c(upperCase2, uyn1.z(cbx.b(x340Var).e.b, 0.0f, 2, u291.f(qim0Var3, 1.0f)), cbx.d(x340Var).a, cbx.a(x340Var).b.a, new a0e1(5), 3, false, new cjc0(2), new px8(fc11.G(22), fc11.G(48), 0L, (mx8) null, 12), 115.0f, (FontWeight) ((bjx) ajx.a.c).g, null, x340Var, 941096960, 0, 2048);
            x340 x340Var2 = x340Var;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            pbh pbhVar = pbh.a;
            qim0 qim0VarB = uyn1.B(pbhVar.a(0.65f, qim0VarF, true), 0.0f, 0.0f, 0.0f, cbx.b(x340Var2).e.b, 7);
            gra graVar = een.h;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarB);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            pbf0 pbf0Var = x9e0Var.equals(u9e0Var) ? z9e0Var.g : z9e0Var.i;
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = sipVar.a();
                x340Var2.s0(objT3);
            }
            otw.c((yhv) objT3, new vhv(pbf0Var.a, pbf0Var.b, true), u291.d(qim0Var3, 1.0f), (ipb1) null, x340Var2, 8, 8);
            x340Var2.r(true);
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var2).e.b, 0.0f, 2, pbhVar.a(0.13f, u291.f(qim0Var3, 1.0f), true));
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarZ);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            if (x9e0Var.equals(u9e0Var)) {
                x340Var2.i0(-496779574);
                uwo1.e(klz0Var.b.c.b, null, cbx.d(x340Var2).g, ((vex) zex.a.e).m, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2018);
                x340Var2 = x340Var2;
                x340Var2.r(false);
                z9e0Var2 = z9e0Var;
            } else {
                x340Var2.i0(-496531450);
                z9e0Var2 = z9e0Var;
                xto1.h(mqo1.A(k4p1.C(z9e0Var2.f)), null, x340Var2, 48);
                x340Var2.r(false);
            }
            x340Var2.r(true);
            qim0 qim0VarB2 = uyn1.B(pbhVar.a(0.218f, u291.f(qim0Var3, 1.0f), true), 0.0f, cbx.b(x340Var2).e.b, 0.0f, 0.0f, 13);
            gfh0 gfh0VarC3 = t1c.c(graVar, false);
            int iHashCode4 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM4 = x340Var2.m();
            qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarB2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC3, x340Var2, lljVar);
            nko1.H(xos0VarM4, x340Var2, lljVar2);
            x0d.q(iHashCode4, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE4, x340Var2, lljVar4);
            x340 x340Var3 = x340Var2;
            f5p1.d(x9e0Var, z9e0Var2.h, function0, function1, yqgVar, zja1Var, null, x340Var3, (i3 << 6) & 516096);
            x340Var = x340Var3;
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(z9e0Var, iu30Var, yqgVar, zja1Var, sipVar, qim0Var2, i, (byte) 26);
        }
    }

    public static final void c(String str, qim0 qim0Var, lee1 lee1Var, long j, int i, boolean z, b0k b0kVar, int i2) {
        int i3;
        int i4;
        int i5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(650052656);
        int i6 = (x340Var.h(z) ? 131072 : 65536) | i2 | (x340Var.g(str) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(lee1Var) ? 256 : 128) | (x340Var.f(j) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i6 & 1, (74899 & i6) != 74898)) {
            x340Var.d0();
            if ((i2 & 1) == 0 || x340Var.E()) {
                i4 = 1000;
            } else {
                x340Var.b0();
                i4 = i;
            }
            x340Var.s();
            if (z) {
                int i7 = i4;
                x340Var.i0(-288515008);
                cb80 cb80VarG = t5p1.g(t5p1.r("shimmer", x340Var, 0), -1.0f, 2.0f, irn1.Y(irn1.o0(i7, 0, mlv.d, 2), 1, 0L, 4), "shimmer_offset", x340Var, 29064, 0);
                uwr uwrVar = cbx.a;
                long j2 = cbx.a(x340Var).b.b;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
                cjc0 cjc0Var = new cjc0(1);
                qim0 qim0VarD = i541.D(nim0.a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 1, null, 983039);
                boolean zF = x340Var.f(j2) | x340Var.i(cb80VarG);
                Object objT = x340Var.T();
                if (zF || objT == fkj0.X) {
                    objT = new kuj(j2, cb80VarG, (byte) 4);
                    x340Var.s0(objT);
                }
                i5 = i7;
                uwo1.e(str, exd0.r(qim0VarD, (iu30) objT), lee1Var, j, null, null, 2, false, cjc0Var, 0, null, x340Var, i6 & 8078, 0, 1712);
                x340Var.r(true);
                x340Var.r(false);
            } else {
                x340Var.i0(-288642914);
                i5 = i4;
                uwo1.e(str, qim0Var, lee1Var, j, null, null, 0, false, null, 0, null, x340Var, i6 & 8190, 0, 2032);
                x340Var.r(false);
            }
            i3 = i5;
        } else {
            x340Var.b0();
            i3 = i;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mc60(str, qim0Var, lee1Var, j, i3, z, i2);
        }
    }

    public static final void d(String str, boolean z, boolean z2, boolean z3, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        String strK;
        qim0 qim0Var3;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-119419256);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.h(z2) ? 256 : 128) | (x340Var2.h(z3) ? 2048 : 1024) | 24576;
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            if (z3) {
                strK = x0d.k(x340Var2, 1202218238, 2131958328, x340Var2, false);
            } else {
                x340Var2.i0(-1385876021);
                if (str == null) {
                    strK = x0d.k(x340Var2, 1202220838, 2131958270, x340Var2, false);
                } else {
                    x340Var2.i0(1202220311);
                    x340Var2.r(false);
                    strK = str;
                }
                x340Var2.r(false);
            }
            qim0 qim0Var4 = nim0.a;
            if (z) {
                x340Var2.i0(-1385753261);
                qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
                fra fraVar = een.N0;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var2, 0);
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
                nko1.H(jw31VarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                k4k.b((qim0) null, z3 ? 2 : 1, z2 && !z3, false, (Integer) null, x340Var2, 0, 25);
                c(strK, new wnb0(1.0f, true), cbx.d(x340Var2).g, cbx.a(x340Var2).c.b, 0, z2 && !z3, x340Var2, 0);
                x340Var = x340Var2;
                x340Var.r(true);
                x340Var.r(false);
                qim0Var3 = qim0Var4;
            } else {
                String str2 = strK;
                x340Var2.i0(-1385170523);
                uwr uwrVar2 = cbx.a;
                qim0Var3 = qim0Var4;
                c(str2, u291.f(qim0Var3, 1.0f), cbx.d(x340Var2).g, cbx.a(x340Var2).c.b, 0, z2 && !z3, x340Var2, 0);
                x340Var = x340Var2;
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gj80(str, z, z2, z3, qim0Var2, i, (byte) 4);
        }
    }

    public static final void e(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1091600185);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131958336);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            cnx cnxVar = cnx.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(cnxVar, isl.a, u291.r(qim0Var3, 16.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, cnx.d | 48, 48);
            uwo1.e(strO0, null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var2, i, (byte) 22);
        }
    }

    public static final void f(czj1 czj1Var, iu30 iu30Var, pzj1 pzj1Var, vzj1 vzj1Var, jd6 jd6Var, zzq0 zzq0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-68219992);
        int i2 = i | (x340Var.g(czj1Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.g(pzj1Var) ? 256 : 128) | (x340Var.g(vzj1Var) ? 2048 : 1024) | (x340Var.i(jd6Var) ? 16384 : 8192) | (x340Var.i(zzq0Var) ? 131072 : 65536) | 1572864;
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            Boolean boolValueOf = Boolean.valueOf(!czj1Var.b.isEmpty());
            int i3 = i2 & 14;
            boolean z = (i3 == 4) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new t6j1(czj1Var, iu30Var, (lnm) null, (byte) 8);
                x340Var.s0(objT);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT);
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            boolean zG = x340Var.g(xtb0VarA);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new py71(xtb0VarA);
                x340Var.s0(objT2);
            }
            py71 py71Var = (py71) objT2;
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            otw.c(jd6Var, new lzu(czj1Var.a), (qim0) null, (ipb1) null, x340Var, (i2 >> 12) & 14, 12);
            int i4 = i2 >> 9;
            otw.c(vzj1Var, new tzj1(czj1Var.c instanceof yyj1), (qim0) null, (ipb1) null, x340Var, i4 & 14, 12);
            qim0 qim0VarL = bmq0.L(u291.f(qim0Var3, 1.0f), py71Var, (g6o0) null);
            boolean z2 = (i3 == 4) | ((i2 & 896) == 256);
            Object objT3 = x340Var.T();
            if (z2 || objT3 == m4cVar) {
                objT3 = new hij1(czj1Var, pzj1Var, (byte) 7);
                x340Var.s0(objT3);
            }
            ujo1.d(qim0VarL, xtb0VarA, zzq0Var, false, null, null, null, false, null, (iu30) objT3, x340Var, i4 & 896, 504);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ydi0((Object) czj1Var, (Object) iu30Var, (Object) pzj1Var, (Object) vzj1Var, (Object) jd6Var, (Object) zzq0Var, (Object) qim0Var2, i, (byte) 25);
        }
    }

    public static final ve01 g(sen0 sen0Var) {
        return new ve01(sen0Var, (xab1) null);
    }

    public static final xe01 h(wen0 wen0Var) {
        return new xe01(wen0Var, (faa0) null);
    }

    public static final boolean i(oa80 oa80Var) {
        return !oa80Var.h && oa80Var.d;
    }

    public static final boolean j(oa80 oa80Var) {
        return oa80Var.h && !oa80Var.d;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    public static final w4c0 k(mr20 mr20Var, int i) {
        jfe.w.getClass();
        int i2 = ffe.b;
        if (i >= i2) {
            i2 = i;
        }
        int i3 = i2 - i;
        if (mr20Var instanceof age) {
            age ageVar = (age) mr20Var;
            int i4 = ageVar.c;
            mr20 mr20VarI = ageVar.i();
            if (mr20VarI != null) {
                int i5 = ageVar.b;
                if (i5 != -3 && i5 != -2 && i5 != 0) {
                    i3 = i5;
                } else if (i4 == 1) {
                    if (i5 == 0) {
                        i3 = 0;
                    }
                } else if (i == 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                return new w4c0(i3, i4, ageVar.a, mr20VarI);
            }
        }
        return new w4c0(i3, 1, o6x.a, mr20Var);
    }

    public static juk0 l(r6h1 r6h1Var) {
        return new juk0(r6h1Var);
    }

    public static final Next m(xju0 xju0Var, String str, String str2, boolean z, int i, String str3, iu30 iu30Var) {
        if (xju0Var.g != null) {
            return Next.j();
        }
        if (!u890.j(str, xju0Var.a) || !u890.j(str2, xju0Var.b)) {
            return Next.j();
        }
        int i2 = xju0Var.h + 1;
        return Next.i(xju0.a(xju0Var, (String) null, (Boolean) null, false, (String) null, (ArrayList) null, Boolean.valueOf(z), i2, (String) null, (String) null, (vju0) null, new bku0(i, i2, str, str2, str3), 1855), Collections.singleton(iu30Var.invoke(Integer.valueOf(i2))));
    }

    public static final long n(oa80 oa80Var, qqq0 qqq0Var, na80 na80Var, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        long j2 = oa80Var.g;
        if (qqq0Var != null) {
            int i = na80Var.a;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (qqq0Var == qqq0.b) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j = jFloatToRawIntBits3 << 32;
            }
            j2 = j | (jFloatToRawIntBits & 4294967295L);
        }
        long jF = Offset.f(o(oa80Var, qqq0Var, na80Var), j2);
        if (z || !oa80Var.i) {
            return jF;
        }
        return 0L;
    }

    public static final long o(oa80 oa80Var, qqq0 qqq0Var, na80 na80Var) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (qqq0Var == null) {
            return oa80Var.c;
        }
        int i = na80Var.a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (oa80Var.c >> 32));
        } else {
            if (i != 2) {
                return oa80Var.c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (oa80Var.c & 4294967295L));
        }
        if (qqq0Var == qqq0.b) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    public static final ys50 p(c380 c380Var, b0k b0kVar) {
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        Object objT = x340Var.T();
        if (objT == obj) {
            objT = mb4.v(context);
            x340Var.s0(objT);
        }
        Vibrator vibrator = (Vibrator) objT;
        Object objT2 = x340Var.T();
        if (objT2 == obj) {
            objT2 = new ys50(context, vibrator, c380Var);
            x340Var.s0(objT2);
        }
        ys50 ys50Var = (ys50) objT2;
        boolean zI = x340Var.i(ys50Var);
        Object objT3 = x340Var.T();
        if (zI || objT3 == obj) {
            objT3 = new zw11(ys50Var, (byte) 2);
            x340Var.s0(objT3);
        }
        qxd0.i(0, (iu30) objT3, x340Var);
        return ys50Var;
    }

    public static final yae1 q(int i, b0k b0kVar, int i2) {
        boolean z = true;
        int i3 = (i2 & 1) != 0 ? 8 : 0;
        x340 x340Var = (x340) b0kVar;
        f930 f930Var = (f930) x340Var.k(t4k.k);
        wat watVar = (wat) x340Var.k(t4k.h);
        flb0 flb0Var = (flb0) x340Var.k(t4k.n);
        boolean zG = x340Var.g(f930Var) | x340Var.g(watVar) | x340Var.e(flb0Var.ordinal());
        if ((((i & 14) ^ 6) <= 4 || !x340Var.e(i3)) && (i & 6) != 4) {
            z = false;
        }
        boolean z2 = zG | z;
        Object objT = x340Var.T();
        if (z2 || objT == fkj0.X) {
            objT = new yae1(f930Var, watVar, flb0Var, i3);
            x340Var.s0(objT);
        }
        return (yae1) objT;
    }

    public static final ve01 r(mr20 mr20Var, c9n c9nVar, fy71 fy71Var, int i) {
        w4c0 w4c0VarK = k(mr20Var, i);
        dt71 dt71VarD = mgo1.d(i, w4c0VarK.b, w4c0VarK.c);
        return new ve01(dt71VarD, fn31.S(c9nVar, (o8n) w4c0VarK.e, u890.j(fy71Var, ey71.a) ? 1 : 4, new l53(fy71Var, (mr20) w4c0VarK.d, dt71VarD, mgo1.a, (lnm) null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object s(mr20 mr20Var, c9n c9nVar, onm onmVar) {
        ru20 ru20Var;
        if (onmVar instanceof ru20) {
            ru20Var = (ru20) onmVar;
            int i = ru20Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ru20Var.b = i - Integer.MIN_VALUE;
            } else {
                ru20Var = new ru20(onmVar);
            }
        } else {
            ru20Var = new ru20(onmVar);
        }
        Object objQ = ru20Var.a;
        int i2 = ru20Var.b;
        if (i2 == 0) {
            hm5.M(objQ);
            w4c0 w4c0VarK = k(mr20Var, 1);
            ayh ayhVar = new ayh(c9nVar.J().A(fkj0.W0));
            fn31.T(c9nVar, (o8n) w4c0VarK.e, 0, new lqv((mr20) w4c0VarK.d, ayhVar, (lnm) null, (byte) 14), 2);
            ru20Var.b = 1;
            objQ = ayhVar.Q(ru20Var);
            d9n d9nVar = d9n.a;
            if (objQ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objQ);
        }
        Object obj = ((e331) objQ).a;
        hm5.M(obj);
        return obj;
    }

    public static final xe01 t(mr20 mr20Var, c9n c9nVar, fy71 fy71Var, Object obj) {
        w4c0 w4c0VarK = k(mr20Var, 1);
        bpb1 bpb1VarB = gio1.b(obj);
        return new xe01(bpb1VarB, fn31.S(c9nVar, (o8n) w4c0VarK.e, u890.j(fy71Var, ey71.a) ? 1 : 4, new l53(fy71Var, (mr20) w4c0VarK.d, bpb1VarB, obj, (lnm) null)));
    }

    public static String u(o0a o0aVar) {
        return "spotify:internal:reinvent-free:back-skip-upsell:".concat(o0aVar.a);
    }
}
