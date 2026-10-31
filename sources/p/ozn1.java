package p;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.spotify.concertcampaignview.v1.CtaType;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ozn1 {
    public static final lhc a = new lhc((byte) 13);
    public static b180 b;

    public static final void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1695511420);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gpx gpxVar = gpx.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.b;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131951776));
            qim0Var2 = nim0.a;
            qim0 qim0VarN = anm1.N("ContextMenuAction", u291.r(uyn1.x(qim0Var2, 12.0f), 24.0f));
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ugj(function0, (byte) 26);
                x340Var.s0(objT);
            }
            w0h1.a(gpxVar, jslVar, bin.x(qim0VarN, false, null, null, null, (Function0) objT, 15), j, 0L, false, x340Var, gpx.d, 48);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(function0, qim0Var2, i, (byte) 17);
        }
    }

    public static final void b(int i, String str, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1508007984);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0Var, cbx.d(x340Var).d, u7h.f, null, null, 2, false, new cjc0(2), 0, null, x340Var, (i2 & 14) | 1575936 | (i2 & 112), 0, 1712);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gy0(str, qim0Var, i, (byte) 15);
        }
    }

    public static final void c(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1432201589);
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
            h311VarV.d = new one0(qim0Var, i, (byte) 19);
        }
    }

    public static final void d(vzq0 vzq0Var, int i, yxa0 yxa0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        int i4;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2136304908);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.i(vzq0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 = i;
            i3 |= b0kVar3.e(i4) ? 32 : 16;
        } else {
            i4 = i;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.i(yxa0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        int i5 = i3 | 24576;
        if (b0kVar3.Y(i5 & 1, (i5 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarS = xyn1.s(sgc1.D(1, u291.f(qim0Var3, 1.0f)), i3o1.n(2131231318, b0kVar3, 0), een.e, mif1.P0, 0.0f, null, 50);
            mmr0 mmr0Var = new mmr0(Float.valueOf(0.0f), new u7h(u7h.j));
            Float fValueOf = Float.valueOf(0.9f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarW = uyn1.w(dug.e(qim0VarS, v9c.t(new mmr0[]{mmr0Var, new mmr0(fValueOf, new u7h(cbx.a(b0kVar3).a.c)), new mmr0(Float.valueOf(1.0f), new u7h(cbx.a(b0kVar3).a.c))}, 0.0f, 0.0f, 14), null, 0.0f, 6), lnn1.n(vzq0Var, uyn1.j(cbx.b(b0kVar3).b.a, cbx.b(b0kVar3).b.a, cbx.b(b0kVar3).b.a, 0.0f, 8)));
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarW);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            String strO0 = cwl1.o0(b0kVar3, 2131957025);
            lee1 lee1Var = cbx.d(b0kVar3).b;
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = z6w.S0;
                b0kVar3.s0(objT);
            }
            uwo1.e(strO0, s161.b(qim0Var3, false, (iu30) objT), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, 0, 0, 2024);
            String strN0 = cwl1.n0(2131957021, new Object[]{Integer.valueOf(i4)}, b0kVar3);
            lee1 lee1Var2 = cbx.d(b0kVar3).g;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0Var2 = qim0Var3;
            uwo1.e(strN0, uyn1.B(qim0Var3, 0.0f, 16.0f, 0.0f, 0.0f, 13), lee1Var2, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, 0, 0, 2024);
            b0kVar2 = b0kVar3;
            op71.g(b0kVar2, u291.h(qim0Var2, cbx.b(b0kVar2).b.b));
            gfx.h(13, apo.r(-1119376143, new p8w(function0, yxa0Var), b0kVar2), b0kVar2, 54);
            x0d.s(qim0Var2, cbx.b(b0kVar2).b.f, b0kVar2, true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lk0(vzq0Var, i, yxa0Var, function0, qim0Var2, i2, (byte) 9);
        }
    }

    public static final void e(String str, gbx gbxVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1208950786);
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
            wro1.h(gbxVar, ldxVar, anm1.N("back_button", u291.r(qim0Var3, 48.0f)), null, null, null, false, null, null, m5j.a, x340Var2, (i2 >> 3) & 14, 6, 1016);
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
            h311VarV.d = new l720(str, gbxVar, qim0Var2, i, (byte) 2);
        }
    }

    public static final void f(String str, gbx gbxVar, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1333261569);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(gbxVar) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("row", dug.f(qim0Var, cbx.a(b0kVar3).a.a.a(), d4o1.a)), null, null, false, null, null, gbxVar, null, null, null, null, null, apo.r(52945146, new epe0((byte) 8, z), b0kVar3), null, null, apo.r(1666107709, new qdg0(str, (byte) 18), b0kVar3), b0kVar2, (i2 << 15) & 3670016, 196992, 28606);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mec0(str, gbxVar, qim0Var, z, i, (byte) 1);
        }
    }

    public static final void g(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        String str3 = str2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1663482875);
        j06 j06Var = ((x340) b0kVar3).a;
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str3) ? 32 : 16) | 384;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            wux wuxVarB = cbx.b(b0kVar3);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarK = xcg1.k(cbx.a, u291.f(qim0Var3, 1.0f));
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarK);
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
            gra graVar2 = een.h;
            h2c h2cVar = h2c.a;
            qim0 qim0VarD = u291.d(h2cVar.a(qim0Var3, graVar2), 1.0f);
            cua cuaVar = wuxVarB.f;
            qim0 qim0VarQ = i1p1.q(qim0VarD, er31.b(4.0f));
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarQ);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(gfh0VarC2, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            int i3 = (i2 >> 3) & 14;
            b0kVar2 = b0kVar3;
            eso1.e(Uri.parse(str), two1.C(2131962251, i3, str3, b0kVar3), u291.d(qim0Var3, 1.0f), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, true, false, b0kVar2, 1797504, 6, 2944);
            t1c.a(dug.e(u291.c(u291.f(h2cVar.a(qim0Var3, een.X), 1.0f), 0.6f), v9c.s(p7h.M(new u7h[]{new u7h(u7h.j), new u7h(u7h.b)}), 0.0f, 0.0f, 14), null, 0.0f, 6), b0kVar2, 0);
            w0h1.a(wsx.c, isl.a, u291.r(uyn1.x(h2cVar.a(qim0Var3, graVar), 8.0f), 32.0f), u7h.f, 0L, false, b0kVar2, wsx.d | 3120, 48);
            str3 = str2;
            b(i3, str3, b0kVar2, uyn1.x(u291.f(h2cVar.a(qim0Var3, een.t), 1.0f), 8.0f));
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str3, qim0Var2, i, (byte) 27);
        }
    }

    public static final void h(String str, String str2, String str3, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(545293201);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | (x340Var.g(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            yxo1.i(str, str2, str3, qim0Var, false, apo.r(2144566289, new b4(str, str2, (byte) 15), x340Var), x340Var, (i2 & 14) | 196608 | (i2 & 112) | (i2 & 896) | (i2 & 7168), 16);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tb9(str, str2, str3, qim0Var, i, (byte) 2);
        }
    }

    public static final void i(y7e1 y7e1Var, Function0 function0, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2133523249);
        int i2 = i | (b0kVar3.g(y7e1Var) ? 4 : 2) | (b0kVar3.e(2131953777) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024) | (b0kVar3.i(iu30Var) ? 16384 : 8192) | 196608;
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(b0kVar3);
            }
            idn0 idn0Var = (idn0) objT;
            CharSequence charSequence = y7e1Var.d().d;
            boolean z = (57344 & i2) == 16384;
            int i3 = i2 & 14;
            boolean z2 = z | (i3 == 4);
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new s251(iu30Var, y7e1Var, null, (byte) 0);
                b0kVar3.s0(objT2);
            }
            qxd0.t(charSequence, b0kVar3, (vu30) objT2);
            String strO0 = cwl1.o0(b0kVar3, 2131953777);
            g820 g820VarM = k8p1.m(vy5.e, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER);
            uwr uwrVar = cbx.a;
            fyx fyxVar = new fyx(new zxx(cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.b, cbx.a(b0kVar3).b.b, cbx.a(b0kVar3).b.d, cbx.a(b0kVar3).a.b.a(), cbx.a(b0kVar3).a.b.a(), cbx.a(b0kVar3).b.c, 0L, 896));
            mta mtaVar = cbx.b(b0kVar3).d;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            rwo1.a(y7e1Var, fyxVar, u291.f(u291.j(48.0f, 0.0f, 2, qim0Var3), 1.0f), null, strO0, uej.a, apo.r(622832701, new t251(y7e1Var, function0, (byte) 0), b0kVar3), false, g820VarM, null, null, null, d6e1.b, null, idn0Var, null, null, null, 0.0f, false, b0kVar2, i3 | 1769472, 199680, 0, 2055560);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pby0(y7e1Var, function0, iu30Var, qim0Var2, i, (byte) 22);
        }
    }

    public static final void j(int i, iu30 iu30Var, qim0 qim0Var, float f, b0k b0kVar, int i2, int i3) {
        int i4;
        float f2;
        float f3;
        boolean z;
        long j;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(344284548);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.e(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                f2 = f;
                int i5 = x340Var.d(f2) ? 2048 : 1024;
                i4 |= i5;
            } else {
                f2 = f;
            }
            i4 |= i5;
        } else {
            f2 = f;
        }
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            x340Var.d0();
            if ((i2 & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                }
            } else if ((i3 & 8) != 0) {
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                i4 &= -7169;
                f2 = 24.0f;
            }
            float f4 = f2;
            int i6 = i4;
            f3 = f4;
            x340Var.s();
            boolean z2 = (i6 & 14) == 4;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = bb00.h(i, x340Var);
            }
            hdn0 hdn0Var = (hdn0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT2);
            }
            tob1 tob1Var = (ven0) objT2;
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(12.0f, true, new um5(false));
            fra fraVar = een.N0;
            Integer numValueOf = Integer.valueOf(i);
            int i7 = i6 & 112;
            boolean zI = x340Var.i(tob1Var) | x340Var.i(hdn0Var) | (i7 == 32);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new mhg(iu30Var, tob1Var, hdn0Var, (byte) 11);
                x340Var.s0(objT3);
            }
            qim0 qim0VarB = f8d1.b(qim0Var, numValueOf, (PointerInputEventHandler) objT3);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            x340Var.i0(531517940);
            int i8 = 0;
            while (i8 < 5) {
                int i9 = i8 + 1;
                err0 err0Var = (err0) hdn0Var;
                boolean z3 = i9 <= err0Var.s();
                String strU = cwl1.U(2131820549, i9, new Object[]{Integer.valueOf(i9)}, x340Var);
                String strU2 = cwl1.U(2131820548, i9, new Object[]{Integer.valueOf(i9)}, x340Var);
                ysx ysxVar = z3 ? ysx.c : xsx.c;
                jsl jslVar = new jsl(strU);
                qim0 qim0VarR = u291.r(nim0.a, f3);
                boolean zG = x340Var.g(strU2) | (i7 == 32) | x340Var.e(i9);
                Object objT4 = x340Var.T();
                if (zG || objT4 == m4cVar) {
                    objT4 = new bc40(strU2, iu30Var, i9);
                    x340Var.s0(objT4);
                }
                qim0 qim0VarB2 = s161.b(qim0VarR, false, (iu30) objT4);
                if (err0Var.s() > 0 || ((Boolean) tob1Var.getValue()).booleanValue()) {
                    z = false;
                    x340Var.i0(1767321596);
                    uwr uwrVar3 = cbx.a;
                    j = cbx.a(x340Var).b.a;
                    x340Var.r(false);
                } else {
                    x340Var.i0(1767322911);
                    uwr uwrVar4 = cbx.a;
                    j = cbx.a(x340Var).b.b;
                    z = false;
                    x340Var.r(false);
                }
                int i10 = i7;
                w0h1.a(ysxVar, jslVar, qim0VarB2, j, 0L, false, x340Var, 8, 48);
                hdn0Var = hdn0Var;
                i8 = i9;
                tob1Var = tob1Var;
                i7 = i10;
                m4cVar = m4cVar;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
            f3 = f2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new thb1(i, iu30Var, qim0Var, f3, i2, i3);
        }
    }

    public static final int m(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return 3;
        }
        if (iC == 1) {
            return 1;
        }
        if (iC == 2) {
            return 2;
        }
        eg.o();
        return 0;
    }

    public static final void n(Throwable th, lnm lnmVar) throws Throwable {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).a;
        }
        lnmVar.resumeWith(new m231(th));
        throw th;
    }

    public static void o(c9n c9nVar, vu30 vu30Var) {
        fn31.S(c9nVar, geo0.b, 1, vu30Var);
    }

    public static mga0 p() {
        return w0h1.d(new o5n1((byte) 2));
    }

    public static int q(String str) {
        String upperCase;
        if (str != null) {
            try {
                upperCase = str.toUpperCase(Locale.ROOT);
            } catch (IllegalArgumentException unused) {
                return 3;
            }
        } else {
            upperCase = "UNKNOWN";
        }
        return zjy.t(upperCase);
    }

    public static final void r(lnm lnmVar, q6 q6Var) throws Throwable {
        try {
            hr80.w(rih1.a, aym.t(lnmVar));
        } catch (Throwable th) {
            n(th, q6Var);
            throw null;
        }
    }

    public static final void s(vu30 vu30Var, q6 q6Var, q6 q6Var2) throws Throwable {
        try {
            hr80.w(rih1.a, aym.t(aym.p(q6Var, q6Var2, vu30Var)));
        } catch (Throwable th) {
            n(th, q6Var2);
            throw null;
        }
    }

    public static final in8 t(lzn0 lzn0Var) {
        return new in8(lzn0Var);
    }

    public static final p6r0 u(yxa0 yxa0Var) {
        if (yxa0Var.equals(txa0.a) || (yxa0Var instanceof vxa0)) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            return yon1.G1("KID_ACCOUNT_CREATION_LEGAL_CONSENT", "kid-account-creation/legal-consent", 879, "kid-account-creation");
        }
        if ((yxa0Var instanceof uxa0) || (yxa0Var instanceof wxa0)) {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            return yon1.G1("KID_ACCOUNT_TRANSITION_LEGAL_CONSENT", "kid-account-transition/legal-consent", 893, "kid-account-transition");
        }
        eg.o();
        return null;
    }

    public static final lik1 v(yxa0 yxa0Var) {
        if (yxa0Var.equals(txa0.a) || (yxa0Var instanceof vxa0)) {
            return nik1.r3;
        }
        if (yxa0Var instanceof uxa0) {
            return cfm0.i("spotify:internal:kid-account-transition:legal-consent:", ((uxa0) yxa0Var).a, nik1.H3);
        }
        if (yxa0Var instanceof wxa0) {
            return cfm0.i("spotify:internal:kid-account-transition:legal-consent:", ((wxa0) yxa0Var).a.getValue(), nik1.H3);
        }
        eg.o();
        return null;
    }

    public px40 k(Context context, Looper looper, d520 d520Var, Object obj, nz40 nz40Var, oz40 oz40Var) {
        return l(context, looper, d520Var, obj, (h8n1) nz40Var, (h8n1) oz40Var);
    }

    public px40 l(Context context, Looper looper, d520 d520Var, Object obj, h8n1 h8n1Var, h8n1 h8n1Var2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
