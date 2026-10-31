package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ftg0 {
    public static final List a;
    public static final mzr0 b;
    public static final se11 c;
    public static final cr31 d;
    public static final cr31 e;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List<nzr0> listM = p7h.M(new dz00[]{new pgc1((byte) 0), new pgc1((byte) 1), uf5.a});
        a = listM;
        mzr0 mzr0Var = new mzr0();
        for (nzr0 nzr0Var : listM) {
            if (nzr0Var instanceof nzr0) {
                nzr0Var.a(mzr0Var);
            }
        }
        b = new mzr0(mzr0Var);
        c = new se11("\\(\\[([^\\]]+)]\\(([^)]+)\\)\\)");
        d = er31.a(50);
        e = er31.a(50);
    }

    public static final void a(cdo0 cdo0Var, ctg0 ctg0Var, iu30 iu30Var, iu30 iu30Var2, lee1 lee1Var, int i, b0k b0kVar, int i2) {
        int i3;
        iu30 iu30Var3;
        lee1 lee1Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1235829744);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(cdo0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(ctg0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            iu30Var3 = iu30Var;
            i3 |= x340Var.i(iu30Var3) ? 256 : 128;
        } else {
            iu30Var3 = iu30Var;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(iu30Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.i(lee1Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.e(i) ? 131072 : 65536;
        }
        if (!x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            x340Var.b0();
        } else if (cdo0Var instanceof y360) {
            x340Var.i0(-144020788);
            int i4 = ((y360) cdo0Var).g;
            if (i4 == 1) {
                x340Var.i0(506442787);
                uwr uwrVar = cbx.a;
                lee1Var2 = cbx.d(x340Var).d;
                x340Var.r(false);
            } else if (i4 != 2) {
                x340Var.i0(506445350);
                uwr uwrVar2 = cbx.a;
                lee1Var2 = cbx.d(x340Var).h;
                x340Var.r(false);
            } else {
                x340Var.i0(506444034);
                uwr uwrVar3 = cbx.a;
                lee1Var2 = cbx.d(x340Var).e;
                x340Var.r(false);
            }
            h(cdo0Var, ctg0Var, iu30Var3, iu30Var2, lee1Var2, ctg0Var.a, x340Var, i3 & 8190);
            x340Var.r(false);
        } else if (cdo0Var instanceof oor0) {
            x340Var.i0(-143867958);
            h(cdo0Var, ctg0Var, iu30Var, iu30Var2, lee1Var, ctg0Var.b, x340Var, i3 & 65534);
            x340Var.r(false);
        } else if (cdo0Var instanceof hcc) {
            x340Var.i0(2073573427);
            int i5 = (i3 & 14) | 48;
            int i6 = i3 << 3;
            f(cdo0Var, false, ctg0Var, iu30Var, iu30Var2, lee1Var, i + 1, x340Var, i5 | (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752));
            x340Var.r(false);
        } else if (cdo0Var instanceof mqq0) {
            x340Var.i0(2073581618);
            int i7 = (i3 & 14) | 48;
            int i8 = i3 << 3;
            f(cdo0Var, true, ctg0Var, iu30Var, iu30Var2, lee1Var, i + 1, x340Var, i7 | (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752));
            x340Var.r(false);
        } else if (cdo0Var instanceof t6b) {
            x340Var.i0(2073589607);
            b(cdo0Var, ctg0Var, iu30Var, iu30Var2, lee1Var, i + 1, x340Var, i3 & 65534);
            x340Var = x340Var;
            x340Var.r(false);
        } else if (cdo0Var instanceof bkd1) {
            x340Var.i0(2073593066);
            g(cdo0Var, ctg0Var, iu30Var, iu30Var2, x340Var, i3 & 8190);
            x340Var.r(false);
        } else if (cdo0Var instanceof vy10) {
            x340Var.i0(2073595767);
            d(((vy10) cdo0Var).j, ctg0Var, x340Var, i3 & 112);
            x340Var.r(false);
        } else if (cdo0Var instanceof r980) {
            x340Var.i0(2073597943);
            d(((r980) cdo0Var).g, ctg0Var, x340Var, i3 & 112);
            x340Var.r(false);
        } else if (cdo0Var instanceof w070) {
            x340Var.i0(2073600110);
            uwo1.e(ihc1.g1(((w070) cdo0Var).g, new char[]{'\n'}), (qim0) null, lee1Var, ctg0Var.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i3 >> 6) & 896, 0, 2034);
            x340Var.r(false);
        } else if (cdo0Var instanceof ife1) {
            x340Var.i0(2073604262);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar4 = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, qim0VarF);
            avw0 avw0Var = cbx.b(x340Var).c;
            t1c.a(dug.f(u291.h(qim0VarZ, 1.0f), ctg0Var.e, d4o1.a), x340Var, 0);
            x340Var.r(false);
        } else if (cdo0Var instanceof lkc0) {
            x340Var.i0(-142506128);
            x340Var.r(false);
        } else {
            x340Var.i0(-142488086);
            h(cdo0Var, ctg0Var, iu30Var, iu30Var2, lee1Var, ctg0Var.b, x340Var, i3 & 65534);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dtg0(cdo0Var, ctg0Var, iu30Var, iu30Var2, lee1Var, i, i2, (byte) 0);
        }
    }

    public static final void b(cdo0 cdo0Var, ctg0 ctg0Var, iu30 iu30Var, iu30 iu30Var2, lee1 lee1Var, int i, b0k b0kVar, int i2) {
        int i3;
        iu30 iu30Var3;
        lee1 lee1Var2;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2143209612);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(cdo0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(ctg0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            iu30Var3 = iu30Var;
            i3 |= x340Var.i(iu30Var3) ? 256 : 128;
        } else {
            iu30Var3 = iu30Var;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(iu30Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            lee1Var2 = lee1Var;
            i3 |= x340Var.i(lee1Var2) ? 16384 : 8192;
        } else {
            lee1Var2 = lee1Var;
        }
        if ((196608 & i2) == 0) {
            i4 = i;
            i3 |= x340Var.e(i4) ? 131072 : 65536;
        } else {
            i4 = i;
        }
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            avw0 avw0Var = cbx.b(x340Var).c;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            qim0 qim0VarB = h2c.a.b(nim0Var);
            era eraVar = een.P0;
            int i5 = i3;
            t1c.a(dug.f(u291.v(u291.D(qim0VarB, eraVar, 2), 2.0f), ctg0Var.c, d), x340Var, 0);
            qim0 qim0VarB2 = uyn1.B(nim0Var, 14.0f, 0.0f, 0.0f, 0.0f, 14);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB2);
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
            c(cdo0Var, ctg0Var, iu30Var3, iu30Var2, lee1Var2, i4, x340Var, i5 & 524286);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dtg0(cdo0Var, ctg0Var, iu30Var, iu30Var2, lee1Var, i, i2, (byte) 1);
        }
    }

    public static final void c(cdo0 cdo0Var, ctg0 ctg0Var, iu30 iu30Var, iu30 iu30Var2, lee1 lee1Var, int i, b0k b0kVar, int i2) {
        int i3;
        ctg0 ctg0Var2;
        iu30 iu30Var3;
        iu30 iu30Var4;
        lee1 lee1Var2;
        b0k b0kVar2;
        cdo0 cdo0Var2;
        h311 h311VarV;
        dtg0 dtg0Var;
        b0k b0kVar3;
        cdo0 cdo0Var3;
        int i4;
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(1874345251);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar4.i(cdo0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            ctg0Var2 = ctg0Var;
            i3 |= b0kVar4.g(ctg0Var2) ? 32 : 16;
        } else {
            ctg0Var2 = ctg0Var;
        }
        if ((i2 & 384) == 0) {
            iu30Var3 = iu30Var;
            i3 |= b0kVar4.i(iu30Var3) ? 256 : 128;
        } else {
            iu30Var3 = iu30Var;
        }
        if ((i2 & 3072) == 0) {
            iu30Var4 = iu30Var2;
            i3 |= b0kVar4.i(iu30Var4) ? 2048 : 1024;
        } else {
            iu30Var4 = iu30Var2;
        }
        if ((i2 & 24576) == 0) {
            lee1Var2 = lee1Var;
            i3 |= b0kVar4.i(lee1Var2) ? 16384 : 8192;
        } else {
            lee1Var2 = lee1Var;
        }
        if ((196608 & i2) == 0) {
            i3 |= b0kVar4.e(i) ? 131072 : 65536;
        }
        int i5 = i3;
        if (b0kVar4.Y(i5 & 1, (74899 & i5) != 74898)) {
            if (i > 32) {
                h311VarV = b0kVar4.v();
                if (h311VarV == null) {
                    return;
                } else {
                    dtg0Var = new dtg0(cdo0Var, ctg0Var2, iu30Var3, iu30Var4, lee1Var2, i, i2, (byte) 2);
                }
            } else {
                cdo0Var2 = cdo0Var;
                cdo0 cdo0Var4 = cdo0Var2.b;
                cdo0 cdo0Var5 = null;
                while (cdo0Var4 != null) {
                    if (cdo0Var4 instanceof lkc0) {
                        b0kVar3 = b0kVar4;
                        cdo0Var3 = cdo0Var4;
                        b0kVar3.i0(-249820769);
                        b0kVar3.r(false);
                    } else {
                        b0kVar4.i0(-250073512);
                        if (cdo0Var5 == null) {
                            b0kVar4.i0(-250052340);
                            b0kVar4.r(false);
                        } else {
                            b0kVar4.i0(-250052339);
                            float f = 0.0f;
                            if ((cdo0Var5 instanceof ife1) || (cdo0Var4 instanceof ife1)) {
                                b0kVar4.i0(-962830257);
                                b0kVar4.r(false);
                            } else if (!(cdo0Var4 instanceof y360) || 1 > (i4 = ((y360) cdo0Var4).g) || i4 >= 4) {
                                boolean z = cdo0Var5 instanceof y360;
                                if (z && ((y360) cdo0Var5).g == 1) {
                                    b0kVar4.i0(-962824939);
                                    uwr uwrVar = cbx.a;
                                    cvx cvxVar = cbx.b(b0kVar4).b;
                                    b0kVar4.r(false);
                                    f = 6.0f;
                                } else if (z && ((y360) cdo0Var5).g == 2) {
                                    b0kVar4.i0(-962822187);
                                    uwr uwrVar2 = cbx.a;
                                    cvx cvxVar2 = cbx.b(b0kVar4).b;
                                    b0kVar4.r(false);
                                    f = 4.0f;
                                } else if (z) {
                                    b0kVar4.i0(-962820977);
                                    b0kVar4.r(false);
                                } else if (i == 0) {
                                    b0kVar4.i0(-962819439);
                                    uwr uwrVar3 = cbx.a;
                                    cvx cvxVar3 = cbx.b(b0kVar4).b;
                                    b0kVar4.r(false);
                                    f = 16.0f;
                                } else {
                                    b0kVar4.i0(-962818027);
                                    uwr uwrVar4 = cbx.a;
                                    cvx cvxVar4 = cbx.b(b0kVar4).b;
                                    b0kVar4.r(false);
                                    f = 8.0f;
                                }
                            } else {
                                b0kVar4.i0(-962827660);
                                uwr uwrVar5 = cbx.a;
                                f = cbx.b(b0kVar4).b.c;
                                b0kVar4.r(false);
                            }
                            x0d.s(nim0.a, f, b0kVar4, false);
                        }
                        b0kVar3 = b0kVar4;
                        cdo0Var3 = cdo0Var4;
                        a(cdo0Var3, ctg0Var, iu30Var, iu30Var2, lee1Var, i, b0kVar3, i5 & 524272);
                        b0kVar3.r(false);
                        cdo0Var5 = cdo0Var3;
                    }
                    cdo0Var4 = cdo0Var3.e;
                    b0kVar4 = b0kVar3;
                }
                b0kVar2 = b0kVar4;
            }
            h311VarV.d = dtg0Var;
        }
        b0kVar2 = b0kVar4;
        cdo0Var2 = cdo0Var;
        b0kVar2.b0();
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            dtg0Var = new dtg0(cdo0Var2, ctg0Var, iu30Var, iu30Var2, lee1Var, i, i2, (byte) 3);
            h311VarV.d = dtg0Var;
        }
    }

    public static final void d(String str, ctg0 ctg0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(364750655);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(ctg0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarX = uyn1.x(dug.f(u291.f(nim0.a, 1.0f), ctg0Var.c, er31.b(6.0f)), 16.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(ihc1.g1(str, new char[]{'\n'}), (qim0) null, cbx.d(x340Var).i, ctg0Var.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(str, ctg0Var, i, (byte) 7);
        }
    }

    public static final void e(String str, qim0 qim0Var, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        iu30 iu30Var3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-142517110);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(iu30Var2) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                String strG = c.g("[$1]($2)", str);
                mzr0 mzr0Var = b;
                mzr0Var.getClass();
                cqu cquVar = new cqu((ArrayList) mzr0Var.a, (qpp0) mzr0Var.g, (ArrayList) mzr0Var.b, (ArrayList) mzr0Var.c, (ArrayList) mzr0Var.d, (HashSet) mzr0Var.e);
                int i4 = 0;
                while (true) {
                    int length = strG.length();
                    int i5 = i4;
                    while (true) {
                        if (i5 >= length) {
                            i5 = -1;
                            break;
                        }
                        char cCharAt = strG.charAt(i5);
                        if (cCharAt == '\n' || cCharAt == '\r') {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (i5 == -1) {
                        break;
                    }
                    cquVar.h(i4, strG.substring(i4, i5));
                    i4 = i5 + 1;
                    if (i4 < strG.length() && strG.charAt(i5) == '\r' && strG.charAt(i4) == '\n') {
                        i4 = i5 + 2;
                    }
                }
                if (!strG.isEmpty() && (i4 == 0 || i4 < strG.length())) {
                    cquVar.h(i4, strG.substring(i4));
                }
                cquVar.e(cquVar.t.size());
                wp20 wp20Var = new wp20(cquVar.l, cquVar.m, cquVar.n, cquVar.o, cquVar.s);
                cquVar.k.getClass();
                ug80 ug80Var = new ug80(wp20Var);
                Iterator it = cquVar.u.iterator();
                while (it.hasNext()) {
                    ((s5) it.next()).i(ug80Var);
                }
                xpu xpuVar = (xpu) cquVar.r.b;
                Iterator it2 = ((ArrayList) mzr0Var.f).iterator();
                if (it2.hasNext()) {
                    throw pze0.g(it2);
                }
                x340Var.s0(xpuVar);
                objT = xpuVar;
            }
            cdo0 cdo0Var = (cdo0) objT;
            f65 f65Var = (f65) x340Var.k(t4k.s);
            if (iu30Var == null) {
                x340Var.i0(1995802310);
                boolean zI = x340Var.i(f65Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new j03(f65Var, (byte) 5);
                    x340Var.s0(objT2);
                }
                x340Var.r(false);
                iu30Var3 = (iu30) objT2;
            } else {
                x340Var.i0(480022189);
                x340Var.r(false);
                iu30Var3 = iu30Var;
            }
            uwr uwrVar = cbx.a;
            ctg0 ctg0Var = new ctg0(cbx.a(x340Var).b.a, cbx.a(x340Var).b.b, cbx.a(x340Var).a.b.a(), cbx.a(x340Var).c.b, cbx.a(x340Var).d.b);
            lee1 lee1Var = cbx.d(x340Var).g;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            cdo0Var.getClass();
            c(cdo0Var, ctg0Var, iu30Var3, iu30Var2, lee1Var, 0, x340Var, (i3 & 7168) | 196608);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, str, qim0Var2, iu30Var, iu30Var2, (byte) 29);
        }
    }

    public static final void f(cdo0 cdo0Var, boolean z, ctg0 ctg0Var, iu30 iu30Var, iu30 iu30Var2, lee1 lee1Var, int i, b0k b0kVar, int i2) {
        int i3;
        cdo0 cdo0Var2;
        Function0 function0;
        String str;
        Function0 function1;
        Integer num;
        ctg0 ctg0Var2 = ctg0Var;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        era eraVar = een.P0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1231556449);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(cdo0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.g(ctg0Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.i(iu30Var2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.i(lee1Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= x340Var.e(i) ? 1048576 : 524288;
        }
        int i4 = i3;
        if (x340Var.Y(i4 & 1, (i4 & 599187) != 599186)) {
            mqq0 mqq0Var = cdo0Var instanceof mqq0 ? (mqq0) cdo0Var : null;
            int iIntValue = (mqq0Var == null || (num = mqq0Var.h) == null) ? 1 : num.intValue();
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.b;
            cvx cvxVar = cbx.b(x340Var).b;
            int i5 = iIntValue;
            mbh mbhVarA = jbh.a(new d36(12.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            cdo0 cdo0Var3 = cdo0Var.b;
            x340Var.i0(-486489246);
            int i6 = i5;
            while (cdo0Var3 != null) {
                if (cdo0Var3 instanceof bvc0) {
                    x340Var.i0(2098750672);
                    cdo0 cdo0Var4 = cdo0Var3;
                    jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0Var);
                    hzj.A.getClass();
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(function2);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(jw31VarA, x340Var, lljVar4);
                    nko1.H(xos0VarM2, x340Var, lljVar3);
                    x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar);
                    if (z) {
                        str = i6 + ".";
                    } else {
                        str = "•";
                    }
                    uwo1.e(str, u291.x(f, 0.0f, 2, qim0Var), lee1Var, ctg0Var2.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i4 >> 9) & 896, 0, 2032);
                    wnb0 wnb0Var = new wnb0(1.0f, true);
                    mbh mbhVarA2 = jbh.a(h36.c, eraVar, x340Var, 0);
                    Function0 function3 = function2;
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, wnb0Var);
                    x340Var.m0();
                    if (x340Var.S) {
                        function1 = function3;
                        x340Var.l(function1);
                    } else {
                        function1 = function3;
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA2, x340Var, lljVar4);
                    nko1.H(xos0VarM3, x340Var, lljVar3);
                    x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar);
                    ctg0 ctg0Var3 = ctg0Var2;
                    function0 = function1;
                    cdo0Var2 = cdo0Var4;
                    c(cdo0Var2, ctg0Var3, iu30Var, iu30Var2, lee1Var, i, x340Var, (i4 >> 3) & 524272);
                    x340Var.r(true);
                    x340Var.r(true);
                    i6++;
                    x340Var.r(false);
                } else {
                    cdo0Var2 = cdo0Var3;
                    function0 = function2;
                    x340Var.i0(2099189849);
                    x340Var.r(false);
                }
                f = f;
                qim0Var = qim0Var;
                cdo0Var3 = cdo0Var2.e;
                function2 = function0;
                ctg0Var2 = ctg0Var;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c0e(cdo0Var, z, ctg0Var, iu30Var, iu30Var2, lee1Var, i, i2);
        }
    }

    public static final void g(cdo0 cdo0Var, ctg0 ctg0Var, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) {
        int i2;
        vu30 vu30Var;
        boolean z;
        int i3;
        qim0 qim0Var;
        Function0 function0;
        b0k b0kVar2;
        cdo0 cdo0Var2;
        boolean z2;
        boolean z3;
        b0k b0kVar3;
        cdo0 cdo0Var3;
        cdo0 cdo0Var4;
        boolean z4;
        lee1 lee1Var;
        ctg0 ctg0Var2 = ctg0Var;
        vu30 vu30Var2 = y580.Y;
        llj lljVar = y580.R0;
        llj lljVar2 = y580.N0;
        llj lljVar3 = y580.O0;
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(1914359094);
        j06 j06Var = ((x340) b0kVar4).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar4.i(cdo0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar4.g(ctg0Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar4.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar4.i(iu30Var2) ? 2048 : 1024;
        }
        if (b0kVar4.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar4).b;
            cua cuaVar = cbx.b(b0kVar4).f;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarX = uyn1.x(dug.f(u291.f(qim0Var2, 1.0f), ctg0Var2.c, er31.b(6.0f)), 12.0f);
            b0k b0kVar5 = b0kVar4;
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar5, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar5).T);
            xos0 xos0VarM = b0kVar5.m();
            qim0 qim0VarE = zr7.E(b0kVar5, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar5.m0();
            boolean z5 = ((x340) b0kVar5).S;
            Function0 function1 = hmb0.t1;
            if (z5) {
                b0kVar5.l(function1);
            } else {
                b0kVar5.v0();
            }
            nko1.H(mbhVarA, b0kVar5, lljVar3);
            nko1.H(xos0VarM, b0kVar5, lljVar2);
            nko1.H(Integer.valueOf(iHashCode), b0kVar5, lljVar);
            nko1.F(b0kVar5);
            nko1.H(qim0VarE, b0kVar5, vu30Var2);
            cdo0 cdo0Var5 = cdo0Var.b;
            b0kVar5.i0(513184692);
            while (cdo0Var5 != null) {
                boolean z6 = cdo0Var5 instanceof lkd1;
                cdo0 cdo0Var6 = cdo0Var5.b;
                b0kVar5.i0(513188036);
                while (cdo0Var6 != null) {
                    if (cdo0Var6 instanceof qkd1) {
                        b0kVar5.i0(-1270992016);
                        qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
                        jw31 jw31VarA = ew31.a(h36.a, een.Z, b0kVar5, 0);
                        int iHashCode2 = Long.hashCode(((x340) b0kVar5).T);
                        xos0 xos0VarM2 = b0kVar5.m();
                        qim0 qim0VarE2 = zr7.E(b0kVar5, qim0VarF);
                        hzj.A.getClass();
                        b0kVar5.m0();
                        if (((x340) b0kVar5).S) {
                            b0kVar5.l(function1);
                        } else {
                            b0kVar5.v0();
                        }
                        nko1.H(jw31VarA, b0kVar5, lljVar3);
                        nko1.H(xos0VarM2, b0kVar5, lljVar2);
                        nko1.H(Integer.valueOf(iHashCode2), b0kVar5, lljVar);
                        nko1.F(b0kVar5);
                        nko1.H(qim0VarE2, b0kVar5, vu30Var2);
                        cdo0 cdo0Var7 = ((qkd1) cdo0Var6).b;
                        b0kVar5.i0(662489628);
                        while (cdo0Var7 != null) {
                            if (cdo0Var7 instanceof fkd1) {
                                b0kVar5.i0(-937601745);
                                if (z6) {
                                    b0kVar5.i0(662493500);
                                    uwr uwrVar2 = cbx.a;
                                    lee1Var = cbx.d(b0kVar5).k;
                                    z4 = false;
                                } else {
                                    z4 = false;
                                    b0kVar5.i0(662494680);
                                    uwr uwrVar3 = cbx.a;
                                    lee1Var = cbx.d(b0kVar5).j;
                                }
                                b0kVar5.r(z4);
                                qim0 qim0VarY = uyn1.y(new wnb0(1.0f, true), 8.0f, 4.0f);
                                gfh0 gfh0VarC = t1c.c(een.d, false);
                                cdo0 cdo0Var8 = cdo0Var6;
                                lee1 lee1Var2 = lee1Var;
                                int iHashCode3 = Long.hashCode(((x340) b0kVar5).T);
                                xos0 xos0VarM3 = b0kVar5.m();
                                qim0 qim0VarE3 = zr7.E(b0kVar5, qim0VarY);
                                hzj.A.getClass();
                                b0kVar5.m0();
                                cdo0 cdo0Var9 = cdo0Var7;
                                if (((x340) b0kVar5).S) {
                                    b0kVar5.l(function1);
                                } else {
                                    b0kVar5.v0();
                                }
                                nko1.H(gfh0VarC, b0kVar5, lljVar3);
                                nko1.H(xos0VarM3, b0kVar5, lljVar2);
                                nko1.H(Integer.valueOf(iHashCode3), b0kVar5, lljVar);
                                nko1.F(b0kVar5);
                                nko1.H(qim0VarE3, b0kVar5, vu30Var2);
                                long j = z6 ? ctg0Var2.a : ctg0Var2.b;
                                b0kVar3 = b0kVar5;
                                cdo0Var4 = cdo0Var8;
                                boolean z7 = z6;
                                ctg0 ctg0Var3 = ctg0Var2;
                                z3 = z7;
                                h(cdo0Var9, ctg0Var3, iu30Var, iu30Var2, lee1Var2, j, b0kVar3, i2 & 8176);
                                cdo0Var3 = cdo0Var9;
                                ctg0Var2 = ctg0Var3;
                                b0kVar3.r(true);
                                b0kVar3.r(false);
                            } else {
                                z3 = z6;
                                b0kVar3 = b0kVar5;
                                cdo0Var3 = cdo0Var7;
                                cdo0Var4 = cdo0Var6;
                                b0kVar3.i0(-936982861);
                                b0kVar3.r(false);
                            }
                            qim0Var2 = qim0Var2;
                            cdo0Var7 = cdo0Var3.e;
                            cdo0Var6 = cdo0Var4;
                            vu30Var2 = vu30Var2;
                            i2 = i2;
                            function1 = function1;
                            z6 = z3;
                            b0kVar5 = b0kVar3;
                        }
                        vu30Var = vu30Var2;
                        z = z6;
                        i3 = i2;
                        qim0Var = qim0Var2;
                        function0 = function1;
                        b0kVar2 = b0kVar5;
                        cdo0Var2 = cdo0Var6;
                        b0kVar2.r(false);
                        b0kVar2.r(true);
                        if (z) {
                            b0kVar2.i0(-1270137036);
                            qim0 qim0VarF2 = u291.f(qim0Var, 1.0f);
                            uwr uwrVar4 = cbx.a;
                            avw0 avw0Var = cbx.b(b0kVar2).c;
                            z2 = false;
                            t1c.a(dug.f(uyn1.z(8.0f, 0.0f, 2, u291.h(qim0VarF2, 1.0f)), ctg0Var2.d, d4o1.a), b0kVar2, 0);
                            b0kVar2.r(false);
                        } else {
                            z2 = false;
                            b0kVar2.i0(-1269858346);
                            b0kVar2.r(false);
                        }
                        b0kVar2.r(z2);
                    } else {
                        vu30Var = vu30Var2;
                        z = z6;
                        i3 = i2;
                        qim0Var = qim0Var2;
                        function0 = function1;
                        b0kVar2 = b0kVar5;
                        cdo0Var2 = cdo0Var6;
                        b0kVar2.i0(-1269848426);
                        b0kVar2.r(false);
                    }
                    cdo0Var6 = cdo0Var2.e;
                    qim0Var2 = qim0Var;
                    z6 = z;
                    b0kVar5 = b0kVar2;
                    cdo0Var5 = cdo0Var5;
                    vu30Var2 = vu30Var;
                    i2 = i3;
                    function1 = function0;
                }
                b0kVar5.r(false);
                qim0Var2 = qim0Var2;
                cdo0Var5 = cdo0Var5.e;
                vu30Var2 = vu30Var2;
            }
            b0kVar4 = b0kVar5;
            b0kVar4.r(false);
            b0kVar4.r(true);
        } else {
            b0kVar4.b0();
        }
        h311 h311VarV = b0kVar4.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(i, cdo0Var, ctg0Var2, iu30Var, iu30Var2, (byte) 0);
        }
    }

    public static final void h(cdo0 cdo0Var, ctg0 ctg0Var, iu30 iu30Var, iu30 iu30Var2, lee1 lee1Var, long j, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1571667646);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(cdo0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(ctg0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(lee1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.f(j) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            o0g1 o0g1Var = new o0g1(ctg0Var, iu30Var, iu30Var2);
            ye5 ye5Var = new ye5();
            j(ye5Var, cdo0Var, o0g1Var);
            af5 af5VarP = ye5Var.p();
            boolean z = cdo0Var instanceof jf5;
            qim0 qim0VarD = nim0.a;
            if (z) {
                x340Var.i0(-1455862770);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarB = uyn1.B(qim0VarD, 12.0f, 0.0f, 0.0f, 12.0f, 6);
                cvx cvxVar3 = cbx.b(x340Var).b;
                qim0VarD = eqr0.D(0.0f, -4.0f, 1, qim0VarB);
                x340Var.r(false);
            } else {
                x340Var.i0(-1455860890);
                x340Var.r(false);
            }
            qim0 qim0Var = qim0VarD;
            boolean zI = x340Var.i(o0g1Var) | x340Var.i(af5VarP) | ((i2 & 458752) == 131072) | x340Var.i(lee1Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                cg6 cg6Var = new cg6(o0g1Var, af5VarP, j, lee1Var);
                x340Var.s0(cg6Var);
                objT = cg6Var;
            }
            ejo1.l(0, 0, x340Var, (vu30) objT, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo1(cdo0Var, ctg0Var, iu30Var, iu30Var2, lee1Var, j, i);
        }
    }

    public static final void i(String str, ctg0 ctg0Var, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1571103529);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(ctg0Var) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            ogx ogxVar = ogx.e;
            zzq0 zzq0Var = new zzq0(4.0f, 2.0f, 4.0f, 2.0f);
            boolean z = (i2 & 896) == 256;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new tze0(function0, (byte) 15);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            cwl1.b((qim0) null, (tl3) null, e, ogxVar, zzq0Var, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT), (gbx) null, apo.r(-216256256, new x9g0(ctg0Var, cvxVar, str), b0kVar3), b0kVar2, 0, 48, 1507);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qae0(str, ctg0Var, function0, i, (byte) 28);
        }
    }

    public static final void j(ye5 ye5Var, cdo0 cdo0Var, o0g1 o0g1Var) {
        qjc0 qjc0Var;
        ctg0 ctg0Var = (ctg0) o0g1Var.c;
        for (cdo0 cdo0Var2 = cdo0Var.b; cdo0Var2 != null; cdo0Var2 = cdo0Var2.e) {
            if (cdo0Var2 instanceof xzd1) {
                ye5Var.g(((xzd1) cdo0Var2).g);
            } else if (cdo0Var2 instanceof rhc1) {
                int iO = ye5Var.o(new zma1(ctg0Var.a, 0L, FontWeight.Z, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65530));
                try {
                    j(ye5Var, cdo0Var2, o0g1Var);
                    ye5Var.k(iO);
                } catch (Throwable th) {
                    ye5Var.k(iO);
                    throw th;
                }
            } else if (cdo0Var2 instanceof q5x) {
                int iO2 = ye5Var.o(new zma1(0L, 0L, (FontWeight) null, new FontStyle(1), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65527));
                try {
                    j(ye5Var, cdo0Var2, o0g1Var);
                    ye5Var.k(iO2);
                } catch (Throwable th2) {
                    ye5Var.k(iO2);
                    throw th2;
                }
            } else if (cdo0Var2 instanceof cwg) {
                int iO3 = ye5Var.o(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily.d, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, ctg0Var.c, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 63455));
                try {
                    ye5Var.g(((cwg) cdo0Var2).g);
                    ye5Var.k(iO3);
                } catch (Throwable th3) {
                    ye5Var.k(iO3);
                    throw th3;
                }
            } else if (cdo0Var2 instanceof ngc1) {
                int iO4 = ye5Var.o(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.d, (Shadow) null, (PlatformSpanStyle) null, 61439));
                try {
                    j(ye5Var, cdo0Var2, o0g1Var);
                    ye5Var.k(iO4);
                } catch (Throwable th4) {
                    ye5Var.k(iO4);
                    throw th4;
                }
            } else if (cdo0Var2 instanceof ijc0) {
                String strK = k(cdo0Var2);
                if (strK.length() != 0) {
                    iu30 iu30Var = (iu30) o0g1Var.e;
                    if (iu30Var == null || (qjc0Var = (qjc0) iu30Var.invoke(((ijc0) cdo0Var2).g)) == null) {
                        qjc0Var = qjc0.a;
                    }
                    int iOrdinal = qjc0Var.ordinal();
                    if (iOrdinal == 0) {
                        int i = o0g1Var.b;
                        o0g1Var.b = i + 1;
                        String strC = f4i1.c(i, "source_chip_");
                        ((LinkedHashMap) o0g1Var.f).put(strC, new j2i(-1990129963, new qae0(strK, o0g1Var, ((ijc0) cdo0Var2).g, (byte) 29), true));
                        z6p1.r(ye5Var, strC, strK);
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return;
                        }
                        vhg.c(ye5Var, strK, ((ijc0) cdo0Var2).g, new zma1(ctg0Var.a, 0L, FontWeight.Z, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65530), (iu30) o0g1Var.d);
                    }
                } else {
                    continue;
                }
            } else if (cdo0Var2 instanceof c170) {
                String str = ((c170) cdo0Var2).g;
                if (nhc1.S(str, "<br>", true) || nhc1.S(str, "<br/>", true) || nhc1.S(str, "<br />", true)) {
                    ye5Var.g("\n");
                }
            } else if (cdo0Var2 instanceof eq70) {
                ye5Var.g(k(cdo0Var2));
            } else if (cdo0Var2 instanceof j6a1) {
                ye5Var.g(" ");
            } else if (cdo0Var2 instanceof bt50) {
                ye5Var.g("\n");
            } else {
                j(ye5Var, cdo0Var2, o0g1Var);
            }
        }
    }

    public static final String k(cdo0 cdo0Var) {
        StringBuilder sb = new StringBuilder();
        for (cdo0 cdo0Var2 = cdo0Var.b; cdo0Var2 != null; cdo0Var2 = cdo0Var2.e) {
            if (cdo0Var2 instanceof xzd1) {
                sb.append(((xzd1) cdo0Var2).g);
            } else if (cdo0Var2 instanceof cwg) {
                sb.append(((cwg) cdo0Var2).g);
            } else {
                sb.append(k(cdo0Var2));
            }
        }
        return sb.toString();
    }
}
