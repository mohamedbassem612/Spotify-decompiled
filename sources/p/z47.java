package p;

import android.R;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.casita.v1.resolved.ResponseInfo;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import com.spotify.mobius.Next;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class z47 {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static b180 e;
    public static b180 f;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(int i, String str, Function0 function0, Function0 function1, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        int i3 = (kk0.t(452569309, i, x340Var) ? 4 : 2) | i2 | (x340Var.g(str) ? 32 : 16) | (x340Var.i(function0) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.i(function1) ? SemanticState.Modal : SemanticState.ReadOnly);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            int iC = l1d.C(i);
            if (iC == 0) {
                x340Var.i0(1127424982);
                fq7.l(((i3 >> 6) & ContentType.LONG_FORM_ON_DEMAND) | ((i3 >> 3) & 14), str, function1, x340Var, (qim0) null);
                x340Var.r(false);
            } else if (iC == 1) {
                x340Var.i0(1127419672);
                fq7.j(((i3 >> 6) & ContentType.LONG_FORM_ON_DEMAND) | ((i3 >> 3) & 14), str, function1, x340Var, (qim0) null);
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, 1127414198, false);
                }
                x340Var.i0(1127415446);
                fq7.u(function0, function1, (qim0) null, x340Var, (i3 >> 6) & 126);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mi2(i, str, function0, function1, i2);
        }
    }

    public static final void b(hdk hdkVar, long j, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        boolean z;
        String str = hdkVar.d;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(857047169);
        if ((i & 48) == 0) {
            i2 = (x340Var2.i(hdkVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.f(j) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 145) != 144)) {
            if (str.length() > 0) {
                x340Var2.i0(-1288242976);
                uwr uwrVar = cbx.a;
                z = false;
                uwo1.e(str, (qim0) null, cbx.d(x340Var2).j, j, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, (i2 << 3) & 7168, 0, 1714);
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                x340Var = x340Var2;
                z = false;
                x340Var.i0(-1288053535);
                x340Var.r(false);
            }
            if (hdkVar.e.length() > 0) {
                x340Var.i0(-1288003687);
                String str2 = hdkVar.e;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str2, (qim0) null, cbx.d(x340Var).h, j, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, (i2 << 3) & 7168, 0, 1714);
                x340Var.r(z);
            } else {
                x340Var.i0(-1287807519);
                x340Var.r(z);
            }
            if (hdkVar.f.length() > 0) {
                x340Var.i0(-1287753734);
                String str3 = hdkVar.f;
                uwr uwrVar3 = cbx.a;
                uwo1.e(str3, (qim0) null, cbx.d(x340Var).j, j, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, (i2 << 3) & 7168, 0, 1714);
                x340Var.r(z);
            } else {
                x340Var.i0(-1287558527);
                x340Var.r(z);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ip30(hdkVar, j, i, (byte) 0);
        }
    }

    public static final void c(String str, boolean z, long j, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1526020792);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.f(j) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).c;
            yfu yfuVar = ajx.a;
            Object obj = yfuVar.b;
            FontWeight fontWeight = (FontWeight) ((bjx) yfuVar.c).e;
            cjc0 cjc0Var = new cjc0(z ? 1 : 2);
            b0kVar2 = b0kVar3;
            gxo1.c(upperCase, (qim0) null, lee1Var, j, new a0e1(3), 2, false, cjc0Var, new px8(fc11.G(20), fc11.G(32), 0L, z ? new mx8(1) : new mx8(2), 4), 150.0f, fontWeight, (iu30) null, b0kVar2, ((i2 << 3) & 7168) | 134217728, 0, 2114);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jp30(i, j, str, z);
        }
    }

    public static final void d(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        Function0 function1;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-892306287);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = l6o1.H(u291.f(qim0Var3, 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarH);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarP);
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
            uwr uwrVar = cbx.a;
            op71.g(x340Var, u291.h(qim0Var3, cbx.b(x340Var).b.a));
            cwl1.f(i3o1.n(2131231283, x340Var, 0), (String) null, i1p1.q(uyn1.z(cbx.b(x340Var).b.a, 0.0f, 2, u291.f(qim0Var3, 0.85f)), er31.b(16.0f)), (tl3) null, mif1.Q0, 0.0f, (ColorFilter) null, x340Var, 56, 104);
            qim0Var2 = qim0Var3;
            uwo1.e(ydh.g(cbx.b(x340Var).b.a, 2131954945, x340Var, x340Var, qim0Var3), (qim0) null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2018);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(ydh.g(16.0f, 2131954944, x340Var, x340Var, qim0Var2), (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2018);
            op71.g(x340Var, u291.h(qim0Var2, cbx.b(x340Var).b.a));
            function1 = function0;
            gfx.g(13, apo.r(-271499442, new bvk(function1, (byte) 15), x340Var), x340Var, 54);
            x0d.s(qim0Var2, cbx.b(x340Var).b.e, x340Var, true);
        } else {
            function1 = function0;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(function1, qim0Var2, i, (byte) 21);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public static final void e(hdk hdkVar, long j, b0k b0kVar, int i) {
        int i2;
        long j2;
        ?? r3;
        String str = hdkVar.B;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(553034677);
        if ((i & 48) == 0) {
            i2 = (x340Var.i(hdkVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            j2 = j;
            i2 |= x340Var.f(j2) ? SemanticState.Hidden : SemanticState.Focused;
        } else {
            j2 = j;
        }
        if (x340Var.Y(i2 & 1, (i2 & 145) != 144)) {
            if (str.length() > 0) {
                x340Var.i0(-38363737);
                uwr uwrVar = cbx.a;
                r3 = 0;
                uwo1.e(str, (qim0) null, cbx.d(x340Var).h, j2, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, (i2 << 3) & 7168, 0, 1714);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                r3 = 0;
                x340Var.i0(-38169491);
                x340Var.r(false);
            }
            String str2 = hdkVar.f;
            String str3 = hdkVar.g;
            uwr uwrVar2 = cbx.a;
            FontWeight fontWeight = cbx.d(x340Var).k.a.c;
            boolean zG = x340Var.g(str2) | x340Var.g(str3) | x340Var.g(fontWeight);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                ye5 ye5Var = new ye5();
                ye5Var.g(str2);
                if (str3.length() > 0) {
                    if (str2.length() > 0) {
                        ye5Var.g(" ");
                    }
                    int iO = ye5Var.o(new zma1(0L, 0L, fontWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65531));
                    try {
                        ye5Var.g(str3);
                        ye5Var.k(iO);
                    } catch (Throwable th) {
                        ye5Var.k(iO);
                        throw th;
                    }
                }
                objT = ye5Var.p();
                x340Var.s0(objT);
            }
            af5 af5Var = (af5) objT;
            int i3 = hdkVar.C;
            if (af5Var.b.length() <= 0 && i3 == 0) {
                x340Var.i0(-37258835);
                x340Var.r((boolean) r3);
            } else {
                x340Var.i0(-37960489);
                fra fraVar = een.N0;
                cvx cvxVar = cbx.b(x340Var).b;
                jw31 jw31VarA = ew31.a(new d36(6.0f, (boolean) r8, new um5((boolean) r3)), fraVar, x340Var, (int) r3);
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
                if (i3 != 0) {
                    x340Var.i0(-90975157);
                    hux huxVarK = rck.k(i3);
                    zov0 zov0Var = cbx.b(x340Var).g;
                    w0h1.a(huxVarK, isl.a, anm1.N("countdown_icon", u291.r(nim0Var, 16.0f)), j, 0L, false, x340Var, 56 | ((i2 << 3) & 7168), 48);
                    x340Var.r((boolean) r3);
                } else {
                    x340Var.i0(-90728893);
                    x340Var.r((boolean) r3);
                }
                if (af5Var.b.length() > 0) {
                    x340Var.i0(-90677681);
                    x340 x340Var2 = x340Var;
                    uwo1.d(af5Var, j, (qim0) null, cbx.d(x340Var).j, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, (cqs0) null, x340Var2, (i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND, 0, 3764);
                    x340Var = x340Var2;
                    x340Var.r((boolean) r3);
                } else {
                    x340Var.i0(-90466013);
                    x340Var.r((boolean) r3);
                }
                x340Var.r((boolean) r8);
                x340Var.r((boolean) r3);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ip30(hdkVar, j, i, (byte) 1);
        }
    }

    public static final void f(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-317713722);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nyx.a(2, (wux) null, apo.r(1305049811, new bvk(function0), x340Var), x340Var, 3078, 6);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(function0, qim0Var, i, (byte) 22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean] */
    public static final void g(hdk hdkVar, long j, float f2, tob1 tob1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        vex vexVar;
        qim0 qim0Var;
        vu30 vu30Var;
        tl3 tl3Var;
        long j2;
        Function0 function0;
        ?? r7;
        float f3;
        h2c h2cVar;
        vu30 vu30Var2;
        vu30 vu30Var3;
        vu30 vu30Var4;
        Function0 function1;
        boolean z;
        llj lljVar;
        Function0 function2;
        String str = hdkVar.A;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(155873717);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(hdkVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f2) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(tob1Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            vex vexVar2 = (vex) zex.a.e;
            long j3 = vexVar2.d;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarR = d7e.r(f2, u291.f(qim0Var2, 1.0f), false);
            tl3 tl3Var2 = een.d;
            gfh0 gfh0VarC = t1c.c(tl3Var2, false);
            int i3 = i2;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            Function0 function3 = hmb0.t1;
            if (z2) {
                x340Var.l(function3);
            } else {
                x340Var.v0();
            }
            vu30 vu30Var5 = y580.O0;
            nko1.H(gfh0VarC, x340Var, vu30Var5);
            vu30 vu30Var6 = y580.N0;
            nko1.H(xos0VarM, x340Var, vu30Var6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar2);
            nko1.F(x340Var);
            vu30 vu30Var7 = y580.Y;
            nko1.H(qim0VarE, x340Var, vu30Var7);
            int length = str.length();
            isl islVar = isl.a;
            if (length > 0) {
                x340Var.i0(605659365);
                vu30Var = vu30Var6;
                r7 = 0;
                function0 = function3;
                qim0Var = qim0Var2;
                tl3Var = tl3Var2;
                f3 = 1.0f;
                vexVar = vexVar2;
                j2 = j3;
                eso1.e(Uri.parse(str), islVar, u291.d(qim0Var2, 1.0f), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, oux.a, false, false, x340Var, 224304, 0, 3456);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                vexVar = vexVar2;
                qim0Var = qim0Var2;
                vu30Var = vu30Var6;
                tl3Var = tl3Var2;
                j2 = j3;
                function0 = function3;
                r7 = 0;
                f3 = 1.0f;
                x340Var.i0(605999559);
                x340Var.r(false);
            }
            h2c h2cVar2 = h2c.a;
            t1c.a(dug.e(h2cVar2.b(qim0Var), v9c.t(new mmr0[]{new mmr0(Float.valueOf(0.5f), new u7h(vexVar.a)), new mmr0(Float.valueOf(f3), new u7h(j2))}, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var, (int) r7);
            brl.c((i3 >> 6) & ContentType.LONG_FORM_ON_DEMAND, x340Var, u291.r(uyn1.x(h2cVar2.a(qim0Var, tl3Var), 16.0f), 72.0f), tob1Var);
            if (hdkVar.s) {
                x340Var.i0(606455166);
                qim0 qim0VarN = anm1.N("full_bleed_overflow", dug.f(i1p1.q(uyn1.x(h2cVar2.a(qim0Var, een.f), 16.0f), er31.a), j2, d4o1.a));
                ?? r15 = (i3 & 57344) == 16384 ? 1 : r7;
                Object objT = x340Var.T();
                if (r15 != 0 || objT == fkj0.X) {
                    objT = new bb30(iu30Var, (byte) 6);
                    x340Var.s0(objT);
                }
                qim0 qim0VarX = uyn1.x(bin.x(qim0VarN, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), 8.0f);
                gfh0 gfh0VarC2 = t1c.c(tl3Var, (boolean) r7);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
                x340Var.m0();
                if (x340Var.S) {
                    function2 = function0;
                    x340Var.l(function2);
                } else {
                    function2 = function0;
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, vu30Var5);
                vu30Var4 = vu30Var;
                nko1.H(xos0VarM2, x340Var, vu30Var4);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                vu30Var2 = vu30Var7;
                nko1.H(qim0VarE2, x340Var, vu30Var2);
                fpx fpxVar = fpx.c;
                zov0 zov0Var = cbx.b(x340Var).g;
                h2cVar = h2cVar2;
                lljVar = lljVar2;
                x340 x340Var2 = x340Var;
                vu30Var3 = vu30Var5;
                function1 = function2;
                w0h1.a(fpxVar, islVar, anm1.N("full_bleed_overflow_icon", u291.r(qim0Var, 24.0f)), j, 0L, false, x340Var2, fpx.d | 48 | ((i3 << 6) & 7168), 48);
                x340Var = x340Var2;
                z = true;
                x340Var.r(true);
                x340Var.r(false);
            } else {
                ?? r9 = r7;
                h2cVar = h2cVar2;
                vu30Var2 = vu30Var7;
                vu30Var3 = vu30Var5;
                vu30Var4 = vu30Var;
                function1 = function0;
                z = true;
                lljVar = lljVar2;
                x340Var.i0(607048103);
                x340Var.r((boolean) r9);
            }
            boolean zI0 = ihc1.i0(ihc1.e1(hdkVar.b).toString(), ' ') ^ z;
            gra graVar = een.X;
            qim0 qim0VarY = uyn1.y(u291.f(h2cVar.a(qim0Var, graVar), f3), cvxVar.b, 16.0f);
            gfh0 gfh0VarC3 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarY);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC3, x340Var, vu30Var3);
            nko1.H(xos0VarM3, x340Var, vu30Var4);
            x0d.q(iHashCode3, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE3, x340Var, vu30Var2);
            c(hdkVar.b, zI0, j, x340Var, (i3 << 3) & 896);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kp30(hdkVar, j, f2, tob1Var, iu30Var, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    public static final void h(hdk hdkVar, iu30 iu30Var, qim0 qim0Var, boolean z, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var;
        qim0 qim0Var2;
        Object obj;
        boolean z2;
        long j;
        Object next;
        long jA;
        long j2;
        ?? r7;
        iu30 iu30Var2;
        m4c m4cVar;
        int i2;
        ?? r2;
        boolean z3;
        Object obj2;
        iu30 iu30Var3 = iu30Var;
        m4c m4cVar2 = fkj0.X;
        u7h u7hVar = hdkVar.k;
        u7h u7hVar2 = hdkVar.j;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1125381219);
        j06 j06Var = x340Var2.a;
        int i3 = i | (x340Var2.i(hdkVar) ? 4 : 2) | (x340Var2.i(iu30Var3) ? 32 : 16) | 384 | (x340Var2.h(z) ? SemanticState.Modal : SemanticState.ReadOnly);
        if (x340Var2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cbx.a.getClass();
            float f2 = ((ecx) uwr.m.getValue()).a;
            boolean zD = x340Var2.d(f2);
            Object objT = x340Var2.T();
            if (zD || objT == m4cVar2) {
                obj = objT;
                lp30 lp30Var = new lp30(f2);
                x340Var2.s0(lp30Var);
                obj = lp30Var;
            }
            lp30 lp30Var2 = (lp30) obj;
            gv21 gv21VarZ = sj1.z(hdkVar.f62p, hdkVar.m, vqo1.j(x340Var2), hdkVar.q, hdkVar.r, z);
            boolean z4 = gv21VarZ.d;
            boolean z5 = gv21VarZ.c;
            ven0 ven0VarD = pap1.D(z5 || z4, x340Var2);
            boolean zG = x340Var2.g(ven0VarD);
            Object objT2 = x340Var2.T();
            Object obj3 = objT2;
            if (zG || objT2 == m4cVar2) {
                mdt mdtVarA = yv91.a(new bu2(ven0VarD, (byte) 6));
                x340Var2.s0(mdtVarA);
                obj3 = mdtVarA;
            }
            tob1 tob1Var = (tob1) obj3;
            if (u7hVar2 == null) {
                x340Var2.i0(840435553);
                j = cbx.a(x340Var2).b.a;
                z2 = false;
                x340Var2.r(false);
            } else {
                z2 = false;
                x340Var2.i0(840434282);
                x340Var2.r(false);
                j = u7hVar2.a;
            }
            if (hdkVar.A.length() == 0) {
                x340Var2.i0(283762539);
                x340Var2.r(z2);
            } else {
                x340Var2.i0(283796391);
                long j3 = cbx.a(x340Var2).b.a;
                Iterator it = f46.i0(new u7h[]{u7hVar2, u7hVar}).iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        Iterator it2 = it;
                        float fB = z4p1.B(((u7h) next).a);
                        while (true) {
                            Object next2 = it2.next();
                            Iterator it3 = it2;
                            float fB2 = z4p1.B(((u7h) next2).a);
                            if (Float.compare(fB, fB2) < 0) {
                                next = next2;
                                fB = fB2;
                            }
                            if (!it3.hasNext()) {
                                break;
                            }
                            iu30Var3 = iu30Var;
                            it2 = it3;
                            i3 = i3;
                        }
                    }
                } else {
                    next = null;
                }
                u7h u7hVar3 = (u7h) next;
                j = u7hVar3 != null ? u7hVar3.a : j3;
                x340Var2.r(false);
            }
            qim0Var2 = nim0.a;
            qim0 qim0VarQ = i1p1.q(anm1.N("full_bleed_card", uyn1.x(pap1.r(u291.f(qim0Var2, 1.0f), tob1Var, z4, 12), rck.e)), lp30Var2);
            if (u7hVar == null) {
                x340Var2.i0(840458081);
                uwr uwrVar2 = cbx.a;
                jA = cbx.a(x340Var2).a.b.a();
                x340Var2.r(false);
            } else {
                x340Var2.i0(840456252);
                x340Var2.r(false);
                jA = u7hVar.a;
            }
            qim0 qim0VarF = dug.f(qim0VarQ, jA, d4o1.a);
            int i4 = i3 & ContentType.LONG_FORM_ON_DEMAND;
            boolean z6 = i4 == 32;
            Object objT3 = x340Var2.T();
            Object obj4 = objT3;
            if (z6 || objT3 == m4cVar2) {
                bb30 bb30Var = new bb30(iu30Var3, (byte) 7);
                x340Var2.s0(bb30Var);
                obj4 = bb30Var;
            }
            qim0 qim0VarX = bin.x(qim0VarF, false, (String) null, (pm31) null, (idn0) null, (Function0) obj4, 15);
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var2, 0);
            long j4 = j;
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z7 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z7) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            if (!z5) {
                ven0VarD = null;
            }
            int i5 = i3;
            g(hdkVar, j4, f2, ven0VarD, iu30Var3, x340Var2, (i3 & 14) | ((i3 << 9) & 57344));
            qim0 qim0VarF2 = u291.f(qim0Var2, 1.0f);
            uwr uwrVar3 = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarX2 = uyn1.x(qim0VarF2, 16.0f);
            fra fraVar = een.N0;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarX2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            wnb0 wnb0VarQ = kk0.q(x340Var2, qim0VarE2, lljVar4, 1.0f, true);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            mbh mbhVarA2 = jbh.a(new d36(4.0f, true, new um5(false)), eraVar, x340Var2, 0);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, wnb0VarQ);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            int iC = l1d.C(hdkVar.G);
            if (iC == 0) {
                j2 = j;
                r7 = 0;
                x340Var2.i0(377178671);
                b(hdkVar, j2, x340Var2, 6 | ((i5 << 3) & ContentType.LONG_FORM_ON_DEMAND));
                x340Var2.r(false);
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var2, 377176617, false);
                }
                x340Var2.i0(377181040);
                j2 = j;
                e(hdkVar, j2, x340Var2, 6 | ((i5 << 3) & ContentType.LONG_FORM_ON_DEMAND));
                r7 = 0;
                x340Var2.r(false);
            }
            x340Var2.r(true);
            cvx cvxVar4 = cbx.b(x340Var2).b;
            jw31 jw31VarA2 = ew31.a(new d36(6.0f, true, new um5((boolean) r7)), fraVar, x340Var2, (int) r7);
            int iHashCode4 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM4 = x340Var2.m();
            qim0 qim0VarE4 = zr7.E(x340Var2, qim0Var2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA2, x340Var2, lljVar);
            nko1.H(xos0VarM4, x340Var2, lljVar2);
            x0d.q(iHashCode4, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE4, x340Var2, lljVar4);
            if (hdkVar.z) {
                x340Var2.i0(-26268325);
                gdx gdxVarS = yla.s(x340Var2);
                mta mtaVar = cbx.b(x340Var2).d;
                qim0 qim0VarX3 = j9k1.x(qim0Var2, new ac8(3, (byte) 11));
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode5 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM5 = x340Var2.m();
                qim0 qim0VarE5 = zr7.E(x340Var2, qim0VarX3);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC, x340Var2, lljVar);
                nko1.H(xos0VarM5, x340Var2, lljVar2);
                x0d.q(iHashCode5, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE5, x340Var2, lljVar4);
                u7h u7hVar4 = new u7h(j2);
                i2 = i4;
                boolean z8 = i2 == 32;
                Object objT4 = x340Var2.T();
                m4cVar = m4cVar2;
                if (z8 || objT4 == m4cVar) {
                    iu30Var2 = iu30Var;
                    bb30 bb30Var2 = new bb30(iu30Var2, (byte) 8);
                    x340Var2.s0(bb30Var2);
                    obj2 = bb30Var2;
                } else {
                    iu30Var2 = iu30Var;
                    obj2 = objT4;
                }
                Function0 function0 = (Function0) obj2;
                z3 = false;
                r2 = 1;
                rck.d(u7hVar4, gdxVarS, function0, x340Var2, 0, 0);
                x340Var2.r(true);
                x340Var2.r(false);
            } else {
                iu30Var2 = iu30Var;
                m4cVar = m4cVar2;
                i2 = i4;
                r2 = 1;
                z3 = false;
                x340Var2.i0(-25826265);
                x340Var2.r(false);
            }
            wck wckVar = hdkVar.h;
            u7h u7hVar5 = hdkVar.j;
            ?? r5 = z3;
            if (i2 == 32) {
                r5 = r2;
            }
            int i6 = (x340Var2.i(hdkVar) ? 1 : 0) | r5;
            Object objT5 = x340Var2.T();
            Object obj5 = objT5;
            if (i6 != 0 || objT5 == m4cVar) {
                mck mckVar = new mck(iu30Var2, hdkVar, (byte) r2);
                x340Var2.s0(mckVar);
                obj5 = mckVar;
            }
            rck.f(wckVar, u7hVar5, (fb5) null, false, false, 0.0f, 0, (iu30) null, (Function0) obj5, x340Var2, 3072, 244);
            x340Var = x340Var2;
            us71.m(x340Var, (boolean) r2, (boolean) r2, (boolean) r2);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bk0(hdkVar, iu30Var, qim0Var2, z, i, (byte) 25);
        }
    }

    public static final void i(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-632152061);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131959652);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.b;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new sc21(strO0, (byte) 7);
                x340Var.s0(objT);
            }
            xto1.e(anm1.N("respond_to_request_loading", s161.b(qim0VarB, false, (iu30) objT)), 3, j, 0L, x340Var, 48, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fk01(i, (byte) 9);
        }
    }

    public static final void j(boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2043349501);
        int i2 = (x340Var.h(z) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = x340Var.i(view) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new kzj(view, z, (lnm) null);
                x340Var.s0(objT);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dr0((byte) 11, i, z);
        }
    }

    public static final void k(int i, int i2, b0k b0kVar, iu30 iu30Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        int i3 = (kk0.t(-1137343267, i, x340Var) ? 4 : 2) | i2 | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.h(z) ? SemanticState.Hidden : SemanticState.Focused);
        if (!x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            x340Var.b0();
        } else if (i == 2) {
            x340Var.i0(403887933);
            gfx.g(8, apo.r(1906708309, new zm9(iu30Var, z, (byte) 4), x340Var), x340Var, 54);
            x340Var.r(false);
        } else {
            x340Var.i0(404475197);
            qim0 qim0VarN = anm1.N("stored-action", nim0.a);
            gdx gdxVarS = yla.s(x340Var);
            String strO0 = cwl1.o0(x340Var, 2131953913);
            boolean z2 = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new smt0(iu30Var, (byte) 18);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                foo1.g(new gbx(new y50(strO0), function0), qim0VarN, (max) null, gdxVarS, (idn0) null, s(z), (vu30) null, k9j.e, x340Var, 12582912, 84);
                x340Var.r(false);
            }
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a30(i, iu30Var, z, i2);
        }
    }

    public static final void l(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        int i3 = (kk0.t(1758521146, i, x340Var) ? 4 : 2) | i2 | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            isl islVar = isl.a;
            if (i == 2) {
                x340Var.i0(-1907502784);
                cnx cnxVar = cnx.c;
                qim0 qim0VarN = anm1.N("inferred-icon", qim0Var);
                uwr uwrVar = cbx.a;
                w0h1.a(cnxVar, islVar, qim0VarN, cbx.a(x340Var).b.e, 0L, false, x340Var, cnx.d | 48, 48);
                x340Var.r(false);
            } else {
                x340Var.i0(-1907268176);
                w0h1.a(dmx.c, islVar, anm1.N("stored-icon", qim0Var), 0L, 0L, false, x340Var, dmx.d | 48, 56);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2((byte) 25, i, i2, qim0Var);
        }
    }

    public static final void m(eov0 eov0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1913272554);
        if ((i & 6) == 0) {
            i2 = i | (b0kVar3.g(eov0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarQ = i1p1.q(u291.f(uyn1.z(16.0f, 0.0f, 2, qim0Var3), 1.0f), er31.b(8.0f));
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(0.0f, 4.0f, 1, dug.f(qim0VarQ, cbx.a(b0kVar3).a.d, d4o1.a));
            uvx uvxVar = (uvx) b0kVar3.k(vvx.a);
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            uvx uvxVarA = uvx.a(uvxVar, (pgx) null, 2, new zzq0(16.0f, 12.0f, 16.0f, 12.0f), (vzq0) null, (tvx) null, (p3v) null, 499);
            String strO0 = cwl1.o0(b0kVar3, 2131953523);
            boolean z = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new smt0(iu30Var, (byte) 19);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarZ, uvxVarA, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO0), function0), (gbx) null, apo.r(-1427581068, new gov0(eov0Var, (byte) 0), b0kVar3), (xu30) null, (xu30) null, k9j.b, k9j.c, (xu30) null, apo.r(1391913039, new hov0(eov0Var, iu30Var, (byte) 0), b0kVar3), apo.r(1694800430, new gov0(eov0Var, (byte) 1), b0kVar3), b0kVar2, 100663360, 221616, 9916);
                qim0Var2 = qim0Var3;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(eov0Var, iu30Var, qim0Var2, i, (byte) 28);
        }
    }

    public static final void n(hux huxVar, String str, int i, int i2, long j, String str2, String str3, Function0 function0, b0k b0kVar, int i3) {
        int i4;
        b0k b0kVar2;
        hax haxVar;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1429940329);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= b0kVar3.e(l1d.C(i)) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i3 & 3072) == 0) {
            i4 |= b0kVar3.e(l1d.C(i2)) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i3 & 24576) == 0) {
            i4 |= b0kVar3.f(j) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if ((196608 & i3) == 0) {
            i4 |= b0kVar3.g(str2) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= b0kVar3.g(str3) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= b0kVar3.i(function0) ? 8388608 : 4194304;
        }
        if (b0kVar3.Y(i4 & 1, (4793491 & i4) != 4793490)) {
            idx idxVar = i == 2 ? new idx(i2) : jdx.c;
            gdx gdxVarS = yla.s(b0kVar3);
            if (i != 3) {
                haxVar = jax.a;
            } else {
                if (str2 == null) {
                    eg.m("Required value was null.");
                    return;
                }
                haxVar = new hax(str2);
            }
            hax haxVar2 = haxVar;
            int i5 = i4 & 896;
            int i6 = i4;
            boolean z = ((i4 & 29360128) == 8388608) | (i5 == 256);
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new gf6(i, function0, (byte) 11);
                b0kVar3.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(str), function1);
            qim0 qim0VarN = anm1.N(str3, nim0.a);
            boolean z2 = (i5 == 256) | ((i6 & 458752) == 131072);
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new rfz0(i, str2, (byte) 1);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            wro1.h(gbxVar, idxVar, s161.b(qim0VarN, false, (iu30) objT2), haxVar2, gdxVarS, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(609950510, new je3(huxVar, str, i, j), b0kVar3), b0kVar2, 12582912, 6, 840);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new yx21(huxVar, str, i, i2, j, str2, str3, function0, i3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void o(ox3 ox3Var, iu30 iu30Var, b0k b0kVar, int i) throws Throwable {
        String strK;
        Throwable th;
        int i2;
        int i3;
        int i4;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1907619289);
        int i5 = i | (x340Var.e(ox3Var.ordinal()) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16);
        boolean z = false;
        if (x340Var.Y(i5 & 1, (i5 & 19) != 18)) {
            int iOrdinal = ox3Var.ordinal();
            if (iOrdinal == 0) {
                x340Var.i0(-1120806684);
                x340Var.r(false);
                strK = null;
            } else if (iOrdinal == 1) {
                strK = x0d.k(x340Var, -728889926, 2131959650, x340Var, false);
            } else {
                if (iOrdinal != 2) {
                    throw p3d1.k(x340Var, -728893215, false);
                }
                strK = x0d.k(x340Var, -728886246, 2131959651, x340Var, false);
            }
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).a.c;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            boolean zG = x340Var.g(strK);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                th = null;
                objT = new sc21(strK, (byte) 8);
                x340Var.s0(objT);
            } else {
                th = null;
            }
            qim0 qim0VarB2 = s161.b(qim0VarB, false, (iu30) objT);
            cvx cvxVar2 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(z)), een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB2);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            ilx ilxVar = ilx.c;
            String strO0 = cwl1.o0(x340Var, 2131959639);
            ox3 ox3Var2 = ox3.a;
            if (ox3Var == ox3Var2) {
                i2 = 1;
            } else {
                i2 = ox3Var == ox3.b ? 2 : 3;
            }
            int i6 = i5 & ContentType.LONG_FORM_ON_DEMAND;
            boolean z2 = i6 == 32;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new dv11(iu30Var, (byte) 23);
                x340Var.s0(objT2);
            }
            String str = strK;
            n(ilxVar, strO0, i2, 4, j, str, "approve_request_button", (Function0) objT2, x340Var, ilx.d | 1575936);
            fux fuxVar = fux.c;
            String strO1 = cwl1.o0(x340Var, 2131959645);
            if (ox3Var == ox3Var2) {
                i3 = 32;
                i4 = 1;
            } else if (ox3Var == ox3.c) {
                i3 = 32;
                i4 = 2;
            } else {
                i3 = 32;
                i4 = 3;
            }
            boolean z3 = i6 == i3;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new dv11(iu30Var, (byte) 24);
                x340Var.s0(objT3);
            }
            n(fuxVar, strO1, i4, 9, j, str, "decline_request_button", (Function0) objT3, x340Var, fux.d | 1575936);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tc11(ox3Var, iu30Var, i, (byte) 18);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void p(String str, String str2, iu30 iu30Var, int i, qim0 qim0Var, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int i3;
        qim0 qim0Var2;
        qim0 qim0Var3;
        qim0 qim0VarF;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1437924901);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(iu30Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.e(l1d.C(i)) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        int i4 = i3 | 24576;
        if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                x340Var.s0(iu30Var);
                objT = iu30Var;
            }
            iu30 iu30Var2 = (iu30) objT;
            int iC = l1d.C(i);
            qim0 qim0Var4 = nim0.a;
            if (iC == 0) {
                qim0Var3 = qim0Var4;
                x340Var.i0(1725710639);
                uwr uwrVar = cbx.a;
                long jC = cbx.a(x340Var).a.a.c();
                cua cuaVar = cbx.b(x340Var).f;
                cua cuaVar2 = cbx.b(x340Var).f;
                qim0VarF = dug.f(qim0Var3, jC, er31.c(0.0f, 0.0f, 16.0f, 16.0f));
                x340Var.r(false);
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var, 1725708337, false);
                }
                x340Var.i0(1725726251);
                qim0 qim0VarF2 = u291.f(qim0Var4, 1.0f);
                uwr uwrVar2 = cbx.a;
                qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).e.b, 0.0f, 2, qim0VarF2);
                qim0Var3 = qim0Var4;
                long jC2 = cbx.a(x340Var).a.a.c();
                cua cuaVar3 = cbx.b(x340Var).f;
                qim0VarF = dug.f(qim0VarZ, jC2, er31.b(16.0f));
                x340Var.r(false);
            }
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
            qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
            float f2 = cbx.b(x340Var).e.b;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF3, f2, 6.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.O0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarY);
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
            cvx cvxVar2 = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarZ2 = uyn1.z(0.0f, 8.0f, 1, wnb0Var);
            mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarZ2);
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
            fra fraVar = een.N0;
            cvx cvxVar4 = cbx.b(x340Var).b;
            jw31 jw31VarA2 = ew31.a(new d36(4.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0Var3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            qim0 qim0Var5 = qim0Var3;
            w0h1.a(wsx.c, isl.a, u291.r(qim0Var3, 16.0f), cbx.a(x340Var).b.c, 0L, false, x340Var, wsx.d | 48, 48);
            uwo1.e(str, (qim0) null, cbx.d(x340Var).n, cbx.a(x340Var).b.c, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i4 & 14, 0, 2034);
            x340Var.r(true);
            uwo1.e(str2, (qim0) null, cbx.d(x340Var).m, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i4 >> 3) & 14, 0, 2042);
            x340Var = x340Var;
            x340Var.r(true);
            cvx cvxVar5 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(qim0Var5, 12.0f));
            gfx.g(4, apo.r(-64046418, new vwk1(iu30Var2, (byte) 0), x340Var), x340Var, 54);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lk0(str, str2, iu30Var, i, qim0Var2, i2, (byte) 25);
        }
    }

    public static final float q(float f2) {
        float fAbs = Math.abs(f2);
        if (fAbs > 1.0f) {
            fAbs = 1.0f;
        }
        float f3 = 1.0f - fAbs;
        return ((((1.0f - (f3 * f3)) - fAbs) * 0.5f) + fAbs) * Math.signum(f2);
    }

    public static ksk0 r() {
        return new ksk0((byte) 20);
    }

    public static j2i s(boolean z) {
        if (z) {
            return new j2i(-910777885, new xgr0((byte) 14, 2, false), true);
        }
        return null;
    }

    public static final yz21 t(ResponseInfo responseInfo, boolean z) {
        String strE;
        String strS = responseInfo.s();
        if (strS == null || ihc1.y0(strS)) {
            strE = "static";
        } else {
            strE = !z ? f4i1.e(responseInfo.s(), "-offline") : responseInfo.s();
        }
        String strQ = responseInfo.q();
        strE.getClass();
        return new yz21(strQ, strE);
    }

    public static final uwe1 u(cwe1 cwe1Var, Boolean bool) {
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            wjh wjhVar = cwe1Var.a;
            if (wjhVar.a() && (!zBooleanValue || wjhVar.b())) {
                return bool.booleanValue() ? new swe1(dqs0.e) : twe1.a;
            }
        }
        return rwe1.a;
    }

    public static Next v(kak0 kak0Var, v1k0 v1k0Var) {
        lhg1 lhg1Var = kak0Var.S0;
        q6w0 q6w0Var = lhg1Var.a;
        rx30 rx30Var = v1k0Var.c;
        return x1p1.t(x1p1.B(x1p1.x(x1p1.F(Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(lhg1Var, q6w0.a(q6w0Var, (buk1) null, (hez) null, (fa20) null, rx30Var != null ? new px30(rx30Var) : null, (taa0) null, (k7f0) null, (s69) null, (s69) null, (gez) null, (gez) null, (r920) null, (r920) null, v1k0Var.a, v1k0Var.b, (x6b) null, 40943), (ruq0) null, false, false, 14), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -262145, 1048575)), kak0Var))), 3);
    }

    public static final a6y0 w(a6y0 a6y0Var, boolean z) {
        if (a6y0Var instanceof w5y0) {
            w5y0 w5y0Var = (w5y0) a6y0Var;
            return new w5y0(w5y0Var.a, w5y0Var.b, z);
        }
        if (a6y0Var instanceof x5y0) {
            x5y0 x5y0Var = (x5y0) a6y0Var;
            return new x5y0(x5y0Var.a, x5y0Var.b, z);
        }
        if (a6y0Var instanceof z5y0) {
            z5y0 z5y0Var = (z5y0) a6y0Var;
            return new z5y0(z5y0Var.a, z5y0Var.b, z);
        }
        if (a6y0Var instanceof y5y0) {
            y5y0 y5y0Var = (y5y0) a6y0Var;
            return new y5y0(y5y0Var.a, y5y0Var.b, z);
        }
        eg.o();
        return null;
    }
}
