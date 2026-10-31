package p;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.text.util.Linkify;
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
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class wxo1 {
    public static b180 a;
    public static b180 b;

    public static final void a(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(215293384);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).e;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var3);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = h3.a1;
                x340Var.s0(objT);
            }
            uwo1.e(str, anm1.N("account-details-section-header", s161.b(qim0VarZ, false, (iu30) objT)), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2032);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var2, i, (byte) 1);
        }
    }

    public static final void b(i2c i2cVar, String str, w61 w61Var, float f, vu30 vu30Var, Function0 function0, boolean z, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        w61 w61Var2;
        vu30 vu30Var2;
        Function0 function1;
        qim0 qim0VarB;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-396948960);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(i2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            w61Var2 = w61Var;
            i2 |= x340Var.g(w61Var2) ? 256 : 128;
        } else {
            w61Var2 = w61Var;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            vu30Var2 = vu30Var;
            i2 |= x340Var.i(vu30Var2) ? 16384 : 8192;
        } else {
            vu30Var2 = vu30Var;
        }
        if ((196608 & i) == 0) {
            function1 = function0;
            i2 |= x340Var.i(function1) ? 131072 : 65536;
        } else {
            function1 = function0;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.h(z) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.i(j2iVar) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarA = i2cVar.a(u291.c(u291.f(nim0Var, 1.0f), 0.75f), een.h);
            if (ihc1.y0(str)) {
                x340Var.i0(-1460812774);
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = oc8.X;
                    x340Var.s0(objT);
                }
                qim0VarB = s161.b(nim0Var, true, (iu30) objT);
                x340Var.r(false);
            } else {
                x340Var.i0(-1461009314);
                boolean z2 = (i3 & 112) == 32;
                Object objT2 = x340Var.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new wk3(str, (byte) 22);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarA2 = s161.a(nim0Var, (iu30) objT2);
                x340Var.r(false);
                qim0VarB = qim0VarA2;
            }
            qim0 qim0VarThen = qim0VarA.then(qim0VarB);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 54);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarThen);
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
            j2i j2iVarR = apo.r(-394643358, new ne8(vu30Var2, w61Var2, function1, z, f, (byte) 1), x340Var);
            pbh pbhVar = pbh.a;
            if (z) {
                x340Var.i0(143766218);
                j2iVarR.invoke(pbhVar, x340Var, 54);
                j2iVar.invoke(pbhVar, x340Var, Integer.valueOf(((i3 >> 18) & 112) | 6));
                x340Var.r(false);
            } else {
                x340Var.i0(143817802);
                j2iVar.invoke(pbhVar, x340Var, Integer.valueOf(6 | ((i3 >> 18) & 112)));
                j2iVarR.invoke(pbhVar, x340Var, 54);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j27(i2cVar, str, w61Var, f, vu30Var, function0, z, j2iVar, i);
        }
    }

    public static final void c(i2c i2cVar, float f, w61 w61Var, String str, vu30 vu30Var, Function0 function0, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1870991197);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(i2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.e(l1d.C(1)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(w61Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.g(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(vu30Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.i(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= b0kVar3.i(j2iVar) ? 8388608 : 4194304;
        }
        if (b0kVar3.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            int i3 = i2 >> 3;
            b0kVar2 = b0kVar3;
            b(i2cVar, str, w61Var, f, vu30Var, function0, true, j2iVar, b0kVar2, (i2 & 14) | ((i2 >> 9) & 112) | (i3 & 896) | ((i2 << 3) & 7168) | (57344 & i3) | (i3 & 458752) | (i2 & 29360128));
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oe8(i2cVar, f, w61Var, str, vu30Var, function0, j2iVar, i);
        }
    }

    public static final void d(o220 o220Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(668886235);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(o220Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            boolean z2 = o220Var.d;
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z3 = (i3 == 32) | (i4 == 4);
            Object objT = x340Var.T();
            byte b2 = 9;
            if (z3 || objT == m4cVar) {
                objT = new w9f(iu30Var, o220Var, b2);
                x340Var.s0(objT);
            }
            aex.b(z2, (iu30) objT, null, null, 0, null, null, x340Var, 0, 124);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            op71.g(x340Var, u291.v(nim0Var, 12.0f));
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT2;
            boolean z4 = (i4 == 4) | (i3 == 32);
            Object objT3 = x340Var.T();
            if (z4 || objT3 == m4cVar) {
                objT3 = new ame(iu30Var, o220Var, (byte) 9);
                x340Var.s0(objT3);
            }
            qim0 qim0VarV = bin.v(nim0Var, idn0Var, null, false, null, null, (Function0) objT3, 28);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarV);
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
            uwo1.e(o220Var.b, null, cbx.d(x340Var).j, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            x340Var = x340Var;
            if (o220Var.c != null) {
                x340Var.i0(-1663577405);
                cvx cvxVar2 = cbx.b(x340Var).b;
                uwo1.e(o220Var.c, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(-1663344595);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swc(o220Var, iu30Var, qim0Var, i, (byte) 15);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:101:0x0220  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:76:0x0120  */
    /* JADX WARN: Code duplicated, block: B:78:0x0127  */
    /* JADX WARN: Code duplicated, block: B:79:0x0166  */
    /* JADX WARN: Code duplicated, block: B:81:0x016a  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:84:0x01af  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:96:0x020e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0216  */
    public static final void e(rb71 rb71Var, long j, Function0 function0, boolean z, qim0 qim0Var, gm31 gm31Var, j2i j2iVar, b0k b0kVar, int i, int i2) throws NoWhenBranchMatchedException {
        int i3;
        gm31 gm31Var2;
        boolean z2;
        gm31 gm31Var3;
        h311 h311VarV;
        u7h u7hVar;
        mb71 mb71Var;
        gm31 gm31Var4;
        String str;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1834479515);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var.g(rb71Var) : x340Var.i(rb71Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var.g(qim0Var) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 == 0) {
            if ((196608 & i) == 0) {
                gm31Var2 = gm31Var;
                i3 |= x340Var.i(gm31Var2) ? 131072 : 65536;
            }
            if ((i & 1572864) == 0) {
                if (x340Var.i(j2iVar)) {
                    i4 = 1048576;
                } else {
                    i4 = 524288;
                }
                i3 |= i4;
            }
            if ((599187 & i3) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i3 & 1, z2)) {
                u7hVar = null;
                if (i5 != 0) {
                    gm31Var2 = null;
                }
                mb71Var = rb71Var.b;
                if (mb71Var instanceof mb71) {
                    x340Var.i0(1815731698);
                    mb71 mb71Var2 = mb71Var;
                    long jE = z4p1.e(Color.parseColor(mb71Var2.a));
                    str = mb71Var2.b;
                    if (str != null) {
                        u7hVar = new u7h(z4p1.e(Color.parseColor(str)));
                    }
                    i3o1.a(jE, j, qim0Var, u7hVar, rb71Var.a, z, apo.r(-565625973, new rv71(j2iVar, (byte) 9), x340Var), x340Var, (i3 & 112) | 1572864 | ((i3 >> 6) & 896) | ((i3 << 6) & 458752), 0);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else if (mb71Var instanceof nb71) {
                    x340Var.i0(1816176145);
                    h4o1.a(((nb71) mb71Var).a, j, function0, qim0Var, rb71Var.a, z, apo.r(1160003068, new rv71(j2iVar, (byte) 10), x340Var), x340Var, (i3 & 112) | 1572864 | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 6) & 458752));
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    if (mb71Var instanceof pb71) {
                        x340Var.i0(1816523345);
                        a6o1.a(((pb71) mb71Var).a, j, function0, qim0Var, rb71Var.a, z, apo.r(1620245947, new rv71(j2iVar, (byte) 11), x340Var), x340Var, (i3 & 112) | 1572864 | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 6) & 458752));
                        x340Var = x340Var;
                        x340Var.r(false);
                    } else {
                        if (mb71Var instanceof ob71) {
                            throw p3d1.k(x340Var, 1998233424, false);
                        }
                        x340Var.i0(1816866298);
                        em31 em31Var = (em31) x340Var.k(fm31.a);
                        if (gm31Var2 != null || em31Var == null) {
                            gm31Var4 = gm31Var2;
                            x340Var.i0(1817241863);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(1816985276);
                            boolean zI = x340Var.i(em31Var) | x340Var.i(mb71Var);
                            Object objT = x340Var.T();
                            if (zI || objT == fkj0.X) {
                                objT = new fpo(em31Var, mb71Var, (lnm) null, (byte) 0);
                                x340Var.s0(objT);
                            }
                            gm31Var4 = gm31Var2;
                            o4o1.a((iu30) objT, gm31Var4, j, qim0Var, x340Var, ((i3 >> 12) & 112) | ((i3 << 3) & 896) | ((i3 >> 3) & 7168));
                            x340Var.r(false);
                        }
                        x340Var.r(false);
                    }
                    gm31Var3 = gm31Var4;
                }
                gm31Var4 = gm31Var2;
                gm31Var3 = gm31Var4;
            } else {
                x340Var.b0();
                gm31Var3 = gm31Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new gpo(rb71Var, j, function0, z, qim0Var, gm31Var3, j2iVar, i, i2);
            }
        }
        i3 |= 196608;
        gm31Var2 = gm31Var;
        if ((i & 1572864) == 0) {
            if (x340Var.i(j2iVar)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        if ((599187 & i3) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i3 & 1, z2)) {
            u7hVar = null;
            if (i5 != 0) {
                gm31Var2 = null;
            }
            mb71Var = rb71Var.b;
            if (mb71Var instanceof mb71) {
                x340Var.i0(1815731698);
                mb71 mb71Var3 = mb71Var;
                long jE2 = z4p1.e(Color.parseColor(mb71Var3.a));
                str = mb71Var3.b;
                if (str != null) {
                    u7hVar = new u7h(z4p1.e(Color.parseColor(str)));
                }
                i3o1.a(jE2, j, qim0Var, u7hVar, rb71Var.a, z, apo.r(-565625973, new rv71(j2iVar, (byte) 9), x340Var), x340Var, (i3 & 112) | 1572864 | ((i3 >> 6) & 896) | ((i3 << 6) & 458752), 0);
                x340Var = x340Var;
                x340Var.r(false);
            } else if (mb71Var instanceof nb71) {
                x340Var.i0(1816176145);
                h4o1.a(((nb71) mb71Var).a, j, function0, qim0Var, rb71Var.a, z, apo.r(1160003068, new rv71(j2iVar, (byte) 10), x340Var), x340Var, (i3 & 112) | 1572864 | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 6) & 458752));
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                if (mb71Var instanceof pb71) {
                    x340Var.i0(1816523345);
                    a6o1.a(((pb71) mb71Var).a, j, function0, qim0Var, rb71Var.a, z, apo.r(1620245947, new rv71(j2iVar, (byte) 11), x340Var), x340Var, (i3 & 112) | 1572864 | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 6) & 458752));
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    if (mb71Var instanceof ob71) {
                        throw p3d1.k(x340Var, 1998233424, false);
                    }
                    x340Var.i0(1816866298);
                    em31 em31Var2 = (em31) x340Var.k(fm31.a);
                    if (gm31Var2 != null) {
                        gm31Var4 = gm31Var2;
                        x340Var.i0(1817241863);
                        x340Var.r(false);
                    } else {
                        gm31Var4 = gm31Var2;
                        x340Var.i0(1817241863);
                        x340Var.r(false);
                    }
                    x340Var.r(false);
                }
                gm31Var3 = gm31Var4;
            }
            gm31Var4 = gm31Var2;
            gm31Var3 = gm31Var4;
        } else {
            x340Var.b0();
            gm31Var3 = gm31Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gpo(rb71Var, j, function0, z, qim0Var, gm31Var3, j2iVar, i, i2);
        }
    }

    public static final void f(gp10 gp10Var, Function0 function0, qim0 qim0Var, String str, String str2, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        String str3 = gp10Var.b;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(319305448);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(gp10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.g(str2) ? 16384 : 8192;
        }
        byte b2 = 0;
        byte b3 = 1;
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            String strN0 = cwl1.n0(2131955934, new Object[]{str3, gp10Var.e, gp10Var.f}, b0kVar3);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("feed-activity-list-row-test-tag", u291.f(qim0Var3, 1.0f));
            uvx uvxVar = new uvx((pgx) null, 3, (tvx) null, (p3v) null, 26);
            boolean z = gp10Var.h instanceof cp10;
            qim0Var2 = qim0Var3;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN, uvxVar, null, false, null, null, new gbx(new y50(strN0), function0), null, apo.r(578584946, new np10(gp10Var, b2), b0kVar3), null, new j2i(1634902142, new xo6((!z || str == null || str.length() == 0) ? str3 : xcg1.i(str3, " • ", str), (!z || str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? null : xcg1.i(str3, ", ", str2), (byte) 7), true), apo.r(1647263920, new np10(gp10Var, b3), b0kVar3), aoi.a, null, null, apo.r(-1673555924, new np10(gp10Var, (byte) 2), b0kVar3), b0kVar2, 100663360, 197040, 25276);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq((byte) 9, i, gp10Var, function0, qim0Var2, str2, str);
        }
    }

    public static final void g(ixi0 ixi0Var, boolean z, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        String strN0;
        long j;
        af5 af5Var;
        dqs0 dqs0VarT;
        m4c m4cVar = fkj0.X;
        hux huxVar = ixi0Var.e;
        String str = ixi0Var.c;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2089460777);
        int i2 = i | (b0kVar3.g(ixi0Var) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(iu30Var) ? 256 : 128) | 3072;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            zma1 zma1Var = new zma1(cbx.a(b0kVar3).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61438);
            if (ixi0Var.g) {
                b0kVar3.i0(165318970);
                strN0 = cwl1.n0(2131954540, new Object[]{str}, b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(165420836);
                strN0 = cwl1.n0(2131954539, new Object[]{ixi0Var.d, str}, b0kVar3);
                b0kVar3.r(false);
            }
            boolean zG = b0kVar3.g(strN0);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = new fki0(strN0, (byte) 2);
                b0kVar3.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = s161.b(qim0Var3, false, (iu30) objT);
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            qim0 qim0VarY = uyn1.y(qim0VarB, 16.0f, 12.0f);
            lee1 lee1Var = cbx.d(b0kVar3).g;
            if (ixi0Var.f) {
                b0kVar3.i0(165901739);
                j = cbx.a(b0kVar3).b.b;
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(165953230);
                j = cbx.a(b0kVar3).b.a;
                b0kVar3.r(false);
            }
            boolean zG2 = b0kVar3.g(str);
            Object objT2 = b0kVar3.T();
            if (zG2 || objT2 == m4cVar) {
                if (huxVar != null) {
                    ye5 ye5Var = new ye5();
                    z6p1.r(ye5Var, "MESSAGE_ICON_KEY", "�");
                    ye5Var.g(str);
                    objT2 = ye5Var.p();
                    j = j;
                } else {
                    if (z) {
                        mhg0 mhg0Var = new mhg0(iu30Var, (byte) 27);
                        SpannableString spannableString = new SpannableString(str);
                        Linkify.addLinks(spannableString, 1);
                        ye5 ye5Var2 = new ye5();
                        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
                        uRLSpanArr.getClass();
                        Iterator it = f46.H0(uRLSpanArr, new xvd((Object) spannableString, (byte) 20)).iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            URLSpan uRLSpan = (URLSpan) it.next();
                            int spanStart = spannableString.getSpanStart(uRLSpan);
                            Iterator it2 = it;
                            int spanEnd = spannableString.getSpanEnd(uRLSpan);
                            if (i3 < spanStart) {
                                ye5Var2.g(str.substring(i3, spanStart));
                            }
                            vhg.c(ye5Var2, str.substring(spanStart, spanEnd), uRLSpan.getURL(), zma1Var, new uah0(mhg0Var, uRLSpan, (byte) 14));
                            it = it2;
                            i3 = spanEnd;
                        }
                        if (i3 < str.length()) {
                            ye5Var2.g(str.substring(i3));
                        }
                        af5Var = ye5Var2.p();
                    } else {
                        StringBuilder sb = new StringBuilder(16);
                        ArrayList arrayListM = xvj1.m();
                        new ArrayList();
                        sb.append(str);
                        String string = sb.toString();
                        ArrayList arrayList = new ArrayList(arrayListM.size());
                        int size = arrayListM.size();
                        for (int iG = 0; iG < size; iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1)) {
                        }
                        af5Var = new af5(string, arrayList);
                    }
                    objT2 = af5Var;
                }
                b0kVar3.s0(objT2);
            } else {
                j = j;
            }
            af5 af5Var2 = (af5) objT2;
            if (huxVar == null) {
                b0kVar3.i0(1658543486);
                b0kVar3.r(false);
                dqs0VarT = dqs0.e;
            } else {
                b0kVar3.i0(1658594481);
                uwr uwrVar2 = cbx.a;
                long j2 = cbx.d(b0kVar3).g.a.b;
                dqs0VarT = mqo1.t(new mmr0("MESSAGE_ICON_KEY", new gh80(new d6t0(4, j2, j2), apo.r(1919378398, new p7g0(huxVar, j2, (byte) 1), b0kVar3))));
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            uwo1.d(af5Var2, j, qim0VarY, lee1Var, null, null, 0, false, null, 0, null, dqs0VarT, b0kVar2, 0, 0, 2032);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90((Object) ixi0Var, z, (Object) iu30Var, (Object) qim0Var2, i, (byte) 15);
        }
    }

    public static final void h(p7t0 p7t0Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        iu30 iu30Var2;
        qim0 qim0Var3;
        int i3;
        float f;
        qim0 qim0Var4;
        String str;
        int i4;
        qim0 qim0Var5;
        m4c m4cVar;
        int i5;
        float f2;
        int i6;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        fra fraVar = een.Z;
        m4c m4cVar2 = fkj0.X;
        String str2 = p7t0Var.c;
        String str3 = p7t0Var.m;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-583076441);
        j06 j06Var = x340Var.a;
        int i7 = (i & 6) == 0 ? ((i & 8) == 0 ? x340Var.g(p7t0Var) : x340Var.i(p7t0Var) ? 4 : 2) | i : i;
        int i8 = i2 & 2;
        if (i8 != 0) {
            i7 |= 48;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            if ((i & 48) == 0) {
                i7 |= x340Var.i(qim0Var2) ? 32 : 16;
            }
        }
        if ((i & 384) == 0) {
            i7 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        int i9 = i7;
        if (x340Var.Y(i9 & 1, (i9 & 147) != 146)) {
            qim0 qim0Var6 = nim0.a;
            if (i8 != 0) {
                qim0Var2 = qim0Var6;
            }
            int i10 = ihx.f;
            afx afxVarE = ihx.e(26, huj.c(p7t0Var.a), 0L, z4p1.f(53, 53, 53, 255));
            uwr uwrVar = cbx.a;
            float f3 = 8.0f;
            qim0 qim0VarF = u291.f(dug.f(qim0Var2, cbx.a(x340Var).a.a.a(), er31.b(8.0f)), 1.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            qim0 qim0Var7 = qim0Var2;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            if (p7t0Var.b.length() > 0) {
                x340Var.i0(904885076);
                i3 = 0;
                gfx.d(afxVarE, apo.r(-34962114, new n7t0(p7t0Var, (byte) 0), x340Var), x340Var, 48);
                x340Var.r(false);
            } else {
                i3 = 0;
                x340Var.i0(905393445);
                x340Var.r(false);
            }
            qim0 qim0VarY = uyn1.y(qim0Var6, 16.0f, 20.0f);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, i3);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarY);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar4);
            nko1.H(xos0VarM2, x340Var, lljVar3);
            x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar);
            qim0 qim0VarB = uyn1.B(qim0Var6, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar4);
            nko1.H(xos0VarM3, x340Var, lljVar3);
            x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar);
            if (str2.length() > 0) {
                x340Var.i0(56894042);
                qim0Var4 = qim0Var7;
                w0h1.a(p7t0Var.d, isl.a, anm1.N("icn_tier", uyn1.B(u291.r(qim0Var6, 16.0f), 0.0f, 0.0f, 4.0f, 0.0f, 11)), 0L, 0L, false, x340Var, 56, 56);
                i4 = i9;
                str = str3;
                qim0Var5 = qim0Var6;
                f = 16.0f;
                uwo1.e(str2, anm1.N("txt_tier", qim0Var6), cbx.d(x340Var).k, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                f = 16.0f;
                qim0Var4 = qim0Var7;
                str = str3;
                i4 = i9;
                qim0Var5 = qim0Var6;
                x340Var.i0(57279403);
                x340Var.r(false);
            }
            x340Var.r(true);
            gfx.d(afxVarE, apo.r(-843096871, new n7t0(p7t0Var, (byte) 1), x340Var), x340Var, 48);
            x340 x340Var2 = x340Var;
            uwo1.e(p7t0Var.f, anm1.N("txt_price", qim0Var5), cbx.d(x340Var).h, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
            uwo1.e(p7t0Var.g, anm1.N("txt_price_caption", qim0Var5), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
            x340Var = x340Var2;
            hr80.d(uyn1.z(0.0f, f, 1, qim0Var5), 2.0f, cbx.a(x340Var2).a.b.c(), x340Var, 0, 0);
            x340Var.i0(892812364);
            for (String str4 : p7t0Var.h) {
                qim0 qim0Var8 = qim0Var5;
                float f4 = f3;
                qim0 qim0VarB2 = uyn1.B(qim0Var8, f4, 0.0f, 0.0f, 0.0f, 14);
                jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, x340Var, 0);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB2);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA2, x340Var, lljVar4);
                nko1.H(xos0VarM4, x340Var, lljVar3);
                x0d.q(iHashCode4, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar);
                uwr uwrVar2 = cbx.a;
                x340 x340Var3 = x340Var;
                qim0Var5 = qim0Var8;
                uwo1.e("• ", null, cbx.d(x340Var).j, 0L, null, null, 0, false, null, 0, null, x340Var3, 6, 0, 2042);
                uwo1.e(str4, null, cbx.d(x340Var3).j, 0L, null, null, 0, false, null, 0, null, x340Var3, 0, 0, 2042);
                x340Var = x340Var3;
                x340Var.r(true);
                f3 = f4;
            }
            x340Var.r(false);
            if (p7t0Var.i.length() > 0) {
                x340Var.i0(1907660463);
                op71.g(x340Var, u291.r(qim0Var5, f));
                iu30Var2 = iu30Var;
                gfx.d(afxVarE, apo.r(1831463220, new hws0(iu30Var2, p7t0Var), x340Var), x340Var, 48);
                x340Var.r(false);
            } else {
                iu30Var2 = iu30Var;
                x340Var.i0(1908490767);
                x340Var.r(false);
            }
            if (p7t0Var.k.length() > 0) {
                x340Var.i0(1908561385);
                op71.g(x340Var, u291.r(qim0Var5, f));
                gdx gdxVarP = yla.p(x340Var);
                f2 = 1.0f;
                qim0 qim0VarN = anm1.N("btn_secondary", u291.f(qim0Var5, 1.0f));
                i5 = i4;
                i6 = 256;
                boolean z2 = ((i5 & 896) == 256) | ((i5 & 14) == 4 || ((i5 & 8) != 0 && x340Var.i(p7t0Var)));
                Object objT = x340Var.T();
                if (z2) {
                    m4cVar = m4cVar2;
                } else {
                    if (objT == m4cVar) {
                    }
                    m4cVar = m4cVar2;
                    x340 x340Var4 = x340Var;
                    foo1.c(new gbx(z50.c, (Function0) objT), jdx.c, qim0VarN, null, gdxVarP, null, null, null, null, null, apo.r(-1250723036, new n7t0(p7t0Var, (byte) 3), x340Var), x340Var4, 0, 48, 2008);
                    x340Var = x340Var4;
                    x340Var.r(false);
                }
                m4cVar = m4cVar2;
                objT = new o7t0(iu30Var2, p7t0Var, (byte) 1);
                x340Var.s0(objT);
                m4cVar = m4cVar2;
                x340 x340Var5 = x340Var;
                foo1.c(new gbx(z50.c, (Function0) objT), jdx.c, qim0VarN, null, gdxVarP, null, null, null, null, null, apo.r(-1250723036, new n7t0(p7t0Var, (byte) 3), x340Var), x340Var5, 0, 48, 2008);
                x340Var = x340Var5;
                x340Var.r(false);
            } else {
                m4cVar = m4cVar2;
                i5 = i4;
                f2 = 1.0f;
                i6 = 256;
                x340Var.i0(1909274447);
                x340Var.r(false);
            }
            if (str.length() > 0) {
                x340Var.i0(1909331177);
                boolean z3 = (i5 & 896) == i6;
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new azr0(iu30Var2, (byte) 11);
                    x340Var.s0(objT2);
                }
                af5 af5VarA = huj.a(str, (iu30) objT2);
                uwr uwrVar3 = cbx.a;
                x340 x340Var6 = x340Var;
                uwo1.d(af5VarA, cbx.a(x340Var).b.b, anm1.N("txt_disclaimer", u291.f(uyn1.B(qim0Var5, 0.0f, f, 0.0f, 0.0f, 13), f2)), cbx.d(x340Var).m, new a0e1(3), null, 0, false, null, 0, null, null, x340Var6, 0, 0, 4064);
                x340Var = x340Var6;
                x340Var.r(false);
            } else {
                x340Var.i0(1909767471);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
            qim0Var3 = qim0Var4;
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1((Object) p7t0Var, (Object) qim0Var3, (Object) iu30Var2, i, i2, (byte) 19);
        }
    }

    public static final void i(wj31 wj31Var, List list, boolean z, Map map, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1542046551);
        int i2 = i | (x340Var.i(wj31Var) ? 4 : 2) | (x340Var.i(list) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.i(map) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            w2g0.c((qim0) null, (tl3) null, apo.r(1092567295, new tf((Object) wj31Var, z, (Object) list, (Object) map, (byte) 3), x340Var), x340Var, 3072, 7);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bk0(wj31Var, list, z, map, i, (byte) 5);
        }
    }

    public static final void j(j171 j171Var, String str, String str2, boolean z, boolean z2, Function0 function0, c380 c380Var, iu30 iu30Var, boolean z3, z201 z201Var, boolean z4, e821 e821Var, yxb0 yxb0Var, c101 c101Var, sve sveVar, ngs0 ngs0Var, Function0 function1, Function0 function2, fqm fqmVar, lgq lgqVar, h9n h9nVar, h4q h4qVar, qim0 qim0Var, boolean z5, boolean z6, boolean z7, boolean z8, b0k b0kVar, int i) {
        x340 x340Var;
        float f;
        Object next;
        c9 c9VarF;
        boolean z9;
        boolean z10;
        i171 i171Var = j171Var.b;
        tom tomVar = j171Var.j;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-322295433);
        int i2 = i | (x340Var2.g(j171Var) ? 4 : 2) | (x340Var2.g(str) ? 32 : 16) | (x340Var2.g(str2) ? 256 : 128) | (x340Var2.h(z) ? 2048 : 1024) | (x340Var2.h(z2) ? 16384 : 8192) | (x340Var2.i(function0) ? 131072 : 65536) | (x340Var2.g(c380Var) ? 1048576 : 524288) | (x340Var2.i(iu30Var) ? 8388608 : 4194304) | (x340Var2.h(z3) ? 67108864 : 33554432) | (x340Var2.i(z201Var) ? 536870912 : 268435456);
        int i3 = 32768 | (x340Var2.h(z4) ? (char) 4 : (char) 2) | (x340Var2.i(e821Var) ? 32 : 16) | (x340Var2.i(yxb0Var) ? 256 : 128) | (x340Var2.i(c101Var) ? 2048 : 1024) | (x340Var2.i(sveVar) ? 16384 : 8192) | (x340Var2.i(ngs0Var) ? 131072 : 65536) | (x340Var2.i(function1) ? 1048576 : 524288) | (x340Var2.i(function2) ? (char) 0 : (char) 0) | (x340Var2.i(fqmVar) ? (char) 0 : (char) 0) | (x340Var2.i(lgqVar) ? (char) 0 : (char) 0);
        int i4 = (x340Var2.i(h9nVar) ? (char) 4 : (char) 2) | (x340Var2.i(h4qVar) ? ' ' : (char) 16) | (x340Var2.g(qim0Var) ? (char) 256 : (char) 128) | (x340Var2.h(z5) ? (char) 2048 : (char) 1024) | (x340Var2.h(z6) ? (char) 16384 : (char) 8192) | (x340Var2.h(z7) ? (char) 0 : (char) 0) | (x340Var2.h(z8) ? (char) 0 : (char) 0);
        if (x340Var2.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 306783379) == 306783378 && (599187 & i4) == 599186) ? false : true)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
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
            if (j171Var.g) {
                x340Var2.i0(-1319330231);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                x340Var2.r(false);
                f = 8.0f;
            } else {
                x340Var2.i0(-1319328599);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                x340Var2.r(false);
                f = 4.0f;
            }
            op71.g(x340Var2, u291.h(nim0.a, f));
            String str3 = tomVar.a;
            boolean zJ = u890.j(tomVar.c.a, str2);
            Iterator it = tomVar.h.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((gxz0) next).c.a, str2));
            gxz0 gxz0Var = (gxz0) next;
            String str4 = gxz0Var != null ? gxz0Var.b : null;
            boolean zG = x340Var2.g(str4);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = z201Var.a(str4);
                x340Var2.s0(objT);
            }
            String str5 = str4;
            ven0 ven0VarG = rwq.g((mr20) objT, z201.b, null, x340Var2, 0, 2);
            boolean zG2 = ((i4 & 7168) == 2048) | x340Var2.g(str3);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = h4qVar.a(str3, z5);
                x340Var2.s0(objT2);
            }
            u201 u201Var = (u201) objT2;
            boolean zG3 = x340Var2.g(j171Var.d) | x340Var2.g(str3) | ((i2 & 112) == 32);
            Object objT3 = x340Var2.T();
            if (zG3 || objT3 == m4cVar) {
                objT3 = lgqVar.a(tomVar, new k271(j171Var, (byte) 1));
                x340Var2.s0(objT3);
            }
            oa0 oa0Var = (oa0) objT3;
            float f2 = j171Var.a;
            c380 c380Var2 = (c380) ven0VarG.getValue();
            boolean z11 = j171Var.c && !(i171Var instanceof f171);
            boolean z12 = j171Var.e;
            boolean z13 = j171Var.f;
            boolean z14 = tomVar.X;
            if (i171Var instanceof f171) {
                c9VarF = mqo1.F(Collections.singletonList(aa0.d));
            } else {
                ArrayList arrayList = new ArrayList();
                if (z2 && !zJ) {
                    e171 e171Var = j171Var.h;
                    if (!(e171Var instanceof d171) && !(e171Var instanceof c171) && !(e171Var instanceof y071) && m0p1.y(tomVar.f.b)) {
                        arrayList.add(fa0.d);
                    }
                }
                arrayList.add((zJ && z14) ? new z90(true) : ba0.d);
                c9VarF = mqo1.F(arrayList);
            }
            c9 c9Var = c9VarF;
            int i5 = i2 & 14;
            int i6 = i2 & 29360128;
            boolean z15 = (i5 == 4) | (i6 == 8388608);
            Object objT4 = x340Var2.T();
            if (z15 || objT4 == m4cVar) {
                z9 = false;
                objT4 = new j271((byte) 0, iu30Var, j171Var);
                x340Var2.s0(objT4);
            } else {
                z9 = false;
            }
            iu30 iu30Var2 = (iu30) objT4;
            boolean z16 = (i5 == 4 ? true : z9) | (i6 == 8388608);
            Object objT5 = x340Var2.T();
            if (z16 || objT5 == m4cVar) {
                z10 = true;
                objT5 = new j271((byte) 1, iu30Var, j171Var);
                x340Var2.s0(objT5);
            } else {
                z10 = true;
            }
            iu30 iu30Var3 = (iu30) objT5;
            boolean z17 = i5 == 4 ? z10 : false;
            Object objT6 = x340Var2.T();
            if (z17 || objT6 == m4cVar) {
                objT6 = new k271(j171Var, (byte) 0);
                x340Var2.s0(objT6);
            }
            exd0.h(u201Var, oa0Var, f2, (qim0) null, z13, zJ, z11, z12, str5, c9Var, iu30Var2, c380Var2, iu30Var3, (Function0) objT6, apo.r(-142061222, new l271(j171Var, str2, z3, z4, z, zJ, tomVar, str, iu30Var, function0, c380Var, function1, function2, yxb0Var, e821Var, fqmVar, h9nVar, z6, z7, z8, sveVar, c101Var, ngs0Var), x340Var2), x340Var2, 0, 8);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m271(j171Var, str, str2, z, z2, function0, c380Var, iu30Var, z3, z201Var, z4, e821Var, yxb0Var, c101Var, sveVar, ngs0Var, function1, function2, fqmVar, lgqVar, h9nVar, h4qVar, qim0Var, z5, z6, z7, z8, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void k(ep10 ep10Var, String str, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        String str2 = str;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1011893949);
        int i2 = i | (x340Var.i(ep10Var) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zJ = u890.j(ep10Var, dp10.a);
            nim0 nim0Var = nim0.a;
            if (zJ) {
                x340Var.i0(1042940308);
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
                c0p1.b(u291.r(nim0Var, 12.0f), x340Var, 0);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                op71.g(x340Var, u291.v(nim0Var, 2.0f));
                uwo1.e(str2, anm1.N("feed-activity-list-row-track-test-tag", nim0Var), cbx.d(x340Var).h, cbx.a(x340Var).c.c, null, null, 2, false, new zic0(1), 0, null, x340Var, (i2 >> 3) & 14, 0, 1712);
                x340Var.r(true);
                x340Var.r(false);
                str2 = str;
            } else {
                if (!(ep10Var instanceof cp10)) {
                    throw p3d1.k(x340Var, -1767473100, false);
                }
                x340Var.i0(1043584023);
                qim0 qim0VarN = anm1.N("feed-activity-list-row-track-test-tag", nim0Var);
                uwr uwrVar2 = cbx.a;
                str2 = str;
                uwo1.e(str2, qim0VarN, cbx.d(x340Var).h, cbx.a(x340Var).b.a, null, null, 2, false, new zic0(1), 0, null, x340Var, (i2 >> 3) & 14, 0, 1712);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xh00((Object) ep10Var, (Object) str2, i, (byte) 6);
        }
    }

    public static final void l(String str, String str2, String str3, Integer num, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-66960136);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | (x340Var.g(num) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            kno1.e(er31.a, apo.r(407087757, new xx00(str2, num, str3, (byte) 5), x340Var), qim0Var, apo.r(159119563, new ps00(str, (byte) 3), x340Var), x340Var, 25008 | ((i2 >> 3) & 7168), 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sxj((byte) 29, i, (Object) str, (Object) str2, (Object) str3, (Object) num, (Object) qim0Var);
        }
    }

    public static final void m(int i, int i2) {
        if (i < 0 || i >= i2) {
            eg.g(cy30.i(i, "index: ", i2, ", size: "));
        }
    }

    public static final void n(int i, int i2) {
        if (i < 0 || i > i2) {
            eg.g(cy30.i(i, "index: ", i2, ", size: "));
        }
    }

    public static final void o(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            k220.e(i3, cy30.q(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            hhg1.n(cy30.i(i, "fromIndex: ", i2, " > toIndex: "));
        }
    }

    public static sc70 p(HubsImmutableComponentBundle hubsImmutableComponentBundle, String str) {
        HubsImmutableComponentBundle hubsImmutableComponentBundle2 = HubsImmutableComponentBundle.b;
        return new sc70(lqc.v(hubsImmutableComponentBundle), str);
    }

    public static hsi1 q(String str, float f, float f2, pxg1 pxg1Var) {
        return new hsi1(str, new p3v(f), new p3v(f2), pxg1Var, rno1.c);
    }

    public static hsi1 r(String str, float f, float f2, fe5 fe5Var) {
        return new hsi1(str, Float.valueOf(f), Float.valueOf(f2), fe5Var, rno1.a);
    }

    public static final boolean s(y6b1 y6b1Var) {
        if (y6b1Var == null) {
            return false;
        }
        v6b1 v6b1Var = y6b1Var.c;
        return v6b1Var == v6b1.O0 || v6b1Var == v6b1.d || v6b1Var == v6b1.h || v6b1Var == v6b1.H1 || v6b1Var == v6b1.I1 || v6b1Var == v6b1.t || v6b1Var == v6b1.L4;
    }

    public static final go80 t(klm klmVar, rbp0 rbp0Var, zcp0 zcp0Var, zcp0 zcp0Var2, zcp0 zcp0Var3) {
        return klmVar.a("DuckingAudioManagerDaemon", new k7h0(rbp0Var, zcp0Var, zcp0Var2, zcp0Var3, (byte) 8));
    }

    public static final boolean u(lp61 lp61Var) {
        Boolean bool = (Boolean) lp61Var.d;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean bool2 = (Boolean) lp61Var.c;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return false;
    }

    public static final boolean v(zuc0 zuc0Var, y6b1 y6b1Var, Map map) {
        btr0 btr0Var;
        yq01 yq01Var = (map == null || (btr0Var = (btr0) map.get(i6p1.j(zuc0Var))) == null) ? null : btr0Var.b;
        return y6b1Var != null && y6b1Var.c == v6b1.O0 && g6p1.k(zuc0Var) == br01.b && (yq01Var != null && yq01Var.b > 0);
    }
}
