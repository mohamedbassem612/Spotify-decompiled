package p;

import android.app.Application;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class vzn1 {
    public static final StackTraceElement[] a = new StackTraceElement[0];
    public static b180 b;

    public static final void a(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1165865683);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.a.c();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(qim0Var, jC, er31.b(16.0f));
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("disclaimer", uyn1.x(qim0VarF, 16.0f));
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            eox eoxVar = eox.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarR = u291.r(nim0.a, 16.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            w0h1.a(eoxVar, isl.a, uyn1.B(qim0VarR, 0.0f, 0.0f, 6.0f, 0.0f, 11), 0L, 0L, false, x340Var, eox.d | 48, 56);
            uwo1.e(cwl1.o0(x340Var, 2131954986), null, cbx.d(x340Var).j, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var, i, (byte) 20);
        }
    }

    public static final void b(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1129942948);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        boolean z = false;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = dug.f(i1p1.q(u291.f(qim0Var2, 1.0f), er31.b(8.0f)), u7h.f, d4o1.a);
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = uyn1.x(qim0VarF, cbx.b(x340Var).b.b);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            gfx.f(6, apo.r(1250310724, new htu((byte) 14, 2, false), x340Var), x340Var);
            gfx.g(4, apo.r(-110328223, new qgd(b2, cwl1.o0(x340Var, 2131953610), iu30Var, z), x340Var), x340Var, 54);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n52(iu30Var, qim0Var, i, (byte) 9);
        }
    }

    public static final void c(svh0 svh0Var, iu30 iu30Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1080422162);
        int i2 = (x340Var.i(svh0Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            boolean zI = x340Var.i(svh0Var) | x340Var.i(ven0VarS);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new fz40(svh0Var, ven0VarS, (byte) 10);
                x340Var.s0(objT);
            }
            qxd0.i(svh0Var, (iu30) objT, x340Var);
            j2iVar.invoke(x340Var, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bp50((Object) svh0Var, (Object) iu30Var, (Object) j2iVar, i, (byte) 1);
        }
    }

    public static final void d(String str, gbx gbxVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(756699228);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.i(gbxVar) ? 32 : 16) | 384;
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var2).a.a.a();
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = dug.f(qim0Var3, jA, u5j1Var);
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            mta mtaVar = cbx.b(x340Var2).d;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 4.0f, 48.0f, 4.0f, 1);
            fra fraVar = een.N0;
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var2, 0);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            ldx ldxVar = ldx.c;
            mta mtaVar2 = cbx.b(x340Var2).d;
            wro1.h(gbxVar, ldxVar, anm1.N("back_button", u291.r(qim0Var3, 48.0f)), null, null, null, false, null, null, o5j.a, x340Var2, (i2 >> 3) & 14, 6, 1016);
            uwo1.e(str, u291.z(new wnb0(1.0f, true), fraVar, 2), cbx.d(x340Var2).h, 0L, new a0e1(3), null, 2, false, new zic0(2), 0, null, x340Var2, i2 & 14, 0, 1704);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l720(str, gbxVar, qim0Var2, i, (byte) 4);
        }
    }

    public static final void e(String str, gbx gbxVar, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1484148129);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(gbxVar) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("row", dug.f(qim0Var, cbx.a(b0kVar3).a.a.a(), d4o1.a)), null, null, false, null, null, gbxVar, null, null, null, null, null, apo.r(1152292184, new epe0((byte) 9, z), b0kVar3), null, null, apo.r(-245986661, new qdg0(str, (byte) 19), b0kVar3), b0kVar2, (i2 << 15) & 3670016, 196992, 28606);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mec0(str, gbxVar, qim0Var, z, i, (byte) 2);
        }
    }

    public static final void f(pcy0 pcy0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1609983901);
        if ((i & 48) == 0) {
            i2 = (x340Var.i(function0) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 145) != 144)) {
            xyn1.g(i2 & 1008, cwl1.o0(x340Var, 2131960625), function0, x340Var, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(pcy0Var, function0, qim0Var, i, (byte) 11);
        }
    }

    public static final void g(x5q0 x5q0Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-811019962);
        int i2 = (x340Var.g(x5q0Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            c4p1.k(x5q0Var, z, anm1.N("search", qim0Var), apo.r(-1840248264, new u841(x5q0Var, (byte) 5), x340Var), x340Var, (i2 & 112) | (i2 & 14) | 3072);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r7e0((Object) x5q0Var, z, (Object) qim0Var, i, (byte) 24);
        }
    }

    public static Bundle h(bkt bktVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("extra_delay_ui", bktVar.a);
        return bundle;
    }

    public static final bj5 i(dj5 dj5Var) {
        s24 s24Var = new s24(dj5Var);
        return new bj5(((Context) dj5Var.j.get()).getApplicationContext(), (fwo) s24Var.d, (q8n) dj5Var.c.get(), (fwo) s24Var.e, (fwo) s24Var.f, (q8n) dj5Var.b.get(), (q8n) dj5Var.d.get(), (Application) dj5Var.l.get(), (fwo) s24Var.g, (fwo) s24Var.h, (fwo) s24Var.i, (jly0) s24Var.t, (fwo) s24Var.X, (fwo) s24Var.Y, (fwo) s24Var.Z, (fwo) s24Var.N0, (tif1) dj5Var.h.get(), (fwo) s24Var.c);
    }

    public static void j(Canvas canvas, CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
    }

    public static void k(Canvas canvas, char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
    }

    public static final a8b0 l(a8b0 a8b0Var) {
        if (a8b0Var instanceof p1h1) {
            return ((p1h1) a8b0Var).f();
        }
        return null;
    }

    public static final String m(String str) {
        Set set = s4b1.f;
        String strJ = uic.x(str).j();
        if (strJ == null) {
            strJ = "";
        }
        return "spotify:readalong:".concat(strJ);
    }

    public static final void n(qwl1 qwl1Var) {
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            String strC = f4i1.c(i, "UnExpedited Request. ");
            utw0 utw0Var = ike1.a;
            utw0Var.y("WorkRequest.Builder<OneTimeWorkRequest.Builder, OneTimeWorkRequest>.shouldExpeditedBeSet()");
            utw0Var.o(strC, new Object[0]);
            return;
        }
        String strC2 = f4i1.c(i, "Expedited Request: ");
        utw0 utw0Var2 = ike1.a;
        utw0Var2.y("WorkRequest.Builder<OneTimeWorkRequest.Builder, OneTimeWorkRequest>.shouldExpeditedBeSet()");
        utw0Var2.o(strC2, new Object[0]);
        vwl1 vwl1Var = qwl1Var.c;
        vwl1Var.q = true;
        vwl1Var.r = 1;
    }

    public static final p6r0 o(yxa0 yxa0Var) {
        if (yxa0Var.equals(txa0.a) || (yxa0Var instanceof vxa0)) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            return yon1.G1("KID_ACCOUNT_CREATION_NAME", "kid-account-creation/name", 880, "kid-account-creation");
        }
        if ((yxa0Var instanceof uxa0) || (yxa0Var instanceof wxa0)) {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            return yon1.G1("KID_ACCOUNT_TRANSITION_NAME", "kid-account-transition/name", 894, "kid-account-transition");
        }
        eg.o();
        return null;
    }

    public static final lik1 p(yxa0 yxa0Var) {
        if (yxa0Var.equals(txa0.a) || (yxa0Var instanceof vxa0)) {
            return nik1.y3;
        }
        if ((yxa0Var instanceof uxa0) || (yxa0Var instanceof wxa0)) {
            return nik1.J3;
        }
        eg.o();
        return null;
    }

    public static final gmh1 q(gmh1 gmh1Var, a8b0 a8b0Var) {
        if (gmh1Var instanceof p1h1) {
            return q(((p1h1) gmh1Var).o0(), a8b0Var);
        }
        if (a8b0Var == null || a8b0Var.equals(gmh1Var)) {
            return gmh1Var;
        }
        if (gmh1Var instanceof qx81) {
            return new ux81((qx81) gmh1Var, a8b0Var);
        }
        if (gmh1Var instanceof dq20) {
            return new hq20((dq20) gmh1Var, a8b0Var);
        }
        eg.o();
        return null;
    }
}
