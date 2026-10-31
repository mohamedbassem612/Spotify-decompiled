package p;

import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.core.http.HttpConnection;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.wrapped.v1.proto.AccessibilityDefinition;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class kuo1 {
    public static b180 a;

    public static final void a(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        j2i j2iVar = pej.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-601663900);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new hws(iu30Var, (byte) 27);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = ern1.x(nim0.a, (iu30) objT);
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
            dv20.l((i2 >> 3) & 14, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30(iu30Var, i, (byte) 8);
        }
    }

    public static final void b(c380 c380Var, em0 em0Var, ysr0 ysr0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        Iterator it;
        qim0 qim0Var3;
        FrameLayout.LayoutParams layoutParams;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2081638937);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(em0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(ysr0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var4);
            hzj.A.getClass();
            FrameLayout.LayoutParams layoutParams2 = null;
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
            x340Var.i0(-743755721);
            Iterator it2 = c380Var.iterator();
            while (it2.hasNext()) {
                sao saoVar = (cbo) it2.next();
                if (saoVar instanceof sao) {
                    x340Var.i0(-1581590094);
                    it = it2;
                    qim0Var3 = qim0Var4;
                    layoutParams = layoutParams2;
                    otw.c(q1o1.u(((mmp) em0Var.b).a(ysr0Var, iu30Var), u291.f(qim0Var4, 1.0f), layoutParams2, 4), saoVar.a, (qim0) null, (ipb1) null, x340Var, 0, 12);
                    x340Var.r(false);
                } else {
                    it = it2;
                    qim0Var3 = qim0Var4;
                    layoutParams = layoutParams2;
                    if (saoVar instanceof tao) {
                        x340Var.i0(-1581250799);
                        otw.c(q1o1.u(((xlp) em0Var.c).a(ysr0Var, iu30Var), u291.f(qim0Var3, 1.0f), layoutParams, 4), ((tao) saoVar).a, (qim0) null, (ipb1) null, x340Var, 0, 12);
                        x340Var.r(false);
                    } else if (saoVar instanceof yao) {
                        x340Var.i0(-1580908497);
                        otw.c(q1o1.u(((jmp) em0Var.d).a(ysr0Var, iu30Var), u291.f(qim0Var3, 1.0f), layoutParams, 4), ((yao) saoVar).a, (qim0) null, (ipb1) null, x340Var, 0, 12);
                        x340Var.r(false);
                    } else if (saoVar instanceof uao) {
                        x340Var.i0(-1580562258);
                        otw.c(q1o1.u(((qmp) em0Var.h).a(ysr0Var, iu30Var), u291.f(qim0Var3, 1.0f), layoutParams, 4), ((uao) saoVar).a, (qim0) null, (ipb1) null, x340Var, 0, 12);
                        x340Var.r(false);
                    } else if (saoVar instanceof vao) {
                        x340Var.i0(-1580218096);
                        otw.c(q1o1.u(f6o1.A(((knp) em0Var.i).a(ysr0Var, iu30Var), layoutParams, layoutParams, 3), u291.f(qim0Var3, 1.0f), layoutParams, 4), ((vao) saoVar).a, (qim0) null, (ipb1) null, x340Var, 64, 12);
                        x340Var.r(false);
                    } else if (saoVar instanceof wao) {
                        x340Var.i0(-1579875856);
                        otw.c(q1o1.u(((omp) em0Var.f).a(ysr0Var, iu30Var), u291.f(qim0Var3, 1.0f), layoutParams, 4), ((wao) saoVar).a, (qim0) null, (ipb1) null, x340Var, 0, 12);
                        x340Var.r(false);
                    } else if (saoVar instanceof xao) {
                        x340Var.i0(-1579535662);
                        otw.c(q1o1.u(((hmp) em0Var.X).a(ysr0Var, iu30Var), u291.f(qim0Var3, 1.0f), layoutParams, 4), ((xao) saoVar).a, (qim0) null, (ipb1) null, x340Var, 0, 12);
                        x340Var.r(false);
                    } else if (saoVar instanceof zao) {
                        x340Var.i0(-1579198413);
                        otw.c(q1o1.u(((smp) em0Var.g).a(ysr0Var, iu30Var), u291.f(qim0Var3, 1.0f), layoutParams, 4), ((zao) saoVar).a, (qim0) null, (ipb1) null, x340Var, 0, 12);
                        x340Var.r(false);
                    } else if (saoVar instanceof abo) {
                        x340Var.i0(-1578861102);
                        otw.c(q1o1.u(((tlp) em0Var.e).a(ysr0Var, iu30Var), u291.f(qim0Var3, 1.0f), layoutParams, 4), ((abo) saoVar).a, (qim0) null, (ipb1) null, x340Var, 0, 12);
                        x340Var.r(false);
                    } else {
                        if (!(saoVar instanceof bbo)) {
                            throw p3d1.k(x340Var, -743754735, false);
                        }
                        x340Var.i0(-1578522830);
                        otw.c(q1o1.u(f6o1.A(((lnp) em0Var.t).a(ysr0Var, iu30Var), layoutParams, layoutParams, 3), u291.f(qim0Var3, 1.0f), layoutParams, 4), ((bbo) saoVar).a, (qim0) null, (ipb1) null, x340Var, 64, 12);
                        x340Var.r(false);
                    }
                }
                layoutParams2 = layoutParams;
                qim0Var4 = qim0Var3;
                it2 = it;
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0((byte) 29, i, c380Var, em0Var, ysr0Var, iu30Var, qim0Var2);
        }
    }

    public static final void c(float f, iu30 iu30Var, j2i j2iVar, qim0 qim0Var, boolean z, ksg ksgVar, List list, Function0 function0, Function0 function1, swx swxVar, int i, String str, boolean z2, b0k b0kVar, int i2, int i3) {
        int i4;
        Function0 function2;
        int i5;
        String str2;
        boolean z3;
        boolean z4;
        ksg ksgVar2;
        List list2;
        ksg jsgVar;
        int i6;
        List list3;
        boolean z5;
        j2i j2iVar2 = pej.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(359230590);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.d(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        int i7 = 221184 | i4;
        if ((i2 & 1572864) == 0) {
            i7 = 745472 | i4;
        }
        int i8 = 113246208 | i7;
        if ((805306368 & i2) == 0) {
            i8 |= x340Var.i(function0) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            function2 = function1;
            i5 = (x340Var.i(function2) ? 4 : 2) | i3;
        } else {
            function2 = function1;
            i5 = i3;
        }
        int i9 = i5 | 432;
        if ((i3 & 3072) == 0) {
            i9 |= x340Var.g(swxVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i9 |= x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            str2 = str;
            i9 |= x340Var.g(str2) ? 131072 : 65536;
        } else {
            str2 = str;
        }
        if ((i3 & 1572864) == 0) {
            z3 = z2;
            i9 |= x340Var.h(z3) ? 1048576 : 524288;
        } else {
            z3 = z2;
        }
        if ((12582912 & i3) == 0) {
            i9 |= x340Var.i(j2iVar2) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i8 & 1, ((306783379 & i8) == 306783378 && (4793491 & i9) == 4793490) ? false : true)) {
            x340Var.d0();
            if ((i2 & 1) == 0 || x340Var.E()) {
                jsgVar = new jsg(0.0f, 1.0f);
                i6 = i8 & (-3670017);
                list3 = z6x.a;
                z5 = true;
            } else {
                x340Var.b0();
                i6 = i8 & (-3670017);
                z5 = z;
                jsgVar = ksgVar;
                list3 = list;
            }
            x340Var.s();
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = new bw91();
                x340Var.s0(objT2);
            }
            bw91 bw91Var = (bw91) objT2;
            int i10 = i6;
            Object objT3 = x340Var.T();
            if (objT3 == obj) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT3);
            }
            ven0 ven0Var = (ven0) objT3;
            boolean zI = x340Var.i(idn0Var) | x340Var.i(bw91Var);
            int i11 = i9;
            Object objT4 = x340Var.T();
            if (zI || objT4 == obj) {
                objT4 = new vec(idn0Var, bw91Var, (lnm) null, (byte) 3);
                x340Var.s0(objT4);
            }
            qxd0.t(idn0Var, x340Var, (vu30) objT4);
            boolean zG = x340Var.g(idn0Var) | x340Var.g(bw91Var);
            Object objT5 = x340Var.T();
            if (zG || objT5 == obj) {
                objT5 = new ro51(idn0Var, bw91Var, new iwr(ven0Var, (byte) 15), new d7v(ven0Var, (byte) 11));
                x340Var.s0(objT5);
            }
            ro51 ro51Var = (ro51) objT5;
            Object objT6 = x340Var.T();
            if (objT6 == obj) {
                objT6 = bb00.h(0, x340Var);
            }
            err0 err0Var = (hdn0) objT6;
            boolean zI2 = x340Var.i(err0Var);
            Object objT7 = x340Var.T();
            if (zI2 || objT7 == obj) {
                objT7 = new tu9(err0Var, (byte) 10);
                x340Var.s0(objT7);
            }
            qim0 qim0VarU = lrn1.u(qim0Var, (iu30) objT7);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarU);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw r3;
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
            Object objT8 = x340Var.T();
            if (objT8 == obj) {
                objT8 = v8r.q((Object) 0);
                x340Var.s0(objT8);
            }
            ven0 ven0Var2 = (ven0) objT8;
            boolean zI3 = x340Var.i(ven0Var2);
            Object objT9 = x340Var.T();
            if (zI3 || objT9 == obj) {
                objT9 = new d7v(ven0Var2, (byte) 8);
                x340Var.s0(objT9);
            }
            a((iu30) objT9, x340Var, (i11 >> 18) & 112);
            Object objT10 = x340Var.T();
            if (objT10 == obj) {
                objT10 = v8r.q((Object) r3);
                x340Var.s0(objT10);
            }
            ven0 ven0Var3 = (ven0) objT10;
            ur80 ur80Var = (ur80) ven0Var2.getValue();
            boolean zI4 = x340Var.i(ven0Var3);
            Object objT11 = x340Var.T();
            if (zI4 || objT11 == obj) {
                objT11 = new d7v(ven0Var3, (byte) 9);
                x340Var.s0(objT11);
            }
            iu30 iu30Var2 = (iu30) objT11;
            int i12 = i10 & 14;
            int i13 = i11 << 9;
            int i14 = (i10 & 126) | ((i10 >> 21) & 896) | (i13 & 7168) | (i13 & 57344) | (i13 & 458752);
            int i15 = i10 << 6;
            int i16 = i14 | (i15 & 3670016) | (i15 & 29360128) | (i15 & 1879048192);
            int i17 = i11 << 3;
            e(f, iu30Var, function0, function2, z5, jsgVar, list3, ro51Var, ur80Var, iu30Var2, swxVar, i, str2, z3, x340Var, i16, ((i10 >> 24) & 14) | (57344 & i17) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128));
            ksgVar2 = jsgVar;
            d(f, ksgVar2, !ro51Var.b.isEmpty() || ((Boolean) ro51Var.c.invoke()).booleanValue(), (ur80) ven0Var3.getValue(), (ur80) ven0Var2.getValue(), err0Var.s(), j2iVar, x340Var, i12 | ((i10 << 12) & 3670016));
            x340Var.r(true);
            z4 = z5;
            list2 = list3;
        } else {
            x340Var.b0();
            z4 = z;
            ksgVar2 = ksgVar;
            list2 = list;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bxx(f, iu30Var, j2iVar, qim0Var, z4, ksgVar2, list2, function0, function1, swxVar, i, str, z2, i2, i3);
        }
    }

    public static final void d(float f, ksg ksgVar, boolean z, ur80 ur80Var, ur80 ur80Var2, int i, j2i j2iVar, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1162847451);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.d(f) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(ksgVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(ur80Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.i(ur80Var2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.e(i) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= x340Var.i(j2iVar) ? 1048576 : 524288;
        }
        if (!x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            x340Var.b0();
        } else {
            if (!z || ur80Var == null) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new cxx(f, ksgVar, z, ur80Var, ur80Var2, i, j2iVar, i2, (byte) 0);
                    return;
                }
                return;
            }
            int iD = ur80Var.a + ((int) (ur80Var.d() * ((f - ((Number) ksgVar.m()).floatValue()) / (((Number) ksgVar.n()).floatValue() - ((Number) ksgVar.m()).floatValue()))));
            int iB = (ur80Var2 != null ? ur80Var2.b() : 0) - ur80Var.b();
            if (iB < 0) {
                iB = 0;
            }
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = p3d1.n(0L, x340Var);
            }
            ven0 ven0Var = (ven0) objT;
            int i4 = iD - (((int) (((yr80) ven0Var.getValue()).a >> 32)) / 2);
            int i5 = i - ((int) (((yr80) ven0Var.getValue()).a >> 32));
            if (i5 < 0) {
                i5 = 0;
            }
            int iP = yoi1.p(i4, 0, i5);
            kiv kivVar = t4k.n;
            mod.b(kivVar.a(flb0.a), apo.r(-1938523749, new dxx(iP, iB, ven0Var, (flb0) x340Var.k(kivVar), (wat) x340Var.k(t4k.h), j2iVar, f), x340Var), x340Var, 56);
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new cxx(f, ksgVar, z, ur80Var, ur80Var2, i, j2iVar, i2, (byte) 1);
        }
    }

    public static final void e(float f, iu30 iu30Var, Function0 function0, Function0 function1, boolean z, ksg ksgVar, List list, ro51 ro51Var, ur80 ur80Var, iu30 iu30Var2, swx swxVar, int i, String str, boolean z2, b0k b0kVar, int i2, int i3) {
        int i4;
        Function0 function2;
        int i5;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(352256585);
        j06 j06Var = x340Var2.a;
        if ((i2 & 6) == 0) {
            i4 = (x340Var2.d(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function2 = function0;
            i4 |= x340Var2.i(function2) ? 256 : 128;
        } else {
            function2 = function0;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var2.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= x340Var2.i((Object) null) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= x340Var2.i((Object) null) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= x340Var2.d(0.0f) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= x340Var2.h(z) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= x340Var2.g(ksgVar) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= x340Var2.e(0) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (x340Var2.g(list) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= x340Var2.i(ro51Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= x340Var2.i(ur80Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= x340Var2.i(iu30Var2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= x340Var2.g(swxVar) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= x340Var2.e(l1d.C(i)) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= x340Var2.g(str) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= x340Var2.h(z2) ? 8388608 : 4194304;
        }
        int i6 = i5;
        if (x340Var2.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (4793491 & i6) == 4793490) ? false : true)) {
            o8x o8xVar = new o8x(ur80Var, (byte) 3);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarX = j9k1.x(nim0Var, o8xVar);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z3 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            int i7 = i4;
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            boolean z4 = (i6 & 7168) == 2048;
            Object objT = x340Var2.T();
            if (z4 || objT == fkj0.X) {
                objT = new hws(iu30Var2, (byte) 28);
                x340Var2.s0(objT);
            }
            qim0 qim0VarX2 = ern1.x(nim0Var, (iu30) objT);
            if (z2) {
                qim0VarX2 = f8d1.c(qim0VarX2, ksgVar, Boolean.valueOf(z), new fxx(z, ksgVar, iu30Var, ro51Var.d));
            }
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarX2);
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            int i8 = i7 >> 6;
            guo1.g(f, iu30Var, null, null, z, ksgVar, 0, list, function2, function1, null, null, ro51Var.a, swxVar, i, str, z2, null, x340Var2, (i7 & 126) | (i8 & 57344) | (i8 & 458752) | (i8 & 3670016) | (i8 & 29360128) | ((i6 << 24) & 234881024) | ((i7 << 21) & 1879048192), ((i7 >> 9) & 1022) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 1835020);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new exx(f, iu30Var, function0, function1, z, ksgVar, list, ro51Var, ur80Var, iu30Var2, swxVar, i, str, z2, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:88:0x0161  */
    /* JADX WARN: Code duplicated, block: B:91:0x016e  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void f(String str, String str2, iu30 iu30Var, qim0 qim0Var, long j, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        long j2;
        boolean z;
        b0k b0kVar2;
        long j3;
        qim0 qim0Var3;
        h311 h311VarV;
        ven0 ven0VarS;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objT;
        long j4;
        int i4;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-712860937);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                j2 = j;
                if ((i2 & 16) == 0 || !b0kVar3.f(j2)) {
                    i4 = 8192;
                } else {
                    i4 = 16384;
                }
                i3 |= i4;
            } else {
                j2 = j;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0 || b0kVar3.E()) {
                    if (i5 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 16) != 0) {
                        uwr uwrVar = cbx.a;
                        j2 = ((vex) zex.a.b).h;
                        i3 &= -57345;
                    }
                } else {
                    b0kVar3.b0();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                }
                b0kVar3.s();
                int i6 = i3 >> 6;
                ven0VarS = v8r.s(iu30Var, b0kVar3);
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z2 | z3 | ((((57344 & i3) ^ 24576) <= 16384 && b0kVar3.f(j2)) || (i3 & 24576) == 16384);
                objT = b0kVar3.T();
                if (!z4 || objT == fkj0.X) {
                    ye5 ye5Var = new ye5();
                    long j5 = j2;
                    j4 = j5;
                    vhg.c(ye5Var, str, str2, new zma1(j5, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61438), new ry71(ven0VarS, (byte) 13));
                    objT = ye5Var.p();
                    b0kVar3.s0(objT);
                } else {
                    j4 = j2;
                }
                uwr uwrVar2 = cbx.a;
                b0kVar2 = b0kVar3;
                uwo1.f((af5) objT, qim0Var2, cbx.d(b0kVar3).k, null, null, null, 0, false, null, 0, null, null, b0kVar2, i6 & 112, 0, 4088);
                j3 = j4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                j3 = j2;
            }
            qim0Var3 = qim0Var2;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new hxx(str, str2, iu30Var, qim0Var3, j3, i, i2);
            }
        }
        i3 |= 3072;
        qim0Var2 = qim0Var;
        if ((i & 24576) == 0) {
            j2 = j;
            if ((i2 & 16) == 0) {
                i4 = 8192;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        } else {
            j2 = j;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i2 & 16) != 0) {
                    uwr uwrVar3 = cbx.a;
                    j2 = ((vex) zex.a.b).h;
                    i3 &= -57345;
                }
            } else {
                if (i5 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i2 & 16) != 0) {
                    uwr uwrVar4 = cbx.a;
                    j2 = ((vex) zex.a.b).h;
                    i3 &= -57345;
                }
            }
            b0kVar3.s();
            int i7 = i3 >> 6;
            ven0VarS = v8r.s(iu30Var, b0kVar3);
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i3 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z2 | z3 | ((((57344 & i3) ^ 24576) <= 16384 && b0kVar3.f(j2)) || (i3 & 24576) == 16384);
            objT = b0kVar3.T();
            if (z4) {
                ye5 ye5Var2 = new ye5();
                long j6 = j2;
                j4 = j6;
                vhg.c(ye5Var2, str, str2, new zma1(j6, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61438), new ry71(ven0VarS, (byte) 13));
                objT = ye5Var2.p();
                b0kVar3.s0(objT);
            } else {
                ye5 ye5Var3 = new ye5();
                long j7 = j2;
                j4 = j7;
                vhg.c(ye5Var3, str, str2, new zma1(j7, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61438), new ry71(ven0VarS, (byte) 13));
                objT = ye5Var3.p();
                b0kVar3.s0(objT);
            }
            uwr uwrVar5 = cbx.a;
            b0kVar2 = b0kVar3;
            uwo1.f((af5) objT, qim0Var2, cbx.d(b0kVar3).k, null, null, null, 0, false, null, 0, null, null, b0kVar2, i7 & 112, 0, 4088);
            j3 = j4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            j3 = j2;
        }
        qim0Var3 = qim0Var2;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hxx(str, str2, iu30Var, qim0Var3, j3, i, i2);
        }
    }

    public static final void g(boolean z, los losVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-725787998);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.i(losVar) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = x340Var.i(losVar) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new ett(losVar, z, (lnm) null);
                x340Var.s0(objT);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kf2(z, (Object) losVar, i, (byte) 6);
        }
    }

    public static String h(Map map) {
        String str = (String) map.get("Content-Type");
        if (str == null) {
            str = (String) map.get("content-type");
        }
        return str == null ? HttpConnection.kDefaultContentType : str;
    }

    public static final void i(pbq pbqVar, gw70 gw70Var) {
        ConstraintLayout constraintLayout = (ConstraintLayout) pbqVar.f;
        eqq.t(-2, -2, constraintLayout);
        View view = (ArtworkView) pbqVar.t;
        view.setViewContext(new f47(gw70Var));
        v9w0 v9w0VarP = b2u.p(constraintLayout);
        Collections.addAll(v9w0VarP.d, view);
        v9w0VarP.a();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final dg j(AccessibilityDefinition accessibilityDefinition) {
        String description = accessibilityDefinition.getDescription();
        if (accessibilityDefinition.hasDescription()) {
            description.getClass();
            if (ihc1.y0(description)) {
                description = null;
            }
        } else {
            description = null;
        }
        String strN = accessibilityDefinition.n();
        if (accessibilityDefinition.q()) {
            strN.getClass();
            if (ihc1.y0(strN)) {
                strN = null;
            }
        } else {
            strN = null;
        }
        Map mapP = accessibilityDefinition.p();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapP.entrySet()) {
            String str = (String) entry.getValue();
            str.getClass();
            if (!ihc1.y0(str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        dg dgVar = new dg(description, strN, linkedHashMap);
        if (description == null && strN == null && linkedHashMap.isEmpty()) {
            return null;
        }
        return dgVar;
    }

    public static final lht k(o60 o60Var) {
        lht lhtVar = (lht) y7a0.d.get(o60Var);
        return lhtVar == null ? mht.g(o60Var) : lhtVar;
    }

    public static final oz61 l(zb71 zb71Var, boolean z) {
        fz61 hz61Var;
        nz61 lz61Var;
        int i;
        float f = zb71Var.a().a;
        mb71 mb71Var = zb71Var.a().b;
        if (mb71Var instanceof mb71) {
            mb71 mb71Var2 = mb71Var;
            hz61Var = new fz61(mb71Var2.a, mb71Var2.b);
        } else if (mb71Var instanceof nb71) {
            hz61Var = new gz61(((nb71) mb71Var).a);
        } else if (mb71Var instanceof pb71) {
            hz61Var = new iz61(((pb71) mb71Var).a);
        } else {
            if (!(mb71Var instanceof ob71)) {
                eg.o();
                return null;
            }
            hz61Var = new hz61(((ob71) mb71Var).a);
        }
        jz61 jz61Var = new jz61(f, hz61Var);
        int i2 = 2;
        if (zb71Var instanceof wb71) {
            lz61Var = new nz61(((wb71) zb71Var).d);
        } else {
            if (!(zb71Var instanceof yb71)) {
                eg.o();
                return null;
            }
            yb71 yb71Var = (yb71) zb71Var;
            if (yb71Var.c.b instanceof mb71) {
                String str = yb71Var.d;
                String str2 = yb71Var.a;
                String str3 = yb71Var.b;
                int iC = l1d.C(yb71Var.e);
                if (iC == 0) {
                    i = 1;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    i = 2;
                }
                xb71 xb71Var = yb71Var.f;
                lz61Var = new lz61(str, str2, str3, i, xb71Var != null ? new kz61(xb71Var.a, xb71Var.b) : null);
            } else {
                lz61Var = mz61.b;
            }
        }
        ib71 ib71VarB = zb71Var.b();
        if (ib71VarB != null) {
            int iOrdinal = ib71VarB.ordinal();
            if (iOrdinal == 0) {
                i2 = 1;
            } else if (iOrdinal != 1) {
                eg.o();
                return null;
            }
        } else {
            i2 = 0;
        }
        return new oz61(jz61Var, lz61Var, i2, z);
    }

    public static final dl01 m(yk01 yk01Var, Resources resources) {
        String string;
        cl01 zk01Var;
        boolean z = yk01Var.c;
        c380 c380Var = yk01Var.b;
        int i = yk01Var.a;
        if (z) {
            int iC = l1d.C(i);
            if (iC == 0) {
                string = resources.getQuantityString(2131820874, c380Var.size(), Integer.valueOf(c380Var.size()));
            } else if (iC == 1) {
                string = resources.getQuantityString(2131820875, c380Var.size(), Integer.valueOf(c380Var.size()));
            } else if (iC == 2) {
                string = resources.getQuantityString(2131820873, c380Var.size(), Integer.valueOf(c380Var.size()));
            } else {
                if (iC != 3) {
                    eg.o();
                    return null;
                }
                string = resources.getQuantityString(2131820876, c380Var.size(), Integer.valueOf(c380Var.size()));
            }
        } else {
            int iC2 = l1d.C(i);
            if (iC2 == 0) {
                string = resources.getString(2131960932);
            } else if (iC2 == 1) {
                string = resources.getString(2131960933);
            } else if (iC2 == 2) {
                string = resources.getString(2131960931);
            } else {
                if (iC2 != 3) {
                    eg.o();
                    return null;
                }
                string = resources.getString(2131960934);
            }
        }
        String str = string;
        str.getClass();
        int iC3 = l1d.C(i);
        if (iC3 == 0) {
            zk01Var = new zk01(urx.c);
        } else if (iC3 == 1) {
            zk01Var = new zk01(klx.c);
        } else if (iC3 == 2) {
            zk01Var = bl01.a;
        } else {
            if (iC3 != 3) {
                eg.o();
                return null;
            }
            zk01Var = al01.a;
        }
        return new dl01(zk01Var, yk01Var.b, yk01Var.c, str, i == 3);
    }

    public static String n(int i) {
        if (i == 1) {
            return "WordBreak.None";
        }
        if (i == 2) {
            return "WordBreak.Phrase";
        }
        return i == 0 ? "WordBreak.Unspecified" : "Invalid";
    }
}
