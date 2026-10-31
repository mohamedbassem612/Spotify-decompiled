package p;

import android.text.Html;
import android.text.Spanned;
import android.text.style.StyleSpan;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rx21 implements kx21 {
    public static zma1 b(lee1 lee1Var, long j) {
        zma1 zma1Var = lee1Var.a;
        return new zma1(j, zma1Var.b, zma1Var.c, (FontStyle) null, (FontSynthesis) null, zma1Var.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65496);
    }

    public final af5 a(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-2042603257);
        String strO0 = cwl1.o0(x340Var, 2131960581);
        uwr uwrVar = cbx.a;
        zma1 zma1VarB = b(cbx.d(x340Var).j, cbx.a(x340Var).b.b);
        zma1 zma1VarB2 = b(cbx.d(x340Var).k, cbx.a(x340Var).b.a);
        Spanned spannedFromHtml = Html.fromHtml(strO0, 0);
        ye5 ye5Var = new ye5(spannedFromHtml.toString());
        ye5Var.d(zma1VarB, 0, spannedFromHtml.length());
        for (Object obj : spannedFromHtml.getSpans(0, spannedFromHtml.length(), Object.class)) {
            int spanStart = spannedFromHtml.getSpanStart(obj);
            int spanEnd = spannedFromHtml.getSpanEnd(obj);
            if (obj instanceof StyleSpan) {
                ye5Var.d(zma1VarB2, spanStart, spanEnd);
            }
        }
        af5 af5VarP = ye5Var.p();
        x340Var.r(false);
        return af5VarP;
    }
}
