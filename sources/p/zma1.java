package p;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
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
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zma1 implements we5 {
    public final j8e1 a;
    public final long b;
    public final FontWeight c;
    public final FontStyle d;
    public final FontSynthesis e;
    public final FontFamily f;
    public final String g;
    public final long h;
    public final BaselineShift i;
    public final TextGeometricTransform j;
    public final LocaleList k;
    public final long l;
    public final TextDecoration m;
    public final Shadow n;
    public final PlatformSpanStyle o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DrawStyle f155p;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ zma1(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, int i) {
        long jP;
        long jK;
        long jK2;
        long jP2;
        if ((i & 1) != 0) {
            int i2 = u7h.l;
            jP = nfb.p();
        } else {
            jP = j;
        }
        if ((i & 2) != 0) {
            wee1[] wee1VarArr = TextUnit.b;
            jK = f7p1.k();
        } else {
            jK = j2;
        }
        FontWeight fontWeight2 = (i & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i & 32) != 0 ? null : fontFamily;
        String str2 = (i & 64) != 0 ? null : str;
        if ((i & 128) != 0) {
            wee1[] wee1VarArr2 = TextUnit.b;
            jK2 = f7p1.k();
        } else {
            jK2 = j3;
        }
        BaselineShift baselineShift2 = (i & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i & 1024) != 0 ? null : localeList;
        if ((i & 2048) != 0) {
            int i3 = u7h.l;
            jP2 = nfb.p();
        } else {
            jP2 = j4;
        }
        this(jP, jK, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, jK2, baselineShift2, textGeometricTransform2, localeList2, jP2, (i & 4096) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (i & 16384) != 0 ? null : platformSpanStyle);
    }

    public static zma1 a(zma1 zma1Var, long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontFamily fontFamily, int i) {
        long jA = (i & 1) != 0 ? zma1Var.a.a() : j;
        long j3 = (i & 2) != 0 ? zma1Var.b : j2;
        FontWeight fontWeight2 = (i & 4) != 0 ? zma1Var.c : fontWeight;
        FontStyle fontStyle2 = (i & 8) != 0 ? zma1Var.d : fontStyle;
        FontSynthesis fontSynthesis = zma1Var.e;
        FontFamily fontFamily2 = (i & 32) != 0 ? zma1Var.f : fontFamily;
        String str = zma1Var.g;
        long j4 = zma1Var.h;
        BaselineShift baselineShift = zma1Var.i;
        TextGeometricTransform textGeometricTransform = zma1Var.j;
        LocaleList localeList = zma1Var.k;
        long j5 = zma1Var.l;
        TextDecoration textDecoration = zma1Var.m;
        Shadow shadow = zma1Var.n;
        PlatformSpanStyle platformSpanStyle = zma1Var.o;
        DrawStyle drawStyle = zma1Var.f155p;
        j8e1 j8e1VarB = zma1Var.a;
        long jA2 = j8e1VarB.a();
        int i2 = u7h.l;
        if (!z4h1.b(jA, jA2)) {
            j8e1VarB = p5x0.b(jA);
        }
        return new zma1(j8e1VarB, j3, fontWeight2, fontStyle2, fontSynthesis, fontFamily2, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    public final boolean b(zma1 zma1Var) {
        if (this == zma1Var) {
            return true;
        }
        if (!TextUnit.a(this.b, zma1Var.b) || !u890.j(this.c, zma1Var.c) || !u890.j(this.d, zma1Var.d) || !u890.j(this.e, zma1Var.e) || !u890.j(this.f, zma1Var.f) || !u890.j(this.g, zma1Var.g) || !TextUnit.a(this.h, zma1Var.h) || !u890.j(this.i, zma1Var.i) || !u890.j(this.j, zma1Var.j) || !u890.j(this.k, zma1Var.k)) {
            return false;
        }
        long j = zma1Var.l;
        int i = u7h.l;
        return z4h1.b(this.l, j) && u890.j(this.o, zma1Var.o);
    }

    public final boolean c(zma1 zma1Var) {
        return u890.j(this.a, zma1Var.a) && u890.j(this.m, zma1Var.m) && u890.j(this.n, zma1Var.n) && u890.j(this.f155p, zma1Var.f155p);
    }

    public final zma1 d(zma1 zma1Var) {
        if (zma1Var == null) {
            return this;
        }
        j8e1 j8e1Var = zma1Var.a;
        return ana1.a(this, j8e1Var.a(), j8e1Var.c(), j8e1Var.b(), zma1Var.b, zma1Var.c, zma1Var.d, zma1Var.e, zma1Var.f, zma1Var.g, zma1Var.h, zma1Var.i, zma1Var.j, zma1Var.k, zma1Var.l, zma1Var.m, zma1Var.n, zma1Var.o, zma1Var.f155p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zma1)) {
            return false;
        }
        zma1 zma1Var = (zma1) obj;
        return b(zma1Var) && c(zma1Var);
    }

    public final int hashCode() {
        j8e1 j8e1Var = this.a;
        long jA = j8e1Var.a();
        int i = u7h.l;
        int iC = z4h1.c(jA) * 31;
        Brush brushC = j8e1Var.c();
        int iHashCode = (Float.hashCode(j8e1Var.b()) + ((iC + (brushC != null ? brushC.hashCode() : 0)) * 31)) * 31;
        wee1[] wee1VarArr = TextUnit.b;
        int iF = cy30.f(iHashCode, this.b, 31);
        FontWeight fontWeight = this.c;
        int i2 = (iF + (fontWeight != null ? fontWeight.a : 0)) * 31;
        FontStyle fontStyle = this.d;
        int iHashCode2 = (i2 + (fontStyle != null ? Integer.hashCode(fontStyle.a) : 0)) * 31;
        FontSynthesis fontSynthesis = this.e;
        int iHashCode3 = (iHashCode2 + (fontSynthesis != null ? Integer.hashCode(fontSynthesis.a) : 0)) * 31;
        FontFamily fontFamily = this.f;
        int iHashCode4 = (iHashCode3 + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.g;
        int iF2 = cy30.f((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31, this.h, 31);
        BaselineShift baselineShift = this.i;
        int iHashCode5 = (iF2 + (baselineShift != null ? Float.hashCode(baselineShift.a) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.j;
        int iHashCode6 = (iHashCode5 + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.k;
        int iF3 = c13.f((iHashCode6 + (localeList != null ? localeList.a.hashCode() : 0)) * 31, this.l, 31);
        TextDecoration textDecoration = this.m;
        int i3 = (iF3 + (textDecoration != null ? textDecoration.a : 0)) * 31;
        Shadow shadow = this.n;
        int iHashCode7 = (i3 + (shadow != null ? shadow.hashCode() : 0)) * 31;
        PlatformSpanStyle platformSpanStyle = this.o;
        int iHashCode8 = (iHashCode7 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0)) * 31;
        DrawStyle drawStyle = this.f155p;
        return iHashCode8 + (drawStyle != null ? drawStyle.hashCode() : 0);
    }

    public final String toString() {
        j8e1 j8e1Var = this.a;
        String strH = u7h.h(j8e1Var.a());
        Brush brushC = j8e1Var.c();
        float fB = j8e1Var.b();
        String strF = TextUnit.f(this.b);
        String strF2 = TextUnit.f(this.h);
        String strH2 = u7h.h(this.l);
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append(strH);
        sb.append(", brush=");
        sb.append(brushC);
        sb.append(", alpha=");
        sb.append(fB);
        sb.append(", fontSize=");
        sb.append(strF);
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        bb00.j(sb, this.g, ", letterSpacing=", strF2, ", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        sb.append(strH2);
        sb.append(", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.f155p);
        sb.append(")");
        return sb.toString();
    }

    public zma1(j8e1 j8e1Var, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this.a = j8e1Var;
        this.b = j;
        this.c = fontWeight;
        this.d = fontStyle;
        this.e = fontSynthesis;
        this.f = fontFamily;
        this.g = str;
        this.h = j2;
        this.i = baselineShift;
        this.j = textGeometricTransform;
        this.k = localeList;
        this.l = j3;
        this.m = textDecoration;
        this.n = shadow;
        this.o = platformSpanStyle;
        this.f155p = drawStyle;
    }

    public zma1(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        this(p5x0.b(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, (DrawStyle) null);
    }
}
