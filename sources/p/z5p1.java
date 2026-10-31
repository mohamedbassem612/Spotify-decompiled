package p;

import android.content.Context;
import android.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class z5p1 {
    public static b180 a;
    public static b180 b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    public static final void a(yg1 yg1Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        nim0 nim0Var;
        byte b2;
        Function0 function0;
        yg1 yg1Var2 = yg1Var;
        vu30 vu30Var = y580.Y;
        llj lljVar = y580.R0;
        llj lljVar2 = y580.N0;
        llj lljVar3 = y580.O0;
        m4c m4cVar = fkj0.X;
        ye1 ye1Var = yg1Var2.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1635912590);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(yg1Var2) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ArrayList arrayList = ye1Var.b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
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
            Function0 function1 = hmb0.t1;
            if (z) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar3);
            nko1.H(xos0VarM, x340Var, lljVar2);
            nko1.H(Integer.valueOf(iHashCode), x340Var, lljVar);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, vu30Var);
            String str = ye1Var.a;
            uwr uwrVar = cbx.a;
            boolean z2 = 0;
            Function0 function2 = function1;
            uwo1.e(str, null, cbx.d(x340Var).h, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            x340Var = x340Var;
            x340Var.i0(-1646159231);
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                nim0Var = nim0.a;
                if (!zHasNext) {
                    break;
                }
                p10 p10Var = (p10) it.next();
                jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(z2)), een.Z, x340Var, z2);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    function0 = function2;
                    x340Var.l(function0);
                } else {
                    function0 = function2;
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar3);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                nko1.H(Integer.valueOf(iHashCode2), x340Var, lljVar);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, vu30Var);
                hux huxVarD = xxq0.d(p10Var.a);
                uwr uwrVar2 = cbx.a;
                x340 x340Var2 = x340Var;
                w0h1.a(huxVarD, isl.a, u291.r(nim0Var, 24.0f), cbx.a(x340Var).b.f, 0L, false, x340Var2, 56, 48);
                uwo1.e(p10Var.c, u291.f(anm1.N("BenefitsText", nim0Var), 1.0f), cbx.d(x340Var2).g, 0L, new a0e1(5), null, 0, false, new cjc0(3), 0, null, x340Var2, 0, 0, 1768);
                x340Var = x340Var2;
                x340Var.r(true);
                function2 = function0;
                vu30Var = vu30Var;
                z2 = 0;
            }
            x340Var.r(z2);
            if (ye1Var.c.c.length() > 0) {
                x340Var.i0(509333956);
                boolean z3 = ((i2 & 14) == 4) | ((i2 & 896) == 256);
                Object objT = x340Var.T();
                if (z3 || objT == m4cVar) {
                    b2 = 0;
                    yg1Var2 = yg1Var;
                    objT = new ze1((byte) 0, yg1Var2, iu30Var);
                    x340Var.s0(objT);
                } else {
                    b2 = 0;
                    yg1Var2 = yg1Var;
                }
                x340 x340Var3 = x340Var;
                foo1.c(new gbx(z50.c, (Function0) objT), jdx.c, uyn1.x(nim0Var, 8.0f), null, null, null, null, null, null, null, apo.r(-27355970, new af1(yg1Var2, b2), x340Var), x340Var3, 0, 48, 2040);
                x340Var = x340Var3;
                x340Var.r(false);
            } else {
                yg1Var2 = yg1Var;
                x340Var.i0(509770250);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bf1(yg1Var2, qim0Var, iu30Var, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:64:0x0133  */
    /* JADX WARN: Code duplicated, block: B:66:0x0137  */
    /* JADX WARN: Code duplicated, block: B:70:0x014a  */
    /* JADX WARN: Code duplicated, block: B:71:0x014d  */
    /* JADX WARN: Code duplicated, block: B:86:0x013a A[EXC_TOP_SPLITTER, PHI: r5
      0x013a: PHI (r5v21 java.lang.String) = (r5v20 java.lang.String), (r5v24 java.lang.String) binds: [B:65:0x0135, B:58:0x0126] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static final void b(lsm0 lsm0Var, Function0 function0, String str, boolean z, boolean z2, k6j1 k6j1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        long j;
        u7h u7hVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-45782516);
        int i2 = i | (x340Var.i(lsm0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.h(z2) ? 16384 : 8192) | (x340Var.i(k6j1Var) ? 131072 : 65536) | (x340Var.i(iu30Var) ? 1048576 : 524288) | (x340Var.i(qim0Var) ? 8388608 : 4194304);
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            float fX0 = ((wat) x340Var.k(t4k.h)).X0(8.0f);
            float f = x340Var.k(t4k.n) == flb0.a ? 1.0f : -1.0f;
            qim0 qim0VarU = lrn1.u(uyn1.B(u291.j(0.0f, 249.0f, 1, u291.D(qim0Var, (era) null, 3)), 0.0f, 0.0f, 16.0f, 0.0f, 11), iu30Var);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarU);
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
            if (k6j1Var == null) {
                j = u7h.d;
            } else {
                String str2 = k6j1Var.a;
                if (str2 == null) {
                    str2 = k6j1Var.b;
                    if (str2 != null || ihc1.y0(str2)) {
                        str2 = null;
                    }
                    if (str2 == null) {
                        u7hVar = null;
                    } else {
                        try {
                            u7hVar = new u7h(z4p1.e(Color.parseColor(str2)));
                        } catch (IllegalArgumentException unused) {
                            u7hVar = null;
                        }
                    }
                    if (u7hVar != null) {
                        j = u7hVar.a;
                    } else {
                        j = u7h.d;
                    }
                } else {
                    if (ihc1.y0(str2)) {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = k6j1Var.b;
                        if (str2 != null) {
                            str2 = null;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            u7hVar = null;
                        } else {
                            u7hVar = new u7h(z4p1.e(Color.parseColor(str2)));
                        }
                    } else {
                        u7hVar = new u7h(z4p1.e(Color.parseColor(str2)));
                    }
                    if (u7hVar != null) {
                        j = u7hVar.a;
                    } else {
                        j = u7h.d;
                    }
                }
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(u291.c(nim0Var, 0.9f), 0.0f, 11.0f, 0.0f, 11.0f, 5);
            cbx.a.getClass();
            idd1 idd1Var = uwr.k;
            qim0 qim0VarR = d7e.r(((ecx) idd1Var.getValue()).a, qim0VarB, false);
            boolean zD = x340Var.d(fX0) | x340Var.d(f);
            Object objT = x340Var.T();
            if (zD || objT == fkj0.X) {
                objT = new e8(fX0, f, (byte) 3);
                x340Var.s0(objT);
            }
            qim0 qim0VarF = dug.f(i541.C(qim0VarR, (iu30) objT), j, d4o1.a);
            gra graVar = een.i;
            h2c h2cVar = h2c.a;
            t1c.a(h2cVar.a(qim0VarF, graVar), x340Var, 0);
            qim0 qim0VarA = h2cVar.a(d7e.r(((ecx) idd1Var.getValue()).a, i1p1.q(sto1.k(uyn1.B(u291.c(nim0Var, 1.0f), 8.0f, 12.0f, 0.0f, 12.0f, 4), er31.b(8.0f), new bw61(6.0f, u7h.b, 0.0f, (((long) Float.floatToRawIntBits(4.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0.3f, 32, 0)), er31.b(8.0f)), false), graVar);
            int i3 = i2 >> 3;
            m6p1.p(new b6k1(str, lsm0Var), function0, z, z2, qim0VarA, x340Var, (i2 & 112) | 8 | (i3 & 896) | (i3 & 7168));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m8m(lsm0Var, function0, str, z, z2, k6j1Var, iu30Var, qim0Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(String str, qim0 qim0Var, String str2, c380 c380Var, c380 c380Var2, iu30 iu30Var, b0k b0kVar, int i, int i2) {
        String str3;
        int i3;
        c380 c380Var3;
        int i4;
        qim0 qim0Var2;
        String str4;
        c380 c380Var4;
        String str5;
        Object objN;
        vu30 vu30Var;
        llj lljVar;
        vu30 vu30Var2;
        nl3 nl3Var;
        byte b2;
        vu30 vu30Var3 = y580.Y;
        llj lljVar2 = y580.R0;
        vu30 vu30Var4 = y580.N0;
        vu30 vu30Var5 = y580.O0;
        nl3 nl3Var2 = een.P0;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(791520251);
        j06 j06Var = x340Var.a;
        int i5 = i | (x340Var.g(str) ? 4 : 2);
        int i6 = i5 | 48;
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 = i5 | 432;
            str3 = str2;
        } else {
            str3 = str2;
            i3 = i6 | (x340Var.g(str3) ? 256 : 128);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i4 = i3 | 3072;
            c380Var3 = c380Var;
        } else {
            c380Var3 = c380Var;
            i4 = i3 | (x340Var.g(c380Var3) ? 2048 : 1024);
        }
        int i9 = i4 | (x340Var.g(c380Var2) ? 16384 : 8192) | (x340Var.i(iu30Var) ? 131072 : 65536);
        if (x340Var.Y(i9 & 1, (i9 & 74899) != 74898)) {
            if (i7 != 0) {
                str3 = "";
            }
            c380<c10> c380Var5 = i8 != 0 ? fg91.b : c380Var3;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            cr31 cr31VarB = er31.b(8.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = uyn1.x(u291.f(dug.f(qim0Var3, jA, cr31VarB), 1.0f), 16.0f);
            mbh mbhVarA = jbh.a(d36Var, nl3Var2, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            nl3 nl3Var3 = nl3Var2;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, vu30Var5);
            nko1.H(xos0VarM, x340Var, vu30Var4);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE, x340Var, vu30Var3);
            String str6 = str3;
            vu30 vu30Var6 = vu30Var3;
            uwo1.e(str, u291.f(qim0Var3, 1.0f), cbx.d(x340Var).h, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, i9 & 14, 0, 2032);
            x340Var = x340Var;
            if (str6.length() > 0) {
                x340Var.i0(840047187);
                boolean z2 = (i9 & 458752) == 131072;
                Object objT = x340Var.T();
                Object obj = objT;
                if (z2 || objT == m4cVar) {
                    bv70 bv70Var = new bv70(iu30Var, (byte) 2);
                    x340Var.s0(bv70Var);
                    obj = bv70Var;
                }
                str5 = str6;
                uwo1.d(xxq0.b(str6, (iu30) obj), cbx.a(x340Var).b.b, u291.f(qim0Var3, 1.0f), cbx.d(x340Var).g, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4080);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                str5 = str6;
                x340Var.i0(840364317);
                x340Var.r(false);
            }
            x340Var.i0(-1358363593);
            for (c10 c10Var : c380Var5) {
                jw31 jw31VarA = ew31.a(new d36(6.0f, true, new um5(false)), een.N0, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0Var3);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, vu30Var5);
                nko1.H(xos0VarM2, x340Var, vu30Var4);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, vu30Var6);
                hux huxVarD = xxq0.d(c10Var.a);
                uwr uwrVar2 = cbx.a;
                x340 x340Var2 = x340Var;
                w0h1.a(huxVarD, isl.a, u291.r(qim0Var3, 12.0f), cbx.a(x340Var).b.b, 0L, false, x340Var2, 56, 48);
                uwo1.e(c10Var.b, u291.f(qim0Var3, 1.0f), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
                x340Var = x340Var2;
                x340Var.r(true);
                vu30Var4 = vu30Var4;
                vu30Var6 = vu30Var6;
            }
            llj lljVar3 = lljVar2;
            vu30 vu30Var7 = vu30Var6;
            vu30 vu30Var8 = vu30Var4;
            byte b3 = 1;
            x340Var.r(false);
            x340Var.i0(-1358342951);
            Iterator it = c380Var2.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    p7h.T();
                    throw null;
                }
                c10 c10Var2 = (c10) next;
                if (c10Var2.g) {
                    x340Var.i0(-128213732);
                    int i12 = (x340Var.g(c10Var2) ? 1 : 0) | ((i9 & 458752) == 131072 ? b3 : (byte) 0);
                    Object objT2 = x340Var.T();
                    Object obj2 = objT2;
                    if (i12 != 0 || objT2 == m4cVar) {
                        lb80 lb80Var = new lb80(iu30Var, c10Var2, (byte) 0);
                        x340Var.s0(lb80Var);
                        obj2 = lb80Var;
                    }
                    x340 x340Var3 = x340Var;
                    foo1.c(new gbx(z50.c, (Function0) obj2), jdx.c, u291.f(uyn1.x(qim0Var3, 8.0f), 1.0f), null, null, null, null, null, null, null, apo.r(1274276202, new jb50(c10Var2, (byte) 20), x340Var), x340Var3, 0, 48, 2040);
                    x340Var = x340Var3;
                    x340Var.r(false);
                    nl3 nl3Var4 = nl3Var3;
                    vu30Var = vu30Var5;
                    lljVar = lljVar3;
                    nl3Var = nl3Var4;
                    b2 = b3;
                    vu30Var2 = vu30Var7;
                } else {
                    x340Var.i0(-127736394);
                    qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                    Object objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objN = objT3;
                        objN = ktd.n(x340Var);
                    }
                    objN = objT3;
                    idn0 idn0Var = (idn0) objN;
                    jtr jtrVar = jtr.f;
                    int i13 = ((i9 & 458752) == 131072 ? b3 : (byte) 0) | (x340Var.g(c10Var2) ? 1 : 0);
                    Object objT4 = x340Var.T();
                    Object obj3 = objT4;
                    if (i13 != 0 || objT4 == m4cVar) {
                        lb80 lb80Var2 = new lb80(iu30Var, c10Var2, b3);
                        x340Var.s0(lb80Var2);
                        obj3 = lb80Var2;
                    }
                    qim0 qim0VarV = bin.v(qim0VarF, idn0Var, jtrVar, false, null, null, (Function0) obj3, 28);
                    nl3 nl3Var5 = nl3Var3;
                    mbh mbhVarA2 = jbh.a(h36.c, nl3Var5, x340Var, 0);
                    vu30 vu30Var9 = vu30Var5;
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarV);
                    hzj.A.getClass();
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    vu30Var = vu30Var9;
                    nko1.H(mbhVarA2, x340Var, vu30Var);
                    vu30Var8 = vu30Var8;
                    nko1.H(xos0VarM3, x340Var, vu30Var8);
                    lljVar = lljVar3;
                    x0d.q(iHashCode3, x340Var, lljVar, x340Var);
                    vu30Var2 = vu30Var7;
                    nko1.H(qim0VarE3, x340Var, vu30Var2);
                    if (i10 > 0) {
                        x340Var.i0(-712535713);
                        uwr uwrVar3 = cbx.a;
                        hr80.d(uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, 16.0f, 7), 1.0f, cbx.a(x340Var).a.b.a(), x340Var, 0, 0);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-712346024);
                        x340Var.r(false);
                    }
                    String strO0 = cwl1.o0(x340Var, 2131959783);
                    String str7 = c10Var2.b;
                    if (!c10Var2.f) {
                        strO0 = null;
                    }
                    af5 af5VarA = xxq0.a(str7, strO0, x340Var);
                    qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
                    uwr uwrVar4 = cbx.a;
                    x340 x340Var4 = x340Var;
                    nl3Var = nl3Var5;
                    uwo1.d(af5VarA, cbx.a(x340Var).b.a, qim0VarF2, cbx.d(x340Var).g, null, null, 0, false, null, 0, null, null, x340Var4, 0, 0, 4080);
                    uwo1.e(c10Var2.c, u291.f(qim0Var3, 1.0f), cbx.d(x340Var4).j, cbx.a(x340Var4).b.b, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2032);
                    x340Var = x340Var4;
                    b2 = 1;
                    x340Var.r(true);
                    x340Var.r(false);
                }
                nl3 nl3Var6 = nl3Var;
                lljVar3 = lljVar;
                vu30Var5 = vu30Var;
                nl3Var3 = nl3Var6;
                it = it;
                vu30Var7 = vu30Var2;
                b3 = b2;
                i10 = i11;
            }
            x340Var.r(false);
            x340Var.r(b3);
            qim0Var2 = qim0Var3;
            c380Var4 = c380Var5;
            str4 = str5;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            str4 = str3;
            c380Var4 = c380Var3;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jn00(str, qim0Var2, str4, c380Var4, c380Var2, iu30Var, i, i2);
        }
    }

    public static final void d(String str, String str2, hnu0 hnu0Var, gnu0 gnu0Var, b0k b0kVar, int i) {
        x340 x340Var;
        xu30 xu30Var;
        af5 af5VarJ;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-967113748);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.i(hnu0Var) ? 256 : 128) | (x340Var2.i(gnu0Var) ? 2048 : 1024);
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var2).a.a.a();
            cua cuaVar = cbx.b(x340Var2).f;
            qim0 qim0VarF2 = dug.f(qim0VarF, jA, er31.b(16.0f));
            if (str == null || hnu0Var == null || gnu0Var == null) {
                x340Var2.i0(-644632643);
                jto1.b(qim0VarF2, null, null, false, null, null, null, null, null, r8j.a, null, r8j.b, null, null, null, r8j.c, x340Var2, 805306368, 196656, 30206);
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                x340Var2.i0(-644344064);
                cvx cvxVar = cbx.b(x340Var2).b;
                qim0 qim0VarX = uyn1.x(qim0VarF2, 8.0f);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
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
                if (str2 == null) {
                    x340Var2.i0(1725160657);
                    x340Var2.r(false);
                    xu30Var = null;
                } else {
                    x340Var2.i0(1725160658);
                    xu30 xu30VarR = apo.r(-232023788, new ukm0(hnu0Var, str2, (byte) 26), x340Var2);
                    x340Var2.r(false);
                    xu30Var = xu30VarR;
                }
                x340Var2.i0(332774682);
                knu0 sender = gnu0Var.getSender();
                enu0 enu0Var = gnu0Var instanceof enu0 ? (enu0) gnu0Var : null;
                knu0 knu0Var = enu0Var != null ? enu0Var.b : null;
                if (knu0Var != null && knu0Var.a() && (sender instanceof jnu0) && (knu0Var instanceof inu0)) {
                    x340Var2.i0(1220287929);
                    af5VarJ = new af5(cwl1.o0(x340Var2, 2131959902));
                    x340Var2.r(false);
                } else if (knu0Var != null && knu0Var.a()) {
                    x340Var2.i0(1220294834);
                    af5VarJ = new af5(cwl1.o0(x340Var2, 2131959898));
                    x340Var2.r(false);
                } else if ((sender instanceof jnu0) && (knu0Var instanceof inu0)) {
                    x340Var2.i0(1220301608);
                    af5VarJ = new af5(cwl1.n0(2131959904, new Object[]{((inu0) knu0Var).b}, x340Var2));
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-825170806);
                    af5VarJ = j(cwl1.n0(2131959900, new Object[]{str}, x340Var2), str, x340Var2);
                    x340Var2.r(false);
                }
                j2i j2iVarR = apo.r(376449598, new pf1(af5VarJ, (byte) 7), x340Var2);
                x340Var2.r(false);
                jto1.b(null, null, null, false, null, null, null, null, null, xu30Var, null, j2iVarR, null, null, null, apo.r(-216259766, new ukm0(str, gnu0Var, (byte) 27), x340Var2), x340Var2, 0, 196608, 30207);
                x340Var = x340Var2;
                x340Var.r(true);
                x340Var.r(false);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(i, str, str2, hnu0Var, gnu0Var, (byte) 19);
        }
    }

    public static final void e(int i, b0k b0kVar, qim0 qim0Var, boolean z, boolean z2) {
        qim0 qim0Var2;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(923720863);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i3 = i2 & 14;
            boolean z4 = i3 == 4;
            Object objT2 = x340Var.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = new wsh(z, ven0Var, (lnm) null, (byte) 3);
                x340Var.s0(objT2);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT2);
            tob1 tob1VarB = z95.b((((Boolean) ven0Var.getValue()).booleanValue() && z) ? 1.0f : 0.0f, irn1.o0(CtaType.CTA_SHARE_FIELD_NUMBER, 0, null, 6), "overlay-alpha", (iu30) null, x340Var, 3120, 20);
            float fFloatValue = ((Number) tob1VarB.getValue()).floatValue();
            qim0 qim0Var3 = nim0.a;
            if (fFloatValue > 0.0f || z || z2) {
                x340Var.i0(713524903);
                qim0 qim0VarF = dug.f(u291.d(qim0Var3, 1.0f), u7h.b(u7h.b, ((Number) tob1VarB.getValue()).floatValue() * 0.6f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
                Boolean boolValueOf2 = Boolean.valueOf(z);
                Boolean boolValueOf3 = Boolean.valueOf(z2);
                boolean z5 = ((i2 & 112) == 32) | (i3 == 4);
                Object objT3 = x340Var.T();
                if (z5 || objT3 == m4cVar) {
                    objT3 = new lae0(z, z2);
                    x340Var.s0(objT3);
                }
                qim0 qim0VarN = anm1.N("edit_playlist_items_loading_overlay", f8d1.c(qim0VarF, boolValueOf2, boolValueOf3, (PointerInputEventHandler) objT3));
                gfh0 gfh0VarC = t1c.c(een.h, false);
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
                if (((Number) tob1VarB.getValue()).floatValue() > 0.0f) {
                    x340Var.i0(1282195849);
                    z3 = true;
                    yto1.e(1, 48, 0, x340Var, d9y0.k(qim0Var3, ((Number) tob1VarB.getValue()).floatValue()));
                    x340Var.r(false);
                } else {
                    z3 = true;
                    x340Var.i0(1282289314);
                    x340Var.r(false);
                }
                x340Var.r(z3);
                x340Var.r(false);
            } else {
                x340Var.i0(714166851);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ovf(z, z2, qim0Var2, i, (byte) 1);
        }
    }

    public static final void f(lnu0 lnu0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2129840885);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(lnu0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ss50 ss50Var = (ss50) x340Var.k(t4k.l);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarT = ltn1.t(u291.f(nim0Var, 1.0f), lnu0Var.g);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0VarT, 8.0f, 6.0f, 8.0f, cbx.b(x340Var).b.b);
            cvx cvxVar4 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            gnu0 gnu0Var = lnu0Var.f;
            String str = !((gnu0Var != null ? gnu0Var.getSender() : null) instanceof jnu0) ? lnu0Var.b : lnu0Var.a;
            qim0 qim0VarF = u291.f(anm1.N("playlist_invitation_share_row_card", nim0Var), 1.0f);
            boolean zI = ((i2 & 112) == 32) | x340Var.i(ss50Var) | x340Var.g(str);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new mhg(ss50Var, iu30Var, str, (byte) 8);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = f8d1.b(qim0VarF, str, (PointerInputEventHandler) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
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
            d(lnu0Var.c, lnu0Var.d, lnu0Var.e, lnu0Var.f, x340Var, 0);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0((Object) lnu0Var, (Object) iu30Var, i, (byte) 8);
        }
    }

    public static final void g(float f, float f2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1117238941);
        int i2 = (x340Var.d(f) ? 4 : 2) | i | (x340Var.d(f2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarH = u291.h(u291.v(uyn1.B(nim0.a, 0.0f, 4.0f, 0.0f, 4.0f, 5), f), f2);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarH, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cru(f, f2, i, (byte) 6);
        }
    }

    public static final void h(ac81 ac81Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2028436147);
        int i2 = i | (x340Var.g(ac81Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            fra fraVar = een.N0;
            d36 d36Var = new d36(14.0f, true, new um5(false));
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarX = bin.x(dug.f(qim0Var, jA, er31.b(8.0f)), false, null, null, null, function0, 15);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarX, 14.0f, 0.0f, 16.0f, 0.0f, 10);
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
            String str = ac81Var.a;
            String str2 = ac81Var.b;
            hux huxVarD = xxq0.d(str);
            jsl jslVar = new jsl(str2);
            qim0 qim0VarZ = uyn1.z(0.0f, 14.0f, 1, nim0.a);
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(huxVarD, jslVar, u291.r(qim0VarZ, 24.0f), cbx.a(x340Var).b.a, 0L, false, x340Var, 8, 48);
            lee1 lee1Var = cbx.d(x340Var).k;
            long j = cbx.a(x340Var).b.a;
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(str2, uyn1.z(0.0f, 6.0f, 1, wnb0Var), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qm71(ac81Var, function0, qim0Var, i, (byte) 2);
        }
    }

    public static final void i(ub81 ub81Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        vu30 vu30Var = y580.Y;
        llj lljVar = y580.R0;
        llj lljVar2 = y580.N0;
        llj lljVar3 = y580.O0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1101957958);
        j06 j06Var = x340Var.a;
        int i2 = (i & 6) == 0 ? (x340Var.g(ub81Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(new d36(18.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(mbhVarA, x340Var, lljVar3);
            nko1.H(xos0VarM, x340Var, lljVar2);
            nko1.H(Integer.valueOf(iHashCode), x340Var, lljVar);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, vu30Var);
            x340Var.i0(1217665303);
            for (List list : o7h.s1(ub81Var.b, 2, 2)) {
                qim0 qim0VarD = sgc1.D(1, u291.f(nim0.a, 1.0f));
                jw31 jw31VarA = ew31.a(new d36(18.0f, true, new um5(false)), een.Z, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar3);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                nko1.H(Integer.valueOf(iHashCode2), x340Var, lljVar);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, vu30Var);
                x340Var.i0(-1013808014);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ac81 ac81Var = (ac81) it.next();
                    boolean zG = ((i2 & 112) == 32) | x340Var.g(ac81Var);
                    Object objT = x340Var.T();
                    if (zG || objT == fkj0.X) {
                        objT = new fh61(iu30Var, ac81Var, (byte) 20);
                        x340Var.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    vu30 vu30Var2 = vu30Var;
                    Iterator it2 = it;
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    h(ac81Var, function0, u291.c(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f), x340Var, 0);
                    vu30Var = vu30Var2;
                    it = it2;
                }
                vu30 vu30Var3 = vu30Var;
                x340Var.r(false);
                x340Var.i0(-1013800853);
                int size = 2 - list.size();
                int i3 = 0;
                while (i3 < size) {
                    int i4 = i3;
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    op71.g(x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    i3 = i4 + 1;
                }
                x340Var.r(false);
                x340Var.r(true);
                vu30Var = vu30Var3;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(ub81Var, iu30Var, qim0Var, i, (byte) 26);
        }
    }

    public static final af5 j(String str, String str2, b0k b0kVar) {
        uwr uwrVar = cbx.a;
        FontFamily fontFamily = cbx.d(b0kVar).n.a.f;
        zma1 zma1Var = new zma1(cbx.a(b0kVar).b.a, 0L, FontWeight.e, (FontStyle) null, (FontSynthesis) null, fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65498);
        ye5 ye5Var = new ye5();
        int iB0 = ihc1.B0(str, str2, 0, 6);
        if (iB0 >= 0) {
            ye5Var.g(str.substring(0, iB0));
            int iO = ye5Var.o(zma1Var);
            try {
                ye5Var.g(str2);
                ye5Var.k(iO);
                ye5Var.g(str.substring(str2.length() + iB0));
            } catch (Throwable th) {
                ye5Var.k(iO);
                throw th;
            }
        } else {
            ye5Var.g(str);
        }
        return ye5Var.p();
    }

    public static final long k(int i, int i2, ggg1 ggg1Var) {
        int i3;
        if (i == -1) {
            return (((long) i2) << 32) | 4294967295L;
        }
        boolean z = i > i2;
        long jI = ggg1Var.i(i);
        long jK = ggg1Var.k(jI);
        if (nbe1.d(jI) && nbe1.d(jK)) {
            i3 = 1;
        } else if (nbe1.d(jI) || nbe1.d(jK)) {
            i3 = (!nbe1.d(jI) || nbe1.d(jK)) ? 4 : 2;
        } else {
            i3 = 3;
        }
        int iC = l1d.C(i3);
        if (iC == 0) {
            return axo1.h(i, z ? 1 : 2);
        }
        if (iC == 1) {
            if (z) {
                return i == ((int) (jK >> 32)) ? axo1.h(i, 1) : axo1.h((int) (jK & 4294967295L), 2);
            }
            return i == ((int) (jK & 4294967295L)) ? axo1.h(i, 2) : axo1.h((int) (jK >> 32), 1);
        }
        if (iC == 2) {
            return z ? axo1.h((int) (jK & 4294967295L), 1) : axo1.h((int) (jK >> 32), 2);
        }
        if (iC == 3) {
            return (((long) i) << 32) | 4294967295L;
        }
        eg.o();
        return 0L;
    }

    public static final n3a l() {
        return new n3a(false);
    }

    public static final Next m(y0k1 y0k1Var, int i) {
        String str = y0k1Var.a;
        int iC = l1d.C(i);
        if (iC == 0) {
            if (y0k1Var.e) {
                return Next.j();
            }
            boolean z = !y0k1Var.b;
            return Next.i(y0k1.a(y0k1Var, z, false, false, true, false, false, 109), Collections.singleton(new h0k1(str, z)));
        }
        if (iC == 1) {
            if (y0k1Var.f) {
                return Next.j();
            }
            boolean z2 = !y0k1Var.c;
            return Next.i(y0k1.a(y0k1Var, false, z2, false, false, true, false, 91), Collections.singleton(new g0k1(str, z2)));
        }
        if (iC != 2) {
            eg.o();
            return null;
        }
        if (y0k1Var.g) {
            return Next.j();
        }
        boolean z3 = !y0k1Var.d;
        return Next.i(y0k1.a(y0k1Var, false, false, z3, false, false, true, 55), Collections.singleton(new i0k1(str, z3)));
    }

    public static zwk0 n() {
        return new zwk0();
    }

    public static lik1 o(kl klVar, xxa0 xxa0Var) {
        kik1 kik1Var;
        String str;
        boolean z = xxa0Var instanceof vxa0;
        hl hlVar = hl.b;
        fl flVar = fl.b;
        dl dlVar = dl.b;
        il ilVar = il.b;
        el elVar = el.b;
        al alVar = al.b;
        cl clVar = cl.b;
        zk zkVar = zk.b;
        bl blVar = bl.b;
        jl jlVar = jl.b;
        if (z) {
            if (klVar.equals(jlVar)) {
                return nik1.w3;
            }
            if (klVar.equals(blVar)) {
                return nik1.O3;
            }
            if (klVar instanceof gl) {
                eg.m("TransitionConsent is not supported in the creation flow");
                return null;
            }
            if (klVar.equals(zkVar)) {
                return nik1.v3;
            }
            if (klVar.equals(clVar)) {
                return nik1.r3;
            }
            if (klVar.equals(alVar)) {
                return nik1.s3;
            }
            if (klVar.equals(elVar)) {
                return nik1.t3;
            }
            if (klVar.equals(ilVar)) {
                return nik1.B3;
            }
            if (klVar.equals(dlVar)) {
                return nik1.z3;
            }
            if (klVar.equals(flVar)) {
                return nik1.A3;
            }
            if (klVar.equals(hlVar)) {
                eg.m("TransitionSubmit is not supported in the creation flow");
                return null;
            }
            eg.o();
            return null;
        }
        if (!(xxa0Var instanceof wxa0)) {
            eg.o();
            return null;
        }
        String value = ((wxa0) xxa0Var).a.getValue();
        if (klVar.equals(jlVar)) {
            return nik1.E3;
        }
        if (klVar.equals(blVar)) {
            return nik1.O3;
        }
        if (klVar instanceof gl) {
            kik1Var = nik1.G3;
            str = "spotify:internal:kid-account-transition:consent:";
        } else {
            if (klVar.equals(zkVar)) {
                return nik1.v3;
            }
            if (!klVar.equals(clVar)) {
                if (klVar.equals(alVar)) {
                    return nik1.I3;
                }
                if (klVar.equals(elVar)) {
                    return nik1.K3;
                }
                if (klVar.equals(ilVar)) {
                    return nik1.C3;
                }
                if (klVar.equals(dlVar)) {
                    return nik1.M3;
                }
                if (klVar.equals(flVar)) {
                    eg.m("Submit is not supported in the transition flow");
                    return null;
                }
                if (klVar.equals(hlVar)) {
                    return nik1.N3;
                }
                eg.o();
                return null;
            }
            kik1Var = nik1.H3;
            str = "spotify:internal:kid-account-transition:legal-consent:";
        }
        return cfm0.i(str, value, kik1Var);
    }

    public static final long p(long j, String str) {
        u7h m231Var;
        try {
            m231Var = new u7h(z4p1.e(Color.parseColor(ihc1.e1(str).toString())));
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (e331.a(m231Var) != null) {
            m231Var = new u7h(j);
        }
        return m231Var.a;
    }

    public static final void q(Context context) {
        awl1 awl1VarD;
        utw0 utw0Var = ike1.a;
        utw0Var.y("RCS");
        utw0Var.o("Unscheduling recurring background work (legacy)", new Object[0]);
        try {
            awl1VarD = awl1.d(context);
        } catch (IllegalStateException e) {
            utw0 utw0Var2 = ike1.a;
            utw0Var2.y("RCS");
            utw0Var2.B(e, "An error occurred while getting an instance of WorkManager. (legacy)", new Object[0]);
            awl1VarD = null;
        }
        if (awl1VarD != null) {
            bzn1.r("remote-config-fetch-daily", awl1VarD);
        }
    }
}
