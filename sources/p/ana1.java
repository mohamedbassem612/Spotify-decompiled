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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ana1 {
    public static final long a = fc11.G(14);
    public static final long b = fc11.G(0);
    public static final long c;
    public static final j8e1 d;

    static {
        int i = u7h.l;
        c = nfb.o();
        d = p5x0.b(nfb.i());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[PHI: r14
      0x0047: PHI (r14v9 androidx.compose.ui.text.style.BaselineShift) = 
      (r14v1 androidx.compose.ui.text.style.BaselineShift)
      (r14v2 androidx.compose.ui.text.style.BaselineShift)
      (r14v10 androidx.compose.ui.text.style.BaselineShift)
     binds: [B:53:0x00c9, B:48:0x00ba, B:13:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0049 A[PHI: r13 r14
      0x0049: PHI (r13v36 androidx.compose.ui.text.intl.LocaleList) = 
      (r13v6 androidx.compose.ui.text.intl.LocaleList)
      (r13v7 androidx.compose.ui.text.intl.LocaleList)
      (r13v37 androidx.compose.ui.text.intl.LocaleList)
     binds: [B:64:0x00ec, B:58:0x00d8, B:14:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r14v8 androidx.compose.ui.text.style.BaselineShift) = 
      (r14v1 androidx.compose.ui.text.style.BaselineShift)
      (r14v1 androidx.compose.ui.text.style.BaselineShift)
      (r14v9 androidx.compose.ui.text.style.BaselineShift)
     binds: [B:64:0x00ec, B:58:0x00d8, B:14:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:75:0x010a  */
    public static final zma1 a(zma1 zma1Var, long j, Brush brush, float f, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        BaselineShift baselineShift2;
        LocaleList localeList2;
        long j5;
        FontFamily fontFamily2 = fontFamily;
        String str2 = str;
        long j6 = j3;
        TextDecoration textDecoration2 = textDecoration;
        wee1[] wee1VarArr = TextUnit.b;
        long j7 = j2 & 1095216660480L;
        if (j7 != 0 && !TextUnit.a(j2, zma1Var.b)) {
            baselineShift2 = baselineShift;
            localeList2 = localeList;
        } else if (brush != null || j == 16) {
            if ((fontStyle != null || fontStyle.equals(zma1Var.d)) && ((fontWeight == null || fontWeight.equals(zma1Var.c)) && ((fontFamily2 == null || fontFamily2 == zma1Var.f) && (((j6 & 1095216660480L) == 0 || TextUnit.a(j6, zma1Var.h)) && ((textDecoration2 == null || textDecoration2.equals(zma1Var.m)) && u890.j(brush, zma1Var.a.c()) && ((brush == null || f == zma1Var.a.b()) && ((fontSynthesis == null || fontSynthesis.equals(zma1Var.e)) && (str2 == null || str2.equals(zma1Var.g))))))))) {
                if (baselineShift != null) {
                    baselineShift2 = baselineShift;
                    if (baselineShift2.equals(zma1Var.i)) {
                    }
                } else {
                    baselineShift2 = baselineShift;
                }
                if (textGeometricTransform != null || textGeometricTransform.equals(zma1Var.j)) {
                    if (localeList != null) {
                        localeList2 = localeList;
                        if (localeList2.equals(zma1Var.k)) {
                        }
                    } else {
                        localeList2 = localeList;
                    }
                    if (j4 != 16) {
                        j5 = zma1Var.l;
                        int i = u7h.l;
                        if (z4h1.b(j4, j5)) {
                        }
                    }
                    if (shadow != null || shadow.equals(zma1Var.n)) {
                        if (platformSpanStyle != null || platformSpanStyle.equals(zma1Var.o)) {
                            if (drawStyle != null || drawStyle.equals(zma1Var.f155p)) {
                                return zma1Var;
                            }
                        }
                    }
                }
            } else {
                baselineShift2 = baselineShift;
            }
            localeList2 = localeList;
        } else {
            long jA = zma1Var.a.a();
            int i2 = u7h.l;
            if (z4h1.b(j, jA)) {
                if (fontStyle != null) {
                    if (baselineShift != null) {
                        baselineShift2 = baselineShift;
                        if (baselineShift2.equals(zma1Var.i)) {
                            localeList2 = localeList;
                        }
                    } else {
                        baselineShift2 = baselineShift;
                    }
                    if (textGeometricTransform != null) {
                    }
                    if (localeList != null) {
                        localeList2 = localeList;
                        if (localeList2.equals(zma1Var.k)) {
                        }
                    } else {
                        localeList2 = localeList;
                    }
                    if (j4 != 16) {
                        j5 = zma1Var.l;
                        int i3 = u7h.l;
                        if (z4h1.b(j4, j5)) {
                        }
                    }
                    if (shadow != null) {
                    }
                    if (platformSpanStyle != null) {
                    }
                    if (drawStyle != null) {
                    }
                    return zma1Var;
                }
                if (baselineShift != null) {
                    baselineShift2 = baselineShift;
                    if (baselineShift2.equals(zma1Var.i)) {
                        localeList2 = localeList;
                    }
                } else {
                    baselineShift2 = baselineShift;
                }
                if (textGeometricTransform != null) {
                }
                if (localeList != null) {
                    localeList2 = localeList;
                    if (localeList2.equals(zma1Var.k)) {
                    }
                } else {
                    localeList2 = localeList;
                }
                if (j4 != 16) {
                    j5 = zma1Var.l;
                    int i4 = u7h.l;
                    if (z4h1.b(j4, j5)) {
                    }
                }
                if (shadow != null) {
                }
                if (platformSpanStyle != null) {
                }
                if (drawStyle != null) {
                }
                return zma1Var;
            }
            baselineShift2 = baselineShift;
            localeList2 = localeList;
        }
        j8e1 j8e1VarA = brush != null ? p5x0.a(brush, f) : p5x0.b(j);
        j8e1 j8e1Var = zma1Var.a;
        j8e1Var.getClass();
        boolean z = j8e1VarA instanceof z9c;
        if (z && (j8e1Var instanceof z9c)) {
            z9c z9cVar = (z9c) j8e1VarA;
            zv61 zv61Var = z9cVar.a;
            float f2 = z9cVar.b;
            j8e1VarA = new z9c(zv61Var, Float.isNaN(f2) ? ((Number) new ww21(j8e1Var, (byte) 21).invoke()).floatValue() : f2);
        } else if ((!z || (j8e1Var instanceof z9c)) && ((!z && (j8e1Var instanceof z9c)) || j8e1VarA.equals(i8e1.a))) {
            j8e1VarA = j8e1Var;
        }
        if (fontFamily2 == null) {
            fontFamily2 = zma1Var.f;
        }
        long j8 = j7 == 0 ? zma1Var.b : j2;
        FontWeight fontWeight2 = fontWeight == null ? zma1Var.c : fontWeight;
        FontStyle fontStyle2 = fontStyle == null ? zma1Var.d : fontStyle;
        FontSynthesis fontSynthesis2 = fontSynthesis == null ? zma1Var.e : fontSynthesis;
        if (str2 == null) {
            str2 = zma1Var.g;
        }
        if ((j6 & 1095216660480L) == 0) {
            j6 = zma1Var.h;
        }
        if (baselineShift2 == null) {
            baselineShift2 = zma1Var.i;
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform == null ? zma1Var.j : textGeometricTransform;
        if (localeList2 == null) {
            localeList2 = zma1Var.k;
        }
        long j9 = j4 != 16 ? j4 : zma1Var.l;
        if (textDecoration2 == null) {
            textDecoration2 = zma1Var.m;
        }
        Shadow shadow2 = shadow == null ? zma1Var.n : shadow;
        PlatformSpanStyle platformSpanStyle2 = zma1Var.o;
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = platformSpanStyle;
        }
        return new zma1(j8e1VarA, j8, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j6, baselineShift2, textGeometricTransform2, localeList2, j9, textDecoration2, shadow2, platformSpanStyle2, drawStyle == null ? zma1Var.f155p : drawStyle);
    }

    public static final Object b(float f, Object obj, Object obj2) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    public static final long c(float f, long j, long j2) {
        wee1[] wee1VarArr = TextUnit.b;
        long j3 = j & 1095216660480L;
        if (j3 == 0 || (1095216660480L & j2) == 0) {
            return ((TextUnit) b(f, new TextUnit(j), new TextUnit(j2))).a;
        }
        fc11.p(j, j2);
        return fc11.Y(dm5.T(TextUnit.c(j), TextUnit.c(j2), f), j3);
    }
}
