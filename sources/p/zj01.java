package p;

import android.icu.lang.UCharacter;
import android.icu.text.BreakIterator;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class zj01 {
    public static final Set a = f46.S0(new Integer[]{14, 37, 24});

    /* JADX WARN: Code duplicated, block: B:123:0x030d  */
    /* JADX WARN: Code duplicated, block: B:126:0x031d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0328  */
    /* JADX WARN: Code duplicated, block: B:130:0x0339 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    public static final void a(Paragraph paragraph, Paragraph paragraph2, boolean z, Function0 function0, b0k b0kVar, int i, int i2) {
        int i3;
        Function0 function1;
        boolean z2;
        x340 x340Var;
        Function0 function2;
        h311 h311VarV;
        xj01 xj01Var;
        Function0 function3;
        int iU;
        int i4;
        int iR;
        Function0 function4;
        qim0 qim0VarB;
        qim0 qim0Var;
        boolean z3;
        qim0 qim0VarX;
        Object objT;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-2026083520);
        if ((i & 6) == 0) {
            i3 = (x340Var2.g(paragraph) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.g(paragraph2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var2.h(z) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                function1 = function0;
                i3 |= x340Var2.i(function1) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var2.Y(i3 & 1, z2)) {
                if (i5 != 0) {
                    objT = x340Var2.T();
                    if (objT == m4cVar) {
                        objT = ijz0.N0;
                        x340Var2.s0(objT);
                    }
                    function3 = (Function0) objT;
                } else {
                    function3 = function1;
                }
                iU = paragraph.u();
                if (iU == 0) {
                    i4 = -1;
                } else {
                    i4 = yj01.a[l1d.C(iU)];
                }
                if (i4 != 1) {
                    iR = paragraph.r().r();
                } else if (i4 != 2) {
                    iR = paragraph.p().r();
                } else if (i4 != 3) {
                    iR = 0;
                } else {
                    iR = paragraph.q().s();
                }
                if (iR > 0 || paragraph.u() == 3) {
                    function4 = function3;
                    x340Var2.i0(-1878454444);
                    g(paragraph, z, x340Var2, (i3 & 14) | ((i3 >> 3) & 112));
                    x340Var2.r(false);
                    h311VarV = x340Var2.v();
                    if (h311VarV == null) {
                        return;
                    } else {
                        xj01Var = new xj01(paragraph, paragraph2, z, function4, i, i2, (byte) 0);
                    }
                } else {
                    x340Var2.i0(-1878379486);
                    x340Var2.r(false);
                    vnr0 vnr0VarA = shy0.a(paragraph, x340Var2);
                    String str = vnr0VarA.a;
                    vnr0 vnr0VarA2 = shy0.a(paragraph2, x340Var2);
                    Object objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = v8r.q(Boolean.FALSE);
                        x340Var2.s0(objT2);
                    }
                    ven0 ven0Var = (ven0) objT2;
                    Object objT3 = x340Var2.T();
                    if (objT3 == m4cVar) {
                        objT3 = v8r.q(Boolean.FALSE);
                        x340Var2.s0(objT3);
                    }
                    ven0 ven0Var2 = (ven0) objT3;
                    Object objT4 = x340Var2.T();
                    if (objT4 == m4cVar) {
                        objT4 = bb00.h(0, x340Var2);
                    }
                    err0 err0Var = (hdn0) objT4;
                    zma1 zma1VarA = zma1.a(vnr0VarA2.b.a, vnr0VarA2.d, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534);
                    qim0 qim0Var2 = nim0.a;
                    qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarZ = uyn1.z(cbx.b(x340Var2).e.b, 0.0f, 2, qim0VarF);
                    if (z) {
                        x340Var2.i0(-1446048777);
                        Object objT5 = x340Var2.T();
                        if (objT5 == m4cVar) {
                            objT5 = th01.f;
                            x340Var2.s0(objT5);
                        }
                        qim0VarB = s161.b(qim0Var2, false, (iu30) objT5);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1446047864);
                        x340Var2.r(false);
                        qim0VarB = qim0Var2;
                    }
                    qim0 qim0VarThen = qim0VarZ.then(qim0VarB);
                    if (!((Boolean) ven0Var2.getValue()).booleanValue() || ((Boolean) ven0Var.getValue()).booleanValue()) {
                        qim0Var = qim0Var2;
                        z3 = false;
                        x340Var2.i0(-1877609632);
                        x340Var2.r(false);
                        qim0VarX = qim0Var;
                    } else {
                        x340Var2.i0(-1877736763);
                        boolean zI = x340Var2.i(ven0Var) | ((i3 & 7168) == 2048);
                        Object objT6 = x340Var2.T();
                        if (zI || objT6 == m4cVar) {
                            objT6 = new swi0(function3, ven0Var, (byte) 9);
                            x340Var2.s0(objT6);
                        }
                        qim0VarX = bin.x(qim0Var2, false, null, null, null, (Function0) objT6, 15);
                        qim0Var = qim0Var2;
                        z3 = false;
                        x340Var2.r(false);
                    }
                    qim0 qim0VarThen2 = qim0VarThen.then(qim0VarX);
                    gfh0 gfh0VarC = t1c.c(een.d, z3);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarThen2);
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
                    qim0 qim0VarD = o0c.d(u291.f(qim0Var, 1.0f), (ni20) null, 3);
                    ye5 ye5Var = new ye5();
                    if (!((Boolean) ven0Var2.getValue()).booleanValue() || ((Boolean) ven0Var.getValue()).booleanValue()) {
                        ye5Var.g(str);
                    } else {
                        ye5Var.g(i(err0Var.s(), str));
                        int iO = ye5Var.o(zma1VarA);
                        try {
                            ye5Var.g(vnr0VarA2.a);
                            ye5Var.k(iO);
                        } catch (Throwable th) {
                            ye5Var.k(iO);
                            throw th;
                        }
                    }
                    af5 af5VarP = ye5Var.p();
                    bjc0 cjc0Var = ((Boolean) ven0Var.getValue()).booleanValue() ? bjc0.a : new cjc0(iR);
                    a0e1 a0e1Var = vnr0VarA.e;
                    lee1 lee1Var = vnr0VarA.b;
                    Function0 function5 = function3;
                    long j = vnr0VarA.d;
                    bjc0 bjc0Var = cjc0Var;
                    boolean zI2 = x340Var2.i(ven0Var) | x340Var2.i(ven0Var2) | x340Var2.i(err0Var) | x340Var2.e(iR) | x340Var2.i(vnr0VarA2) | x340Var2.i(vnr0VarA);
                    Object objT7 = x340Var2.T();
                    if (zI2 || objT7 == m4cVar) {
                        pvj pvjVar = new pvj(iR, vnr0VarA2, vnr0VarA, ven0Var, ven0Var2, err0Var);
                        x340Var2.s0(pvjVar);
                        objT7 = pvjVar;
                    }
                    function2 = function5;
                    uwo1.d(af5VarP, j, qim0VarD, lee1Var, a0e1Var, (iu30) objT7, 0, false, bjc0Var, 0, null, null, x340Var2, 0, 0, 3776);
                    x340Var = x340Var2;
                    x340Var.r(true);
                }
                h311VarV.d = xj01Var;
            }
            x340Var = x340Var2;
            x340Var.b0();
            function2 = function1;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                xj01Var = new xj01(paragraph, paragraph2, z, function2, i, i2, (byte) 1);
                h311VarV.d = xj01Var;
            }
        }
        i3 |= 3072;
        function1 = function0;
        if ((i3 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var2.Y(i3 & 1, z2)) {
            if (i5 != 0) {
                objT = x340Var2.T();
                if (objT == m4cVar) {
                    objT = ijz0.N0;
                    x340Var2.s0(objT);
                }
                function3 = (Function0) objT;
            } else {
                function3 = function1;
            }
            iU = paragraph.u();
            if (iU == 0) {
                i4 = -1;
            } else {
                i4 = yj01.a[l1d.C(iU)];
            }
            if (i4 != 1) {
                iR = paragraph.r().r();
            } else if (i4 != 2) {
                iR = paragraph.p().r();
            } else if (i4 != 3) {
                iR = 0;
            } else {
                iR = paragraph.q().s();
            }
            if (iR > 0) {
            }
            function4 = function3;
            x340Var2.i0(-1878454444);
            g(paragraph, z, x340Var2, (i3 & 14) | ((i3 >> 3) & 112));
            x340Var2.r(false);
            h311VarV = x340Var2.v();
            if (h311VarV == null) {
                xj01Var = new xj01(paragraph, paragraph2, z, function4, i, i2, (byte) 0);
                h311VarV.d = xj01Var;
            }
            return;
        }
        x340Var = x340Var2;
        x340Var.b0();
        function2 = function1;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            xj01Var = new xj01(paragraph, paragraph2, z, function2, i, i2, (byte) 1);
            h311VarV.d = xj01Var;
        }
    }

    public static final void b(Paragraph paragraph, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-946609235);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(paragraph) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            vnr0 vnr0VarA = shy0.a(paragraph, x340Var);
            jch0.c(vnr0VarA.a, qim0Var, lee1.a(vnr0VarA.b, vnr0VarA.d, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), (iu30) null, 0, false, 1, 0, (x9h) null, new rx8(fc11.G(4), vnr0VarA.b.a.b, fc11.G(1)), x340Var, (i2 & 112) | 1572864, 440);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(paragraph, qim0Var, i, (byte) 8);
        }
    }

    public static final void c(int i, int i2, String str, b0k b0kVar) {
        long jC;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-768758790);
        int i3 = (x340Var.g(str) ? 4 : 2) | i2 | (x340Var.e(i) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            if (str.length() > 0) {
                x340Var.i0(-42818228);
                x340Var.r(false);
                jC = ror0.e(u7h.j, str);
            } else {
                x340Var.i0(-42816253);
                uwr uwrVar = cbx.a;
                jC = cbx.a(x340Var).a.b.c();
                x340Var.r(false);
            }
            qim0 qim0VarZ = uyn1.z(h(x340Var, i), 0.0f, 2, u291.f(nim0.a, 1.0f));
            uwr uwrVar2 = cbx.a;
            avw0 avw0Var = cbx.b(x340Var).c;
            qim0 qim0VarF = dug.f(u291.h(qim0VarZ, 1.0f), jC, d4o1.a);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = th01.g;
                x340Var.s0(objT);
            }
            op71.g(x340Var, s161.a(qim0VarF, (iu30) objT));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ue0(str, i, i2, (byte) 17);
        }
    }

    public static final void d(Paragraph paragraph, String str, int i, Paragraph paragraph2, Paragraph paragraph3, Paragraph paragraph4, String str2, boolean z, boolean z2, b0k b0kVar, int i2) {
        float f;
        cr31 cr31Var;
        nim0 nim0Var;
        long jE;
        cr31 cr31VarB;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1954838210);
        j06 j06Var = x340Var.a;
        int i3 = i2 | (x340Var.g(paragraph) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.e(l1d.C(i)) ? 256 : 128) | (x340Var.g(paragraph2) ? 2048 : 1024) | (x340Var.g(paragraph3) ? 16384 : 8192) | (x340Var.g(paragraph4) ? 131072 : 65536) | (x340Var.g(str2) ? 1048576 : 524288) | (x340Var.h(z) ? 8388608 : 4194304) | (x340Var.h(z2) ? 67108864 : 33554432);
        if (x340Var.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            uwr uwrVar = cbx.a;
            xpv0 xpv0Var = cbx.c(x340Var).c;
            n8b1 n8b1VarE = xpv0.e();
            flb0 flb0Var = (flb0) x340Var.k(t4k.n);
            if (z2) {
                f = flb0Var == flb0.b ? 180.0f : -180.0f;
            } else {
                f = 0.0f;
            }
            tob1 tob1VarB = z95.b(f, irn1.l0(n8b1VarE.a, n8b1VarE.b, null, 4), (String) null, (iu30) null, x340Var, 0, 28);
            nim0 nim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var2, 1.0f);
            float f2 = cbx.b(x340Var).e.b;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, f2, 8.0f);
            fra fraVar = een.N0;
            cvx cvxVar2 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            int iC = l1d.C(i);
            if (iC != 0) {
                if (iC == 1) {
                    x340Var.i0(1577802829);
                    x340Var.r(false);
                    cr31VarB = er31.a;
                } else {
                    if (iC != 2) {
                        throw p3d1.k(x340Var, 1577801449, false);
                    }
                    x340Var.i0(1577804218);
                    cua cuaVar = cbx.b(x340Var).f;
                    cr31VarB = er31.b(4.0f);
                    x340Var.r(false);
                }
                cr31Var = cr31VarB;
            } else {
                x340Var.i0(1577806928);
                x340Var.r(false);
                cr31Var = d4o1.a;
            }
            b(paragraph, u291.v(nim0Var2, 20.0f), x340Var, i3 & 14);
            Uri uri = Uri.parse(str);
            qim0 qim0VarQ = i1p1.q(nim0Var2, cr31Var);
            zov0 zov0Var = cbx.b(x340Var).g;
            p3v p3vVar = new p3v(40.0f);
            cua cuaVar2 = cbx.b(x340Var).f;
            cua cuaVar3 = cbx.b(x340Var).f;
            zvx zvxVar = new zvx();
            isl islVar = isl.a;
            eso1.e(uri, islVar, qim0VarQ, p3vVar, zvxVar, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 48, 0, 4064);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            qgo1.f(shy0.a(paragraph2, x340Var), null, null, 2, false, null, x340Var, 8, 54);
            x340 x340Var2 = x340Var;
            if (paragraph3 != null) {
                x340Var2.i0(1636193972);
                vnr0 vnr0VarA = shy0.a(paragraph3, x340Var2);
                cvx cvxVar3 = cbx.b(x340Var2).b;
                nim0Var = nim0Var2;
                qgo1.f(vnr0VarA, uyn1.B(nim0Var2, 0.0f, 2.0f, 0.0f, 0.0f, 13), null, 2, false, null, x340Var2, 8, 52);
                x340Var2 = x340Var2;
                x340Var2.r(false);
            } else {
                nim0Var = nim0Var2;
                x340Var2.i0(1636399626);
                x340Var2.r(false);
            }
            x340Var2.r(true);
            x340 x340Var3 = x340Var2;
            qgo1.f(shy0.a(paragraph4, x340Var2), null, null, 2, false, null, x340Var3, 8, 54);
            x340Var = x340Var3;
            if (z) {
                x340Var.i0(1668282194);
                mlx mlxVar = mlx.c;
                if (str2.length() > 0) {
                    x340Var.i0(1577841684);
                    x340Var.r(false);
                    jE = ror0.e(u7h.j, str2);
                } else {
                    x340Var.i0(1577843433);
                    jE = cbx.a(x340Var).b.b;
                    x340Var.r(false);
                }
                zov0 zov0Var2 = cbx.b(x340Var).g;
                qim0 qim0VarR = u291.r(nim0Var, 12.0f);
                boolean zI = x340Var.i(tob1VarB);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new lws0(tob1VarB, (byte) 10);
                    x340Var.s0(objT);
                }
                w0h1.a(mlxVar, islVar, i541.C(qim0VarR, (iu30) objT), jE, 0L, false, x340Var, mlx.d | 48, 48);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(1668647963);
                zov0 zov0Var3 = cbx.b(x340Var).g;
                ywx0.n(nim0Var, 12.0f, x340Var, false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rf6(paragraph, str, i, paragraph2, paragraph3, paragraph4, str2, z, z2, i2);
        }
    }

    public static final void e(Paragraph paragraph, Paragraph paragraph2, Paragraph paragraph3, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-826333705);
        int i2 = (x340Var.g(paragraph) ? 4 : 2) | i | (x340Var.g(paragraph2) ? 32 : 16) | (x340Var.g(paragraph3) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).e.b, 0.0f, 2, qim0VarF);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = th01.h;
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0VarZ, (iu30) objT);
            fra fraVar = een.N0;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            b(paragraph, u291.v(nim0Var, 20.0f), x340Var, i2 & 14);
            qgo1.f(shy0.a(paragraph2, x340Var), new wnb0(1.0f, true), null, 0, false, null, x340Var, 8, 60);
            qgo1.f(shy0.a(paragraph3, x340Var), null, null, 0, false, null, x340Var, 8, 62);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ffx0(paragraph, paragraph2, paragraph3, i, (byte) 17);
        }
    }

    public static final void f(int i, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1561057674);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            qim0 qim0VarH = u291.h(u291.f(nim0.a, 1.0f), h(x340Var, i));
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = th01.i;
                x340Var.s0(objT);
            }
            op71.g(x340Var, s161.a(qim0VarH, (iu30) objT));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p4g0((byte) 12, i, i2);
        }
    }

    public static final void g(Paragraph paragraph, boolean z, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1750046246);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(paragraph) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            vnr0 vnr0VarA = shy0.a(paragraph, x340Var);
            qim0 qim0VarB = nim0.a;
            qim0 qim0VarF = u291.f(qim0VarB, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).e.b, 0.0f, 2, qim0VarF);
            if (z) {
                x340Var.i0(-1832728547);
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = th01.t;
                    x340Var.s0(objT);
                }
                qim0VarB = s161.b(qim0VarB, false, (iu30) objT);
            } else {
                x340Var.i0(-1832727634);
            }
            x340Var.r(false);
            qgo1.f(vnr0VarA, qim0VarZ.then(qim0VarB), null, 0, false, null, x340Var, 8, 60);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new se5(paragraph, z, i, (byte) 5);
        }
    }

    public static final float h(b0k b0kVar, int i) {
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(b0kVar).b;
        switch (i) {
            case 2:
                return 2.0f;
            case 4:
                return 4.0f;
            case 6:
                return 6.0f;
            case 8:
                return 8.0f;
            case grn1.d /* 12 */:
                return 12.0f;
            case 16:
                return 16.0f;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return cvxVar.a;
            case 24:
                return cvxVar.b;
            case 32:
                return cvxVar.c;
            case 40:
                return cvxVar.d;
            case 48:
                return cvxVar.e;
            case 64:
                return cvxVar.f;
            default:
                if (i < 0) {
                    i = 0;
                }
                return i;
        }
    }

    public static final String i(int i, String str) {
        int iP = yoi1.p(i, 0, str.length());
        if (iP == 0) {
            return "";
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance();
        lineInstance.setText(str);
        int iPreceding = lineInstance.preceding(iP);
        while (iPreceding > 0 && !eth.H(str.charAt(iPreceding - 1))) {
            Integer numValueOf = Integer.valueOf(UCharacter.getIntPropertyValue(str.codePointBefore(iPreceding), 4104));
            Set set = a;
            if (set.contains(numValueOf) || set.contains(Integer.valueOf(UCharacter.getIntPropertyValue(str.codePointAt(iPreceding), 4104)))) {
                break;
            }
            iPreceding = lineInstance.preceding(iPreceding);
        }
        if (iPreceding <= 0) {
            iPreceding = Character.offsetByCodePoints(str, iP, -1);
        }
        String strSubstring = str.substring(0, iPreceding);
        for (int iQ0 = ihc1.q0(strSubstring); -1 < iQ0; iQ0--) {
            char cCharAt = strSubstring.charAt(iQ0);
            if (!eth.H(cCharAt) && cCharAt != '.' && cCharAt != 12290) {
                return strSubstring.substring(0, iQ0 + 1);
            }
        }
        return "";
    }
}
