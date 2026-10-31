package p;

import android.net.Uri;
import android.text.Layout;
import android.widget.FrameLayout;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import com.google.android.gms.cast.CastDevice;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.mobius.Next;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class iho1 {
    public static final qqt a = new qqt(32.68f, 38.0f, 3.32f, 5.0f, 8.0f);
    public static final qqt b = new qqt(32.0f, 52.03f, 4.0f, 5.0f, 8.0f);
    public static final qqt c = new qqt(51.09f, 32.0f, 4.0f, 8.0f, 27.09f);
    public static final qqt d = new qqt(57.27f, 40.56f, -35.27f, 4.0f, -6.0f);
    public static final qqt e = new qqt(62.0f, 41.12f, -19.0f, 3.0f, 9.0f);
    public static final qqt f = new qqt(27.02f, 38.66f, 4.0f, 5.0f, 3.0f);
    public static final qqt g = new qqt(30.22f, 53.62f, 4.0f, 8.0f, 6.21f);
    public static final qqt h = new qqt(72.33f, 60.0f, -30.33f, -4.0f, 8.0f);
    public static final qqt i = new qqt(74.47f, 24.0f, -34.47f, 13.0f, 12.0f);
    public static final qqt j = new qqt(80.27f, 29.0f, -44.14f, 9.0f, 8.0f);
    public static final qqt k = new qqt(25.69f, 41.4f, 4.0f, 3.0f, 1.69f);
    public static b180 l;

    public static final void a(int i2, b0k b0kVar, ziu ziuVar, iu30 iu30Var, qim0 qim0Var) {
        diu diuVar = ziuVar.f;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2094525177);
        int i3 = i2 | (x340Var.i(ziuVar) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0Var, 12.0f, 6.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            Function0 function0 = null;
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
            String str = diuVar.c.a;
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(str, anm1.N(zyd1.d, uyn1.B(wnb0Var, 0.0f, 0.0f, 12.0f, 0.0f, 11)), cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1712);
            x340Var = x340Var;
            boolean z = (i3 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new q7u(iu30Var, (byte) 18);
                x340Var.s0(objT);
            }
            Function0 function0P = d9p1.p((Function0) objT, x340Var, 0);
            ciu ciuVar = diuVar.d;
            String str2 = ciuVar.a;
            String str3 = zyd1.f;
            cjc0 cjc0Var = new cjc0(1);
            if (ciuVar.b.b()) {
                x340Var.i0(-1640214563);
                boolean zG = x340Var.g(function0P);
                Object objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new ivw(function0P, (byte) 1);
                    x340Var.s0(objT2);
                }
                function0 = (Function0) objT2;
                x340Var.r(false);
            } else {
                x340Var.i0(-1640170048);
                x340Var.r(false);
            }
            cpn1.a(str2, str3, function0, null, null, cjc0Var, x340Var, 0, 24);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jq0(ziuVar, qim0Var, iu30Var, i2, (byte) 2);
        }
    }

    public static final void b(w4i1 w4i1Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i2) {
        w4i1 w4i1Var2;
        x340 x340Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-529046278);
        j06 j06Var = x340Var2.a;
        int i3 = i2 | (x340Var2.g(w4i1Var) ? 4 : 2) | (x340Var2.g(qim0Var) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128);
        if (x340Var2.Y(i3 & 1, (i3 & 147) != 146)) {
            Object objT = x340Var2.T();
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            tob1 tob1VarB = z95.b(((Boolean) ven0Var.getValue()).booleanValue() ? 1.0f : 0.0f, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6), "scale_animation", (iu30) null, x340Var2, 3120, 20);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = new vk1(ven0Var, (lnm) null, (byte) 8);
                x340Var2.s0(objT2);
            }
            qxd0.t(rih1.a, x340Var2, (vu30) objT2);
            hcx hcxVar = hcx.d;
            qim0 qim0VarX = u291.x(0.0f, hcxVar.a(x340Var2), 1, qim0Var);
            float fFloatValue = ((Number) tob1VarB.getValue()).floatValue();
            qim0 qim0VarF = fj30.F(qim0VarX, fFloatValue, fFloatValue);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
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
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE2 = zr7.E(x340Var2, nim0Var);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            String str = w4i1Var.c;
            Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
            uri.getClass();
            bmq0.a(uri, (qim0) null, hcxVar, w4i1Var.a, w4i1Var.b, bro1.q(w4i1Var.d), 0L, false, x340Var2, 384, 194);
            qim0 qim0VarA = h2c.a.a(nim0Var, een.f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var2).a.a.a();
            cr31 cr31Var = er31.a;
            qim0 qim0VarF2 = dug.f(d1u.E(1.0f, jA, qim0VarA, cr31Var), cbx.a(x340Var2).a.a.a(), cr31Var);
            boolean z2 = (i3 & 896) == 256;
            Object objT3 = x340Var2.T();
            if (z2 || objT3 == m4cVar) {
                objT3 = new ugj(function0, (byte) 27);
                x340Var2.s0(objT3);
            }
            qim0 qim0VarX2 = bin.x(qim0VarF2, false, null, null, null, (Function0) objT3, 15);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarX2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            w0h1.a(gux.c, isl.a, uyn1.x(u291.r(nim0Var, 16.0f), 1.0f), 0L, 0L, true, x340Var2, gux.d | 197040, 24);
            x340Var2.r(true);
            x340Var2.r(true);
            w4i1Var2 = w4i1Var;
            String str2 = w4i1Var2.b;
            lee1 lee1Var = cbx.d(x340Var2).m;
            cjc0 cjc0Var = new cjc0(2);
            cvx cvxVar = cbx.b(x340Var2).b;
            uwo1.e(str2, ktd.m(een.Q0, uyn1.B(nim0Var, 0.0f, 4.0f, 0.0f, 0.0f, 13)), lee1Var, 0L, new a0e1(3), null, 2, false, cjc0Var, 0, null, x340Var2, 1572864, 0, 1704);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            w4i1Var2 = w4i1Var;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mzj(w4i1Var2, qim0Var, function0, i2, (byte) 24);
        }
    }

    public static final void c(f0u f0uVar, boolean z, String str, String str2, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        qqt qqtVar;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(72292244);
        j06 j06Var = x340Var.a;
        int i4 = i2 | (x340Var.e(f0uVar.ordinal()) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i4 |= x340Var.h(z) ? 32 : 16;
        }
        int i5 = i4 | (x340Var.g(str) ? 256 : 128) | (x340Var.g(str2) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i5 & 1, (i5 & 9363) != 9362)) {
            if (z) {
                qqtVar = a;
            } else {
                switch (f0uVar.ordinal()) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    case 4:
                    case 8:
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                    case 15:
                    case 16:
                        qqtVar = b;
                        break;
                    case 1:
                    case 14:
                        qqtVar = e;
                        break;
                    case 2:
                        qqtVar = f;
                        break;
                    case 3:
                        qqtVar = g;
                        break;
                    case 5:
                    case 7:
                    case 10:
                        qqtVar = c;
                        break;
                    case 6:
                        qqtVar = j;
                        break;
                    case 9:
                        qqtVar = d;
                        break;
                    case grn1.d /* 12 */:
                        qqtVar = h;
                        break;
                    case 13:
                        qqtVar = k;
                        break;
                    case 17:
                        qqtVar = i;
                        break;
                    default:
                        eg.o();
                        return;
                }
            }
            jw31 jw31VarA = ew31.a(new d36(qqtVar.e, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
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
            qim0 qim0VarH = u291.h(u291.v(qim0Var3, 40.0f), 48.0f);
            boolean zG = x340Var.g(qqtVar);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new hu6(qqtVar, (byte) 4);
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0Var, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (z) {
                i3 = 2131231293;
            } else {
                switch (f0uVar.ordinal()) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    case 4:
                    case 8:
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                    case 15:
                    case 16:
                        i3 = 2131231296;
                        break;
                    case 1:
                    case 14:
                        i3 = 2131231290;
                        break;
                    case 2:
                        i3 = 2131231297;
                        break;
                    case 3:
                        i3 = 2131231295;
                        break;
                    case 5:
                    case 7:
                    case 10:
                        i3 = 2131231298;
                        break;
                    case 6:
                        i3 = 2131231288;
                        break;
                    case 9:
                        i3 = 2131231291;
                        break;
                    case grn1.d /* 12 */:
                        i3 = 2131231289;
                        break;
                    case 13:
                        i3 = 2131231299;
                        break;
                    case 17:
                        i3 = 2131231292;
                        break;
                    default:
                        eg.o();
                        return;
                }
            }
            cwl1.f(i3o1.n(i3, x340Var, 0), str, (qim0) null, (tl3) null, mif1.V0, 0.0f, (ColorFilter) null, x340Var, ((i5 >> 3) & 112) | 8, 108);
            x340Var.r(true);
            uwr uwrVar = cbx.a;
            uwo1.e(str2, null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 2, false, new zic0(2), 0, null, x340Var, (i5 >> 9) & 14, 0, 1714);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sqb(f0uVar, z, str, str2, qim0Var2, i2);
        }
    }

    public static final void d(int i2, b0k b0kVar, ziu ziuVar, iu30 iu30Var, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(894356478);
        int i3 = (x340Var.i(ziuVar) ? 4 : 2) | i2 | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new q7u(iu30Var, (byte) 19);
                x340Var.s0(objT);
            }
            gfx.b(18, apo.r(1343650089, new b3x(ziuVar, qim0Var, d9p1.p((Function0) objT, x340Var, 0), iu30Var, (byte) 0), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jq0(ziuVar, qim0Var, iu30Var, i2, (byte) 3);
        }
    }

    public static final void e(ye5 ye5Var, String str, iu30 iu30Var, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2028310381);
        int i3 = i2 | (x340Var.i(ye5Var) ? 4 : 2) | (x340Var.g(str) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            vhg.a(ye5Var, str, "playlist_description_expand", new zma1(((vex) zex.a.b).b, cbx.d(x340Var).k.a.b, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, cbx.d(x340Var).k.a.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.b, (Shadow) null, (PlatformSpanStyle) null, 61404), iu30Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g6w((byte) 28, i2, ye5Var, str, iu30Var);
        }
    }

    public static final void f(String str, qim0 qim0Var, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-770207622);
        int i3 = (x340Var.g(str) ? 4 : 2) | i2 | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(iu30Var2) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            nyx.a(2, (wux) null, apo.r(-589840185, new mq00(qim0Var, str, iu30Var2, iu30Var), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq00(str, qim0Var, iu30Var, iu30Var2, i2);
        }
    }

    public static final void g(b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1859673238);
        j06 j06Var = x340Var.a;
        if (x340Var.Y(i2 & 1, i2 != 0)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(4.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
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
            t1c.a(cwl1.l0(dug.f(u291.r(nim0Var, 16.0f), jA, er31.a), 0L, (hw61) null, 15), x340Var, 0);
            op71.g(x340Var, u291.v(nim0Var, 8.0f));
            t1c.a(cwl1.l0(dug.f(u291.h(u291.v(nim0Var, 80.0f), 12.0f), jA, cr31VarB), 0L, (hw61) null, 15), x340Var, 0);
            x340Var.r(true);
            op71.g(x340Var, u291.h(nim0Var, 6.0f));
            t1c.a(cwl1.l0(dug.f(u291.h(u291.f(nim0Var, 1.0f), 12.0f), jA, cr31VarB), 0L, (hw61) null, 15), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new afm0(i2, (byte) 17);
        }
    }

    public static final void h(xho0 xho0Var, qim0 qim0Var, Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        boolean z;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-14655965);
        int i3 = i2 | (x340Var.i(xho0Var) ? 4 : 2) | 48 | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | (x340Var.i(function2) ? 16384 : 8192);
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(4.0f);
            qim0Var2 = nim0.a;
            qim0 qim0VarQ = i1p1.q(u291.f(qim0Var2, 1.0f), cr31VarB);
            long jA = cbx.a(x340Var).a.b.a();
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0VarY = uyn1.y(dug.f(qim0VarQ, jA, u5j1Var), 12.0f, 8.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            if (xho0Var.b.c) {
                x340Var.i0(22500114);
                g(x340Var, 0);
                x340Var.r(false);
                z = true;
            } else {
                x340Var.i0(22561711);
                String strO0 = cwl1.o0(x340Var, 2131954543);
                qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = ofo0.f;
                    x340Var.s0(objT);
                }
                kgx kgxVar = new kgx(0, (vu30) objT, (vu30) null, (vu30) null, 13);
                vzq0.a.getClass();
                tzq0 tzq0Var = uzq0.b;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    z = true;
                    cwl1.b(qim0VarF, (tl3) null, u5j1Var, kgxVar, tzq0Var, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO0), function0), (gbx) null, apo.r(244189188, new hho0(xho0Var, function1, function2, (byte) 0), x340Var), x340Var, 100663296, 48, 1250);
                    x340Var.r(false);
                }
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e9g0((byte) 11, i2, xho0Var, qim0Var2, function0, function1, function2);
        }
    }

    public static final void i(xho0 xho0Var, Function0 function0, Function0 function1, b0k b0kVar, int i2) {
        b0k b0kVar2;
        Object textUnit;
        Uri uri;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(725302162);
        int i3 = i2 | (b0kVar3.i(xho0Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(function1) ? 256 : 128);
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            long j2 = cbx.a(b0kVar3).b.a;
            long j3 = cbx.a(b0kVar3).b.b;
            lee1 lee1Var = cbx.d(b0kVar3).j;
            yae1 yae1VarQ = d5p1.q(0, b0kVar3, 1);
            wat watVar = (wat) b0kVar3.k(t4k.h);
            cvm cvmVar = xho0Var.a.g;
            boolean zG = b0kVar3.g(watVar);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                textUnit = new TextUnit(watVar.s(16.0f));
                b0kVar3.s0(textUnit);
            } else {
                textUnit = objT;
            }
            long j4 = ((TextUnit) textUnit).a;
            boolean zG2 = b0kVar3.g(watVar);
            Object objT2 = b0kVar3.T();
            if (zG2 || objT2 == m4cVar) {
                TextUnit textUnit2 = new TextUnit(watVar.s(12.0f));
                b0kVar3.s0(textUnit2);
                objT2 = textUnit2;
            }
            long j5 = ((TextUnit) objT2).a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            boolean zD = b0kVar3.d(6.0f) | b0kVar3.g(watVar);
            Object objT3 = b0kVar3.T();
            if (zD || objT3 == m4cVar) {
                objT3 = new TextUnit(watVar.s(6.0f));
                b0kVar3.s0(objT3);
            }
            long j6 = ((TextUnit) objT3).a;
            s2o s2oVar = xho0Var.b;
            String str = s2oVar.b;
            String strP = p(xho0Var);
            boolean zG3 = b0kVar3.g(str);
            Object objT4 = b0kVar3.T();
            if (zG3 || objT4 == m4cVar) {
                if (str == null || (uri = Uri.parse(str)) == null) {
                    uri = Uri.EMPTY;
                }
                objT4 = uri;
                b0kVar3.s0(objT4);
            }
            b0kVar3.i0(1230708091);
            xkg0 xkg0Var = new xkg0();
            b0kVar3.i0(1542344643);
            xkg0Var.put("avatar", new gh80(new d6t0(4, j4, j4), apo.r(2076672932, new ukm0((Uri) objT4, s2oVar, (byte) 8), b0kVar3)));
            b0kVar3.r(false);
            if (cvmVar == cvm.b) {
                xkg0Var.put("badge", new gh80(new d6t0(4, j5, j5), x3j.a));
                if (xho0Var.c != null) {
                    xkg0Var.put("editor_timestamp_spacer", new gh80(new d6t0(4, j6, j5), x3j.b));
                }
            }
            xkg0 xkg0VarB = xkg0Var.b();
            b0kVar3.r(false);
            j2i j2iVarR = apo.r(-1223101444, new iho0(xho0Var, cwl1.o0(b0kVar3, 2131954544), lee1Var, mqo1.G(xkg0VarB), s2oVar, j2, cvmVar, function1, j3, strP, function0, yae1VarQ), b0kVar3);
            b0kVar2 = b0kVar3;
            w2g0.c((qim0) null, (tl3) null, j2iVarR, b0kVar2, 3072, 7);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vbn0(xho0Var, function0, function1, i2, (byte) 8);
        }
    }

    public static final void j(k0z0 k0z0Var, j2i j2iVar, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, b0k b0kVar, int i2, int i3) {
        vu30 vu30Var4;
        vu30 vu30Var5;
        vu30 vu30Var6;
        vu30 vu30Var7;
        vu30 vu30Var8;
        vu30 vu30Var9;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(526407310);
        int i4 = (x340Var.i(k0z0Var) ? 4 : 2) | i2;
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= x340Var.i(vu30Var) ? 256 : 128;
        }
        int i6 = i4 | 9216;
        if (x340Var.Y(i6 & 1, (i6 & 9363) != 9362)) {
            x340Var.d0();
            if ((i2 & 1) == 0 || x340Var.E()) {
                if (i5 != 0) {
                    vu30Var = taj.a;
                }
                vu30Var7 = vu30Var;
                vu30Var8 = vu30Var7;
                vu30Var9 = vu30Var8;
            } else {
                x340Var.b0();
                vu30Var8 = vu30Var;
                vu30Var7 = vu30Var2;
                vu30Var9 = vu30Var3;
            }
            x340Var.s();
            axo1.e(k0z0Var.c, null, apo.r(-825885879, new c9y(vu30Var7, vu30Var8, vu30Var9, j2iVar, (byte) 24), x340Var), x340Var, 384);
            vu30Var5 = vu30Var7;
            vu30Var4 = vu30Var8;
            vu30Var6 = vu30Var9;
        } else {
            x340Var.b0();
            vu30Var4 = vu30Var;
            vu30Var5 = vu30Var2;
            vu30Var6 = vu30Var3;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nym(k0z0Var, j2iVar, vu30Var4, vu30Var5, vu30Var6, i2, i3);
        }
    }

    public static final void k(c380 c380Var, j2i j2iVar, j2i j2iVar2, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1522650513);
        int i3 = i2 | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.e(2) ? 32 : 16) | (x340Var.d(16.0f) ? 256 : 128) | 196608;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = i3 & 112;
            boolean zE = x340Var.e(c380Var.size()) | (i4 == 32);
            Object objT = x340Var.T();
            if (zE || objT == obj) {
                int size = c380Var.size();
                int iCeil = ((int) Math.ceil((c380Var.size() - 1.0f) / 2.0f)) + 1;
                if (size > iCeil) {
                    size = iCeil;
                }
                objT = Integer.valueOf(size);
                x340Var.s0(objT);
            }
            int iIntValue = ((Number) objT).intValue();
            zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
            d36 d36Var = new d36(16.0f, true, new um5(false));
            boolean zE2 = ((i3 & 14) == 4) | x340Var.e(iIntValue) | (i4 == 32);
            Object objT2 = x340Var.T();
            if (zE2 || objT2 == obj) {
                objT2 = new fu(iIntValue, c380Var, j2iVar, j2iVar2, (byte) 18);
                x340Var.s0(objT2);
            }
            qim0 qim0Var3 = nim0.a;
            ujo1.e(qim0Var3, null, zzq0VarH, d36Var, null, null, false, null, (iu30) objT2, x340Var, 6, 490);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l4c1(c380Var, j2iVar, j2iVar2, qim0Var2, i2, (byte) 0);
        }
    }

    public static final w0d l(boolean z, boolean z2, int i2, boolean z3, gj6 gj6Var, Function0 function0, boolean z4, String str, String str2, Function0 function1, Function0 function2) {
        Object objValueOf = null;
        if (z2) {
            if (i2 > 0) {
                objValueOf = Integer.valueOf(i2);
            } else if (z3) {
                objValueOf = "top-artist";
            }
        }
        return new w0d(z, objValueOf, new nx2(function0, gj6Var, (byte) 21), z4, str, z4 && i2 > 0, str2, function1, function2);
    }

    public static final dtw m(FrameLayout frameLayout, wpw wpwVar, Object obj) {
        tka0 tka0Var = dtw.C;
        return mhc.b(frameLayout.getContext(), frameLayout, wpwVar, obj, (ipb1) null, 112);
    }

    public static final int n(Layout layout, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i2 || lineEnd == i2) {
            if (lineStart == i2) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static Object o(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final String p(xho0 xho0Var) {
        String str;
        mum mumVar = xho0Var.a.c;
        if (mumVar instanceof mum) {
            str = mumVar.c;
        } else if (mumVar instanceof lum) {
            str = ((lum) mumVar).c;
        } else {
            if (!(mumVar instanceof num)) {
                eg.o();
                return null;
            }
            str = ((num) mumVar).c;
        }
        return cy30.o("\\n{2,}", str, "\n");
    }

    public static Next q(fu1 fu1Var, String str, Set set) {
        Object next;
        fu1 fu1VarC = fu1Var.c(new sc21(str, (byte) 27), wp51.e1);
        Iterator it = fu1Var.h.c.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((af41) next).a, str));
        af41 af41Var = (af41) next;
        boolean z = false;
        if (af41Var != null && af41Var.c) {
            z = true;
        }
        if (z) {
            ma61 ma61Var = fu1VarC.h;
            hlg1 hlg1Var = ma61Var.c;
            Set set2 = hlg1Var.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : set2) {
                if (!u890.j(((af41) obj).a, str)) {
                    arrayList.add(obj);
                }
            }
            fu1VarC = fu1.b(fu1VarC, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(ma61Var, null, null, hlg1.a(hlg1Var, null, o7h.p1(arrayList), null, null, null, 29), null, null, null, null, 123), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097023);
        }
        xj61 xj61Var = new xj61();
        xj61Var.addAll(set);
        if (z) {
            xj61Var.add(new ip1(Collections.singleton(str)));
        }
        return Next.i(fu1VarC, cwl1.j(xj61Var));
    }

    public static final c3e r(CastDevice castDevice) {
        ho41 ho41Var = castDevice.i;
        String strJ = castDevice.j();
        String str = castDevice.d;
        String str2 = castDevice.e;
        InetAddress inetAddress = castDevice.c;
        String hostAddress = inetAddress != null ? inetAddress.getHostAddress() : null;
        if (hostAddress == null) {
            hostAddress = "";
        }
        return new c3e(strJ, str, str2, hostAddress, castDevice.f, ho41Var.c(4), ho41Var.c(1), ho41Var.c(32), ho41Var.c(65536));
    }

    public static final oqr0 s(bob1 bob1Var) {
        f3f1 f3f1Var = bob1Var.a;
        g3f1 g3f1Var = f3f1Var.a;
        tcx0 tcx0Var = new tcx0(g3f1Var.a, g3f1Var.b, g3f1Var.c, g3f1Var.d, g3f1Var.e);
        List list = f3f1Var.b;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(t((c3f1) it.next()));
        }
        h3f1 h3f1Var = new h3f1(tcx0Var, arrayList);
        String str = bob1Var.b;
        String str2 = bob1Var.f;
        List<bq10> list2 = bob1Var.j;
        ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
        for (bq10 bq10Var : list2) {
            arrayList2.add(new bf41(bq10Var.a, bq10Var.b));
        }
        return new oqr0(h3f1Var, str, str2, arrayList2);
    }

    public static final o620 t(c3f1 c3f1Var) {
        hf20 gf20Var;
        String str = c3f1Var.a;
        e3f1 e3f1Var = c3f1Var.b;
        if (e3f1Var instanceof e3f1) {
            gf20Var = new hf20(e3f1Var.d);
        } else {
            if (!(e3f1Var instanceof d3f1)) {
                eg.o();
                return null;
            }
            gf20Var = new gf20(((d3f1) e3f1Var).d);
        }
        String str2 = c3f1Var.c;
        boolean z = c3f1Var.d;
        String str3 = c3f1Var.e;
        List list = c3f1Var.f;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(t((c3f1) it.next()));
        }
        return new o620(str, gf20Var, str2, z, str3, arrayList, c3f1Var.h.name());
    }

    public static final bob1 u(oqr0 oqr0Var, b3f1 b3f1Var) {
        h3f1 h3f1Var = oqr0Var.a;
        tcx0 tcx0Var = h3f1Var.a;
        g3f1 g3f1Var = new g3f1(tcx0Var.a, tcx0Var.b, tcx0Var.c, tcx0Var.d, tcx0Var.e);
        ArrayList arrayList = h3f1Var.b;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(v((o620) it.next(), oqr0Var.c));
        }
        f3f1 f3f1Var = new f3f1(g3f1Var, arrayList2, false, 28);
        String str = oqr0Var.b;
        String str2 = oqr0Var.c;
        ArrayList<bf41> arrayList3 = oqr0Var.d;
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
        for (bf41 bf41Var : arrayList3) {
            String str3 = bf41Var.a;
            arrayList4.add(new bq10(str3, bf41Var.b, 120, str3));
        }
        return new bob1(f3f1Var, str, str2, b3f1Var, (wkc1) null, arrayList4, 348);
    }

    public static final c3f1 v(o620 o620Var, String str) {
        e3f1 d3f1Var;
        String str2 = o620Var.a;
        hf20 hf20Var = o620Var.b;
        if (hf20Var instanceof hf20) {
            d3f1Var = new e3f1(hf20Var.a);
        } else {
            if (!(hf20Var instanceof gf20)) {
                eg.o();
                return null;
            }
            d3f1Var = new d3f1(((gf20) hf20Var).a);
        }
        String str3 = o620Var.c;
        boolean z = o620Var.d;
        String str4 = o620Var.e;
        ArrayList arrayList = o620Var.f;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(v((o620) it.next(), str));
        }
        return new c3f1(str2, d3f1Var, str3, z, str4, arrayList2, u890.j(o620Var.c, str), b3f1.valueOf(o620Var.g), (String) null, (a3f1) null, 768);
    }
}
