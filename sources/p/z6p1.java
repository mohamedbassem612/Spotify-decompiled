package p;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
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
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.base.java.logging.Logger;
import com.spotify.common.uri.SpotifyUriParserException;
import com.spotify.wrapped.v1.proto.Paragraph;
import defpackage.m;
import io.reactivex.rxjava3.core.Observable;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class z6p1 {
    public static b180 a;
    public static b180 b;

    public static final lee1 F(lee1 lee1Var, flb0 flb0Var) {
        zma1 zma1Var = lee1Var.a;
        j8e1 j8e1Var = ana1.d;
        j8e1 j8e1Var2 = zma1Var.a;
        if (j8e1Var2.equals(i8e1.a)) {
            j8e1Var2 = ana1.d;
        }
        j8e1 j8e1Var3 = j8e1Var2;
        long j = zma1Var.b;
        wee1[] wee1VarArr = TextUnit.b;
        if ((j & 1095216660480L) == 0) {
            j = ana1.a;
        }
        long j2 = j;
        FontWeight fontWeight = zma1Var.c;
        if (fontWeight == null) {
            fontWeight = FontWeight.t;
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyle = zma1Var.d;
        FontStyle fontStyle2 = new FontStyle(fontStyle != null ? fontStyle.a : 0);
        FontSynthesis fontSynthesis = zma1Var.e;
        FontSynthesis fontSynthesis2 = new FontSynthesis(fontSynthesis != null ? fontSynthesis.a : 65535);
        a0s a0sVar = zma1Var.f;
        if (a0sVar == null) {
            a0sVar = FontFamily.a;
        }
        a0s a0sVar2 = a0sVar;
        String str = zma1Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j3 = zma1Var.h;
        if ((j3 & 1095216660480L) == 0) {
            j3 = ana1.b;
        }
        long j4 = j3;
        BaselineShift baselineShift = zma1Var.i;
        float f = baselineShift != null ? baselineShift.a : 0.0f;
        BaselineShift baselineShift2 = new BaselineShift(Float.isNaN(f) ? 0.0f : f);
        TextGeometricTransform textGeometricTransform = zma1Var.j;
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.c;
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeListI = zma1Var.k;
        if (localeListI == null) {
            LocaleList localeList = LocaleList.c;
            localeListI = uct0.a.i();
        }
        LocaleList localeList2 = localeListI;
        long j5 = zma1Var.l;
        if (j5 == 16) {
            j5 = ana1.c;
        }
        long j6 = j5;
        TextDecoration textDecoration = zma1Var.m;
        if (textDecoration == null) {
            textDecoration = TextDecoration.b;
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = zma1Var.n;
        if (shadow == null) {
            shadow = Shadow.d;
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformSpanStyle = zma1Var.o;
        z520 z520Var = zma1Var.p;
        if (z520Var == null) {
            z520Var = z520.a;
        }
        zma1 zma1Var2 = new zma1(j8e1Var3, j2, fontWeight2, fontStyle2, fontSynthesis2, a0sVar2, str2, j4, baselineShift2, textGeometricTransform2, localeList2, j6, textDecoration2, shadow2, platformSpanStyle, z520Var);
        cpr0 cpr0Var = lee1Var.b;
        int i = dpr0.b;
        int i2 = cpr0Var.a;
        int i3 = cpr0Var.h;
        int i4 = cpr0Var.g;
        int i5 = 5;
        if (i2 == 0) {
            i2 = 5;
        }
        int i6 = cpr0Var.b;
        if (i6 == 3) {
            int iOrdinal = flb0Var.ordinal();
            if (iOrdinal == 0) {
                i5 = 4;
            } else if (iOrdinal != 1) {
                eg.o();
                return null;
            }
        } else if (i6 == 0) {
            int iOrdinal2 = flb0Var.ordinal();
            if (iOrdinal2 == 0) {
                i5 = 1;
            } else {
                if (iOrdinal2 != 1) {
                    eg.o();
                    return null;
                }
                i5 = 2;
            }
        } else {
            i5 = i6;
        }
        long j7 = cpr0Var.c;
        if ((j7 & 1095216660480L) == 0) {
            j7 = dpr0.a;
        }
        u8e1 u8e1Var = cpr0Var.d;
        if (u8e1Var == null) {
            u8e1Var = u8e1.c;
        }
        edt0 edt0Var = cpr0Var.e;
        int i7 = 1;
        shc0 shc0Var = cpr0Var.f;
        int i8 = mhc0.b;
        if (i4 == 0) {
            i4 = mhc0.b;
        }
        if (i3 != 0) {
            i7 = i3;
        }
        gbe1 gbe1Var = cpr0Var.i;
        if (gbe1Var == null) {
            gbe1Var = gbe1.c;
        }
        return new lee1(zma1Var2, new cpr0(i2, i5, j7, u8e1Var, edt0Var, shc0Var, i4, i7, gbe1Var), lee1Var.c);
    }

    public static void G(fx40 fx40Var, int i, mi30 mi30Var) {
        switch (mi30Var.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((kgr0) ((idd1) mi30Var.d).getValue()).setBackground(new pgr0(i));
                break;
            default:
                ((kgr0) mi30Var.d).setBackground(new pgr0(i));
                break;
        }
        fx40Var.setBackground(new rw40(new Drawable[]{new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, 0}), new ads(fx40Var.getContext())}));
    }

    public static final void a(j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, j2i j2iVar5, b0k b0kVar, int i) {
        j2i j2iVar6;
        j2i j2iVar7;
        j2i j2iVar8;
        j2i j2iVar9;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(329712642);
        j06 j06Var = x340Var.a;
        if (x340Var.Y(i & 1, (i & 9363) != 9362)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(x340Var).a.d, d4o1.a);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).b.b, 0.0f, 2, l6o1.H(too1.y(qim0VarF2, lhc.g(x340Var).e), l6o1.C(0, 0, 1, x340Var), false, 14));
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("add_page_number_page", uyn1.B(qim0VarZ, 0.0f, 16.0f, 0.0f, cbx.b(x340Var).b.b, 5));
            era eraVar = een.Q0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            j2iVar.invoke(x340Var, 6);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 12.0f));
            j2iVar6 = j2iVar2;
            j2iVar6.invoke(x340Var, 6);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            j2iVar7 = j2iVar3;
            j2iVar7.invoke(x340Var, 6);
            cvx cvxVar4 = ywx0.k(nim0Var, cbx.b(x340Var).b.b, x340Var, x340Var).b;
            mbh mbhVarA2 = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            j2iVar8 = j2iVar4;
            j2iVar8.invoke(x340Var, 6);
            j2iVar9 = j2iVar5;
            ktd.s(j2iVar9, x340Var, 6, true, true);
        } else {
            j2iVar6 = j2iVar2;
            j2iVar7 = j2iVar3;
            j2iVar8 = j2iVar4;
            j2iVar9 = j2iVar5;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m(j2iVar, j2iVar6, j2iVar7, j2iVar8, j2iVar9, i);
        }
    }

    public static final void b(mfv0 mfv0Var, j2i j2iVar, w5f1 w5f1Var, qim0 qim0Var, j2i j2iVar2, b0k b0kVar, int i) {
        mfv0 mfv0Var2;
        int i2;
        b0k b0kVar2;
        ven0 ven0Var;
        boolean z;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1221877520);
        if ((i & 6) == 0) {
            mfv0Var2 = mfv0Var;
            i2 = (b0kVar3.g(mfv0Var2) ? 4 : 2) | i;
        } else {
            mfv0Var2 = mfv0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? b0kVar3.g(w5f1Var) : b0kVar3.i(w5f1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i((Object) null) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= b0kVar3.h(false) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.h(true) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= b0kVar3.h(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= b0kVar3.i(j2iVar2) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (b0kVar3.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iK = tgp1.k(b0kVar3);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, nim0.a);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(gfh0VarC, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            llj lljVar = y580.R0;
            if (((x340) b0kVar3).S || !u890.j(b0kVar3.T(), Integer.valueOf(iK))) {
                z5c.f(iK, b0kVar3, iK, lljVar);
            }
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            if (w5f1Var.isVisible()) {
                b0kVar3.i0(-1891243071);
                b0kVar2 = b0kVar3;
                ven0Var = ven0Var2;
                m(mfv0Var2, w5f1Var, c9nVar, false, ven0Var, j2iVar, b0kVar2, (i3 & 14) | 196608 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                z = false;
                b0kVar2.r(false);
            } else {
                b0kVar2 = b0kVar3;
                ven0Var = ven0Var2;
                z = false;
                b0kVar2.i0(-1890863476);
                b0kVar2.r(false);
            }
            o(w5f1Var, ven0Var, qim0Var, j2iVar2, b0kVar2, ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752));
            b0kVar2.r(true);
            boolean z2 = ((i3 & 896) == 256 || ((i3 & 512) != 0 && b0kVar2.i(w5f1Var))) ? true : z;
            Object objT3 = b0kVar2.T();
            if (z2 || objT3 == m4cVar) {
                objT3 = new j6(w5f1Var, (byte) 11);
                b0kVar2.s0(objT3);
            }
            qxd0.i(w5f1Var, (iu30) objT3, b0kVar2);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hfa(mfv0Var, j2iVar, w5f1Var, qim0Var, j2iVar2, i);
        }
    }

    public static final void c(hux huxVar, String str, b0k b0kVar, int i) {
        String str2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(812667415);
        int i2 = i | ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | (x340Var.g(str) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.N0, x340Var, 0);
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
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(huxVar, isl.a, u291.r(nim0Var, 24.0f), 0L, 0L, false, x340Var, 56 | (i2 & 14), 56);
            str2 = str;
            uwo1.e(str2, new wnb0(1.0f, true), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(5), null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2016);
            x340Var.r(true);
        } else {
            str2 = str;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new grc(huxVar, str2, i, (byte) 6);
        }
    }

    public static final void d(ljh ljhVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        String str = ljhVar.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-565073325);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ljhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, qim0Var);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new syf(ljhVar, (byte) 21);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarZ, true, (iu30) objT);
            boolean z2 = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new ukf(function0, (byte) 24);
                x340Var.s0(objT2);
            }
            qim0 qim0VarK = eqn1.k(qim0VarB, (Function0) objT2);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarK);
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
            xlx xlxVar = xlx.c;
            long j = cbx.a(x340Var).b.a;
            float f = cbx.b(x340Var).b.b;
            nim0 nim0Var = nim0.a;
            w0h1.a(xlxVar, isl.a, u291.r(nim0Var, f), j, 0L, false, x340Var, xlx.d | 48, 48);
            if (str.length() > 0) {
                x340Var.i0(-728998607);
                lee1 lee1VarA = lee1.a(cbx.d(x340Var).m, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, new Shadow(12.0f, ((vex) zex.a.e).c, (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)), (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16769023);
                long j2 = cbx.a(x340Var).b.a;
                cjc0 cjc0Var = new cjc0(1);
                cvx cvxVar2 = cbx.b(x340Var).b;
                uwo1.e(str, uyn1.B(nim0Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), lee1VarA, j2, null, null, 2, false, cjc0Var, 0, null, x340Var, 1572864, 0, 1712);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(-728481403);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b(ljhVar, function0, qim0Var, i, (byte) 27);
        }
    }

    public static final void e(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1928697035);
        int i2 = (b0kVar3.i(function0) ? 4 : 2) | i | 48;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new pt61(function0, (byte) 12);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            j2i j2iVar = shj.a;
            j2i j2iVar2 = shj.b;
            b0kVar2 = b0kVar3;
            qim0Var2 = nim0.a;
            jto1.b(qim0Var2, null, null, false, null, null, gbxVar, null, null, j2iVar, null, null, null, null, null, j2iVar2, b0kVar2, 805306374, 196608, 32190);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new t531(function0, qim0Var2, i, (byte) 6);
        }
    }

    public static final void f(Paragraph paragraph, float f, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1587565243);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(paragraph) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(48.0f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            kiv kivVar = t4k.h;
            wat watVar = (wat) x340Var.k(kivVar);
            vnr0 vnr0VarA = shy0.a(paragraph, x340Var);
            bor0 bor0VarE = vnr0VarA.c.e();
            float f2 = bor0VarE != null ? bor0VarE.e : 0.0f;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = pzo0.R0;
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0Var, (iu30) objT);
            boolean zD = x340Var.d(f2) | ((i2 & 896) == 256);
            Object objT2 = x340Var.T();
            if (zD || objT2 == m4cVar) {
                objT2 = new j37((byte) 6, f2);
                x340Var.s0(objT2);
            }
            gfh0 gfh0Var = (gfh0) objT2;
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
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            mod.b(kivVar.a(new xat(watVar.h(), 1.0f)), apo.r(786702770, new udp0(vnr0VarA, bor0VarE, f), x340Var), x340Var, 56);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jh6((Object) paragraph, f, qim0Var, i, (byte) 4);
        }
    }

    public static final void g(vnr0 vnr0Var, qim0 qim0Var, b0k b0kVar, int i) {
        vnr0 vnr0Var2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(880317784);
        int i2 = (x340Var.i(vnr0Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            vnr0Var2 = vnr0Var;
            qim0Var2 = qim0Var;
            qgo1.f(vnr0Var2, qim0Var2, null, 2, false, null, x340Var, (i2 & 14) | 24584 | (i2 & 112), 36);
        } else {
            vnr0Var2 = vnr0Var;
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vdp0(vnr0Var2, qim0Var2, i, (byte) 0);
        }
    }

    public static final void h(vnr0 vnr0Var, bor0 bor0Var, float f, b0k b0kVar, int i) {
        vnr0 vnr0Var2;
        bor0 bor0Var2;
        x340 x340Var;
        jor0 jor0VarF;
        byte b2;
        Object obj = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1469222719);
        int i2 = (x340Var2.i(vnr0Var) ? 4 : 2) | i | (x340Var2.g(bor0Var) ? 32 : 16) | (x340Var2.d(f) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 14) == 4 || x340Var2.g(vnr0Var);
            Object objT = x340Var2.T();
            if (z || objT == obj) {
                String strConcat = vnr0Var.a;
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(strConcat);
                List listK0 = z561.k0(z561.b0(new pdp0(characterInstance, (byte) 1)));
                if (listK0.size() > 10) {
                    Logger.d("BottomBar: Nudge label exceeds %d characters", new Object[]{10});
                    strConcat = strConcat.substring(0, ((Number) listK0.get(8)).intValue()).concat("…");
                }
                jor0 jor0Var = vnr0Var.c;
                if (jor0Var instanceof jor0) {
                    jor0VarF = jor0.f(jor0Var, (gor0) null, (djc0) null, 47);
                } else {
                    if (!(jor0Var instanceof ior0)) {
                        eg.o();
                        return;
                    }
                    jor0VarF = ior0.f((ior0) jor0Var, (ArrayList) null, (cjc0) null, 11);
                }
                b2 = 8;
                objT = vnr0.a(vnr0Var, strConcat, null, jor0VarF, 0L, 26);
                x340Var2.s0(objT);
            } else {
                b2 = 8;
            }
            vnr0 vnr0Var3 = (vnr0) objT;
            boolean z2 = (i2 & 896) == 256;
            Object objT2 = x340Var2.T();
            if (z2 || objT2 == obj) {
                objT2 = new vbk0(b2, f);
                x340Var2.s0(objT2);
            }
            qim0 qim0VarC = i541.C(nim0.a, (iu30) objT2);
            if (bor0Var == null) {
                x340Var2.i0(-397222806);
                g(vnr0Var3, qim0VarC, x340Var2, b2);
                x340Var2.r(false);
                bor0Var2 = bor0Var;
                x340Var = x340Var2;
                vnr0Var2 = vnr0Var;
            } else {
                x340Var2.i0(-397148344);
                bor0Var2 = bor0Var;
                x340Var = x340Var2;
                vnr0Var2 = vnr0Var;
                fn31.d(bor0Var2, qim0VarC, 0.0f, 2.0f, apo.r(-416017168, new ukm0(vnr0Var3, bor0Var, (byte) 11), x340Var2), x340Var, 27648 | ((i2 >> 3) & 14));
                x340Var.r(false);
            }
        } else {
            vnr0Var2 = vnr0Var;
            bor0Var2 = bor0Var;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new udp0(vnr0Var2, bor0Var2, f, i);
        }
    }

    public static final void i(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-490833932);
        int i2 = (x340Var.g(str) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 16.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            c(znx.c, cwl1.n0(2131961140, new Object[]{str}, x340Var), x340Var, znx.d);
            c(ttx.c, cwl1.n0(2131961142, new Object[]{str}, x340Var), x340Var, ttx.d);
            c(vox.c, cwl1.o0(x340Var, 2131961139), x340Var, vox.d);
            c(kpx.c, cwl1.n0(2131961141, new Object[]{str}, x340Var), x340Var, kpx.d);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p9y0(str, i, (byte) 17);
        }
    }

    public static final void j(String str, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-77618806);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ila0.c((scx) null, apo.r(117250506, new p9y0(str, (byte) 18), x340Var), apo.r(-1696542197, new p9y0(str, (byte) 19), x340Var), apo.r(784632396, new ql(cwl1.o0(x340Var, 2131961143), function0, (byte) 29), x340Var), apo.r(-1029160307, new s721(cwl1.o0(x340Var, 2131961144), function1, (byte) 0), x340Var), function1, x340Var, ((i2 << 9) & 458752) | 28080, 1);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb(str, function0, function1, i, (byte) 8);
        }
    }

    public static final void k(m881 m881Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        xu30 xu30Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(778152566);
        byte b2 = 2;
        int i2 = i | (b0kVar3.g(m881Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | 384;
        byte b3 = 0;
        byte b4 = 1;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new pt61(function0, (byte) 13);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            Integer num = m881Var.d;
            j2i j2iVarR = null;
            if (num == null) {
                b0kVar3.i0(2005175965);
                b0kVar3.r(false);
                xu30Var = null;
            } else {
                b0kVar3.i0(2005175966);
                xu30 xu30VarR = apo.r(-1402887543, new f13(num.intValue(), (byte) 19), b0kVar3);
                b0kVar3.r(false);
                xu30Var = xu30VarR;
            }
            if (m881Var.e) {
                b0kVar3.i0(2005489066);
                j2iVarR = apo.r(1066011311, new k881(m881Var, b3), b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(2005804583);
                b0kVar3.r(false);
            }
            j2i j2iVar = j2iVarR;
            j2i j2iVarR2 = apo.r(1278181983, new k881(m881Var, b4), b0kVar3);
            j2i j2iVarR3 = apo.r(506452410, new k881(m881Var, b2), b0kVar3);
            qim0Var2 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(qim0Var2, null, null, false, null, null, gbxVar, null, null, j2iVarR2, null, xu30Var, j2iVar, null, null, j2iVarR3, b0kVar2, 805306374, 196608, 26046);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qm71(m881Var, function0, qim0Var2, i, (byte) 5);
        }
    }

    public static final void l(c380 c380Var, vu30 vu30Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        h311 h311VarV;
        l881 l881Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(846469026);
        int i2 = i | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.i(vu30Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                boolean zI = x340Var.i(ven0Var) | ((i2 & 7168) == 2048);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new swi0(function1, ven0Var, (byte) 13);
                    x340Var.s0(objT2);
                }
                x74.f((Function0) objT2, (scx) null, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(2038910689, new kj21(c380Var, ven0Var, vu30Var, function0, (byte) 12), x340Var), x340Var, 12607488, 48, 1902);
            } else {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    l881Var = new l881(c380Var, vu30Var, function0, function1, i, (byte) 0);
                }
            }
            h311VarV.d = l881Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            l881Var = new l881(c380Var, vu30Var, function0, function1, i, (byte) 1);
            h311VarV.d = l881Var;
        }
    }

    public static final void m(mfv0 mfv0Var, w5f1 w5f1Var, c9n c9nVar, boolean z, ven0 ven0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1413720282);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(mfv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(w5f1Var) : x340Var.i(w5f1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i((Object) null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(c9nVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.g(ven0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(j2iVar) ? 1048576 : 524288;
        }
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            String strO0 = cwl1.o0(x340Var, 2131963297);
            boolean zI = ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(w5f1Var))) | ((i2 & 896) == 256) | x340Var.i(c9nVar) | ((458752 & i2) == 131072);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new uc9(w5f1Var, c9nVar, ven0Var, (byte) 1);
                x340Var.s0(objT);
            }
            sy4.a(mfv0Var, (Function0) objT, new nfv0(1, z, true), apo.r(-1287705660, new ek1(strO0, j2iVar, (byte) 2), x340Var), x340Var, (i2 & 14) | 3072, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ifa(mfv0Var, w5f1Var, c9nVar, z, ven0Var, j2iVar, i);
        }
    }

    public static final void n(String str, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(694165187);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131961150);
            String strO1 = cwl1.o0(x340Var, 2131961151);
            String strN0 = cwl1.n0(2131961152, new Object[]{str}, x340Var);
            String strO2 = cwl1.o0(x340Var, 2131961149);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            zgx zgxVar = new zgx(strO0, new gbx(new y50(strO0), function0));
            if (ihc1.y0(strO1)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            mqo1.d(function1, null, null, strN0, strO2, zgxVar, new zgx(strO1, new gbx(new y50(strO1), function1)), x340Var, ((i2 >> 6) & 14) | 2359296, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb(str, function0, function1, i, (byte) 9);
        }
    }

    public static final void o(w5f1 w5f1Var, ven0 ven0Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1873232064);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(w5f1Var) : x340Var.i(w5f1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(ven0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(qim0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(j2iVar) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            qim0 qim0VarT = y9g1.t(cev0.G(f8d1.b(f8d1.b(qim0Var, w5f1Var, new ofa(w5f1Var, (byte) 0)), w5f1Var, new ofa(w5f1Var, (byte) 1)).then(new itr0(new pg(cwl1.o0(x340Var, 2131963298), c9nVar, w5f1Var, (byte) 5))), new b6(c9nVar, w5f1Var, (byte) 8)), new da(w5f1Var, ven0Var, (byte) 9));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iK = tgp1.k(x340Var);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarT);
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
            llj lljVar = y580.R0;
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var, iK, lljVar);
            }
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l((i2 >> 15) & 14, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zh3(w5f1Var, ven0Var, qim0Var, j2iVar, i);
        }
    }

    public static final Observable p(g0l g0lVar) {
        return ((inr) g0lVar).l().filter(rzs0.W0).map(s321.V0).map(u321.V0);
    }

    public static final wdt0 q(PlatformSpanStyle platformSpanStyle, edt0 edt0Var) {
        if (platformSpanStyle == null && edt0Var == null) {
            return null;
        }
        return new wdt0(platformSpanStyle, edt0Var);
    }

    public static final void r(ye5 ye5Var, String str, String str2) {
        if (str2.length() <= 0) {
            tf80.a("alternateText can't be an empty string.");
        }
        ye5Var.m("androidx.compose.foundation.text.inlineContent", str);
        ye5Var.g(str2);
        ye5Var.j();
    }

    public static final wnb1 t(String str) {
        String str2;
        y6b1 y6b1Var;
        io70 io70Var = null;
        try {
            str2 = str;
            try {
                y6b1Var = new y6b1(str2, false);
                if (y6b1Var.c != v6b1.T0) {
                    y6b1Var = null;
                }
            } catch (SpotifyUriParserException unused) {
            }
        } catch (SpotifyUriParserException unused2) {
            str2 = str;
        }
        if (y6b1Var == null) {
            return null;
        }
        String str3 = y6b1Var.e;
        String str4 = str3 == null ? "" : str3;
        String str5 = y6b1Var.f;
        List listSingletonList = (str5 == null || str5.length() == 0) ? z6x.a : Collections.singletonList(new ho70(str5, ""));
        String str6 = y6b1Var.g;
        if (str6 != null && str6.length() != 0) {
            io70Var = new io70(str6, "");
        }
        jo70 jo70Var = new jo70(str4, "Track", (String) null, listSingletonList, io70Var, 4);
        xkk1 xkk1VarK = d7p1.k(str2);
        ytw0 ytw0Var = jfv.b;
        long j = y6b1Var.i;
        if (j < 0) {
            j = 0;
        }
        return new wnb1(jo70Var, xkk1VarK, new hll(fdg1.l0(j, ngv.e), 14), (hzy) null, (iix0) null, (h2v) null, (zoy0) null, (w281) null, 504);
    }

    public static upa0 w(py9 py9Var) {
        return new upa0(py9Var.b(), (byte) 26);
    }

    public abstract void C(int i);

    public abstract void D(View view, int i, int i2);

    public abstract void E(View view, float f, float f2);

    public abstract boolean H(View view, int i);

    public int u(View view, int i) {
        return view.getLeft();
    }

    public int v(View view, int i) {
        return view.getTop();
    }

    public int x(View view) {
        return 0;
    }

    public int y() {
        return 0;
    }

    public void A() {
    }

    public void B(View view, int i) {
    }

    public void z(int i, int i2) {
    }
}
