package p;

import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class osc {
    public final x9e1 a;

    public osc(x9e1 x9e1Var) {
        this.a = x9e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osc)) {
            return false;
        }
        x9e1 x9e1Var = this.a;
        af5 af5Var = x9e1Var.a;
        x9e1 x9e1Var2 = ((osc) obj).a;
        return u890.j(af5Var, x9e1Var2.a) && x9e1Var.b.d(x9e1Var2.b) && u890.j(x9e1Var.c, x9e1Var2.c) && x9e1Var.d == x9e1Var2.d && x9e1Var.e == x9e1Var2.e && x9e1Var.f == x9e1Var2.f && u890.j(x9e1Var.g, x9e1Var2.g) && x9e1Var.h == x9e1Var2.h && x9e1Var.i == x9e1Var2.i && hjl.c(x9e1Var.j, x9e1Var2.j);
    }

    public final int hashCode() {
        x9e1 x9e1Var = this.a;
        int iHashCode = x9e1Var.a.hashCode() * 31;
        lee1 lee1Var = x9e1Var.b;
        zma1 zma1Var = lee1Var.a;
        long j = zma1Var.b;
        wee1[] wee1VarArr = TextUnit.b;
        int iHashCode2 = Long.hashCode(j) * 31;
        FontWeight fontWeight = zma1Var.c;
        int i = (iHashCode2 + (fontWeight != null ? fontWeight.a : 0)) * 31;
        FontStyle fontStyle = zma1Var.d;
        int iHashCode3 = (i + (fontStyle != null ? Integer.hashCode(fontStyle.a) : 0)) * 31;
        FontSynthesis fontSynthesis = zma1Var.e;
        int iHashCode4 = (iHashCode3 + (fontSynthesis != null ? Integer.hashCode(fontSynthesis.a) : 0)) * 31;
        FontFamily fontFamily = zma1Var.f;
        int iHashCode5 = (iHashCode4 + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = zma1Var.g;
        int iF = cy30.f((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, zma1Var.h, 31);
        BaselineShift baselineShift = zma1Var.i;
        int iHashCode6 = (iF + (baselineShift != null ? Float.hashCode(baselineShift.a) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = zma1Var.j;
        int iHashCode7 = (iHashCode6 + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = zma1Var.k;
        int iHashCode8 = (iHashCode7 + (localeList != null ? localeList.a.hashCode() : 0)) * 31;
        long j2 = zma1Var.l;
        int i2 = u7h.l;
        int iF2 = c13.f(iHashCode8, j2, 31);
        PlatformSpanStyle platformSpanStyle = zma1Var.o;
        int iHashCode9 = (lee1Var.b.hashCode() + ((iF2 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0)) * 31)) * 31;
        wdt0 wdt0Var = lee1Var.c;
        return Long.hashCode(x9e1Var.j) + ((x9e1Var.i.hashCode() + ((x9e1Var.h.hashCode() + ((x9e1Var.g.hashCode() + kaa0.f(x9e1Var.f, xcg1.g((f4i1.b((iHashCode9 + (wdt0Var != null ? wdt0Var.hashCode() : 0) + iHashCode) * 31, 31, x9e1Var.c) + x9e1Var.d) * 31, 31, x9e1Var.e), 31)) * 31)) * 31)) * 31);
    }
}
