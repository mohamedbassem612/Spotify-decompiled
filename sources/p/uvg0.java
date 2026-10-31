package p;

import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.base.java.logging.Logger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class uvg0 {
    public static final ceo a = new ceo(0.3f, 0.0f, 0.4f, 1.0f);
    public static final ceo b = new ceo(0.6f, 0.0f, 0.7f, 1.0f);

    public static final void a(String str, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1472039673);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(function1) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            Uri uri = Uri.parse(str);
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new xet(function0, (byte) 27);
                b0kVar3.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            boolean z2 = (i2 & 896) == 256;
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new xet(function1, (byte) 28);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            cwl1.f(oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, iu30Var, (iu30) objT2, (iu30) null, 0L, b0kVar2, 0, 0, 118782), (String) null, u291.d(nim0.a, 1.0f), (tl3) null, mif1.P0, 0.0f, (ColorFilter) null, b0kVar2, 48, 104);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bb(str, function0, function1, i, (byte) 5);
        }
    }

    public static final void b(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1623492289);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128) | (x340Var2.i(qim0Var) ? 2048 : 1024);
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            long j = z ? u7h.b : u7h.f;
            long j2 = z ? u7h.f : u7h.b;
            qim0 qim0VarF = dug.f(i1p1.q(u291.h(qim0Var, 48.0f), er31.b(24.0f)), j, d4o1.a);
            boolean z2 = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                objT = new tze0(function0, (byte) 16);
                x340Var2.s0(objT);
            }
            qim0 qim0VarZ = uyn1.z(32.0f, 0.0f, 2, bin.x(qim0VarF, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15));
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
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
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var2).h, j2, new a0e1(3), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, i2 & 14, 0, 1698);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pfg(str, z, function0, qim0Var, i, (byte) 6);
        }
    }

    public static final void c(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(339862875);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131958195);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, bin.x(qim0Var, false, (String) null, (pm31) null, (idn0) null, function0, 15), cbx.d(x340Var).j, u7h.f, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(function0, qim0Var, i, (byte) 10);
        }
    }

    public static final void d(fwg0 fwg0Var, iu30 iu30Var, qim0 qim0Var, vu30 vu30Var, u7h u7hVar, b0k b0kVar, int i) {
        int i2;
        fwg0 fwg0Var2;
        iu30 iu30Var2;
        qim0 qim0Var2;
        long jL;
        Function0 function0;
        byte b2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1321096413);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(fwg0Var) : x340Var.i(fwg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(vu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var.g(u7hVar) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z = fwg0Var.l == twg0.DARK;
            long j = z ? u7h.b : u7h.f;
            long jB = u7h.b(z ? u7h.b : u7h.f, 0.7f, 0.0f, 0.0f, 0.0f, 14);
            String str = fwg0Var.k;
            if (str == null) {
                jL = u7hVar != null ? l(u7hVar.a) : l(z4p1.g(4283650899L));
            } else if (str != null) {
                try {
                    jL = z4p1.e(Color.parseColor(str));
                } catch (IllegalArgumentException unused) {
                    jL = u7h.d;
                }
            } else {
                jL = z4p1.g(4283650899L);
            }
            long j2 = jL;
            cr31 cr31VarB = er31.b(8.0f);
            long j3 = j;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = dug.f(i1p1.q(qim0Var3, cr31VarB), j2, d4o1.a);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z2) {
                x340Var.l(function1);
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
            fra fraVar = een.N0;
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int i4 = i3;
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            qim0 qim0VarN = anm1.N("marquee_cover_art", uyn1.x(u291.r(qim0Var3, zjy.p(128.0f, new p3v(208.0f / ((wat) x340Var.k(t4k.h)).U0())).a), 16.0f));
            int i5 = i4 & 112;
            boolean z3 = i5 == 32;
            Object objT = x340Var.T();
            if (z3 || objT == m4cVar) {
                objT = new ebg0(iu30Var, (byte) 3);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarN, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            us71.j((i4 >> 9) & 14, vu30Var, x340Var, true);
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
            qim0 qim0VarB = uyn1.B(l6o1.H(new wnb0(1.0f, true), es41VarC, es41VarC.f.s() > 0, 12), 0.0f, 16.0f, 16.0f, 16.0f, 1);
            era eraVar = een.Q0;
            mbh mbhVarA = jbh.a(new d36(16.0f, false, new g21(fraVar, (byte) 28)), eraVar, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            f36 f36Var = h36.c;
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0Var3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM5, x340Var, lljVar2);
            x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar4);
            fwg0Var2 = fwg0Var;
            String str2 = fwg0Var2.a;
            uwr uwrVar = cbx.a;
            uwo1.e(str2, (qim0) null, cbx.d(x340Var).f, j3, new a0e1(3), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1698);
            x340 x340Var2 = x340Var;
            String str3 = fwg0Var2.b;
            if (str3 == null || str3.length() == 0) {
                x340Var2.i0(-283957591);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-284126727);
                k(0, 8, jB, fwg0Var2.b, fwg0Var2.m, x340Var2, null);
                x340Var2 = x340Var2;
                x340Var2.r(false);
            }
            x340Var2.r(true);
            era eraVar2 = een.P0;
            tq60 tq60Var = new tq60(eraVar2);
            mbh mbhVarA3 = jbh.a(f36Var, eraVar2, x340Var2, 0);
            int iHashCode6 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM6 = x340Var2.m();
            qim0 qim0VarE6 = zr7.E(x340Var2, tq60Var);
            x340Var2.m0();
            if (x340Var2.S) {
                function0 = function1;
                x340Var2.l(function0);
            } else {
                function0 = function1;
                x340Var2.v0();
            }
            nko1.H(mbhVarA3, x340Var2, lljVar);
            nko1.H(xos0VarM6, x340Var2, lljVar2);
            x0d.q(iHashCode6, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE6, x340Var2, lljVar4);
            Function0 function2 = function0;
            x340 x340Var3 = x340Var2;
            uwo1.e(fwg0Var2.d, (qim0) null, cbx.d(x340Var2).h, j3, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, new px8(fc11.G(13), fc11.G(16), fc11.G(2), (mx8) null, 8), x340Var3, 0, 8, 690);
            uwo1.e(fwg0Var2.e, (qim0) null, cbx.d(x340Var3).g, jB, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, new px8(fc11.G(13), fc11.G(16), fc11.G(2), (mx8) null, 8), x340Var3, 0, 8, 690);
            x340Var3.r(true);
            jw31 jw31VarA2 = ew31.a(h36.e, fraVar, x340Var3, 0);
            int iHashCode7 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM7 = x340Var3.m();
            qim0 qim0VarE7 = zr7.E(x340Var3, qim0Var3);
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(function2);
            } else {
                x340Var3.v0();
            }
            nko1.H(jw31VarA2, x340Var3, lljVar);
            nko1.H(xos0VarM7, x340Var3, lljVar2);
            x0d.q(iHashCode7, x340Var3, lljVar3, x340Var3);
            nko1.H(qim0VarE7, x340Var3, lljVar4);
            String str4 = fwg0Var2.f;
            boolean z4 = i5 == 32;
            Object objT2 = x340Var3.T();
            if (z4 || objT2 == m4cVar) {
                iu30Var2 = iu30Var;
                b2 = 4;
                objT2 = new ebg0(iu30Var2, (byte) 4);
                x340Var3.s0(objT2);
            } else {
                iu30Var2 = iu30Var;
                b2 = 4;
            }
            boolean z5 = z;
            b(0, str4, (Function0) objT2, x340Var3, anm1.N("marquee_cta", qim0Var3), z5);
            nyx.a(z5 ? 3 : 2, (wux) null, apo.r(1399383098, new r7e0(fwg0Var2, z5, iu30Var2, b2), x340Var3), x340Var3, 3072, 6);
            x340Var3.r(true);
            String str5 = fwg0Var2.g;
            String str6 = fwg0Var2.h;
            boolean z6 = fwg0Var2.f19p;
            boolean z7 = i5 == 32;
            Object objT3 = x340Var3.T();
            if (z7 || objT3 == m4cVar) {
                objT3 = new ebg0(iu30Var2, (byte) 6);
                x340Var3.s0(objT3);
            }
            qim0Var2 = qim0Var3;
            i(str5, str6, z6, jB, (Function0) objT3, anm1.N("marquee_sponsored_footer", qim0Var3), bjc0.a, x340Var3, 0, 0);
            x340Var = x340Var3;
            us71.m(x340Var, true, true, true);
        } else {
            fwg0Var2 = fwg0Var;
            iu30Var2 = iu30Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nvg0(fwg0Var2, iu30Var2, qim0Var2, vu30Var, u7hVar, i, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v30 */
    public static final void e(fwg0 fwg0Var, iu30 iu30Var, qim0 qim0Var, vu30 vu30Var, u7h u7hVar, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        long jL;
        ?? r8;
        Function0 function0;
        Function0 function1;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(702573851);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(fwg0Var) : x340Var.i(fwg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(vu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var.g(u7hVar) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z = fwg0Var.l == twg0.DARK;
            long j = z ? u7h.b : u7h.f;
            long jB = u7h.b(z ? u7h.b : u7h.f, 0.7f, 0.0f, 0.0f, 0.0f, 14);
            String str = fwg0Var.k;
            if (str == null) {
                jL = u7hVar != null ? l(u7hVar.a) : l(z4p1.g(4283650899L));
            } else if (str != null) {
                try {
                    jL = z4p1.e(Color.parseColor(str));
                } catch (IllegalArgumentException unused) {
                    jL = u7h.d;
                }
            } else {
                jL = z4p1.g(4283650899L);
            }
            long j2 = jL;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = dug.f(i1p1.q(u291.f(qim0Var3, 1.0f), er31.b(8.0f)), j2, d4o1.a);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            long j3 = j;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            Function0 function2 = hmb0.t1;
            if (z2) {
                x340Var.l(function2);
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
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            era eraVar = een.Q0;
            f36 f36Var = h36.c;
            int i4 = i3;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function2);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            op71.g(x340Var, u291.h(qim0Var3, 32.0f));
            String str2 = fwg0Var.a;
            uwr uwrVar = cbx.a;
            uwo1.e(str2, uyn1.z(16.0f, 0.0f, 2, qim0Var3), cbx.d(x340Var).f, j3, new a0e1(3), (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1696);
            x340 x340Var2 = x340Var;
            String str3 = fwg0Var.b;
            if (str3 == null || str3.length() == 0) {
                r8 = 0;
                v8i0.i(32.0f, -2026032056, x340Var2, x340Var2, qim0Var3);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-2026290658);
                k(0, 0, jB, fwg0Var.b, fwg0Var.m, x340Var2, uyn1.z(16.0f, 0.0f, 2, qim0Var3));
                x340Var2 = x340Var2;
                r8 = 0;
                x0d.s(qim0Var3, 20.0f, x340Var2, false);
            }
            qim0 qim0VarN = anm1.N("marquee_cover_art", d7e.r(1.0f, uyn1.z(48.0f, 0.0f, 2, u291.f(qim0Var3, 1.0f)), (boolean) r8));
            int i5 = i4 & 112;
            ?? r13 = i5 == 32 ? 1 : r8;
            Object objT = x340Var2.T();
            if (r13 != 0 || objT == m4cVar) {
                objT = new ebg0(iu30Var, (byte) 7);
                x340Var2.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarN, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15);
            gfh0 gfh0VarC2 = t1c.c(graVar, (boolean) r8);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarX);
            x340Var2.m0();
            if (x340Var2.S) {
                function0 = function2;
                x340Var2.l(function0);
            } else {
                function0 = function2;
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            us71.j((i4 >> 9) & 14, vu30Var, x340Var2, true);
            qim0 qim0VarB = uyn1.B(u291.f(qim0Var3, 1.0f), 48.0f, 8.0f, 36.0f, 0.0f, 8);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, (int) r8);
            Function0 function3 = function0;
            int iHashCode4 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM4 = x340Var2.m();
            qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarB);
            x340Var2.m0();
            if (x340Var2.S) {
                function1 = function3;
                x340Var2.l(function1);
            } else {
                function1 = function3;
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM4, x340Var2, lljVar2);
            x0d.q(iHashCode4, x340Var2, lljVar3, x340Var2);
            qim0 qim0VarB2 = uyn1.B(kk0.q(x340Var2, qim0VarE4, lljVar4, 1.0f, true), 0.0f, 0.0f, 12.0f, 0.0f, 11);
            mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var2, 0);
            int iHashCode5 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM5 = x340Var2.m();
            qim0 qim0VarE5 = zr7.E(x340Var2, qim0VarB2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(function1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar);
            nko1.H(xos0VarM5, x340Var2, lljVar2);
            x0d.q(iHashCode5, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE5, x340Var2, lljVar4);
            x340 x340Var3 = x340Var2;
            uwo1.e(fwg0Var.d, (qim0) null, cbx.d(x340Var2).h, j3, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, new px8(fc11.G(13), fc11.G(16), fc11.G(2), (mx8) null, 8), x340Var3, 0, 8, 690);
            uwo1.e(fwg0Var.e, (qim0) null, cbx.d(x340Var3).g, jB, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, new px8(fc11.G(13), fc11.G(16), fc11.G(2), (mx8) null, 8), x340Var3, 0, 8, 690);
            x340Var3.r(true);
            pk1 pk1Var = new pk1(fwg0Var.o ? qk1.b : qk1.a, false, (String) null, (String) null, z ? rk1.c : tk1.c, 14);
            boolean z3 = i5 == 32;
            Object objT2 = x340Var3.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new ebg0(iu30Var, (byte) 8);
                x340Var3.s0(objT2);
            }
            Function0 function4 = (Function0) objT2;
            if (ihc1.y0("Toggle save")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            h7p1.a(pk1Var, new gbx(new y50("Toggle save"), function4), anm1.N("marquee_save_button", u291.r(qim0Var3, 48.0f)), (max) null, (gdx) null, x340Var3, 0, 24);
            x340Var3.r(true);
            op71.g(x340Var3, u291.h(qim0Var3, 16.0f));
            String str4 = fwg0Var.f;
            boolean z4 = i5 == 32;
            Object objT3 = x340Var3.T();
            if (z4 || objT3 == m4cVar) {
                objT3 = new ebg0(iu30Var, (byte) 9);
                x340Var3.s0(objT3);
            }
            b(0, str4, (Function0) objT3, x340Var3, anm1.N("marquee_cta", uyn1.z(24.0f, 0.0f, 2, qim0Var3)), z);
            op71.g(x340Var3, u291.h(qim0Var3, 24.0f));
            String str5 = fwg0Var.g;
            String str6 = fwg0Var.h;
            boolean z5 = fwg0Var.f19p;
            boolean z6 = i5 == 32;
            Object objT4 = x340Var3.T();
            if (z6 || objT4 == m4cVar) {
                objT4 = new ebg0(iu30Var, (byte) 10);
                x340Var3.s0(objT4);
            }
            i(str5, str6, z5, jB, (Function0) objT4, anm1.N("marquee_sponsored_footer", uyn1.B(uyn1.z(24.0f, 0.0f, 2, qim0Var3), 0.0f, 0.0f, 0.0f, 16.0f, 7)), null, x340Var3, 0, 64);
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
            h311VarV.d = new nvg0(fwg0Var, iu30Var, qim0Var2, vu30Var, u7hVar, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:106:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:107:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:110:0x0328  */
    /* JADX WARN: Code duplicated, block: B:111:0x032c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0347  */
    /* JADX WARN: Code duplicated, block: B:125:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:129:0x0406  */
    /* JADX WARN: Code duplicated, block: B:132:0x0440  */
    /* JADX WARN: Code duplicated, block: B:133:0x0444  */
    /* JADX WARN: Code duplicated, block: B:139:0x047d  */
    /* JADX WARN: Code duplicated, block: B:143:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:147:0x04cd  */
    public static final void f(fwg0 fwg0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        Object az80Var;
        Configuration configuration;
        fwg0 fwg0Var2;
        float f;
        float f2;
        qim0 qim0VarZ;
        qim0 qim0VarZ2;
        boolean zD;
        Object objT;
        boolean zD2;
        Object objT2;
        boolean zI;
        Object objT3;
        float f3;
        iu30 iu30Var2;
        boolean zG;
        Object objT4;
        boolean zD3;
        Object objT5;
        Float fValueOf = Float.valueOf(0.0f);
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-861484557);
        j06 j06Var = ((x340) b0kVar3).a;
        int i2 = i | (b0kVar3.g(fwg0Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | 3456;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Configuration configuration2 = (Configuration) b0kVar3.k(AndroidCompositionLocals_androidKt.a);
            boolean z = configuration2.orientation == 2;
            boolean z2 = configuration2.smallestScreenWidthDp >= 600;
            Object objT6 = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT6 == m4cVar) {
                objT6 = v8r.q((Object) null);
                b0kVar3.s0(objT6);
            }
            ven0 ven0Var = (ven0) objT6;
            gw70 gw70Var = (gw70) b0kVar3.k(oi7.a);
            String str = fwg0Var.c;
            int i3 = i2 & 14;
            boolean zI2 = (i3 == 4) | b0kVar3.i(gw70Var) | b0kVar3.i(ven0Var);
            Object objT7 = b0kVar3.T();
            if (zI2 || objT7 == m4cVar) {
                configuration = configuration2;
                fwg0Var2 = fwg0Var;
                az80Var = new az80(fwg0Var2, gw70Var, ven0Var, (lnm) null, (byte) 16);
                b0kVar3.s0(az80Var);
            } else {
                fwg0Var2 = fwg0Var;
                az80Var = objT7;
                configuration = configuration2;
            }
            qxd0.t(str, b0kVar3, (vu30) az80Var);
            b0kVar3.i0(1042058653);
            j2i j2iVarR = apo.r(594460678, new lvg0(fwg0Var2, iu30Var, (byte) 1), b0kVar3);
            b0kVar3.r(false);
            Object objT8 = b0kVar3.T();
            if (objT8 == m4cVar) {
                objT8 = c97.b(0.0f);
                b0kVar3.s0(objT8);
            }
            o95 o95Var = (o95) objT8;
            Object objT9 = b0kVar3.T();
            if (objT9 == m4cVar) {
                objT9 = v8r.q(fValueOf);
                b0kVar3.s0(objT9);
            }
            ven0 ven0Var2 = (ven0) objT9;
            Object objT10 = b0kVar3.T();
            if (objT10 == m4cVar) {
                objT10 = v8r.q(fValueOf);
                b0kVar3.s0(objT10);
            }
            ven0 ven0Var3 = (ven0) objT10;
            Object objT11 = b0kVar3.T();
            if (objT11 == m4cVar) {
                objT11 = c97.b(0.0f);
                b0kVar3.s0(objT11);
            }
            o95 o95Var2 = (o95) objT11;
            Object objT12 = b0kVar3.T();
            if (objT12 == m4cVar) {
                objT12 = c97.b(0.0f);
                b0kVar3.s0(objT12);
            }
            o95 o95Var3 = (o95) objT12;
            Object objT13 = b0kVar3.T();
            if (objT13 == m4cVar) {
                objT13 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT13);
            }
            ven0 ven0Var4 = (ven0) objT13;
            Object objT14 = b0kVar3.T();
            if (objT14 == m4cVar) {
                objT14 = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT14);
            }
            c9n c9nVar = (c9n) objT14;
            float fX0 = ((wat) b0kVar3.k(t4k.h)).X0(configuration.screenWidthDp);
            boolean zI3 = b0kVar3.i(o95Var);
            Object objT15 = b0kVar3.T();
            if (zI3 || objT15 == m4cVar) {
                objT15 = new b(o95Var, (lnm) null, (byte) 13);
                b0kVar3.s0(objT15);
            }
            rih1 rih1Var = rih1.a;
            qxd0.t(rih1Var, b0kVar3, (vu30) objT15);
            boolean z3 = (i2 & 112) == 32;
            Object objT16 = b0kVar3.T();
            if (z3 || objT16 == m4cVar) {
                objT16 = new gnf0(iu30Var, c9nVar, o95Var, (byte) 7);
                b0kVar3.s0(objT16);
            }
            iu30 iu30Var3 = (iu30) objT16;
            float fFloatValue = ((Number) o95Var.e()).floatValue();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("marquee_overlay", u291.d(qim0Var3, 1.0f));
            gra graVar = een.h;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z4 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
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
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            boolean zD4 = b0kVar3.d(fFloatValue);
            Object objT17 = b0kVar3.T();
            if (zD4 || objT17 == m4cVar) {
                objT17 = new jc5((byte) 27, fFloatValue);
                b0kVar3.s0(objT17);
            }
            qim0 qim0VarF = dug.f(i541.C(qim0VarD, (iu30) objT17), u7h.b(u7h.b, 0.8f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
            boolean zG2 = b0kVar3.g(iu30Var3);
            Object objT18 = b0kVar3.T();
            if (zG2 || objT18 == m4cVar) {
                objT18 = new ebg0(iu30Var3, (byte) 11);
                b0kVar3.s0(objT18);
            }
            t1c.a(bin.x(qim0VarF, false, (String) null, (pm31) null, (idn0) null, (Function0) objT18, 15), b0kVar3, 0);
            float f4 = (!z || z2) ? 32.0f : 16.0f;
            if (z2) {
                b0kVar3.i0(350986021);
                b0kVar3.r(false);
                f = 0.0f;
                qim0VarZ2 = u291.x(0.0f, 360.0f, 1, qim0Var3);
            } else {
                f = 0.0f;
                if (z) {
                    b0kVar3.i0(351057538);
                    uwr uwrVar = cbx.a;
                    qim0VarZ2 = uyn1.z(cbx.b(b0kVar3).b.f, 0.0f, 2, qim0Var3);
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(351144927);
                    b0kVar3.r(false);
                    f2 = 0.0f;
                    qim0VarZ = uyn1.z(24.0f, 0.0f, 2, qim0Var3);
                }
                if (!((Boolean) ven0Var4.getValue()).booleanValue()) {
                    f2 = fFloatValue;
                }
                qim0 qim0VarD2 = u291.d(qim0Var3, 1.0f);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
                xos0 xos0VarM2 = b0kVar3.m();
                qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarD2);
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
                mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar3, 0);
                int iHashCode3 = Long.hashCode(((x340) b0kVar3).T);
                xos0 xos0VarM3 = b0kVar3.m();
                qim0 qim0VarE3 = zr7.E(b0kVar3, qim0Var3);
                b0kVar3.m0();
                if (((x340) b0kVar3).S) {
                    b0kVar3.l(n4kVar);
                } else {
                    b0kVar3.v0();
                }
                nko1.H(mbhVarA, b0kVar3, lljVar);
                nko1.H(xos0VarM3, b0kVar3, lljVar2);
                x0d.q(iHashCode3, b0kVar3, lljVar3, b0kVar3);
                nko1.H(qim0VarE3, b0kVar3, lljVar4);
                zD = b0kVar3.d(f2);
                objT = b0kVar3.T();
                if (zD || objT == m4cVar) {
                    objT = new jc5((byte) 28, f2);
                    b0kVar3.s0(objT);
                }
                j(i541.C(qim0Var3, (iu30) objT), b0kVar3, 0);
                op71.g(b0kVar3, u291.h(qim0Var3, f4));
                if (z && !z2) {
                    qim0VarZ = new wnb0(1.0f, false).then(u291.D(qim0VarZ, (era) null, 3));
                }
                float f5 = f4;
                zD2 = b0kVar3.d(fX0) | b0kVar3.i(ven0Var4) | b0kVar3.i(ven0Var2) | b0kVar3.i(ven0Var3) | b0kVar3.i(c9nVar) | b0kVar3.i(o95Var2) | b0kVar3.i(o95Var3) | b0kVar3.g(iu30Var3);
                objT2 = b0kVar3.T();
                if (zD2 || objT2 == m4cVar) {
                    objT2 = new svg0(fX0, c9nVar, ven0Var4, ven0Var2, ven0Var3, o95Var2, o95Var3, iu30Var3);
                    b0kVar3.s0(objT2);
                }
                qim0 qim0VarB = f8d1.b(qim0VarZ, rih1Var, (PointerInputEventHandler) objT2);
                zI = b0kVar3.i(ven0Var2) | b0kVar3.i((Object) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x03fa: ARITH (r3v40 'zI' boolean) = (wrap boolean:0x03f3: ARITH (wrap boolean:0x03ee: ARITH (wrap boolean:0x03e9: ARITH (wrap boolean:0x03e1: INVOKE (r9v1 'b0kVar3' p.b0k), (r5v10 'ven0Var2' p.ven0) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:994)) | (wrap boolean:0x03e5: INVOKE (r9v1 'b0kVar3' p.b0k), (wrap java.lang.Object:?: CAST (java.lang.Object) (r26v0 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:998)) A[DONT_WRAP, WRAPPED] (LINE:1002)) | (wrap boolean:0x03ea: INVOKE (r9v1 'b0kVar3' p.b0k), (r14v3 'ven0Var3' p.ven0) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:1003)) A[DONT_WRAP, WRAPPED] (LINE:1007)) | (wrap boolean:0x03ef: INVOKE (r9v1 'b0kVar3' p.b0k), (wrap java.lang.Object:?: CAST (java.lang.Object) (r27v0 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:1008)) A[DONT_WRAP, WRAPPED] (LINE:1012)) | (wrap boolean:0x03f6: INVOKE (r9v1 'b0kVar3' p.b0k), (r2v13 'fFloatValue' float) VIRTUAL call: p.x340.d(float):boolean A[WRAPPED] (LINE:1015)) (LINE:1019) in method: p.uvg0.f(p.fwg0, p.iu30, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r26v0 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1293
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.uvg0.f(p.fwg0, p.iu30, p.qim0, p.b0k, int):void");
            }

            public static final float g(ven0 ven0Var) {
                return ((Number) ven0Var.getValue()).floatValue();
            }

            public static final float h(ven0 ven0Var) {
                return ((Number) ven0Var.getValue()).floatValue();
            }

            /* JADX WARN: Code duplicated, block: B:35:0x007c  */
            /* JADX WARN: Code duplicated, block: B:36:0x007e  */
            /* JADX WARN: Code duplicated, block: B:39:0x0087  */
            /* JADX WARN: Code duplicated, block: B:48:0x00a2  */
            /* JADX WARN: Code duplicated, block: B:50:0x00a6  */
            /* JADX WARN: Code duplicated, block: B:63:0x0140  */
            /* JADX WARN: Code duplicated, block: B:65:0x017c  */
            /* JADX WARN: Code duplicated, block: B:68:0x0185  */
            /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
            public static final void i(String str, String str2, boolean z, long j, Function0 function0, qim0 qim0Var, djc0 djc0Var, b0k b0kVar, int i, int i2) {
                djc0 cjc0Var;
                int i3;
                boolean z2;
                h311 h311VarV;
                djc0 djc0Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(666293962);
                int i4 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.f(j) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.i(qim0Var) ? 131072 : 65536);
                if ((i2 & 64) == 0) {
                    cjc0Var = djc0Var;
                    int i5 = x340Var.i(cjc0Var) ? 1048576 : 524288;
                    i3 = i4 | i5;
                    if ((599187 & i3) != 599186) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i3 & 1, z2)) {
                        x340Var.d0();
                        if ((i & 1) == 0 && !x340Var.E()) {
                            x340Var.b0();
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                        } else if ((i2 & 64) != 0) {
                            cjc0Var = new cjc0(2);
                            i3 &= -3670017;
                        }
                        djc0Var2 = cjc0Var;
                        x340Var.s();
                        if (!z || str2 == null || str2.length() == 0) {
                            int i6 = i3;
                            x340Var.i0(-1775134255);
                            uwr uwrVar = cbx.a;
                            uwo1.e(str, qim0Var, cbx.d(x340Var).m, j, new a0e1(3), (iu30) null, 2, false, djc0Var2, 0, (qx8) null, x340Var, (i6 & 14) | ((i6 >> 12) & 112) | (i6 & 7168) | (234881024 & (i6 << 6)), 0, 1696);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(-1774887588);
                            x340Var.i0(358388137);
                            ye5 ye5Var = new ye5();
                            ye5Var.g(str);
                            ye5Var.g(" ");
                            uwr uwrVar2 = cbx.a;
                            int iO = ye5Var.o(cbx.d(x340Var).n.a);
                            try {
                                ye5Var.g(str2);
                                ye5Var.k(iO);
                                int i7 = i3;
                                af5 af5VarP = ye5Var.p();
                                x340Var.r(false);
                                uwo1.d(af5VarP, j, bin.x(qim0Var, false, (String) null, (pm31) null, (idn0) null, function0, 15), cbx.d(x340Var).m, new a0e1(3), (iu30) null, 2, false, djc0Var2, 0, (qx8) null, (cqs0) null, x340Var, ((i7 >> 6) & 112) | (234881024 & (i7 << 6)), 0, 3744);
                                djc0Var2 = djc0Var2;
                                x340Var = x340Var;
                                x340Var.r(false);
                            } catch (Throwable th) {
                                ye5Var.k(iO);
                                throw th;
                            }
                        }
                        cjc0Var = djc0Var2;
                    } else {
                        x340Var.b0();
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new tvg0(str, str2, z, j, function0, qim0Var, cjc0Var, i, i2);
                    }
                }
                cjc0Var = djc0Var;
                i3 = i4 | i5;
                if ((599187 & i3) != 599186) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i3 & 1, z2)) {
                    x340Var.d0();
                    if ((i & 1) == 0) {
                        if ((i2 & 64) != 0) {
                            cjc0Var = new cjc0(2);
                            i3 &= -3670017;
                        }
                    } else if ((i2 & 64) != 0) {
                        cjc0Var = new cjc0(2);
                        i3 &= -3670017;
                    }
                    djc0Var2 = cjc0Var;
                    x340Var.s();
                    if (z) {
                        int i8 = i3;
                        x340Var.i0(-1775134255);
                        uwr uwrVar3 = cbx.a;
                        uwo1.e(str, qim0Var, cbx.d(x340Var).m, j, new a0e1(3), (iu30) null, 2, false, djc0Var2, 0, (qx8) null, x340Var, (i8 & 14) | ((i8 >> 12) & 112) | (i8 & 7168) | (234881024 & (i8 << 6)), 0, 1696);
                        x340Var.r(false);
                    } else {
                        int i9 = i3;
                        x340Var.i0(-1775134255);
                        uwr uwrVar4 = cbx.a;
                        uwo1.e(str, qim0Var, cbx.d(x340Var).m, j, new a0e1(3), (iu30) null, 2, false, djc0Var2, 0, (qx8) null, x340Var, (i9 & 14) | ((i9 >> 12) & 112) | (i9 & 7168) | (234881024 & (i9 << 6)), 0, 1696);
                        x340Var.r(false);
                    }
                    cjc0Var = djc0Var2;
                } else {
                    x340Var.b0();
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new tvg0(str, str2, z, j, function0, qim0Var, cjc0Var, i, i2);
                }
            }

            public static final void j(qim0 qim0Var, b0k b0kVar, int i) {
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(856742012);
                int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
                if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                    Object objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = jtg0.e;
                        x340Var.s0(objT);
                    }
                    dm5.a((iu30) objT, u291.r(qim0Var, 24.0f), (iu30) null, x340Var, 6, 4);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new one0(qim0Var, i, (byte) 8);
                }
            }

            /* JADX WARN: Code duplicated, block: B:50:0x0143  */
            public static final void k(int i, int i2, long j, String str, String str2, b0k b0kVar, qim0 qim0Var) {
                qim0 qim0Var2;
                int i3;
                qim0 qim0Var3;
                qim0 qim0Var4;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-485178227);
                String str3 = str;
                long j2 = j;
                int i4 = i | (x340Var.g(str3) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.f(j2) ? 256 : 128);
                int i5 = i2 & 8;
                if (i5 != 0) {
                    i3 = i4 | 3072;
                    qim0Var2 = qim0Var;
                } else {
                    qim0Var2 = qim0Var;
                    i3 = i4 | (x340Var.i(qim0Var2) ? 2048 : 1024);
                }
                int i6 = 1;
                if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
                    qim0 qim0Var5 = nim0.a;
                    if (i5 != 0) {
                        qim0Var2 = qim0Var5;
                    }
                    if (str2 == null || !ihc1.h0(str2, "icon", true)) {
                        i6 = 1;
                        x340Var.i0(-1378531583);
                        uwr uwrVar = cbx.a;
                        qim0Var4 = qim0Var2;
                        uwo1.e(str, qim0Var4, cbx.d(x340Var).j, j, new a0e1(3), (iu30) null, 2, false, new cjc0(i6), 0, (qx8) null, x340Var, (i3 & 14) | ((i3 >> 6) & 112) | ((i3 << 3) & 7168), 0, 1696);
                        x340Var = x340Var;
                        x340Var.r(false);
                    } else {
                        try {
                            eyg0[] eyg0VarArrValues = eyg0.values();
                            int length = eyg0VarArrValues.length;
                            int i7 = 0;
                            while (true) {
                                if (i7 < length) {
                                    eyg0 eyg0Var = eyg0VarArrValues[i7];
                                    if (!str2.equalsIgnoreCase(eyg0Var.a)) {
                                        i7++;
                                        j2 = j;
                                        eyg0VarArrValues = eyg0VarArrValues;
                                        str3 = str;
                                    } else if (eyg0Var == eyg0.ICON_RELEASED) {
                                        x340Var.i0(-1379163208);
                                        jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                                        int iHashCode = Long.hashCode(x340Var.T);
                                        xos0 xos0VarM = x340Var.m();
                                        qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
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
                                        xrx xrxVar = xrx.c;
                                        uwr uwrVar2 = cbx.a;
                                        zov0 zov0Var = cbx.b(x340Var).g;
                                        int i8 = (i3 << 3) & 7168;
                                        w0h1.a(xrxVar, isl.a, u291.r(qim0Var5, 12.0f), j2, 0L, false, x340Var, xrx.d | 48 | i8, 48);
                                        cvx cvxVar = cbx.b(x340Var).b;
                                        uwo1.e(str3, (qim0) null, ktd.l(qim0Var5, 4.0f, x340Var, x340Var).j, j, new a0e1(3), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, (i3 & 14) | i8, 0, 1698);
                                        x340Var = x340Var;
                                        x340Var.r(true);
                                        x340Var.r(false);
                                        qim0Var4 = qim0Var2;
                                    } else {
                                        i6 = 1;
                                        x340Var.i0(-1378531583);
                                        uwr uwrVar3 = cbx.a;
                                        qim0Var4 = qim0Var2;
                                        uwo1.e(str, qim0Var4, cbx.d(x340Var).j, j, new a0e1(3), (iu30) null, 2, false, new cjc0(i6), 0, (qx8) null, x340Var, (i3 & 14) | ((i3 >> 6) & 112) | ((i3 << 3) & 7168), 0, 1696);
                                        x340Var = x340Var;
                                        x340Var.r(false);
                                    }
                                } else {
                                    try {
                                        throw new IllegalArgumentException("MarqueeVisualsType " + str2 + " not recognized");
                                    } catch (IllegalArgumentException unused) {
                                    }
                                }
                                Logger.d("Unknown MarqueeVisualsType: %s", new Object[]{str2});
                                x340Var.i0(-1378531583);
                                uwr uwrVar4 = cbx.a;
                                qim0Var4 = qim0Var2;
                                uwo1.e(str, qim0Var4, cbx.d(x340Var).j, j, new a0e1(3), (iu30) null, 2, false, new cjc0(i6), 0, (qx8) null, x340Var, (i3 & 14) | ((i3 >> 6) & 112) | ((i3 << 3) & 7168), 0, 1696);
                                x340Var = x340Var;
                                x340Var.r(false);
                            }
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                    qim0Var3 = qim0Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new o9e0(i, i2, j, str, str2, qim0Var3);
                }
            }

            public static final long l(long j) {
                return z4p1.t(u7h.b(u7h.b, 0.3019608f, 0.0f, 0.0f, 0.0f, 14), j);
            }
        }
