package p;

import android.app.ActivityManager;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.music.SpotifyApplication;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class m1p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(String str, String str2, String str3, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1648920869);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            j2i j2iVarR = apo.r(-1374131938, new sb9(str3, str, str2), x340Var);
            qim0 qim0Var3 = nim0.a;
            k(54, 0, j2iVarR, x340Var, qim0Var3);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tb9(str, str2, str3, qim0Var2, i, (byte) 0);
        }
    }

    public static final void b(int i, Function0 function0, Function0 function1, b0k b0kVar, boolean z, boolean z2) {
        x340 x340Var;
        long j;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1460264774);
        int i2 = i | (x340Var2.i(function0) ? 4 : 2) | (x340Var2.i(function1) ? 32 : 16) | (x340Var2.h(z) ? 256 : 128) | (x340Var2.h(z2) ? 2048 : 1024);
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
            String strO0 = cwl1.o0(x340Var2, 2131953920);
            lee1 lee1Var = cbx.d(x340Var2).k;
            gra graVar = een.g;
            h2c h2cVar = h2c.a;
            qim0 qim0VarA = h2cVar.a(nim0Var, graVar);
            vq60 vq60Var = jw80.a;
            tsj0 tsj0Var = tsj0.a;
            uwo1.e(strO0, bin.x(anm1.N("clip_title_editing_cancel_button", qim0VarA.then(tsj0Var)), false, null, new pm31(0), null, function0, 11), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
            uwo1.e(cwl1.o0(x340Var2, 2131953923), h2cVar.a(nim0Var, een.h), cbx.d(x340Var2).h, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
            x340Var = x340Var2;
            if (z) {
                x340Var.i0(-128872041);
                String strO1 = cwl1.o0(x340Var, 2131953921);
                lee1 lee1Var2 = cbx.d(x340Var).k;
                if (z2) {
                    x340Var.i0(1796963660);
                    j = cbx.a(x340Var).c.c;
                    x340Var.r(false);
                } else {
                    x340Var.i0(1796965383);
                    j = cbx.a(x340Var).c.b;
                    x340Var.r(false);
                }
                uwo1.e(strO1, bin.x(anm1.N("clip_title_editing_header_save_button", h2cVar.a(nim0Var, een.i).then(tsj0Var)), z2, null, new pm31(0), null, function1, 10), lee1Var2, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(-128363486);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xoe(function0, function1, z, z2, i);
        }
    }

    public static final void c(u720 u720Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        iu30 iu30Var2;
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1769523414);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.i(u720Var) ? 32 : 16) | (b0kVar2.i(iu30Var) ? 256 : 128) | 3072;
        if (b0kVar2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new bw91();
                b0kVar2.s0(objT);
            }
            List list = (List) objT;
            Boolean bool = Boolean.TRUE;
            boolean zG = b0kVar2.g(list) | b0kVar2.i(u720Var);
            Object objT2 = b0kVar2.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new t6j1(list, u720Var, (lnm) null, (byte) 0);
                b0kVar2.s0(objT2);
            }
            qxd0.t(bool, b0kVar2, (vu30) objT2);
            es41 es41VarC = l6o1.C(0, 0, 1, b0kVar2);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = l6o1.H(qim0Var3, es41VarC, false, 14);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarH);
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
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarF);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            boolean zG2 = b0kVar2.g(list);
            Object objT3 = b0kVar2.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new a1e(list, (byte) 3);
                b0kVar2.s0(objT3);
            }
            g0p1.c(6, cwl1.o0(b0kVar2, 2131953905), (Function0) objT3, b0kVar2, null, list.isEmpty());
            qim0 qim0VarA = h2c.a.a(qim0Var3, een.h);
            Object objT4 = b0kVar2.T();
            if (objT4 == m4cVar) {
                objT4 = l6j1.d;
                b0kVar2.s0(objT4);
            }
            qim0 qim0VarB = s161.b(qim0VarA, false, (iu30) objT4);
            String strO0 = cwl1.o0(b0kVar2, 2131956227);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar2).h;
            b0kVar2 = b0kVar2;
            uwo1.e(strO0, qim0VarB, lee1Var, 0L, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2040);
            op71.g(b0kVar2, u291.v(qim0Var3, 1.0f));
            b0kVar2.r(true);
            long jB = u7h.b(cbx.a(b0kVar2).a.b.c(), 0.1f, 0.0f, 0.0f, 0.0f, 14);
            cvx cvxVar = cbx.b(b0kVar2).b;
            hr80.d(uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, 16.0f, 7), 0.5f, jB, b0kVar2, 0, 0);
            b6k b6kVar = new b6k(u720Var.d, list);
            boolean zG3 = b0kVar2.g(list) | ((i2 & 896) == 256);
            Object objT5 = b0kVar2.T();
            if (zG3 || objT5 == m4cVar) {
                iu30Var2 = iu30Var;
                objT5 = new v40(iu30Var2, list, (byte) 4);
                b0kVar2.s0(objT5);
            } else {
                iu30Var2 = iu30Var;
            }
            sqe.c(b6kVar, (iu30) objT5, (qim0) null, b0kVar2, 0);
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarF2);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC2, b0kVar2, lljVar);
            nko1.H(xos0VarM3, b0kVar2, lljVar2);
            x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar4);
            gfx.g(4, apo.r(380206134, new zdv0(iu30Var2, list), b0kVar2), b0kVar2, 54);
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            iu30Var2 = iu30Var;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wpg1((Object) u720Var, (Object) iu30Var2, (Object) qim0Var2, i, (byte) 25);
        }
    }

    public static final void d(pey0 pey0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        int i4;
        gbx gbxVar;
        m4c m4cVar = fkj0.X;
        String str = pey0Var.d;
        String str2 = pey0Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-295649516);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(pey0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i5 = i2 | 384;
        if (x340Var.Y(i5 & 1, (i5 & 147) != 146)) {
            zzq0 zzq0Var = pey0Var.f;
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarW = uyn1.w(qim0Var4, zzq0Var);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarW);
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
            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(qim0VarF, jA, er31.b(16.0f));
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF2, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            jw31 jw31VarA = ew31.a(h36.g, een.Z, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
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
            qim0 qim0VarH = kx40.h(1.0f, u291.c(qim0Var4, 1.0f), true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarH);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var4, 12.0f));
            String str3 = ihc1.y0(str2) ? null : str2;
            if (str3 == null) {
                x340Var.i0(-2125914466);
                x340Var.r(false);
                qim0Var3 = qim0Var4;
                i4 = 0;
                i3 = i5;
            } else {
                x340Var.i0(-2125914465);
                i3 = i5;
                qim0Var3 = qim0Var4;
                i4 = 0;
                uwo1.e(str3, anm1.N("title-tag", qim0Var4), cbx.d(x340Var).h, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                x340Var = x340Var;
                cvx cvxVar3 = cbx.b(x340Var).b;
                x0d.s(qim0Var3, 6.0f, x340Var, false);
            }
            e(i4, pey0Var.b, x340Var, !ihc1.y0(str2));
            cvx cvxVar4 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 8.0f));
            qim0 qim0VarN = anm1.N("cta-button-tag", qim0Var3);
            int i6 = i3 & 112;
            int i7 = i6 == 32 ? 1 : i4;
            Object objT = x340Var.T();
            if (i7 != 0 || objT == m4cVar) {
                objT = new fr01(iu30Var, (byte) 22);
                x340Var.s0(objT);
            }
            z50 z50Var = z50.c;
            gbx gbxVar2 = new gbx(z50Var, (Function0) objT);
            ldx ldxVar = ldx.c;
            x340 x340Var2 = x340Var;
            iu30Var2 = iu30Var;
            foo1.c(gbxVar2, ldxVar, qim0VarN, null, null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), null, null, null, null, apo.r(1470155443, new ziz0(pey0Var, (byte) 17), x340Var), x340Var2, 0, 48, 1976);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0 qim0VarN2 = anm1.N("close-tag", qim0Var3);
            if (ihc1.y0(str)) {
                x340Var.i0(1859246064);
                boolean z2 = i6 == 32;
                Object objT2 = x340Var.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new fr01(iu30Var2, (byte) 24);
                    x340Var.s0(objT2);
                }
                gbxVar = new gbx(z50Var, (Function0) objT2);
                x340Var.r(false);
            } else {
                x340Var.i0(1859102007);
                boolean z3 = i6 == 32;
                Object objT3 = x340Var.T();
                if (z3 || objT3 == m4cVar) {
                    objT3 = new fr01(iu30Var2, (byte) 23);
                    x340Var.s0(objT3);
                }
                Function0 function0 = (Function0) objT3;
                if (ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    gbxVar = new gbx(new y50(str), function0);
                    x340Var.r(false);
                }
            }
            gbx gbxVar3 = gbxVar;
            cvx cvxVar5 = cbx.b(x340Var).b;
            wro1.h(gbxVar3, ldxVar, qim0VarN2, null, yla.s(x340Var), new zzq0(6.0f, 6.0f, 6.0f, 6.0f), false, null, null, mcj.a, x340Var, 0, 6, 920);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(pey0Var, iu30Var2, qim0Var2, i, (byte) 20);
        }
    }

    public static final void e(int i, String str, b0k b0kVar, boolean z) {
        String str2 = str;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1941781730);
        int i2 = i | (x340Var.g(str2) ? 4 : 2) | (x340Var.h(z) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(-1294897555);
                qim0 qim0VarN = anm1.N("body-with-title-tag", nim0Var);
                uwr uwrVar = cbx.a;
                uwo1.e(str2, qim0VarN, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2032);
                x340Var.r(false);
                str2 = str;
            } else {
                x340Var.i0(-1294704115);
                qim0 qim0VarN2 = anm1.N("body-without-title-tag", nim0Var);
                uwr uwrVar2 = cbx.a;
                str2 = str;
                uwo1.e(str2, qim0VarN2, cbx.d(x340Var).j, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2032);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mv8((byte) 10, i, str2, z);
        }
    }

    public static final void f(List list, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) {
        List list2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1304625029);
        int i2 = i | (x340Var.i(list) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(iu30Var2) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = v8r.q((Object) null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = kaa0.h(0L, x340Var);
            }
            ven0 ven0Var2 = (ven0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == obj) {
                objT3 = v8r.q((Object) null);
                x340Var.s0(objT3);
            }
            ven0 ven0Var3 = (ven0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == obj) {
                objT4 = p3d1.n(0L, x340Var);
            }
            ven0 ven0Var4 = (ven0) objT4;
            Object objT5 = x340Var.T();
            if (objT5 == obj) {
                objT5 = new HashMap();
                x340Var.s0(objT5);
            }
            HashMap map = (HashMap) objT5;
            View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            Object objT6 = x340Var.T();
            Object obj2 = objT6;
            if (objT6 == obj) {
                bw91 bw91Var = new bw91();
                bw91Var.addAll(list);
                x340Var.s0(bw91Var);
                obj2 = bw91Var;
            }
            bw91 bw91Var2 = (bw91) obj2;
            boolean zI = x340Var.i(list);
            Object objT7 = x340Var.T();
            if (zI || objT7 == obj) {
                piu piuVar = new piu(bw91Var2, list, ven0Var, (lnm) null, (byte) 16);
                list2 = list;
                ven0Var = ven0Var;
                x340Var.s0(piuVar);
                objT7 = piuVar;
            } else {
                list2 = list;
            }
            qxd0.t(list2, x340Var, (vu30) objT7);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            Object objT8 = x340Var.T();
            if (objT8 == obj) {
                objT8 = new d7v(ven0Var4, (byte) 27);
                x340Var.s0(objT8);
            }
            qim0 qim0VarN = anm1.N("filter_reordering_flow_row", lrn1.u(qim0VarF, (iu30) objT8));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            cvx cvxVar2 = cbx.b(x340Var).b;
            k5p1.d(qim0VarN, d36Var, new d36(12.0f, true, new um5(false)), null, 0, 0, apo.r(-1937453642, new e1c(bw91Var2, map, view, iu30Var, ven0Var, ven0Var2, ven0Var3, ven0Var4, iu30Var2), x340Var), x340Var, 1572870, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx00((byte) 12, i, list, iu30Var2, iu30Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void g(ic20 ic20Var, iu30 iu30Var, iu30 iu30Var2, br0 br0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        iu30 iu30Var3;
        iu30 iu30Var4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1142142136);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(ic20Var) : x340Var.i(ic20Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            iu30Var3 = iu30Var;
            i2 |= x340Var.i(iu30Var3) ? 32 : 16;
        } else {
            iu30Var3 = iu30Var;
        }
        if ((i & 384) == 0) {
            iu30Var4 = iu30Var2;
            i2 |= x340Var.i(iu30Var4) ? 256 : 128;
        } else {
            iu30Var4 = iu30Var2;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(br0Var) : x340Var.i(br0Var) ? 2048 : 1024;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.b0();
        } else if (ic20Var instanceof hc20) {
            x340Var.i0(1913042529);
            h(x340Var, 0);
            x340Var.r(false);
        } else {
            if (!(ic20Var instanceof gc20)) {
                throw p3d1.k(x340Var, 1913042151, false);
            }
            x340Var.i0(-825151017);
            Boolean bool = (Boolean) x340Var.k(ixm1.a);
            bool.getClass();
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = zs10.c1;
                x340Var.s0(objT);
            }
            hm5.a(bool, (qim0) null, (iu30) objT, (tl3) null, "edit_mode_transition", (iu30) null, apo.r(-637309396, new d34(ic20Var, iu30Var3, iu30Var4, br0Var, (byte) 3), x340Var), x340Var, 1597824, 42);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, ic20Var, iu30Var, iu30Var2, br0Var, (byte) 29);
        }
    }

    public static final void h(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(446132785);
        if (x340Var.Y(i & 1, i != 0)) {
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.b.c();
            cr31 cr31VarA = er31.a(50);
            qim0 qim0VarN = anm1.N("filter_reordering_shimmer", u291.f(nim0.a, 1.0f));
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            cvx cvxVar2 = cbx.b(x340Var).b;
            k5p1.d(qim0VarN, d36Var, new d36(12.0f, true, new um5(false)), null, 0, 0, apo.r(589682156, new r7j(jC, cr31VarA, (byte) 3), x340Var), x340Var, 1572870, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new htu(i, (byte) 27);
        }
    }

    public static final void i(List list, br0 br0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(195925901);
        int i2 = (x340Var.i(list) ? 4 : 2) | i | (x340Var.g(br0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarN = anm1.N("filter_reordering_flow_row", u291.f(nim0.a, 1.0f));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            cvx cvxVar2 = cbx.b(x340Var).b;
            k5p1.d(qim0VarN, d36Var, new d36(12.0f, true, new um5(false)), null, 0, 0, apo.r(-305562446, new cex(list, br0Var, (byte) 12), x340Var), x340Var, 1572870, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xh00((Object) list, (Object) br0Var, i, (byte) 13);
        }
    }

    public static final void j(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-208316510);
        if (x340Var.Y(i & 1, i != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var).a.b.c(), er31.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(unx.c, isl.a, u291.r(nim0Var, 40.0f), cbx.a(x340Var).b.a, 0L, false, x340Var, unx.d | 48, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bom1((byte) 27, i, false);
        }
    }

    public static final void k(int i, int i2, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1539542799);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                qim0Var = nim0.a;
            }
            kno1.e(er31.a, k8i.a, u291.r(qim0Var, hcx.e.a(x340Var)), apo.r(-838073794, new pu2(j2iVar, (byte) 9), x340Var), x340Var, 25008, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new py3(i, j2iVar, qim0Var, i2);
        }
    }

    public static final void l(zs70 zs70Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        boolean z;
        iie1 iie1Var;
        jkr0 jkr0Var;
        hdn0 hdn0Var;
        Object aryVar;
        iie1 iie1Var2;
        iu30 iu30Var2;
        ven0 ven0Var;
        jkr0 jkr0Var2;
        int i2 = zs70Var.c;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1559719315);
        int i3 = i | (b0kVar3.g(zs70Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | 384;
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            gt70 gt70Var = (gt70) b0kVar3.k(ige0.d);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(i2, b0kVar3);
            }
            hdn0 hdn0Var2 = (hdn0) objT;
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new jt70(zs70Var, (byte) 2);
                b0kVar3.s0(objT2);
            }
            jkr0 jkr0VarB = lkr0.b(i2, (Function0) objT2, b0kVar3, 0, 2);
            int i5 = zs70Var.c;
            xtb0 xtb0VarA = aub0.a(0, b0kVar3, 3);
            wat watVar = (wat) b0kVar3.k(t4k.h);
            boolean zG = b0kVar3.g(xtb0VarA);
            Object objT3 = b0kVar3.T();
            if (zG || objT3 == m4cVar) {
                objT3 = yv91.a(new wt41(xtb0VarA, (byte) 8));
                b0kVar3.s0(objT3);
            }
            tob1 tob1Var = (tob1) objT3;
            boolean zF = b0kVar3.f(((yr80) tob1Var.getValue()).a);
            Object objT4 = b0kVar3.T();
            if (zF || objT4 == m4cVar) {
                objT4 = yv91.a(new bu2(tob1Var, (byte) 23));
                b0kVar3.s0(objT4);
            }
            tob1 tob1Var2 = (tob1) objT4;
            b0kVar3.i0(-1001498648);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            float fX0 = watVar.X0(2.0f) + watVar.X0(48.0f);
            b0kVar3.r(false);
            long j = ((yr80) tob1Var.getValue()).a;
            boolean zD = b0kVar3.d(((Number) tob1Var2.getValue()).floatValue()) | b0kVar3.f(j);
            Object objT5 = b0kVar3.T();
            if (zD || objT5 == m4cVar) {
                objT5 = yv91.a(new b0e0(fX0, tob1Var2, (byte) 2));
                b0kVar3.s0(objT5);
            }
            tob1 tob1Var3 = (tob1) objT5;
            Object objT6 = b0kVar3.T();
            if (objT6 == m4cVar) {
                objT6 = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT6);
            }
            c9n c9nVar = (c9n) objT6;
            boolean zD2 = b0kVar3.d(((Number) tob1Var3.getValue()).floatValue());
            Object objT7 = b0kVar3.T();
            if (zD2 || objT7 == m4cVar) {
                iie1 iie1Var3 = new iie1(xtb0VarA, watVar, ((Number) tob1Var3.getValue()).floatValue(), ((Number) tob1Var2.getValue()).floatValue(), i5, c9nVar);
                b0kVar3.s0(iie1Var3);
                objT7 = iie1Var3;
            }
            iie1 iie1Var4 = (iie1) objT7;
            Integer numValueOf = Integer.valueOf(i2);
            boolean zG2 = (i4 == 4) | b0kVar3.g(iie1Var4) | b0kVar3.g(jkr0VarB);
            Object objT8 = b0kVar3.T();
            if (zG2 || objT8 == m4cVar) {
                z = false;
                rzu rzuVar = new rzu(zs70Var, iie1Var4, jkr0VarB, hdn0Var2, (lnm) null, (byte) 20);
                iie1Var = iie1Var4;
                jkr0Var = jkr0VarB;
                hdn0Var = hdn0Var2;
                b0kVar3.s0(rzuVar);
                objT8 = rzuVar;
            } else {
                hdn0Var = hdn0Var2;
                jkr0Var = jkr0VarB;
                z = false;
                iie1Var = iie1Var4;
            }
            qxd0.t(numValueOf, b0kVar3, (vu30) objT8);
            Object objT9 = b0kVar3.T();
            if (objT9 == m4cVar) {
                objT9 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT9);
            }
            ven0 ven0Var2 = (ven0) objT9;
            Boolean bool = (Boolean) ven0Var2.getValue();
            bool.getClass();
            int i6 = i3 & 112;
            boolean zG3 = b0kVar3.g(jkr0Var) | (i6 == 32 ? true : z);
            Object objT10 = b0kVar3.T();
            if (zG3 || objT10 == m4cVar) {
                lqv lqvVar = new lqv(jkr0Var, iu30Var, hdn0Var, ven0Var2, (lnm) null);
                b0kVar3.s0(lqvVar);
                objT10 = lqvVar;
            }
            qxd0.s(jkr0Var, bool, (vu30) objT10, b0kVar3);
            Boolean bool2 = (Boolean) ven0Var2.getValue();
            bool2.getClass();
            boolean zG4 = b0kVar3.g(iie1Var) | b0kVar3.g(jkr0Var);
            if (i6 == 32) {
                z = true;
            }
            boolean z3 = zG4 | z;
            Object objT11 = b0kVar3.T();
            if (z3 || objT11 == m4cVar) {
                hdn0 hdn0Var3 = hdn0Var;
                jkr0 jkr0Var3 = jkr0Var;
                iie1 iie1Var5 = iie1Var;
                aryVar = new ary((byte) 9, iie1Var5, jkr0Var3, iu30Var, hdn0Var3, ven0Var2, (lnm) null);
                iie1Var2 = iie1Var5;
                iu30Var2 = iu30Var;
                ven0Var = ven0Var2;
                jkr0Var2 = jkr0Var3;
                b0kVar3.s0(aryVar);
            } else {
                aryVar = objT11;
                ven0Var = ven0Var2;
                iie1Var2 = iie1Var;
                iu30Var2 = iu30Var;
                jkr0Var2 = jkr0Var;
            }
            qxd0.s(iie1Var2, bool2, (vu30) aryVar, b0kVar3);
            boolean z4 = ((zs70) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0231: IGET (r7v4 'z4' boolean) = (wrap p.zs70:?: CAST (p.zs70) (r1v0 ?? I:??[OBJECT, ARRAY])) A[DECLARE_VAR] (LINE:562) p.zs70.g boolean in method: p.m1p1.l(p.zs70, p.iu30, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 701
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.m1p1.l(p.zs70, p.iu30, p.qim0, p.b0k, int):void");
        }

        public static final void m(zkd0 zkd0Var, int i, Function0 function0, qim0 qim0Var, b0k b0kVar, int i2) {
            qim0 qim0Var2;
            int i3;
            m4c m4cVar = fkj0.X;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(2083090432);
            int i4 = i2 | (x340Var.e(zkd0Var.ordinal()) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | 3072;
            if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
                int iOrdinal = zkd0Var.ordinal();
                if (iOrdinal == 0) {
                    i3 = 2131957501;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return;
                    }
                    i3 = 2131957495;
                }
                tob1 tob1VarA = w191.a(z4p1.e(i), irn1.o0(0, 0, null, 7), "trackColorAnimation", x340Var, 384, 8);
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                boolean zI = x340Var.i(tob1VarA);
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    objT = new pak(tob1VarA, (byte) 26);
                    x340Var.s0(objT);
                }
                qim0 qim0VarQ = exd0.q(qim0VarF, (iu30) objT);
                boolean z = (i4 & 896) == 256;
                Object objT2 = x340Var.T();
                if (z || objT2 == m4cVar) {
                    objT2 = new aba0(function0, (byte) 19);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarX = bin.x(qim0VarQ, false, null, null, null, (Function0) objT2, 15);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarY = uyn1.y(qim0VarX, 8.0f, 12.0f);
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
                w0h1.a(wsx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var, wsx.d | 48, 60);
                cvx cvxVar3 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.v(qim0Var3, 6.0f));
                uwo1.e(cwl1.o0(x340Var, i3), new wnb0(1.0f, true), cbx.d(x340Var).m, cbx.a(x340Var).b.a, null, null, 2, false, new zic0(1), 0, null, x340Var, 0, 0, 1712);
                uwo1.e(cwl1.o0(x340Var, 2131957496), null, cbx.d(x340Var).n, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                x340Var = x340Var;
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ri60((byte) 28, i, i2, zkd0Var, function0, qim0Var2);
            }
        }

        public static final void n(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1880036028);
            int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
            if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                x340Var.b0();
            } else if (z) {
                x340Var.i0(-1779681305);
                ptx ptxVar = ptx.c;
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                w0h1.a(ptxVar, isl.a, u291.r(qim0Var, 12.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, ptx.d | 48, 48);
                x340Var.r(false);
            } else {
                x340Var.i0(-1779474690);
                x340Var.r(false);
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new uc0(z, qim0Var, i, (byte) 24);
            }
        }

        public static final void o(int i, int i2, String str, String str2, String str3, b0k b0kVar, qim0 qim0Var) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1758538496);
            int i3 = (x340Var.g(str) ? 4 : 2) | i2 | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | (x340Var.e(i) ? 2048 : 1024) | (x340Var.g(qim0Var) ? 16384 : 8192);
            if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
                otw.c((ift0) x340Var.k(ige0.b), new tet0(str, str2, i, str3), u291.D(u291.f(qim0Var, 1.0f), een.Q0, 2), (ipb1) null, x340Var, 0, 8);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new c5(str, str2, str3, i, qim0Var, i2);
            }
        }

        public static final void p(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
            max maxVar;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1702033177);
            int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                String strO0 = cwl1.o0(x340Var, 2131953921);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbx gbxVar = new gbx(new y50(strO0), function0);
                idx idxVar = new idx(4);
                if (z) {
                    x340Var.i0(-728646291);
                    x340Var.r(false);
                    maxVar = jax.a;
                } else {
                    x340Var.i0(-728644822);
                    max haxVar = new hax(cwl1.o0(x340Var, 2131953921));
                    x340Var.r(false);
                    maxVar = haxVar;
                }
                foo1.c(gbxVar, idxVar, anm1.N("clip_title_editing_primary_save_button", qim0Var), maxVar, null, null, null, null, null, null, wci.a, x340Var, 0, 48, 2024);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new le3(z, function0, qim0Var, i, (byte) 4);
            }
        }

        public static daq q(SpotifyApplication spotifyApplication) {
            return new daq(spotifyApplication);
        }

        public static final go80 r(klm klmVar, xbp0 xbp0Var, obp0 obp0Var, xbp0 xbp0Var2, ecp0 ecp0Var, xbp0 xbp0Var3) {
            return klmVar.a("OfflineSyncNotificationDaemon", new kbp0(xbp0Var, obp0Var, xbp0Var2, ecp0Var, xbp0Var3, (byte) 8));
        }

        public static boolean s(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        public static boolean t(n15 n15Var) {
            return n15Var.j();
        }

        public static boolean u(n15 n15Var) {
            return n15Var.c();
        }

        public static final xvd1 v(kx7 kx7Var) {
            int iOrdinal = kx7Var.d.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    return xvd1.d;
                }
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return xvd1.b;
                    }
                    if (iOrdinal != 4) {
                        eg.o();
                        return null;
                    }
                }
            }
            return xvd1.c;
        }

        public static final xvd1 w(l0l l0lVar) {
            if (hqq0.Y(l0lVar)) {
                return xvd1.a;
            }
            return (hqq0.a0(l0lVar) || hqq0.b0(l0lVar)) ? xvd1.b : xvd1.c;
        }
    }
