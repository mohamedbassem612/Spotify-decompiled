package p;

import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.RemoteViews;
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
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class p6p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(lh1 lh1Var, af10 af10Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1962763044);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(lh1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(af10Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = x340Var.i(af10Var) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new d4((Object) lh1Var, (Object) af10Var, (byte) 17);
                x340Var.s0(objT);
            }
            dm5.a((iu30) objT, qim0Var, (iu30) null, x340Var, (i2 >> 3) & 112, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(lh1Var, af10Var, qim0Var, i, (byte) 4);
        }
    }

    public static final void b(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(618008423);
        if (x340Var.Y(i & 1, i != 0)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
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
            pox poxVar = pox.c;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(poxVar, isl.a, u291.r(nim0Var, 12.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, pox.d | 48, 48);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(nim0Var, 6.0f));
            uwo1.e(cwl1.o0(x340Var, 2131958590), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bom1((byte) 29, i, false);
        }
    }

    public static final void c(int i, b0k b0kVar, int i2) {
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1929147152);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            if (i <= 10) {
                x340Var.i0(1515462840);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.d;
                x340Var.r(false);
            } else if (i <= 20) {
                x340Var.i0(1515465079);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).b.e;
                x340Var.r(false);
            } else {
                x340Var.i0(1515466455);
                uwr uwrVar3 = cbx.a;
                j = cbx.a(x340Var).b.b;
                x340Var.r(false);
            }
            uwo1.e(String.valueOf(i), null, cbx.d(x340Var).m, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vx1((byte) 7, i, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:100:0x0387  */
    /* JADX WARN: Code duplicated, block: B:102:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:104:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:107:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:108:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:115:0x0400  */
    /* JADX WARN: Code duplicated, block: B:118:0x0414  */
    /* JADX WARN: Code duplicated, block: B:120:0x042b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0437  */
    /* JADX WARN: Code duplicated, block: B:123:0x0476  */
    /* JADX WARN: Code duplicated, block: B:125:0x047c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0498  */
    /* JADX WARN: Code duplicated, block: B:129:0x04af  */
    /* JADX WARN: Code duplicated, block: B:90:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:91:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:97:0x02ef  */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v7 */
    public static final void d(zfh zfhVar, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        iu30 iu30Var3;
        Uri uri;
        m4c m4cVar;
        boolean z;
        boolean zI;
        Object objT;
        tob1 tob1Var;
        y7e1 y7e1Var;
        y7e1 y7e1Var2;
        boolean z2;
        ?? r14;
        boolean z3;
        boolean z4;
        Object objT2;
        Function0 function0;
        jax haxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-70010256);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(zfhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Boolean bool = zfhVar.a;
            if (bool == null) {
                x340Var.i0(1678717356);
                x340Var.r(false);
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new fgh(zfhVar, iu30Var, iu30Var2, i, (byte) 0);
                    return;
                }
                return;
            }
            Boolean bool2 = Boolean.FALSE;
            if (bool.equals(bool2)) {
                x340Var.i0(1678738374);
                k(x340Var, 0);
                x340Var.r(false);
                h311 h311VarV2 = x340Var.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new fgh(zfhVar, iu30Var, iu30Var2, i, (byte) 1);
                    return;
                }
                return;
            }
            if (!bool.equals(Boolean.TRUE)) {
                throw p3d1.k(x340Var, 1439624393, false);
            }
            x340Var.i0(1678793616);
            x340Var.r(false);
            y7e1 y7e1VarD = c4p1.D(0, 3, null, x340Var);
            az20 az20Var = (az20) x340Var.k(t4k.i);
            Object objT3 = x340Var.T();
            m4c m4cVar2 = fkj0.X;
            if (objT3 == m4cVar2) {
                objT3 = v8r.q(bool2);
                x340Var.s0(objT3);
            }
            tob1 tob1Var2 = (ven0) objT3;
            boolean zI2 = x340Var.i(zfhVar) | x340Var.i(y7e1VarD);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar2) {
                objT4 = new pid(zfhVar, y7e1VarD, (lnm) null, (byte) 25);
                x340Var.s0(objT4);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT4);
            CharSequence charSequence = y7e1VarD.d().d;
            boolean zY0 = ihc1.y0(charSequence);
            boolean z5 = (zY0 || (charSequence.length() > 500)) ? false : true;
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar2) {
                objT5 = yv91.a(new tr1(y7e1VarD, (byte) 17));
                x340Var.s0(objT5);
            }
            tob1 tob1Var3 = (tob1) objT5;
            String strO0 = cwl1.o0(x340Var, 2131954057);
            String strO1 = cwl1.o0(x340Var, 2131954053);
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar2) {
                objT6 = er31.b(21.0f);
                x340Var.s0(objT6);
            }
            cr31 cr31Var = (cr31) objT6;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).d.b;
            nim0 nim0Var = nim0.a;
            int i3 = i2;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z6 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z6) {
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
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0VarF2, 16.0f, 8.0f, 10.0f, 8.0f);
            fra fraVar = een.O0;
            cvx cvxVar4 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
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
            String str = zfhVar.b;
            if (str == null || (uri = Uri.parse(str)) == null) {
                uri = Uri.EMPTY;
            }
            uri.getClass();
            cvx cvxVar5 = cbx.b(x340Var).b;
            bmq0.a(uri, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), hcx.c, (String) null, (String) null, 0L, 0L, false, x340Var, 384, 248);
            qim0 qim0VarF3 = dug.f(i1p1.q(u291.j(0.0f, 104.0f, 1, new wnb0(1.0f, true)), cr31Var), j, cr31Var);
            boolean zG = x340Var.g(strO1);
            Object objT7 = x340Var.T();
            if (zG) {
                m4cVar = m4cVar2;
            } else {
                m4cVar = m4cVar2;
                if (objT7 == m4cVar) {
                }
                qim0 qim0VarB = s161.b(qim0VarF3, false, (iu30) objT7);
                boolean zI3 = x340Var.i(tob1Var2) | x340Var.i(charSequence);
                if ((i3 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                zI = zI3 | z | x340Var.i(y7e1VarD);
                objT = x340Var.T();
                if (!zI || objT == m4cVar) {
                    tob1Var = tob1Var2;
                    objT = new ggh(charSequence, iu30Var2, y7e1VarD, tob1Var, (byte) 0);
                    y7e1Var = y7e1VarD;
                    x340Var.s0(objT);
                } else {
                    y7e1Var = y7e1VarD;
                    tob1Var = tob1Var2;
                }
                m4c m4cVar3 = m4cVar;
                y7e1Var2 = y7e1Var;
                xea.c(y7e1Var2, cev0.G(qim0VarB, (iu30) objT), false, false, (dk80) null, lee1.a(cbx.d(x340Var).j, cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), (kua0) null, (yta0) null, new c6e1(0, 4, 1), (vu30) null, (idn0) null, new n6a1(cbx.a(x340Var).b.c), (uwg) null, new xid(charSequence, strO1, (byte) 19), (es41) null, x340Var, 0, 0, 22236);
                x340Var = x340Var;
                if (zY0) {
                    iu30Var3 = iu30Var;
                    z2 = true;
                    r14 = 0;
                    x340Var.i0(-1467475156);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1468476518);
                    cvx cvxVar6 = cbx.b(x340Var).b;
                    qim0 qim0VarB2 = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
                    r14 = 0;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB2);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, lljVar);
                    nko1.H(xos0VarM3, x340Var, lljVar2);
                    x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar4);
                    boolean zI4 = x340Var.i(y7e1Var2) | x340Var.i(az20Var);
                    if ((i3 & 112) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = zI4 | z3;
                    objT2 = x340Var.T();
                    if (!z4 || objT2 == m4cVar3) {
                        iu30Var3 = iu30Var;
                        objT2 = new d1c(y7e1Var2, az20Var, iu30Var3, (byte) 22);
                        x340Var.s0(objT2);
                    } else {
                        iu30Var3 = iu30Var;
                    }
                    function0 = (Function0) objT2;
                    if (!ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    gbx gbxVar = new gbx(new y50(strO0), function0);
                    idx idxVar = new idx();
                    gdx gdxVarS = yla.s(x340Var);
                    if (z5) {
                        x340Var.i0(1367247113);
                        x340Var.r(false);
                        haxVar = jax.a;
                    } else {
                        x340Var.i0(1367249419);
                        haxVar = new hax(cwl1.o0(x340Var, 2131954056));
                        x340Var.r(false);
                    }
                    wro1.h(gbxVar, idxVar, u291.r(nim0Var, 36.0f), haxVar, gdxVarS, null, false, null, null, apo.r(573808670, new j3b(strO0, (byte) 26), x340Var), x340Var, 12582912, 6, 840);
                    z2 = true;
                    x340Var.r(true);
                    x340Var.r(false);
                }
                x340Var.r(z2);
                if (((Boolean) tob1Var.getValue()).booleanValue()) {
                    x340Var.i0(-1219947594);
                    i(((Number) tob1Var3.getValue()).intValue(), x340Var, r14);
                    x340Var.r((boolean) r14);
                } else {
                    x340Var.i0(-1219899544);
                    x340Var.r((boolean) r14);
                }
                x340Var.r(z2);
            }
            objT7 = new irf(strO1, (byte) 10);
            x340Var.s0(objT7);
            qim0 qim0VarB3 = s161.b(qim0VarF3, false, (iu30) objT7);
            boolean zI5 = x340Var.i(tob1Var2) | x340Var.i(charSequence);
            if ((i3 & 896) == 256) {
                z = true;
            } else {
                z = false;
            }
            zI = zI5 | z | x340Var.i(y7e1VarD);
            objT = x340Var.T();
            if (zI) {
                tob1Var = tob1Var2;
                objT = new ggh(charSequence, iu30Var2, y7e1VarD, tob1Var, (byte) 0);
                y7e1Var = y7e1VarD;
                x340Var.s0(objT);
            } else {
                tob1Var = tob1Var2;
                objT = new ggh(charSequence, iu30Var2, y7e1VarD, tob1Var, (byte) 0);
                y7e1Var = y7e1VarD;
                x340Var.s0(objT);
            }
            m4c m4cVar4 = m4cVar;
            y7e1Var2 = y7e1Var;
            xea.c(y7e1Var2, cev0.G(qim0VarB3, (iu30) objT), false, false, (dk80) null, lee1.a(cbx.d(x340Var).j, cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), (kua0) null, (yta0) null, new c6e1(0, 4, 1), (vu30) null, (idn0) null, new n6a1(cbx.a(x340Var).b.c), (uwg) null, new xid(charSequence, strO1, (byte) 19), (es41) null, x340Var, 0, 0, 22236);
            x340Var = x340Var;
            if (zY0) {
                x340Var.i0(-1468476518);
                cvx cvxVar7 = cbx.b(x340Var).b;
                qim0 qim0VarB4 = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
                r14 = 0;
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB4);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM4, x340Var, lljVar2);
                x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar4);
                boolean zI6 = x340Var.i(y7e1Var2) | x340Var.i(az20Var);
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = zI6 | z3;
                objT2 = x340Var.T();
                if (z4) {
                    iu30Var3 = iu30Var;
                    objT2 = new d1c(y7e1Var2, az20Var, iu30Var3, (byte) 22);
                    x340Var.s0(objT2);
                } else {
                    iu30Var3 = iu30Var;
                    objT2 = new d1c(y7e1Var2, az20Var, iu30Var3, (byte) 22);
                    x340Var.s0(objT2);
                }
                function0 = (Function0) objT2;
                if (!ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbx gbxVar2 = new gbx(new y50(strO0), function0);
                idx idxVar2 = new idx();
                gdx gdxVarS2 = yla.s(x340Var);
                if (z5) {
                    x340Var.i0(1367247113);
                    x340Var.r(false);
                    haxVar = jax.a;
                } else {
                    x340Var.i0(1367249419);
                    haxVar = new hax(cwl1.o0(x340Var, 2131954056));
                    x340Var.r(false);
                }
                wro1.h(gbxVar2, idxVar2, u291.r(nim0Var, 36.0f), haxVar, gdxVarS2, null, false, null, null, apo.r(573808670, new j3b(strO0, (byte) 26), x340Var), x340Var, 12582912, 6, 840);
                z2 = true;
                x340Var.r(true);
                x340Var.r(false);
            } else {
                iu30Var3 = iu30Var;
                z2 = true;
                r14 = 0;
                x340Var.i0(-1467475156);
                x340Var.r(false);
            }
            x340Var.r(z2);
            if (((Boolean) tob1Var.getValue()).booleanValue()) {
                x340Var.i0(-1219947594);
                i(((Number) tob1Var3.getValue()).intValue(), x340Var, r14);
                x340Var.r((boolean) r14);
            } else {
                x340Var.i0(-1219899544);
                x340Var.r((boolean) r14);
            }
            x340Var.r(z2);
        } else {
            iu30Var3 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV3 = x340Var.v();
        if (h311VarV3 != null) {
            h311VarV3.d = new fgh(zfhVar, iu30Var3, iu30Var2, i, (byte) 2);
        }
    }

    public static final void e(iu30 iu30Var, qim0 qim0Var, xtb0 xtb0Var, vzq0 vzq0Var, iu30 iu30Var2, b0k b0kVar, int i) {
        xtb0 xtb0Var2;
        Object uh0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-841516369);
        int i2 = i | (x340Var.i(iu30Var) ? 4 : 2) | (x340Var.g(qim0Var) ? 32 : 16) | (x340Var.g(xtb0Var) ? 256 : 128) | (x340Var.g(vzq0Var) ? 2048 : 1024) | (x340Var.i(iu30Var2) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            if (xtb0Var == null) {
                x340Var.i0(-1243370202);
                xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
                x340Var.r(false);
                xtb0Var2 = xtb0VarA;
            } else {
                x340Var.i0(-1243370605);
                x340Var.r(false);
                xtb0Var2 = xtb0Var;
            }
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(fg91.b);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object[] objArr = new Object[0];
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = n0r.f;
                x340Var.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) k5p1.s(objArr, (Function0) objT2, x340Var, 48);
            boolean zG = ((i2 & 14) == 4) | x340Var.g(xtb0Var2) | x340Var.g(ven0Var2) | ((57344 & i2) == 16384);
            Object objT3 = x340Var.T();
            if (zG || objT3 == m4cVar) {
                uh0Var = new uh0(xtb0Var2, ven0Var2, iu30Var, iu30Var2, ven0Var, (byte) 20);
                x340Var.s0(uh0Var);
            } else {
                uh0Var = objT3;
            }
            xtb0 xtb0Var3 = xtb0Var2;
            ujo1.d(qim0Var, xtb0Var3, vzq0Var, false, null, null, null, false, null, (iu30) uh0Var, x340Var, (i2 >> 3) & 910, 504);
            x340Var = x340Var;
            c380 c380Var = (c380) ven0Var.getValue();
            boolean zG2 = x340Var.g(ven0Var2);
            Object objT4 = x340Var.T();
            if (zG2 || objT4 == m4cVar) {
                objT4 = new hnf(ven0Var2, (byte) 22);
                x340Var.s0(objT4);
            }
            f(xtb0Var3, c380Var, iu30Var, (Function0) objT4, x340Var, (i2 << 6) & 896);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sxj((byte) 16, i, (Object) iu30Var, (Object) qim0Var, (Object) xtb0Var, (Object) vzq0Var, (Object) iu30Var2);
        }
    }

    public static final void f(xtb0 xtb0Var, c380 c380Var, iu30 iu30Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        h311 h311VarV;
        hdr hdrVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-33601598);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(xtb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(c380Var) : x340Var.i(c380Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            if (iu30Var == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    hdrVar = new hdr(xtb0Var, c380Var, iu30Var, function0, i, (byte) 0);
                }
            } else {
                Object[] objArr = new Object[0];
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = n0r.g;
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, x340Var, 48);
                Integer num = null;
                c380 c380Var2 = (!((Boolean) ven0Var.getValue()).booleanValue() || c380Var.isEmpty()) ? null : c380Var;
                if (c380Var2 != null) {
                    Iterator it = c380Var2.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        Object next = it.next();
                        if (next != null && ((Boolean) iu30Var.invoke(next)).booleanValue()) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    Integer numValueOf = Integer.valueOf(i3);
                    if (i3 >= 0) {
                        num = numValueOf;
                    }
                }
                if (num == null) {
                    x340Var.i0(-297367993);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-297367992);
                    int iIntValue = num.intValue();
                    uwr uwrVar = cbx.a;
                    bwx bwxVar = cbx.c(x340Var).b;
                    boolean zI = ((i2 & 14) == 4) | x340Var.i(bwxVar) | x340Var.e(iIntValue) | x340Var.g(ven0Var) | ((i2 & 7168) == 2048);
                    Object objT2 = x340Var.T();
                    if (zI || objT2 == m4cVar) {
                        a38 a38Var = new a38(bwxVar, xtb0Var, iIntValue, ven0Var, function0, (lnm) null);
                        x340Var.s0(a38Var);
                        objT2 = a38Var;
                    }
                    qxd0.t(rih1.a, x340Var, (vu30) objT2);
                    x340Var.r(false);
                }
            }
            h311VarV.d = hdrVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            hdrVar = new hdr(xtb0Var, c380Var, iu30Var, function0, i, (byte) 1);
            h311VarV.d = hdrVar;
        }
    }

    public static final void g(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-682302250);
        int i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            qim0Var2 = qim0Var;
            hr80.d(qim0Var2, 1.0f, cbx.a(x340Var).a.b.c(), x340Var, (i2 & 14) | 48, 0);
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var2, i, (byte) 7);
        }
    }

    public static final void h(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-619102029);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new i030(ven0Var, (byte) 0);
                x340Var.s0(objT2);
            }
            qim0 qim0VarU = qxy0.u(cev0.G(qim0Var, (iu30) objT2), (idn0) null, 3);
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
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(1180824743);
                t1c.a(dug.f(h2c.a.b(nim0.a), u7h.b(u7h.d, 0.5f, 0.0f, 0.0f, 0.0f, 14), d4o1.a), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1180918921);
                x340Var.r(false);
            }
            dv20.l(6, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new klb((byte) 5, i, j2iVar, qim0Var);
        }
    }

    public static final void i(int i, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-183557107);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0VarF, 16.0f, 6.0f, 16.0f, 8.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
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
            n(x340Var, 0);
            c(i, x340Var, i3 & 14);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vx1((byte) 8, i, i2);
        }
    }

    public static final void j(boolean z, Function0 function0, j2i j2iVar, b0k b0kVar, int i) throws Throwable {
        j2i j2iVar2;
        o95 o95Var;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-93844387);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).d.b;
            long jB = u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            Throwable th = null;
            if (objT == m4cVar) {
                n8b1 n8b1Var = w191.a;
                objT = new o95(new u7h(jB), new tzg1(m4h.X0, new syf(u7h.e(jB), (byte) 20)), (Object) null, 12);
                x340Var.s0(objT);
            }
            o95 o95Var2 = (o95) objT;
            if (z) {
                x340Var.i0(305965321);
                cwx cwxVarC = cbx.c(x340Var);
                boolean zI = ((i2 & 112) == 32) | x340Var.i(cwxVarC) | x340Var.i(o95Var2) | x340Var.f(j) | x340Var.f(jB);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    o95Var = o95Var2;
                    idr idrVar = new idr(cwxVarC, o95Var, j, jB, function0, (lnm) null);
                    x340Var.s0(idrVar);
                    objT2 = idrVar;
                } else {
                    o95Var = o95Var2;
                }
                qxd0.t(rih1.a, x340Var, (vu30) objT2);
                z2 = false;
                x340Var.r(false);
            } else {
                o95Var = o95Var2;
                th = null;
                z2 = false;
                x340Var.i0(306422757);
                x340Var.r(false);
            }
            qim0 qim0VarF = dug.f(u291.f(nim0.a, 1.0f), ((u7h) o95Var.e()).a, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, z2);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw th;
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
            j2iVar2 = j2iVar;
            dv20.l(6, j2iVar2, x340Var, true);
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jdr(z, function0, j2iVar2, i, (byte) 0);
        }
    }

    public static final void k(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1220980634);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            uwo1.e(cwl1.o0(x340Var, 2131954052), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qza((byte) 23, i, false);
        }
    }

    public static final mf80 l(String str, nma0 nma0Var) {
        return new mf80(str, new nf80(nma0Var));
    }

    public static final void m(vzq0 vzq0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1410457740);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(vzq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarW = uyn1.w(u291.d(qim0Var2, 1.0f), vzq0Var);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarW);
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
            xto1.e(null, 3, 0L, 0L, x340Var, 48, 13);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(vzq0Var, qim0Var, i, (byte) 23);
        }
    }

    public static final void n(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1445661088);
        if (x340Var.Y(i & 1, i != 0)) {
            f65 f65Var = (f65) x340Var.k(t4k.s);
            uwr uwrVar = cbx.a;
            zma1 zma1Var = new zma1(cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534);
            boolean zI = x340Var.i(f65Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new j03(f65Var, (byte) 3);
                x340Var.s0(objT);
            }
            uwo1.d(wmo1.A(2131954054, 2131954055, "https://support.spotify.com/article/platform-rules/", zma1Var, (iu30) objT, x340Var, 384, 0), cbx.a(x340Var).b.b, null, cbx.d(x340Var).m, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4084);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qza((byte) 24, i, false);
        }
    }

    public static final void o(mxr mxrVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1994672889);
        int i2 = (x340Var.g(mxrVar) ? 4 : 2) | i | (x340Var.i(r681.a) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nyx.a(2, (wux) null, apo.r(450204820, new h681(mxrVar), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h681(mxrVar, i);
        }
    }

    public static final void p(Object obj, xtb0 xtb0Var, long j, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1729479862);
        int i2 = i | (x340Var.i(obj) ? 4 : 2) | (x340Var.g(xtb0Var) ? 32 : 16) | (x340Var.f(j) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = yv91.a(new sqm(xtb0Var, obj, (byte) 21));
                x340Var.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            t1c.a(dug.e(u291.h(u291.f(qim0Var3, 1.0f), 4.0f), v9c.s(p7h.M(new u7h[]{new u7h(u7h.b(j, ((Boolean) ((tob1) objT).getValue()).booleanValue() ? u7h.c(j) : 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))}), 0.0f, 0.0f, 14), null, 0.0f, 6), x340Var, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cg6(obj, (Object) xtb0Var, j, (Object) qim0Var2, i, (byte) 6);
        }
    }

    public static final void q(tde1 tde1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        String str = tde1Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2091884959);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(tde1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            flb0 flb0VarR = f5p1.r(tde1Var.h, x340Var);
            int iMin = Math.min(tde1Var.c, str.length());
            ye5 ye5Var = new ye5();
            if (iMin > 0) {
                int iO = ye5Var.o(new zma1(z4p1.e(tde1Var.g), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                try {
                    ye5Var.g(str.substring(0, iMin));
                    ye5Var.k(iO);
                } catch (Throwable th) {
                    ye5Var.k(iO);
                    throw th;
                }
            }
            if (iMin < str.length()) {
                int iO2 = ye5Var.o(new zma1(z4p1.e(tde1Var.f), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                try {
                    ye5Var.g(str.substring(iMin));
                    ye5Var.k(iO2);
                } catch (Throwable th2) {
                    ye5Var.k(iO2);
                    throw th2;
                }
            }
            af5 af5VarP = ye5Var.p();
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).d;
            boolean zG = x340Var.g(lee1Var);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, fc11.Y(TextUnit.c(lee1Var.a.b) + 14.0f, 4294967296L), (u8e1) null, (wdt0) null, (shc0) null, 0, 16646143);
                x340Var.s0(objT);
            }
            mod.b(t4k.n.a(flb0VarR), apo.r(-563165985, new bvd1(tde1Var, iu30Var, af5VarP, (lee1) objT, (byte) 3), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(tde1Var, iu30Var, i, (byte) 14);
        }
    }

    public static final void r(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
        }
    }

    public static final int s(h661 h661Var, h661[] h661VarArr) {
        int iHashCode = (h661Var.h().hashCode() * 31) + Arrays.hashCode(h661VarArr);
        int iD = h661Var.d();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iD > 0)) {
                break;
            }
            int i2 = iD - 1;
            int i3 = i * 31;
            String strH = h661Var.g(h661Var.d() - iD).h();
            if (strH != null) {
                iHashCode2 = strH.hashCode();
            }
            i = i3 + iHashCode2;
            iD = i2;
        }
        int iD2 = h661Var.d();
        int iHashCode3 = 1;
        while (true) {
            if (!(iD2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iD2 - 1;
            int i5 = iHashCode3 * 31;
            yoi1 kind = h661Var.g(h661Var.d() - iD2).getKind();
            iHashCode3 = i5 + (kind != null ? kind.hashCode() : 0);
            iD2 = i4;
        }
    }

    public static k3l0 t(String str, String str2) {
        return new k3l0(str, str2);
    }

    public static final ValueAnimator u(View view, s5u s5uVar, int i, int i2, float f, float f2, Function0 function0) {
        s5u s5uVar2 = s5u.a;
        s5u s5uVar3 = s5u.b;
        boolean zContains = p7h.M(new s5u[]{s5uVar2, s5uVar3}).contains(s5uVar);
        view.setVisibility(0);
        view.setAlpha(f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (zContains) {
            layoutParams.width = i;
        } else {
            layoutParams.height = i;
        }
        view.setLayoutParams(layoutParams);
        view.requestLayout();
        boolean zContains2 = p7h.M(new s5u[]{s5uVar2, s5uVar3}).contains(s5uVar);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new d7k1(i, i2, f, f2, view, zContains2));
        valueAnimatorOfFloat.addListener(new d20(function0, (byte) 17));
        view.post(new seg1(valueAnimatorOfFloat, (byte) 4));
        return valueAnimatorOfFloat;
    }

    public static final void v(RemoteViews remoteViews, cng1 cng1Var, lk80 lk80Var, ArrayList arrayList) {
        int i = 0;
        for (Object obj : o7h.d1(arrayList, 10)) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            x(remoteViews, cng1Var.b(lk80Var, i), (i3x) obj);
            i = i2;
        }
    }

    public static final String w(h661 h661Var) {
        return o7h.y0(yoi1.Q(0, h661Var.d()), ", ", h661Var.h() + '(', ")", new waq0(h661Var, (byte) 2), 24);
    }

    /* JADX WARN: Code duplicated, block: B:205:0x03be  */
    public static final void x(RemoteViews remoteViews, cng1 cng1Var, i3x i3xVar) {
        vnb0 vnb0Var;
        Layout.Alignment alignment;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Context context = cng1Var.a;
        gkz0 gkz0Var = gkz0.c;
        if (i3xVar instanceof j3x) {
            j3x j3xVar = (j3x) i3xVar;
            ArrayList<i3x> arrayList = ((s3x) j3xVar).b;
            int size = arrayList.size();
            gt40 gt40Var = j3xVar.c;
            ql3 ql3Var = j3xVar.d;
            lk80 lk80VarC = qnb0.c(remoteViews, cng1Var, vnb0.c, size, gt40Var, new ml3(ql3Var.a), new ol3(ql3Var.b));
            i3o1.f(cng1Var, remoteViews, j3xVar.c, lk80VarC);
            for (i3x i3xVar2 : arrayList) {
                i3xVar2.c(i3xVar2.b().c(new cm3(j3xVar.d)));
            }
            v(remoteViews, cng1Var, lk80VarC, arrayList);
            return;
        }
        boolean z = true;
        if (i3xVar instanceof o3x) {
            o3x o3xVar = (o3x) i3xVar;
            vnb0 vnb0Var2 = (Build.VERSION.SDK_INT < 31 || !o3xVar.c.a(gkz0Var)) ? vnb0.a : vnb0.b1;
            ArrayList arrayList2 = ((s3x) o3xVar).b;
            lk80 lk80VarC2 = qnb0.c(remoteViews, cng1Var, vnb0Var2, arrayList2.size(), o3xVar.c, (ml3) null, new ol3(o3xVar.e));
            int i6 = lk80VarC2.a;
            int i7 = o3xVar.d;
            int i8 = o3xVar.e;
            if (i7 == 0) {
                i4 = 8388611;
            } else if (i7 == 2) {
                i4 = 8388613;
            } else if (i7 == 1) {
                i4 = 1;
            } else {
                ml3.c(i7);
                i4 = 8388611;
            }
            if (i8 == 0) {
                i5 = 48;
            } else if (i8 == 2) {
                i5 = 80;
            } else if (i8 == 1) {
                i5 = 16;
            } else {
                ol3.c(i8);
                i5 = 48;
            }
            remoteViews.setInt(i6, "setGravity", i4 | i5);
            i3o1.f(cng1.a(cng1Var, 0, null, null, null, 0L, null, 28671), remoteViews, o3xVar.c, lk80VarC2);
            v(remoteViews, cng1Var, lk80VarC2, arrayList2);
            if (o3xVar.c.a(gkz0Var)) {
                r(arrayList2);
                return;
            }
            return;
        }
        if (i3xVar instanceof l3x) {
            l3x l3xVar = (l3x) i3xVar;
            vnb0 vnb0Var3 = (Build.VERSION.SDK_INT < 31 || !l3xVar.c.a(gkz0Var)) ? vnb0.b : vnb0.c1;
            ArrayList arrayList3 = ((s3x) l3xVar).b;
            lk80 lk80VarC3 = qnb0.c(remoteViews, cng1Var, vnb0Var3, arrayList3.size(), l3xVar.c, new ml3(l3xVar.e), (ol3) null);
            int i9 = lk80VarC3.a;
            int i10 = l3xVar.e;
            int i11 = l3xVar.d;
            if (i10 == 0) {
                i2 = 8388611;
            } else if (i10 == 2) {
                i2 = 8388613;
            } else if (i10 == 1) {
                i2 = 1;
            } else {
                ml3.c(i10);
                i2 = 8388611;
            }
            if (i11 == 0) {
                i3 = 48;
            } else if (i11 == 2) {
                i3 = 80;
            } else if (i11 == 1) {
                i3 = 16;
            } else {
                ol3.c(i11);
                i3 = 48;
            }
            remoteViews.setInt(i9, "setGravity", i2 | i3);
            i3o1.f(cng1.a(cng1Var, 0, null, null, null, 0L, null, 28671), remoteViews, l3xVar.c, lk80VarC3);
            v(remoteViews, cng1Var, lk80VarC3, arrayList3);
            if (l3xVar.c.a(gkz0Var)) {
                r(arrayList3);
                return;
            }
            return;
        }
        if (i3xVar instanceof r3x) {
            r3x r3xVar = (r3x) i3xVar;
            lk80 lk80VarD = qnb0.d(remoteViews, cng1Var, vnb0.d, r3xVar.d);
            int i12 = lk80VarD.a;
            CharSequence charSequence = r3xVar.a;
            kee1 kee1Var = r3xVar.b;
            int i13 = r3xVar.c;
            if (i13 != Integer.MAX_VALUE) {
                remoteViews.setInt(i12, "setMaxLines", i13);
            }
            if (kee1Var == null) {
                remoteViews.setTextViewText(i12, charSequence);
            } else {
                SpannableString spannableString = new SpannableString(charSequence);
                int length = spannableString.length();
                TextUnit textUnit = kee1Var.b;
                if (textUnit != null) {
                    long j = textUnit.a;
                    if (!TextUnit.e(j)) {
                        hhg1.n("Only Sp is currently supported for font sizes");
                        return;
                    }
                    remoteViews.setTextViewTextSize(i12, 2, TextUnit.c(j));
                }
                ArrayList arrayList4 = new ArrayList();
                ka30 ka30Var = kee1Var.c;
                if (ka30Var != null) {
                    short s = ka30Var.a;
                    arrayList4.add(new TextAppearanceSpan(context, s == 700 ? 2132017670 : s == 500 ? 2132017672 : 2132017673));
                }
                if (kee1Var.e != null) {
                    arrayList4.add(new TypefaceSpan("sans-serif-medium"));
                }
                zzd1 zzd1Var = kee1Var.d;
                if (zzd1Var != null) {
                    byte b2 = zzd1Var.a;
                    if (Build.VERSION.SDK_INT >= 31) {
                        if (b2 == 3) {
                            i = 1;
                        } else if (b2 == 1) {
                            i = 3;
                        } else if (b2 == 2) {
                            i = 5;
                        } else {
                            i = (b2 != 4 && b2 == 5) ? 8388613 : 8388611;
                        }
                        tee1.a.a(remoteViews, i12, i | 48);
                    } else {
                        boolean z2 = cng1Var.c;
                        if (b2 == 3) {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        } else if (b2 == 1) {
                            alignment = z2 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                        } else if (b2 == 2) {
                            alignment = z2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                        } else {
                            alignment = (b2 != 4 && b2 == 5) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                        }
                        arrayList4.add(new AlignmentSpan.Standard(alignment));
                    }
                }
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    spannableString.setSpan((ParcelableSpan) it.next(), 0, length, 17);
                }
                remoteViews.setTextViewText(i12, spannableString);
                hn20 hn20Var = kee1Var.a;
                if (hn20Var instanceof hn20) {
                    remoteViews.setTextColor(i12, z4p1.G(hn20Var.a));
                } else if (hn20Var instanceof tw21) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        b421.g(remoteViews, i12, "setTextColor", ((tw21) hn20Var).a);
                    } else {
                        remoteViews.setTextColor(i12, z4p1.G(((tw21) hn20Var).a(context)));
                    }
                } else if (!(hn20Var instanceof l7r)) {
                    Objects.toString(hn20Var);
                } else if (Build.VERSION.SDK_INT >= 31) {
                    l7r l7rVar = (l7r) hn20Var;
                    b421.f(remoteViews, i12, "setTextColor", z4p1.G(l7rVar.a), z4p1.G(l7rVar.b));
                } else {
                    remoteViews.setTextColor(i12, z4p1.G(((l7r) hn20Var).a(context)));
                }
            }
            i3o1.f(cng1Var, remoteViews, r3xVar.d, lk80VarD);
            return;
        }
        if (i3xVar instanceof q3x) {
            q3x q3xVar = (q3x) i3xVar;
            i3o1.f(cng1Var, remoteViews, q3xVar.a, qnb0.d(remoteViews, cng1Var, vnb0.i, q3xVar.a));
            return;
        }
        if (!(i3xVar instanceof n3x)) {
            if (!(i3xVar instanceof k3x)) {
                if (!(i3xVar instanceof p3x)) {
                    tw20.t(i3xVar.getClass().getCanonicalName(), "Unknown element type ");
                    return;
                }
                ArrayList arrayList5 = ((s3x) ((p3x) i3xVar)).b;
                if (arrayList5.size() <= 1) {
                    i3x i3xVar3 = (i3x) o7h.s0(arrayList5);
                    if (i3xVar3 != null) {
                        x(remoteViews, cng1Var, i3xVar3);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(("Size boxes can only have at most one child " + arrayList5.size() + ". The normalization of the composition tree failed.").toString());
            }
            k3x k3xVar = (k3x) i3xVar;
            lk80 lk80VarD2 = qnb0.d(remoteViews, cng1Var, vnb0.X, k3xVar.a);
            int i14 = lk80VarD2.a;
            remoteViews.setProgressBar(i14, 0, 0, true);
            if (Build.VERSION.SDK_INT >= 31) {
                hn20 hn20Var2 = k3xVar.b;
                if (hn20Var2 instanceof hn20) {
                    b421.h(remoteViews, i14, "setIndeterminateTintList", ColorStateList.valueOf(z4p1.G(hn20Var2.a)));
                } else if (hn20Var2 instanceof tw21) {
                    b421.g(remoteViews, i14, "setIndeterminateTintList", ((tw21) hn20Var2).a);
                } else if (hn20Var2 instanceof l7r) {
                    l7r l7rVar2 = (l7r) hn20Var2;
                    b421.i(remoteViews, i14, "setIndeterminateTintList", ColorStateList.valueOf(z4p1.G(l7rVar2.a)), ColorStateList.valueOf(z4p1.G(l7rVar2.b)));
                } else {
                    Objects.toString(hn20Var2);
                }
            }
            i3o1.f(cng1Var, remoteViews, k3xVar.a, lk80VarD2);
            return;
        }
        n3x n3xVar = (n3x) i3xVar;
        boolean zD = yoi1.D(n3xVar);
        int i15 = n3xVar.d;
        if (i15 == 0) {
            vnb0Var = zD ? vnb0.W0 : vnb0.T0;
        } else {
            vnb0 vnb0Var4 = vnb0.U0;
            if (i15 == 1) {
                vnb0Var = zD ? vnb0.X0 : vnb0Var4;
            } else if (i15 == 2) {
                vnb0Var = zD ? vnb0.Y0 : vnb0.V0;
            } else {
                i6m.c(i15);
            }
        }
        lk80 lk80VarD3 = qnb0.d(remoteViews, cng1Var, vnb0Var, n3xVar.a);
        int i16 = lk80VarD3.a;
        yx70 yx70Var = n3xVar.b;
        if (yx70Var instanceof p05) {
            remoteViews.setImageViewResource(i16, ((p05) yx70Var).a);
        } else if (yx70Var instanceof lxa) {
            remoteViews.setImageViewBitmap(i16, ((lxa) yx70Var).a);
        } else {
            if (!(yx70Var instanceof o2i1)) {
                hhg1.n("An unsupported ImageProvider type was used.");
                return;
            }
            remoteViews.setImageViewUri(i16, ((o2i1) yx70Var).a);
        }
        oxe1 oxe1Var = n3xVar.c;
        if (oxe1Var != null) {
            if (!(oxe1Var instanceof oxe1)) {
                hhg1.n("An unsupported ColorFilter was used.");
                return;
            }
            z9h z9hVar = oxe1Var.a;
            if (Build.VERSION.SDK_INT >= 31) {
                o080.a.a(cng1Var, remoteViews, z9hVar, i16);
            } else {
                remoteViews.setInt(i16, "setColorFilter", z4p1.G(z9hVar.a(context)));
            }
        }
        i3o1.f(cng1Var, remoteViews, n3xVar.a, lk80VarD3);
        if (n3xVar.d == 1) {
            iql1 iql1Var = (iql1) n3xVar.a.foldIn((Object) null, g070.Q0);
            b5u b5uVar = iql1Var != null ? iql1Var.a : null;
            z4u z4uVar = z4u.a;
            if (!u890.j(b5uVar, z4uVar)) {
                f660 f660Var = (f660) n3xVar.a.foldIn((Object) null, g070.R0);
                if (!u890.j(f660Var != null ? f660Var.a : null, z4uVar)) {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        remoteViews.setBoolean(i16, "setAdjustViewBounds", z);
    }

    public static final RemoteViews y(Context context, int i, e421 e421Var, dlb0 dlb0Var, int i2, ComponentName componentName) {
        cng1 cng1Var = new cng1(context, i, context.getResources().getConfiguration().getLayoutDirection() == 1, dlb0Var, -1, false, new AtomicInteger(1), new lk80(0, 0, (Map) null, 7), new AtomicBoolean(false), 9205357640488583168L, -1, false, null, componentName);
        ArrayList<p3x> arrayList = ((s3x) e421Var).b;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!(((i3x) it.next()) instanceof p3x)) {
                    i3x i3xVar = (i3x) o7h.V0(arrayList);
                    d421 d421VarA = qnb0.a(cng1Var, i3xVar.b(), i2);
                    RemoteViews remoteViews = d421VarA.a;
                    x(remoteViews, cng1.a(cng1Var.b(d421VarA.b, 0), 0, new AtomicInteger(1), null, new AtomicBoolean(false), 0L, null, 32447), i3xVar);
                    return remoteViews;
                }
            }
        }
        x291 x291Var = ((p3x) o7h.q0(arrayList)).d;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (p3x p3xVar : arrayList) {
            long j = p3xVar.c;
            d421 d421VarA2 = qnb0.a(cng1Var, p3xVar.b(), i2);
            RemoteViews remoteViews2 = d421VarA2.a;
            x(remoteViews2, cng1.a(cng1Var.b(d421VarA2.b, 0), 0, new AtomicInteger(1), null, new AtomicBoolean(false), j, null, 31935), p3xVar);
            arrayList2.add(new mmr0(new SizeF(s3v.b(j), s3v.a(j)), remoteViews2));
        }
        if (x291Var instanceof w291) {
            return (RemoteViews) ((mmr0) o7h.V0(arrayList2)).b;
        }
        if (!u890.j(x291Var, v291.a)) {
            eg.o();
            return null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return vh5.a.a(sqg0.T(arrayList2));
        }
        if (arrayList2.size() != 1 && arrayList2.size() != 2) {
            hhg1.n("unsupported views size");
            return null;
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add((RemoteViews) ((mmr0) it2.next()).b);
        }
        int size = arrayList3.size();
        if (size == 1) {
            return (RemoteViews) arrayList3.get(0);
        }
        if (size == 2) {
            return new RemoteViews((RemoteViews) arrayList3.get(0), (RemoteViews) arrayList3.get(1));
        }
        hhg1.n("There must be between 1 and 2 views.");
        return null;
    }
}
