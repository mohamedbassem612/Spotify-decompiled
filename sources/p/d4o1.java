package p;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.compose.ui.graphics.Brush;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Restrictions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class d4o1 {
    public static final u5j1 a = new u5j1((byte) 1);
    public static b180 b;

    public static final void a(int i, String str, String str2, String str3, Function0 function0, b0k b0kVar) {
        String str4;
        int i2;
        x340 x340Var;
        qim0 qim0VarB;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-514718225);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            str4 = str;
            i2 = (x340Var2.g(str4) ? 4 : 2) | i;
        } else {
            str4 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(function0) ? 2048 : 1024;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            if (str2 == null) {
                x340Var2.i0(743333081);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                qim0VarB = uyn1.B(qim0Var, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                x340Var2.r(false);
            } else {
                x340Var2.i0(743335277);
                x340Var2.r(false);
                qim0VarB = qim0Var;
            }
            qim0 qim0VarThen = qim0VarF.then(qim0VarB);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarThen);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            wnb0 wnb0VarQ = kk0.q(x340Var2, qim0VarE2, lljVar4, 1.0f, true);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = fjd.i;
                x340Var2.s0(objT);
            }
            qim0 qim0VarA = s161.a(wnb0VarQ, (iu30) objT);
            uwr uwrVar2 = cbx.a;
            int i3 = i2;
            uwo1.e(str4, qim0VarA, cbx.d(x340Var2).h, 0L, null, null, 0, false, new cjc0(1), 0, null, x340Var2, i2 & 14, 0, 1784);
            x340Var = x340Var2;
            if (str3 == null || function0 == null) {
                x340Var.i0(-1082507495);
                x340Var.r(false);
            } else {
                x340Var.i0(-1082755681);
                lee1 lee1Var = cbx.d(x340Var).k;
                long j = cbx.a(x340Var).b.c;
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = fjd.t;
                    x340Var.s0(objT2);
                }
                qim0 qim0VarB2 = s161.b(qim0Var, false, (iu30) objT2);
                boolean z2 = (i3 & 7168) == 2048;
                Object objT3 = x340Var.T();
                if (z2 || objT3 == m4cVar) {
                    objT3 = new pj8(function0, (byte) 20);
                    x340Var.s0(objT3);
                }
                uwo1.e(str3, bin.x(qim0VarB2, false, null, null, null, (Function0) objT3, 15), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, (i3 >> 6) & 14, 0, 2032);
                x340Var = x340Var;
                x340Var.r(false);
            }
            x340Var.r(true);
            if (str2 != null) {
                x340Var.i0(1569216975);
                lee1 lee1Var2 = cbx.d(x340Var).j;
                long j2 = cbx.a(x340Var).b.b;
                cjc0 cjc0Var = new cjc0(2);
                cvx cvxVar2 = cbx.b(x340Var).b;
                cvx cvxVar3 = cbx.b(x340Var).b;
                qim0 qim0VarB3 = uyn1.B(qim0Var, 0.0f, 4.0f, 0.0f, 12.0f, 5);
                Object objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = fjd.X;
                    x340Var.s0(objT4);
                }
                x340 x340Var3 = x340Var;
                uwo1.e(str2, s161.a(qim0VarB3, (iu30) objT4), lee1Var2, j2, null, null, 2, false, cjc0Var, 0, null, x340Var3, (i3 >> 3) & 14, 0, 1712);
                x340Var = x340Var3;
                x340Var.r(false);
            } else {
                x340Var.i0(1569636157);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ptd(str, str2, str3, function0, i, (byte) 0);
        }
    }

    public static final void b(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1908565063);
        j06 j06Var = ((x340) b0kVar3).a;
        int i2 = i | (b0kVar3.i(function0) ? 4 : 2) | 48;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarN = anm1.N("match_review_completion", dug.f(qim0VarD, cbx.a(b0kVar3).a.c, a));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            qim0 qim0VarY = voo1.y(u291.d(qim0Var3, 1.0f), voo1.a);
            float f = cbx.b(b0kVar3).e.b;
            mta mtaVar = cbx.b(b0kVar3).d;
            qim0 qim0VarH = l6o1.H(uyn1.y(qim0VarY, f, 56.0f), l6o1.C(0, 0, 1, b0kVar3), false, 14);
            era eraVar = een.Q0;
            cvx cvxVar = cbx.b(b0kVar3).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, false, new g21(een.N0, (byte) 28)), eraVar, b0kVar3, 48);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarH);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            klx klxVar = klx.c;
            long j = cbx.a(b0kVar3).b.f;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            b0kVar2 = b0kVar3;
            w0h1.a(klxVar, isl.a, u291.r(qim0Var3, 48.0f), j, 0L, false, b0kVar2, klx.d | 48, 48);
            uwo1.e(cwl1.o0(b0kVar2, 2131957269), null, cbx.d(b0kVar2).f, cbx.a(b0kVar2).b.a, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2018);
            b0kVar2.r(true);
            x7f1 x7f1VarC = kkn.C(cbx.a(b0kVar2).a.c, cbx.a(b0kVar2).a.c, 0L, 0L, 0L, b0kVar2, 60);
            mta mtaVar2 = cbx.b(b0kVar2).d;
            ti5.a(pzi.a, (qim0) null, apo.r(-65150278, new tse0(function0, (byte) 4), b0kVar2), (xu30) null, 56.0f, (erl1) null, x7f1VarC, b0kVar2, 390, 170);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(function0, qim0Var2, i, (byte) 12);
        }
    }

    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    public static final void c(dp71 dp71Var, jwf0 jwf0Var, tln tlnVar, iu30 iu30Var, cb0 cb0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        int i3;
        boolean z;
        qim0 qim0Var3;
        ?? r3;
        boolean z2;
        t7q0 t7q0Var = dp71Var.b;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(430658144);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.g(dp71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar2.g(jwf0Var) : b0kVar2.i(jwf0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.i(tlnVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar2.i(cb0Var) ? 16384 : 8192;
        }
        int i4 = i2 | 196608;
        if (b0kVar2.Y(i4 & 1, (74899 & i4) != 74898)) {
            boolean z3 = dp71Var.d;
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarC = u291.c(qim0Var4, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarC);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            t7q0Var.getClass();
            boolean z4 = t7q0Var instanceof g7q0;
            j2h1.f(cwl1.o0(b0kVar2, z4 ? 2131953661 : 2131953778), (qim0) null, 0L, 0L, (lee1) null, (vu30) null, b0kVar2, 0, 126);
            b0kVar2 = b0kVar2;
            if (z3) {
                b0kVar2.i0(1955656396);
                String strO0 = cwl1.o0(b0kVar2, 2131953776);
                uwr uwrVar = cbx.a;
                long j = cbx.a(b0kVar2).b.a;
                lee1 lee1Var = cbx.d(b0kVar2).h;
                cvx cvxVar = cbx.b(b0kVar2).b;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var4);
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                cvx cvxVar3 = cbx.b(b0kVar2).b;
                i3 = 48;
                uwo1.e(strO0, uyn1.B(qim0VarZ, 0.0f, 16.0f, 0.0f, 8.0f, 5), lee1Var, j, new a0e1(5), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2016);
                z = true;
                qim0Var3 = null;
                zko1.d(48, 1, apo.r(-1447691325, new gbo0(cb0Var, (byte) 0), b0kVar2), b0kVar2, null);
                b0kVar2.r(false);
            } else {
                i3 = 48;
                z = true;
                qim0Var3 = null;
                b0kVar2.i0(1956209932);
                b0kVar2.r(false);
            }
            if (z4) {
                b0kVar2.i0(1956265453);
                String uri = t7q0Var.getUri();
                if ((i4 & 7168) == 2048) {
                    b0kVar2 = b0kVar2;
                    z2 = z;
                } else {
                    b0kVar2 = b0kVar2;
                    z2 = false;
                }
                Object objT = b0kVar2.T();
                if (z2 || objT == fkj0.X) {
                    objT = new wck0(iu30Var, (byte) 10);
                    b0kVar2.s0(objT);
                }
                int i5 = (i4 >> 6) & 14;
                r3 = z;
                otw.c(tlnVar, new pln(new rln(uri, (iu30) objT)), (qim0) null, (ipb1) null, b0kVar2, i5, 12);
                b0kVar2.r(false);
            } else {
                b0kVar2 = b0kVar2;
                r3 = z;
                b0kVar2.i0(1956572012);
                b0kVar2.r(false);
            }
            zko1.d(i3, r3, apo.r(-2090110936, new loi0(jwf0Var, dp71Var, (byte) 26), b0kVar2), b0kVar2, qim0Var3);
            b0kVar2.r((boolean) r3);
            qim0Var2 = qim0Var4;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0(dp71Var, jwf0Var, tlnVar, iu30Var, cb0Var, qim0Var2, i, (byte) 6);
        }
    }

    public static final void d(xfx xfxVar, l7u l7uVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1374605493);
        int i2 = i | (x340Var.i(xfxVar) ? 4 : 2) | (x340Var.i(l7uVar) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zI = x340Var.i(xfxVar) | ((i2 & 7168) == 2048);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new umr0(xfxVar, iu30Var, (byte) 2);
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            boolean zI2 = x340Var.i(l7uVar);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new wvq0(l7uVar, (byte) 12);
                x340Var.s0(objT2);
            }
            dm5.a(iu30Var2, qim0Var, (iu30) objT2, x340Var, (i2 >> 3) & 112, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(xfxVar, l7uVar, qim0Var, iu30Var, i, (byte) 8);
        }
    }

    public static final void e(y7e1 y7e1Var, String str, Function0 function0, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        String strK;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-343970663);
        int i2 = i | (b0kVar3.i(y7e1Var) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128) | (b0kVar3.i(iu30Var) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            if (str == null) {
                strK = x0d.k(b0kVar3, 156683704, 2131953591, b0kVar3, false);
            } else {
                b0kVar3.i0(156683115);
                b0kVar3.r(false);
                strK = str;
            }
            if (y7e1Var.d().d.length() > 0) {
                b0kVar3.i0(562606598);
                j2iVarR = apo.r(1366742233, new h621(function0, (byte) 4), b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(563077395);
                b0kVar3.r(false);
                j2iVarR = null;
            }
            uwr uwrVar = cbx.a;
            String str2 = strK;
            fyx fyxVar = new fyx(new zxx(cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.b, cbx.a(b0kVar3).b.d, cbx.a(b0kVar3).a.b.a(), cbx.a(b0kVar3).a.b.a(), cbx.a(b0kVar3).b.c, 0L, 896));
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            mta mtaVar = cbx.b(b0kVar3).d;
            qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0VarF);
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            qim0 qim0VarY = uyn1.y(qim0VarJ, 16.0f, 8.0f);
            boolean z = (i2 & 7168) == 2048;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new n601(iu30Var, (byte) 20);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            rwo1.a(y7e1Var, fyxVar, cev0.G(qim0VarY, (iu30) objT), null, str2, gfj.b, j2iVarR, false, null, null, null, null, d6e1.b, null, null, null, null, null, 0.0f, false, b0kVar2, (i2 & 14) | 196608, 0, 0, 2088840);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pby0(y7e1Var, str, function0, iu30Var, i, (byte) 26);
        }
    }

    public static poy0 f(iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, iu30 iu30Var3, int i) {
        bhh1 bhh1Var = igu.b;
        if ((i & 16) != 0) {
            iu30Var3 = fft0.N0;
        }
        return h4o1.q(iu30Var, iu30Var2, vu30Var, bhh1Var, iu30Var3);
    }

    public static poy0 g(moy0 moy0Var, iu30 iu30Var, vu30 vu30Var, iu30 iu30Var2, int i) {
        bhh1 bhh1Var = igu.b;
        if ((i & 16) != 0) {
            iu30Var2 = ucy0.R0;
        }
        return h4o1.q(new qoy0(moy0Var, (byte) 1), iu30Var, vu30Var, bhh1Var, iu30Var2);
    }

    public static int h(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier == 0) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    public static final boolean i(a8b0 a8b0Var) {
        dq20 dq20VarW0 = a8b0Var.w0();
        if (dq20VarW0 instanceof wjz) {
            return true;
        }
        return (dq20VarW0 instanceof dq20) && (dq20VarW0.A0() instanceof wjz);
    }

    public static final boolean j(String str) {
        return !nhc1.R(str, "NonAuth", false);
    }

    public static final gao k(qx50 qx50Var, u7h u7hVar, Brush brush, ni20 ni20Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = v8r.q(brush);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = v8r.q(brush);
            x340Var.s0(objT2);
        }
        ven0 ven0Var2 = (ven0) objT2;
        Object objT3 = x340Var.T();
        if (objT3 == m4cVar) {
            objT3 = v8r.q(new mmr0(qx50Var, u7hVar));
            x340Var.s0(objT3);
        }
        ven0 ven0Var3 = (ven0) objT3;
        if (u890.j(((mmr0) ven0Var3.getValue()).a, qx50Var) && u890.j(((mmr0) ven0Var3.getValue()).b, u7hVar)) {
            ven0Var2.setValue(brush);
        } else {
            ven0Var.setValue((Brush) ven0Var2.getValue());
            ven0Var2.setValue(brush);
            ven0Var3.setValue(new mmr0(qx50Var, u7hVar));
        }
        boolean zG = x340Var.g(qx50Var) | x340Var.g(u7hVar);
        Object objT4 = x340Var.T();
        if (zG || objT4 == m4cVar) {
            objT4 = c97.b(0.0f);
            x340Var.s0(objT4);
        }
        o95 o95Var = (o95) objT4;
        boolean zI = x340Var.i(o95Var) | x340Var.i(ni20Var);
        Object objT5 = x340Var.T();
        if (zI || objT5 == m4cVar) {
            objT5 = new x060(o95Var, ni20Var, (lnm) null, (byte) 0);
            x340Var.s0(objT5);
        }
        qxd0.s(qx50Var, u7hVar, (vu30) objT5, x340Var);
        Brush brush2 = (Brush) ven0Var.getValue();
        boolean zI2 = x340Var.i(o95Var);
        Object objT6 = x340Var.T();
        if (zI2 || objT6 == m4cVar) {
            objT6 = new hub(o95Var, (byte) 1);
            x340Var.s0(objT6);
        }
        return new gao(brush2, (Function0) objT6);
    }

    public static final bw50 l(rbt rbtVar, b0k b0kVar) {
        long jE;
        ven0 ven0VarK = f4p1.k(rbtVar.a, (iac0) null, b0kVar, 7);
        qx50 qx50Var = ((ly50) f4p1.j(rbtVar.f, ly50.i, (iac0) null, b0kVar, 0, 14).getValue()).f;
        ymc0 ymc0Var = (ymc0) ven0VarK.getValue();
        if (ymc0Var != null) {
            jE = z4p1.e(ymc0Var.a);
        } else {
            uwr uwrVar = cbx.a;
            jE = ((yex) zex.a.d).e;
        }
        return new bw50(qx50Var, jE);
    }

    public static final rxe1 m(Integer num, vxe1 vxe1Var, b0k b0kVar, int i) {
        tob1 tob1Var;
        m4c m4cVar = fkj0.X;
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        x340 x340Var = (x340) b0kVar;
        boolean zG = ((i2 > 4 && ((x340) b0kVar).g(num)) || (i & 6) == 4) | x340Var.g(vxe1Var);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            objT = v8r.q((Object) null);
            x340Var.s0(objT);
        }
        tob1 tob1Var2 = (ven0) objT;
        boolean zI = x340Var.i(tob1Var2);
        if ((i2 <= 4 || !x340Var.g(num)) && (i & 6) != 4) {
            z = false;
        }
        boolean zI2 = zI | z | x340Var.i(vxe1Var);
        Object objT2 = x340Var.T();
        if (zI2 || objT2 == m4cVar) {
            tob1Var = tob1Var2;
            nsf1 nsf1Var = new nsf1(num, vxe1Var, tob1Var, (lnm) null, (byte) 8);
            x340Var.s0(nsf1Var);
            objT2 = nsf1Var;
        } else {
            tob1Var = tob1Var2;
        }
        qxd0.s(num, vxe1Var, (vu30) objT2, x340Var);
        return (rxe1) tob1Var.getValue();
    }

    public static final rxe1 n(String str, vxe1 vxe1Var, b0k b0kVar, int i) {
        boolean z;
        u7h u7hVarQ;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.f0(-1761484417, str);
        xb10 xb10VarO = x4p1.o(x340Var);
        if (ihc1.y0(str)) {
            z = false;
            x340Var.i0(1228883330);
            x340Var.r(false);
        } else {
            x340Var.i0(1228647885);
            boolean z2 = (((i & 14) ^ 6) > 4 && x340Var.g(str)) || (i & 6) == 4;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = Uri.parse(str);
                x340Var.s0(objT);
            }
            objT.getClass();
            z = false;
            oi7.a((Uri) objT, (gw70) null, xb10VarO, yqi1.b, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, jhc1.c(100.0f, 100.0f), x340Var, 0, 0, 98278);
            x340Var = x340Var;
            x340Var.r(false);
        }
        boolean zG = x340Var.g(xb10VarO.a());
        Object objT2 = x340Var.T();
        if (zG || objT2 == m4cVar) {
            smr0 smr0VarA = xb10VarO.a();
            objT2 = (smr0VarA == null || (u7hVarQ = ywo1.q(smr0VarA)) == null) ? null : Integer.valueOf(z4p1.G(u7hVarQ.a));
            x340Var.s0(objT2);
        }
        rxe1 rxe1VarM = m((Integer) objT2, vxe1Var, x340Var, i & 112);
        x340Var.r(z);
        return rxe1VarM;
    }

    public static Object[] o(int i, Object[] objArr) {
        if (objArr.length < i) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public static final zv61 p(qx50 qx50Var, long j, long j2) {
        uwr uwrVar = cbx.a;
        long j3 = ((yex) zex.a.d).a;
        if (qx50Var instanceof ox50) {
            return v9c.s(p7h.M(new u7h[]{new u7h(j), new u7h(j3)}), 0.0f, 0.0f, 14);
        }
        if (!(qx50Var instanceof px50)) {
            eg.o();
            return null;
        }
        px50 px50Var = (px50) qx50Var;
        List list = px50Var.b;
        float f = px50Var.a;
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            arrayList.add(new mmr0(Float.valueOf(((Number) obj).floatValue()), new u7h(i == p7h.L(list) ? j3 : j)));
            i = i2;
        }
        mmr0[] mmr0VarArr = (mmr0[]) arrayList.toArray(new mmr0[0]);
        return v9c.p((mmr0[]) Arrays.copyOf(mmr0VarArr, mmr0VarArr.length), j2, f, 8);
    }

    public static final ArrayList q(frw frwVar, List list, Function0 function0) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (Object obj : list2) {
            Class<?> cls = obj.getClass();
            LinkedHashMap linkedHashMap = frwVar.b;
            LinkedHashMap linkedHashMap2 = frwVar.c;
            if (!linkedHashMap.containsKey(cls) && !linkedHashMap2.containsKey(cls)) {
                n9v.k("Item not defined in the DSL ", obj.getClass(), ". All the item types that are defined in the source should have a corresponding item in the DSL");
                return null;
            }
            if (!linkedHashMap.containsKey(obj.getClass())) {
                sqg0.G(obj.getClass(), linkedHashMap2).getClass();
                bhn0.d();
                return null;
            }
            vqw vqwVar = (vqw) sqg0.G(obj.getClass(), linkedHashMap);
            laa laaVar = (laa) vqwVar.f.getValue();
            String string = vqwVar.a.b.invoke(obj).toString();
            vu30 vu30Var = null;
            boolean z = vqwVar.e;
            vu30 vu30Var2 = vqwVar.d;
            if (w0h1.y(2, vu30Var2)) {
                vu30Var = vu30Var2;
            }
            arrayList.add(new uqw(laaVar, obj, string, z, vu30Var, function0, vqwVar.b, vqwVar.c));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0230  */
    /* JADX WARN: Code duplicated, block: B:159:0x0240  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:6:0x0016  */
    public static final hjf1 r(ContextTrack contextTrack, int i, Restrictions restrictions, List list, boolean z, boolean z2, ktw0 ktw0Var, boolean z3, boolean z4, boolean z5, String str, String str2, boolean z6, boolean z7, boolean z8, String str3, aak0 aak0Var, boolean z9) {
        boolean zContains;
        String strL;
        boolean zContains2;
        boolean z10;
        boolean zContains3;
        boolean z11;
        boolean zO = h4o1.o(contextTrack);
        if (!z) {
            if ((ktw0Var instanceof itw0 ? true : ktw0Var.a().contains(zO ? abz0.c : abz0.d)) && restrictions.disallowAddToQueueReasons().isEmpty()) {
                zContains = true;
            } else {
                zContains = false;
            }
        } else if (u890.j(ktw0Var.a(), abz0.b)) {
            zContains = false;
        } else {
            zContains = ktw0Var.a().contains(zO ? abz0.c : abz0.d);
        }
        int i2 = (z9 && zContains) ? (i == 0 && l4o1.S(contextTrack)) ? 3 : 2 : 1;
        String strC0 = l4o1.c0(contextTrack);
        String strUri = contextTrack.uri();
        String strF0 = l4o1.f0(contextTrack);
        if (strF0 == null) {
            strF0 = "";
        }
        if (str2 != null) {
            strL = str2;
        } else if (l4o1.E(contextTrack)) {
            strL = l4o1.a0(contextTrack, "advertiser");
            if (strL == null) {
                strL = "";
            }
        } else if (l4o1.P(contextTrack)) {
            strL = l4o1.a0(contextTrack, "album_title");
            if (strL == null) {
                strL = "";
            }
        } else {
            strL = l4o1.l(contextTrack);
        }
        boolean z12 = str2 != null;
        String str4 = (!z7 || str3 == null) ? str : str3;
        String str5 = strUri;
        String str6 = strL;
        boolean zS = l4o1.S(contextTrack);
        boolean zO2 = h4o1.o(contextTrack);
        Set setF = l4o1.S(contextTrack) ? ktw0Var.f() : ktw0Var.e();
        abz0 abz0Var = zO2 ? abz0.c : abz0.d;
        boolean zContains4 = setF.contains(abz0Var);
        ezf1 ezf1Var = ezf1.c;
        if (zContains4 && z) {
            if (!ktw0Var.d().contains(abz0Var)) {
                ezf1Var = ezf1.d;
            }
        } else if (!(ktw0Var instanceof itw0)) {
            ezf1Var = ktw0Var instanceof htw0 ? ezf1.b : ezf1.a;
        }
        boolean zS2 = l4o1.S(contextTrack);
        boolean zO3 = h4o1.o(contextTrack);
        if (z) {
            zContains2 = (zS2 ? ktw0Var.c() : ktw0Var.b()).contains(zO3 ? abz0.c : abz0.d);
        } else {
            zContains2 = !(ktw0Var instanceof htw0) && restrictions.disallowRemovingFromNextTracksReasons().isEmpty() && restrictions.disallowSetQueueReasons().isEmpty();
        }
        boolean z13 = l4o1.J(contextTrack) || Boolean.parseBoolean((String) contextTrack.metadata().get("recommendation_icon")) || l4o1.V(contextTrack) || Boolean.parseBoolean((String) contextTrack.metadata().get("mft.externally_injected")) || u890.j(contextTrack.metadata().get("provider"), "album/inject_filler_tracks") || (z3 && !l4o1.I(contextTrack));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str7 = strC0;
            String str8 = str5;
            String str9 = ((td10) obj).b;
            String str10 = str6;
            String str11 = strF0;
            String str12 = (String) contextTrack.metadata().get("queued_by");
            if (str12 == null) {
                str12 = "";
            }
            if (u890.j(str9, str12)) {
                arrayList.add(obj);
            }
            str5 = str8;
            str6 = str10;
            strC0 = str7;
            strF0 = str11;
        }
        String str13 = strC0;
        String str14 = str5;
        String str15 = str6;
        String str16 = strF0;
        k4m k4mVar = l4o1.K(contextTrack) ? k4m.b : l4o1.D(contextTrack) ? k4m.a : k4m.d;
        boolean zO4 = h4o1.o(contextTrack);
        if (!z) {
            if (!zO4 || ((ktw0Var instanceof itw0) && ((itw0) ktw0Var).s.contains(abz0.c))) {
                zContains3 = true;
            } else if (ktw0Var instanceof htw0) {
                htw0 htw0Var = (htw0) ktw0Var;
                if (htw0Var.t.contains(abz0.c)) {
                    z10 = true;
                    if (htw0Var.l != 1) {
                        zContains3 = true;
                    }
                } else {
                    z10 = true;
                }
                zContains3 = false;
            } else {
                z10 = true;
                zContains3 = false;
            }
            if (z6 || !l4o1.L(contextTrack)) {
                z11 = false;
            } else {
                z11 = z10;
            }
            return new hjf1(str13, str14, str16, str15, str4, i, zS, contextTrack, ezf1Var, zContains2, zContains, i2, z13, z2, zContains3, k4mVar, arrayList, z4, z5, z11, z7, z8, aak0Var, z12);
        }
        if (ktw0Var.g().isEmpty()) {
            zContains3 = false;
        } else {
            zContains3 = ktw0Var.g().contains(zO4 ? abz0.c : abz0.d);
        }
        z10 = true;
        if (z6) {
            z11 = false;
        } else {
            z11 = false;
        }
        return new hjf1(str13, str14, str16, str15, str4, i, zS, contextTrack, ezf1Var, zContains2, zContains, i2, z13, z2, zContains3, k4mVar, arrayList, z4, z5, z11, z7, z8, aak0Var, z12);
    }

    public static boolean t(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
