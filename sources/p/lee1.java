package p;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lee1 {
    public static final lee1 d = new lee1(0, 0, null, null, 0, 0, 0, 0, 0, null, 0, 16777215);
    public final zma1 a;
    public final cpr0 b;
    public final wdt0 c;

    /* JADX WARN: Illegal instructions before constructor call */
    public lee1(long j, long j2, FontWeight fontWeight, FontFamily fontFamily, long j3, long j4, int i, int i2, long j5, shc0 shc0Var, int i3, int i4) {
        long jP;
        long jK;
        long jK2;
        long jP2;
        long jK3;
        if ((i4 & 1) != 0) {
            int i5 = u7h.l;
            jP = nfb.p();
        } else {
            jP = j;
        }
        if ((i4 & 2) != 0) {
            wee1[] wee1VarArr = TextUnit.b;
            jK = f7p1.k();
        } else {
            jK = j2;
        }
        FontWeight fontWeight2 = (i4 & 4) != 0 ? null : fontWeight;
        FontFamily fontFamily2 = (i4 & 32) != 0 ? null : fontFamily;
        String str = (i4 & 64) != 0 ? null : "liga 1";
        if ((i4 & 128) != 0) {
            wee1[] wee1VarArr2 = TextUnit.b;
            jK2 = f7p1.k();
        } else {
            jK2 = j3;
        }
        if ((i4 & 2048) != 0) {
            int i6 = u7h.l;
            jP2 = nfb.p();
        } else {
            jP2 = j4;
        }
        TextDecoration textDecoration = (i4 & 4096) != 0 ? null : TextDecoration.c;
        int i7 = 0;
        int i8 = (32768 & i4) != 0 ? 0 : i;
        int i9 = (65536 & i4) != 0 ? 0 : i2;
        if ((131072 & i4) != 0) {
            wee1[] wee1VarArr3 = TextUnit.b;
            jK3 = f7p1.k();
        } else {
            jK3 = j5;
        }
        shc0 shc0Var2 = (1048576 & i4) != 0 ? null : shc0Var;
        if ((i4 & 2097152) != 0) {
            int i10 = mhc0.b;
            cuo1.C();
        } else {
            i7 = i3;
        }
        this(new zma1(jP, jK, fontWeight2, null, null, fontFamily2, str, jK2, null, null, null, jP2, textDecoration, null, null), new cpr0(i8, i9, jK3, null, null, shc0Var2, i7, 0, null), null);
    }

    public static lee1 a(lee1 lee1Var, long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, TextGeometricTransform textGeometricTransform, long j4, TextDecoration textDecoration, Shadow shadow, phc1 phc1Var, int i, int i2, long j5, u8e1 u8e1Var, wdt0 wdt0Var, shc0 shc0Var, int i3, int i4) {
        long jA = (i4 & 1) != 0 ? lee1Var.a.a.a() : j;
        long j6 = (i4 & 2) != 0 ? lee1Var.a.b : j2;
        FontWeight fontWeight2 = (i4 & 4) != 0 ? lee1Var.a.c : fontWeight;
        FontStyle fontStyle2 = (i4 & 8) != 0 ? lee1Var.a.d : fontStyle;
        FontSynthesis fontSynthesis2 = (i4 & 16) != 0 ? lee1Var.a.e : fontSynthesis;
        FontFamily fontFamily2 = (i4 & 32) != 0 ? lee1Var.a.f : fontFamily;
        String str2 = (i4 & 64) != 0 ? lee1Var.a.g : str;
        long j7 = (i4 & 128) != 0 ? lee1Var.a.h : j3;
        zma1 zma1Var = lee1Var.a;
        BaselineShift baselineShift = zma1Var.i;
        TextGeometricTransform textGeometricTransform2 = (i4 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? zma1Var.j : textGeometricTransform;
        long j8 = j6;
        LocaleList localeList = zma1Var.k;
        long j9 = (i4 & 2048) != 0 ? zma1Var.l : j4;
        TextDecoration textDecoration2 = (i4 & 4096) != 0 ? zma1Var.m : textDecoration;
        Shadow shadow2 = (i4 & 8192) != 0 ? zma1Var.n : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        phc1 phc1Var2 = (i4 & 16384) != 0 ? zma1Var.f155p : phc1Var;
        int i5 = (i4 & 32768) != 0 ? lee1Var.b.a : i;
        int i6 = (i4 & 65536) != 0 ? lee1Var.b.b : i2;
        long j10 = (i4 & 131072) != 0 ? lee1Var.b.c : j5;
        u8e1 u8e1Var2 = (i4 & 262144) != 0 ? lee1Var.b.d : u8e1Var;
        wdt0 wdt0Var2 = (i4 & 524288) != 0 ? lee1Var.c : wdt0Var;
        shc0 shc0Var2 = (i4 & 1048576) != 0 ? lee1Var.b.f : shc0Var;
        int i7 = (i4 & 2097152) != 0 ? lee1Var.b.g : i3;
        shc0 shc0Var3 = shc0Var2;
        int i8 = (i4 & 4194304) != 0 ? lee1Var.b.h : 2;
        gbe1 gbe1Var = lee1Var.b.i;
        int i9 = i8;
        int i10 = i7;
        long jA2 = zma1Var.a.a();
        int i11 = u7h.l;
        return new lee1(new zma1(z4h1.b(jA, jA2) ? zma1Var.a : p5x0.b(jA), j8, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j7, baselineShift, textGeometricTransform2, localeList, j9, textDecoration3, shadow2, wdt0Var2 != null ? wdt0Var2.a : null, (DrawStyle) phc1Var2), new cpr0(i5, i6, j10, u8e1Var2, wdt0Var2 != null ? wdt0Var2.b : null, shc0Var3, i10, i9, gbe1Var), wdt0Var2);
    }

    public static lee1 f(lee1 lee1Var, long j, long j2, FontWeight fontWeight, FontFamily fontFamily, long j3, int i, long j4, int i2) {
        long jP;
        long jK;
        long jK2;
        long jK3;
        if ((i2 & 1) != 0) {
            int i3 = u7h.l;
            jP = nfb.p();
        } else {
            jP = j;
        }
        if ((i2 & 2) != 0) {
            wee1[] wee1VarArr = TextUnit.b;
            jK = f7p1.k();
        } else {
            jK = j2;
        }
        FontWeight fontWeight2 = (i2 & 4) != 0 ? null : fontWeight;
        FontFamily fontFamily2 = (i2 & 32) != 0 ? null : fontFamily;
        if ((i2 & 128) != 0) {
            wee1[] wee1VarArr2 = TextUnit.b;
            jK2 = f7p1.k();
        } else {
            jK2 = j3;
        }
        int i4 = u7h.l;
        long jP2 = nfb.p();
        int i5 = (32768 & i2) != 0 ? 0 : i;
        if ((i2 & 131072) != 0) {
            wee1[] wee1VarArr3 = TextUnit.b;
            jK3 = f7p1.k();
        } else {
            jK3 = j4;
        }
        int i6 = mhc0.b;
        cuo1.C();
        zma1 zma1VarA = ana1.a(lee1Var.a, jP, null, Float.NaN, jK, fontWeight2, null, null, fontFamily2, null, jK2, null, null, null, jP2, null, null, null, null);
        cpr0 cpr0VarA = dpr0.a(lee1Var.b, i5, 0, jK3, null, null, null, 0, 0, null);
        return (lee1Var.a == zma1VarA && lee1Var.b == cpr0VarA) ? lee1Var : new lee1(zma1VarA, cpr0VarA);
    }

    public final Brush b() {
        return this.a.a.c();
    }

    public final long c() {
        return this.a.a.a();
    }

    public final boolean d(lee1 lee1Var) {
        if (this != lee1Var) {
            return u890.j(this.b, lee1Var.b) && this.a.b(lee1Var.a);
        }
        return true;
    }

    public final lee1 e(lee1 lee1Var) {
        return (lee1Var == null || lee1Var.equals(d)) ? this : new lee1(this.a.d(lee1Var.a), this.b.a(lee1Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lee1)) {
            return false;
        }
        lee1 lee1Var = (lee1) obj;
        return u890.j(this.a, lee1Var.a) && u890.j(this.b, lee1Var.b) && u890.j(this.c, lee1Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        wdt0 wdt0Var = this.c;
        return iHashCode + (wdt0Var != null ? wdt0Var.hashCode() : 0);
    }

    public final String toString() {
        String strH = u7h.h(c());
        Brush brushB = b();
        zma1 zma1Var = this.a;
        float fB = zma1Var.a.b();
        String strF = TextUnit.f(zma1Var.b);
        FontWeight fontWeight = zma1Var.c;
        FontStyle fontStyle = zma1Var.d;
        FontSynthesis fontSynthesis = zma1Var.e;
        FontFamily fontFamily = zma1Var.f;
        String str = zma1Var.g;
        String strF2 = TextUnit.f(zma1Var.h);
        BaselineShift baselineShift = zma1Var.i;
        TextGeometricTransform textGeometricTransform = zma1Var.j;
        LocaleList localeList = zma1Var.k;
        String strH2 = u7h.h(zma1Var.l);
        TextDecoration textDecoration = zma1Var.m;
        Shadow shadow = zma1Var.n;
        DrawStyle drawStyle = zma1Var.f155p;
        cpr0 cpr0Var = this.b;
        String strB = a0e1.b(cpr0Var.a);
        String strD = z3e1.d(cpr0Var.b);
        String strF3 = TextUnit.f(cpr0Var.c);
        u8e1 u8e1Var = cpr0Var.d;
        shc0 shc0Var = cpr0Var.f;
        String strA = mhc0.a(cpr0Var.g);
        String strD2 = yf70.d(cpr0Var.h);
        gbe1 gbe1Var = cpr0Var.i;
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append(strH);
        sb.append(", brush=");
        sb.append(brushB);
        sb.append(", alpha=");
        sb.append(fB);
        sb.append(", fontSize=");
        sb.append(strF);
        sb.append(", fontWeight=");
        sb.append(fontWeight);
        sb.append(", fontStyle=");
        sb.append(fontStyle);
        sb.append(", fontSynthesis=");
        sb.append(fontSynthesis);
        sb.append(", fontFamily=");
        sb.append(fontFamily);
        sb.append(", fontFeatureSettings=");
        bb00.j(sb, str, ", letterSpacing=", strF2, ", baselineShift=");
        sb.append(baselineShift);
        sb.append(", textGeometricTransform=");
        sb.append(textGeometricTransform);
        sb.append(", localeList=");
        sb.append(localeList);
        sb.append(", background=");
        sb.append(strH2);
        sb.append(", textDecoration=");
        sb.append(textDecoration);
        sb.append(", shadow=");
        sb.append(shadow);
        sb.append(", drawStyle=");
        sb.append(drawStyle);
        sb.append(", textAlign=");
        sb.append(strB);
        sb.append(", textDirection=");
        bb00.j(sb, strD, ", lineHeight=", strF3, ", textIndent=");
        sb.append(u8e1Var);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(shc0Var);
        sb.append(", lineBreak=");
        sb.append(strA);
        sb.append(", hyphens=");
        sb.append(strD2);
        sb.append(", textMotion=");
        sb.append(gbe1Var);
        sb.append(")");
        return sb.toString();
    }

    public lee1(zma1 zma1Var, cpr0 cpr0Var) {
        this(zma1Var, cpr0Var, z6p1.q(zma1Var.o, cpr0Var.e));
    }

    public lee1(zma1 zma1Var, cpr0 cpr0Var, wdt0 wdt0Var) {
        this.a = zma1Var;
        this.b = cpr0Var;
        this.c = wdt0Var;
    }
}
