package p;

import android.content.Context;
import android.content.SharedPreferences;
import android.icu.text.BreakIterator;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
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
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class nho1 {
    public static final Object a = new Object();
    public static b180 b;
    public static SharedPreferences c;

    public static final long A(elb0 elb0Var) {
        elb0 elb0VarJ = elb0Var.J();
        if (elb0VarJ != null) {
            return elb0VarJ.K(elb0Var, 0L);
        }
        return 0L;
    }

    public static final long B(elb0 elb0Var) {
        return elb0Var.O(0L);
    }

    public static final long C(elb0 elb0Var) {
        return elb0Var.p(0L);
    }

    public static final long D(elb0 elb0Var) {
        return elb0Var.E(0L);
    }

    public static final k0z0 E(xm41 xm41Var, b0k b0kVar) {
        m4c m4cVar = fkj0.X;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a.f;
        x340 x340Var = (x340) b0kVar;
        boolean zI = x340Var.i(xm41Var) | x340Var.i(bs50Var);
        Object objT = x340Var.T();
        if (zI || objT == m4cVar) {
            objT = new j3y0(xm41Var, bs50Var, (byte) 3);
            x340Var.s0(objT);
        }
        iu30 iu30Var = (iu30) objT;
        xnn0 xnn0Var = (xnn0) x340Var.k(aon0.a);
        boolean zG = x340Var.g((Object) null);
        Object objT2 = x340Var.T();
        if (zG || objT2 == m4cVar) {
            objT2 = (rdo0) iu30Var.invoke(xnn0Var);
            x340Var.s0(objT2);
        }
        k0z0 k0z0Var = (rdo0) objT2;
        boolean zI2 = x340Var.i(k0z0Var);
        Object objT3 = x340Var.T();
        if (zI2 || objT3 == m4cVar) {
            objT3 = new tdo0(k0z0Var, (byte) 0);
            x340Var.s0(objT3);
        }
        qxd0.i(k0z0Var, (iu30) objT3, x340Var);
        return k0z0Var;
    }

    public static final qim0 F(qim0 qim0Var) {
        return s161.b(qim0Var, false, new cix0((byte) 12));
    }

    public static final opb1 G(d9 d9Var) {
        jv91 jv91VarH = pv91.h();
        opb1 opb1Var = new opb1(jv91VarH.g(), d9Var);
        if (!(jv91VarH instanceof rv40)) {
            ((cqb1) opb1Var).b = new opb1(1L, d9Var);
        }
        return opb1Var;
    }

    public static final e8b0 H(e8b0 e8b0Var, e8b0 e8b0Var2) {
        dq20 dq20VarQ;
        c4x0 c4x0Var = c4x0.N0;
        qx81 qx81VarR = d0p1.r(e8b0Var);
        if (qx81VarR == null && ((dq20VarQ = d0p1.q(e8b0Var)) == null || (qx81VarR = d0p1.Z(dq20VarQ)) == null)) {
            qx81VarR = d0p1.r(e8b0Var);
            qx81VarR.getClass();
        }
        if (d0p1.D(d0p1.n0(qx81VarR)) != null) {
            return d0p1.S(e8b0Var) ? c4x0Var.N(e8b0Var2) : e8b0Var2;
        }
        d0h1 d0h1Var = (d0h1) o7h.V0(d0p1.y(e8b0Var));
        if (tq00.a[l1d.C(d0p1.E(d0h1Var))] == 1) {
            c4x0Var.e();
            throw null;
        }
        gmh1 gmh1VarC = d0p1.C(c4x0Var, d0h1Var);
        gmh1VarC.getClass();
        if (H(gmh1VarC, e8b0Var2) instanceof a8b0) {
            c4x0Var.e();
            throw null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(c4x0Var);
        sb.append(", ");
        throw new IllegalArgumentException(us71.f(rc11.a, c4x0Var.getClass(), sb).toString());
    }

    public static String I(Context context, int i) {
        Locale locale = Locale.ENGLISH;
        if (i <= 100) {
            String string = context.getString(2131963839);
            string.getClass();
            return string;
        }
        if (i <= 250) {
            return String.format(locale, context.getString(2131963838), Arrays.copyOf(new Object[]{250}, 1));
        }
        if (i <= 500) {
            return String.format(locale, context.getString(2131963838), Arrays.copyOf(new Object[]{Integer.valueOf(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER)}, 1));
        }
        return i <= 1000 ? String.format(locale, context.getString(2131963837), Arrays.copyOf(new Object[]{1}, 1)) : String.format(locale, context.getString(2131963837), Arrays.copyOf(new Object[]{Double.valueOf(Math.ceil(((double) i) / 1000.0d))}, 1));
    }

    public static final void J(int i, int i2) {
        if (i < 0 || i >= i2) {
            eg.g(l1d.j(i, i2, "index (", ") is out of bound of [0, ", ")"));
        }
    }

    public static SharedPreferences K(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                sharedPreferences = c;
                if (sharedPreferences == null) {
                    sharedPreferences = (SharedPreferences) u890.K(new u1o1(context, (byte) 0));
                    c = sharedPreferences;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }

    public static final void a(rx7 rx7Var, String str, boolean z, xgm1 xgm1Var, b0k b0kVar, int i) {
        h311 h311VarV;
        mg6 mg6Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1242861217);
        int i2 = i | (x340Var.g(rx7Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.i(xgm1Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            if (rx7Var == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    mg6Var = new mg6(rx7Var, str, z, xgm1Var, i, (byte) 0);
                }
            } else {
                StoryCard storyCard = ((wgm1) rwq.h(xgm1Var.getState(), x340Var, 0).getValue()).a;
                boolean zJ = u890.j(storyCard != null ? storyCard.getId() : null, str);
                boolean zH = x340Var.h(zJ);
                Object objT = x340Var.T();
                if (zH || objT == m4cVar) {
                    objT = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                Boolean boolValueOf = Boolean.valueOf(zJ);
                Boolean boolValueOf2 = Boolean.valueOf(z);
                boolean zH2 = ((i2 & 112) == 32) | ((i2 & 896) == 256) | x340Var.h(zJ) | x340Var.g(ven0Var) | x340Var.i(xgm1Var) | ((i2 & 14) == 4);
                Object objT2 = x340Var.T();
                if (zH2 || objT2 == m4cVar) {
                    on1 on1Var = new on1(zJ, z, xgm1Var, str, rx7Var, ven0Var, (lnm) null);
                    x340Var.s0(on1Var);
                    objT2 = on1Var;
                }
                qxd0.s(boolValueOf, boolValueOf2, (vu30) objT2, x340Var);
            }
            h311VarV.d = mg6Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            mg6Var = new mg6(rx7Var, str, z, xgm1Var, i, (byte) 1);
            h311VarV.d = mg6Var;
        }
    }

    public static final void b(jxm jxmVar, qlb qlbVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(2101175166);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.g(jxmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(qlbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.i(iu30Var) ? 256 : 128;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarN = anm1.N("contributor-sheet-collaborators-section", u291.f(nim0.a, 1.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarN);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            String strO0 = cwl1.o0(b0kVar2, 2131954581);
            String strO1 = cwl1.o0(b0kVar2, 2131954579);
            boolean z = (i2 & 896) == 256;
            int i3 = i2 & 14;
            boolean z2 = z | (i3 == 4);
            Object objT = b0kVar2.T();
            if (z2 || objT == m4cVar) {
                objT = new sqm(iu30Var, jxmVar, (byte) 5);
                b0kVar2.s0(objT);
            }
            tho1.f(strO0, strO1, (Function0) objT, null, cwl1.o0(b0kVar2, 2131954580), b0kVar2, 0, 8);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            d36 d36Var = new d36(12.0f, true, new um5(false));
            boolean zI = b0kVar2.i(qlbVar) | (i3 == 4);
            Object objT2 = b0kVar2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new kjk(jxmVar, qlbVar, (byte) 20);
                b0kVar2.s0(objT2);
            }
            b0kVar2 = b0kVar2;
            ujo1.e(null, null, zzq0VarH, d36Var, null, null, false, null, (iu30) objT2, b0kVar2, 0, 491);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nok((Object) jxmVar, (Object) qlbVar, (Object) iu30Var, i, (byte) 17);
        }
    }

    public static final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-631753044);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarN = anm1.N("contributor-sheet-collaborators-skeleton", u291.f(nim0.a, 1.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            tho1.f(cwl1.o0(x340Var, 2131954581), cwl1.o0(x340Var, 2131954579), null, null, null, x340Var, 384, 24);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            d36 d36Var = new d36(12.0f, true, new um5(false));
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = bxm.c1;
                x340Var.s0(objT);
            }
            ujo1.e(null, null, zzq0VarH, d36Var, null, null, false, null, (iu30) objT, x340Var, 817889280, 363);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sqk((byte) 6, i, false);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(mxm mxmVar, qlb qlbVar, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(89408763);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(mxmVar) : x340Var.i(mxmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qlbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (mxmVar.equals(kxm.a)) {
            x340Var.i0(22480690);
            c(x340Var, 0);
            x340Var.r(false);
        } else if (mxmVar.equals(lxm.a)) {
            x340Var.i0(22482239);
            x340Var.r(false);
        } else {
            if (!(mxmVar instanceof jxm)) {
                throw p3d1.k(x340Var, 22479687, false);
            }
            x340Var.i0(22483186);
            b((jxm) mxmVar, qlbVar, iu30Var, x340Var, i2 & 1022);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok((Object) mxmVar, (Object) qlbVar, (Object) iu30Var, i, (byte) 18);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void e(int i, int i2, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) throws NoWhenBranchMatchedException {
        int i3;
        x340 x340Var;
        boolean z;
        long j;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1218417533);
        if ((i2 & 6) == 0) {
            i3 = (x340Var2.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var2.i(qim0Var) ? 256 : 128;
        }
        if (x340Var2.Y(i3 & 1, (i3 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var2, 2131954550);
            String strO1 = cwl1.o0(x340Var2, 2131954555);
            ye5 ye5VarO = kk0.o(-1626811568, x340Var2);
            uwr uwrVar = cbx.a;
            int iO = ye5VarO.o(new zma1(cbx.a(x340Var2).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            try {
                ye5VarO.g(strO0 + " ");
                ye5VarO.k(iO);
                vhg.c(ye5VarO, strO1, "https://www.spotify.com/platform-rules/plain", new zma1(cbx.a(x340Var2).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), iu30Var);
                int i4 = i3;
                af5 af5VarP = ye5VarO.p();
                x340Var2.r(false);
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
                uwo1.f(af5VarP, qxy0.u(new wnb0(1.0f, true), (idn0) null, 3), cbx.d(x340Var2).j, null, null, null, 0, false, null, 0, null, null, x340Var2, 0, 0, 4088);
                String strS = s(i, x340Var2, i4 & 14);
                String strValueOf = String.valueOf(i);
                lee1 lee1Var = cbx.d(x340Var2).j;
                int iOrdinal = t(i).ordinal();
                if (iOrdinal == 0) {
                    z = false;
                    x340Var2.i0(-1402034179);
                    j = cbx.a(x340Var2).b.b;
                    x340Var2.r(false);
                } else if (iOrdinal == 1) {
                    z = false;
                    x340Var2.i0(-1402032227);
                    j = cbx.a(x340Var2).b.e;
                    x340Var2.r(false);
                } else {
                    if (iOrdinal != 2) {
                        throw p3d1.k(x340Var2, -1402036996, false);
                    }
                    x340Var2.i0(-1402030242);
                    j = cbx.a(x340Var2).b.d;
                    z = false;
                    x340Var2.r(false);
                }
                cvx cvxVar = cbx.b(x340Var2).b;
                qim0 qim0VarB = uyn1.B(nim0.a, 4.0f, 0.0f, 0.0f, 0.0f, 14);
                boolean zG = x340Var2.g(strS);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    objT = new fki0(strS, (byte) 24);
                    x340Var2.s0(objT);
                }
                uwo1.e(strValueOf, s161.b(qim0VarB, z, (iu30) objT), lee1Var, j, new a0e1(6), null, 0, false, null, 0, null, x340Var2, 0, 0, 2016);
                x340Var = x340Var2;
                x340Var.r(true);
            } catch (Throwable th) {
                ye5VarO.k(iO);
                throw th;
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ry1(i, iu30Var, qim0Var, i2, (byte) 2);
        }
    }

    public static final void f(int i, b0k b0kVar, ziu ziuVar, iu30 iu30Var, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1108070206);
        int i2 = (x340Var.i(ziuVar) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new q7u(iu30Var, (byte) 20);
                x340Var.s0(objT);
            }
            gfx.b(1, apo.r(697495273, new b3x(ziuVar, qim0Var, d9p1.p((Function0) objT, x340Var, 0), iu30Var, (byte) 1), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jq0(ziuVar, qim0Var, iu30Var, i, (byte) 4);
        }
    }

    public static final void g(Function0 function0, b0k b0kVar, int i) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1732155196);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131955156);
            String strO1 = cwl1.o0(x340Var, 2131955154);
            String strO2 = cwl1.o0(x340Var, 2131955155);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new tze0(function0, (byte) 18);
                x340Var.s0(objT);
            }
            function1 = function0;
            mqo1.d(function1, null, null, strO0, strO1, new zgx(strO2, new gbx(z50.c, (Function0) objT)), null, x340Var, i3 | 262144, 70);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tse0(function1, i, (byte) 8);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa A[LOOP:0: B:55:0x00a3->B:57:0x00aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:64:0x0105  */
    /* JADX WARN: Code duplicated, block: B:67:0x013d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0144  */
    /* JADX WARN: Code duplicated, block: B:70:0x014a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0180  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static final void h(y7e1 y7e1Var, uho0 uho0Var, iu30 iu30Var, qim0 qim0Var, iu30 iu30Var2, b0k b0kVar, int i, int i2) throws NoWhenBranchMatchedException {
        y7e1 y7e1Var2;
        int i3;
        iu30 iu30Var3;
        boolean z;
        b0k b0kVar2;
        iu30 iu30Var4;
        h311 h311VarV;
        iu30 iu30Var5;
        BreakIterator characterInstance;
        int i4;
        int i5;
        View view;
        String strS;
        String strS2;
        Object objT;
        m4c m4cVar;
        ven0 ven0Var;
        oan oanVarT;
        boolean zE;
        Object objT2;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z2;
        Object objT3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1735335509);
        if ((i & 6) == 0) {
            y7e1Var2 = y7e1Var;
            i3 = (b0kVar3.i(y7e1Var2) ? 4 : 2) | i;
        } else {
            y7e1Var2 = y7e1Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? b0kVar3.g(uho0Var) : b0kVar3.i(uho0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.i(qim0Var) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                iu30Var3 = iu30Var2;
                i3 |= b0kVar3.i(iu30Var3) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                if (i6 != 0) {
                    iu30Var5 = null;
                } else {
                    iu30Var5 = iu30Var3;
                }
                String string = y7e1Var2.d().d.toString();
                characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(string);
                i4 = 0;
                while (characterInstance.next() != -1) {
                    i4++;
                }
                i5 = 250 - i4;
                view = (View) b0kVar3.k(AndroidCompositionLocals_androidKt.f);
                strS = s(20, b0kVar3, 6);
                strS2 = s(0, b0kVar3, 6);
                objT = b0kVar3.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(t(i5));
                    b0kVar3.s0(objT);
                }
                ven0Var = (ven0) objT;
                oanVarT = t(i5);
                zE = b0kVar3.e(oanVarT.ordinal()) | b0kVar3.i(ven0Var) | b0kVar3.g(strS) | b0kVar3.g(strS2) | b0kVar3.i(view);
                objT2 = b0kVar3.T();
                if (zE || objT2 == m4cVar) {
                    vt1 vt1Var = new vt1(oanVarT, strS, strS2, ven0Var, view);
                    b0kVar3.s0(vt1Var);
                    objT2 = vt1Var;
                }
                qxd0.S((Function0) objT2, b0kVar3);
                mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
                iHashCode = Long.hashCode(((x340) b0kVar3).T);
                xos0VarM = b0kVar3.m();
                qim0VarE = zr7.E(b0kVar3, qim0Var);
                hzj.A.getClass();
                if (((x340) b0kVar3).a != null) {
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
                String strO0 = cwl1.o0(b0kVar3, uho0Var.b());
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                z2 = (57344 & i3) == 16384;
                objT3 = b0kVar3.T();
                if (z2 || objT3 == m4cVar) {
                    objT3 = new wck0(iu30Var5, (byte) 12);
                    b0kVar3.s0(objT3);
                }
                iu30 iu30Var6 = iu30Var5;
                eqn1.e(y7e1Var2, 5, strO0, 250, cev0.G(qim0VarF, (iu30) objT3), null, false, false, uho0Var.a(b0kVar3), "NoteInput.TextField", b0kVar3, (i3 & 14) | 805309488, 224);
                b0kVar2 = b0kVar3;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar2).b;
                e(i5, (i3 >> 3) & 112, b0kVar2, iu30Var, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13));
                b0kVar2.r(true);
                iu30Var4 = iu30Var6;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                iu30Var4 = iu30Var3;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new j90(y7e1Var, uho0Var, iu30Var, qim0Var, iu30Var4, i, i2, (byte) 14);
            }
        }
        i3 |= 24576;
        iu30Var3 = iu30Var2;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            if (i6 != 0) {
                iu30Var5 = null;
            } else {
                iu30Var5 = iu30Var3;
            }
            String string2 = y7e1Var2.d().d.toString();
            characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(string2);
            i4 = 0;
            while (characterInstance.next() != -1) {
                i4++;
            }
            i5 = 250 - i4;
            view = (View) b0kVar3.k(AndroidCompositionLocals_androidKt.f);
            strS = s(20, b0kVar3, 6);
            strS2 = s(0, b0kVar3, 6);
            objT = b0kVar3.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(t(i5));
                b0kVar3.s0(objT);
            }
            ven0Var = (ven0) objT;
            oanVarT = t(i5);
            zE = b0kVar3.e(oanVarT.ordinal()) | b0kVar3.i(ven0Var) | b0kVar3.g(strS) | b0kVar3.g(strS2) | b0kVar3.i(view);
            objT2 = b0kVar3.T();
            if (zE) {
                vt1 vt1Var2 = new vt1(oanVarT, strS, strS2, ven0Var, view);
                b0kVar3.s0(vt1Var2);
                objT2 = vt1Var2;
            } else {
                vt1 vt1Var3 = new vt1(oanVarT, strS, strS2, ven0Var, view);
                b0kVar3.s0(vt1Var3);
                objT2 = vt1Var3;
            }
            qxd0.S((Function0) objT2, b0kVar3);
            mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0VarM = b0kVar3.m();
            qim0VarE = zr7.E(b0kVar3, qim0Var);
            hzj.A.getClass();
            if (((x340) b0kVar3).a != null) {
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
            String strO1 = cwl1.o0(b0kVar3, uho0Var.b());
            nim0 nim0Var2 = nim0.a;
            qim0 qim0VarF2 = u291.f(nim0Var2, 1.0f);
            if ((57344 & i3) == 16384) {
            }
            objT3 = b0kVar3.T();
            if (z2) {
                objT3 = new wck0(iu30Var5, (byte) 12);
                b0kVar3.s0(objT3);
            } else {
                objT3 = new wck0(iu30Var5, (byte) 12);
                b0kVar3.s0(objT3);
            }
            iu30 iu30Var7 = iu30Var5;
            eqn1.e(y7e1Var2, 5, strO1, 250, cev0.G(qim0VarF2, (iu30) objT3), null, false, false, uho0Var.a(b0kVar3), "NoteInput.TextField", b0kVar3, (i3 & 14) | 805309488, 224);
            b0kVar2 = b0kVar3;
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            e(i5, (i3 >> 3) & 112, b0kVar2, iu30Var, uyn1.B(nim0Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13));
            b0kVar2.r(true);
            iu30Var4 = iu30Var7;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            iu30Var4 = iu30Var3;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new j90(y7e1Var, uho0Var, iu30Var, qim0Var, iu30Var4, i, i2, (byte) 14);
        }
    }

    public static final void i(vnr0 vnr0Var, boolean z, vnr0 vnr0Var2, int i, String str, float f, String str2, dzo1 dzo1Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i2) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-195550908);
        int i3 = i2 | (b0kVar3.i(vnr0Var) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(vnr0Var2) ? 256 : 128) | (b0kVar3.e(i) ? 2048 : 1024) | (b0kVar3.g(str) ? 16384 : 8192) | (b0kVar3.d(f) ? 131072 : 65536) | (b0kVar3.g(str2) ? 1048576 : 524288) | (b0kVar3.g(dzo1Var) ? 8388608 : 4194304) | 100663296 | (b0kVar3.i(function0) ? 536870912 : 268435456);
        if (b0kVar3.Y(i3 & 1, (306783379 & i3) != 306783378)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(b0kVar3);
            }
            idn0 idn0Var = (idn0) objT;
            boolean z2 = (3670016 & i3) == 1048576;
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new hqa1(str2, (byte) 5);
                b0kVar3.s0(objT2);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarR = u291.r(s161.b(qim0Var3, true, (iu30) objT2), f);
            boolean z3 = (i3 & 1879048192) == 536870912;
            Object objT3 = b0kVar3.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new pt61(function0, (byte) 27);
                b0kVar3.s0(objT3);
            }
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarR, (tl3) null, (hw61) null, (pgx) null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (max) null, false, idn0Var, jtr.g, new gbx(dzo1Var, (Function0) objT3), (gbx) null, apo.r(-570549701, new p6c1(str, vnr0Var, f, z, i, vnr0Var2), b0kVar3), b0kVar2, 100663296, 48, 1134);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bya1(vnr0Var, z, vnr0Var2, i, str, f, str2, dzo1Var, qim0Var2, function0, i2);
        }
    }

    public static final a1h1 j(e8b0 e8b0Var) {
        boolean z;
        e8b0 e8b0VarW0;
        dq20 dq20VarQ;
        qx81 qx81VarR = d0p1.r(e8b0Var);
        if (qx81VarR == null && ((dq20VarQ = d0p1.q(e8b0Var)) == null || (qx81VarR = d0p1.Z(dq20VarQ)) == null)) {
            qx81VarR = d0p1.r(e8b0Var);
            qx81VarR.getClass();
        }
        y0h1 y0h1VarD = d0p1.D(d0p1.n0(qx81VarR));
        if (y0h1VarD != null) {
            return y0h1VarD;
        }
        if (e8b0Var instanceof a8b0) {
            z = g6b0.z((a8b0) e8b0Var);
        } else {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(e8b0Var);
            sb.append(", ");
            hhg1.f(us71.f(rc11.a, e8b0Var.getClass(), sb));
            z = false;
        }
        if (z) {
            e1h1 e1h1Var = (d0h1) o7h.V0(d0p1.y(e8b0Var));
            if (d0p1.V(e1h1Var)) {
                e8b0VarW0 = null;
            } else {
                if (!(e1h1Var instanceof e1h1)) {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(e1h1Var);
                    sb2.append(", ");
                    hhg1.f(us71.f(rc11.a, e1h1Var.getClass(), sb2));
                    return null;
                }
                e8b0VarW0 = e1h1Var.b().w0();
            }
            if (e8b0VarW0 != null) {
                return j(e8b0VarW0);
            }
        }
        return null;
    }

    public static final boolean k(opb1 opb1Var, int i, d9 d9Var, boolean z) {
        boolean z2;
        synchronized (a) {
            try {
                int i2 = opb1Var.d;
                if (i2 == i) {
                    opb1Var.c = d9Var;
                    z2 = true;
                    if (z) {
                        opb1Var.e++;
                    }
                    opb1Var.d = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final n511 l(elb0 elb0Var) {
        elb0 elb0VarJ = elb0Var.J();
        return elb0VarJ != null ? elb0VarJ.M(elb0Var, true) : new n511(0.0f, 0.0f, (int) (elb0Var.b() >> 32), (int) (elb0Var.b() & 4294967295L));
    }

    public static final n511 m(ndo0 ndo0Var) {
        return v(ndo0Var).M(ndo0Var, true);
    }

    public static final n511 n(elb0 elb0Var, boolean z) {
        elb0 elb0VarV = v(elb0Var);
        float fB = (int) (elb0VarV.b() >> 32);
        float fB2 = (int) (elb0VarV.b() & 4294967295L);
        n511 n511VarM = elb0VarV.M(elb0Var, z);
        float f = n511VarM.a;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > fB) {
                f = fB;
            }
        }
        float f2 = n511VarM.b;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fB2) {
                f2 = fB2;
            }
        }
        float f3 = n511VarM.c;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fB) {
                fB = f3;
            }
            f3 = fB;
        }
        float f4 = n511VarM.d;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= fB2) {
                fB2 = f5;
            }
            f4 = fB2;
        }
        if (f == f3 || f2 == f4) {
            return n511.e;
        }
        long jP = elb0VarV.p((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jP2 = elb0VarV.p((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jP3 = elb0VarV.p((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jP4 = elb0VarV.p((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jP >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jP2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jP4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jP3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jP & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jP2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jP4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jP3 & 4294967295L));
        return new n511(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static String p(String str) {
        if (str != null) {
            return new a6n1(str, (Object) null, (byte) 8).f();
        }
        hhg1.n("applicationId cannot be null");
        return null;
    }

    public static String q(String str, List list) {
        if (str == null) {
            hhg1.n("applicationId cannot be null");
            return null;
        }
        if (list != null) {
            return new a6n1(str, list, (byte) 8).f();
        }
        hhg1.n("namespaces cannot be null");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0198  */
    /* JADX WARN: Code duplicated, block: B:76:0x019a  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c9  */
    public static final e8b0 r(e8b0 e8b0Var, HashSet hashSet) {
        qx81 qx81Var;
        a1h1 a1h1VarJ;
        e8b0 e8b0VarH;
        sx81 sx81VarR;
        h0h1 h0h1VarG;
        c4x0 c4x0Var = c4x0.N0;
        i0h1 i0h1VarG = c4x0Var.G(e8b0Var);
        if (hashSet.add(i0h1VarG)) {
            y0h1 y0h1VarD = d0p1.D(i0h1VarG);
            boolean z = true;
            int i = 0;
            if (y0h1VarD != null) {
                sx81 sx81VarB = d0p1.B(y0h1VarD);
                sx81 sx81VarR2 = r(sx81VarB, hashSet);
                if (sx81VarR2 != null) {
                    if (!d0p1.N(c4x0Var.G(sx81VarB)) && (!(sx81VarB instanceof sx81) || !d0p1.T(sx81VarB))) {
                        z = false;
                    }
                    if ((sx81VarR2 instanceof sx81) && d0p1.T(sx81VarR2) && d0p1.S(e8b0Var) && z) {
                        return c4x0Var.N(sx81VarB);
                    }
                    return (d0p1.S(sx81VarR2) || !d0p1.Q(e8b0Var)) ? sx81VarR2 : c4x0Var.N(sx81VarR2);
                }
            } else {
                if (!d0p1.N(i0h1VarG)) {
                    return e8b0Var;
                }
                List listA = d0p1.A(c4x0Var.G(e8b0Var));
                List listY = d0p1.y(e8b0Var);
                ArrayList arrayList = new ArrayList(q7h.U(listY, 10));
                for (Object obj : listY) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    a8b0 a8b0VarC = d0p1.C(c4x0Var, (d0h1) obj);
                    if (a8b0VarC == null) {
                        a8b0VarC = d0p1.B((a1h1) listA.get(i));
                    }
                    arrayList.add(a8b0VarC);
                    i = i2;
                }
                List<y0h1> list = listA;
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                for (y0h1 y0h1Var : list) {
                    if (y0h1Var instanceof y0h1) {
                        h0h1VarG = y0h1Var.g();
                    } else {
                        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb.append(y0h1Var);
                        sb.append(", ");
                        hhg1.f(us71.f(rc11.a, y0h1Var.getClass(), sb));
                        h0h1VarG = null;
                    }
                    arrayList2.add(h0h1VarG);
                }
                Map mapT = sqg0.T(o7h.v1(arrayList2, arrayList));
                ArrayList arrayList3 = new ArrayList(mapT.size());
                for (Map.Entry entry : mapT.entrySet()) {
                    arrayList3.add(new mmr0((h0h1) ((i0h1) entry.getKey()), new f1h1(1, (e8b0) entry.getValue())));
                }
                l1h1 l1h1Var = new l1h1(new qhb1(sqg0.T(arrayList3), (byte) 1));
                if (e8b0Var instanceof a8b0) {
                    int i3 = vf80.a;
                    beg begVarS = ((a8b0) e8b0Var).t0().s();
                    beg begVar = begVarS instanceof beg ? begVarS : null;
                    if (begVar != null) {
                        int i4 = kht.a;
                        uf80 uf80VarQ = begVar.Q();
                        uf80 uf80Var = uf80VarQ instanceof uf80 ? uf80VarQ : null;
                        qx81Var = uf80Var != null ? uf80Var.b : null;
                    }
                    if (qx81Var == null) {
                        e8b0VarH = null;
                    } else {
                        a1h1VarJ = j(qx81Var);
                        if (a1h1VarJ == null) {
                            e8b0VarH = d0p1.h0(l1h1Var, qx81Var);
                        } else {
                            e8b0VarH = H(qx81Var, d0p1.h0(l1h1Var, d0p1.B(a1h1VarJ)));
                        }
                    }
                    if (e8b0VarH != null && (sx81VarR = r(e8b0VarH, hashSet)) != null) {
                        if (!d0p1.S(e8b0Var)) {
                            return sx81VarR;
                        }
                        if (d0p1.S(sx81VarR)) {
                            return e8b0Var;
                        }
                        return ((sx81VarR instanceof sx81) || !d0p1.T(sx81VarR)) ? c4x0Var.N(sx81VarR) : e8b0Var;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(e8b0Var);
                    sb2.append(", ");
                    hhg1.f(us71.f(rc11.a, e8b0Var.getClass(), sb2));
                }
                if (qx81Var == null) {
                    e8b0VarH = null;
                } else {
                    a1h1VarJ = j(qx81Var);
                    if (a1h1VarJ == null) {
                        e8b0VarH = d0p1.h0(l1h1Var, qx81Var);
                    } else {
                        e8b0VarH = H(qx81Var, d0p1.h0(l1h1Var, d0p1.B(a1h1VarJ)));
                    }
                }
                if (e8b0VarH != null) {
                    if (!d0p1.S(e8b0Var)) {
                        return sx81VarR;
                    }
                    if (d0p1.S(sx81VarR)) {
                        return e8b0Var;
                    }
                    if (sx81VarR instanceof sx81) {
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final String s(int i, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int iOrdinal = t(i).ordinal();
        if (iOrdinal == 0) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(703639624);
            String strU = cwl1.U(2131820760, i, new Object[]{Integer.valueOf(i)}, x340Var);
            x340Var.r(false);
            return strU;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw p3d1.k((x340) b0kVar, 703630390, false);
            }
            x340 x340Var2 = (x340) b0kVar;
            return x0d.k(x340Var2, 703632409, 2131959159, x340Var2, false);
        }
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.i0(703635332);
        String strU2 = cwl1.U(2131820759, i, new Object[]{Integer.valueOf(i)}, x340Var3);
        x340Var3.r(false);
        return strU2;
    }

    public static final oan t(int i) {
        if (i <= 0) {
            return oan.c;
        }
        return i <= 20 ? oan.b : oan.a;
    }

    public static int u(Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.dataSize();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static final elb0 v(elb0 elb0Var) {
        elb0 elb0Var2;
        elb0 elb0VarJ = elb0Var.J();
        while (true) {
            elb0 elb0Var3 = elb0VarJ;
            elb0Var2 = elb0Var;
            elb0Var = elb0Var3;
            if (elb0Var == null) {
                break;
            }
            elb0VarJ = elb0Var.J();
        }
        ndo0 ndo0Var = elb0Var2 instanceof ndo0 ? (ndo0) elb0Var2 : null;
        if (ndo0Var == null) {
            return elb0Var2;
        }
        ndo0 ndo0Var2 = ndo0Var.Y0;
        while (true) {
            ndo0 ndo0Var3 = ndo0Var2;
            ndo0 ndo0Var4 = ndo0Var;
            ndo0Var = ndo0Var3;
            if (ndo0Var == null) {
                return ndo0Var4;
            }
            ndo0Var2 = ndo0Var.Y0;
        }
    }

    public static final opb1 w(bw91 bw91Var) {
        return pv91.r(bw91Var.a, bw91Var);
    }

    public static final String x(x360 x360Var) {
        if (x360Var instanceof hvl1) {
            return ((hvl1) x360Var).a;
        }
        if (x360Var instanceof may) {
            may mayVar = (may) x360Var;
            return MessageFormat.format(mayVar.getFormat(), mayVar.a().a);
        }
        if (x360Var instanceof i460) {
            i460 i460Var = (i460) x360Var;
            return xcg1.i(i460Var.a, "\n", i460Var.b);
        }
        if (x360Var instanceof prb1) {
            return ((prb1) x360Var).a;
        }
        eg.o();
        return null;
    }

    public static final boolean y(bw91 bw91Var, iu30 iu30Var) {
        int i;
        d9 d9Var;
        Object objInvoke;
        jv91 jv91VarH;
        boolean zK;
        do {
            synchronized (a) {
                opb1 opb1VarF = pv91.f(bw91Var.a);
                i = opb1VarF.d;
                d9Var = opb1VarF.c;
            }
            d9Var.getClass();
            ers0 ers0VarF = d9Var.f();
            objInvoke = iu30Var.invoke(ers0VarF);
            d9 d9VarD = ers0VarF.d();
            if (u890.j(d9VarD, d9Var)) {
                break;
            }
            opb1 opb1Var = bw91Var.a;
            synchronized (pv91.c) {
                jv91VarH = pv91.h();
                zK = k(pv91.u(opb1Var, bw91Var, jv91VarH), i, d9VarD, true);
            }
            pv91.l(jv91VarH, bw91Var);
        } while (!zK);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final void z(xgm1 xgm1Var, String str, rx7 rx7Var) {
        StoryCard storyCard = ((wgm1) xgm1Var.getState().getValue()).a;
        if (u890.j(storyCard != null ? storyCard.getId() : null, str)) {
            xgm1Var.a(new lgm1(rx7Var.a, rx7Var.b, rx7Var.c));
        }
    }
}
