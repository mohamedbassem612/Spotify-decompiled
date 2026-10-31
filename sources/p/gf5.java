package p;

import android.text.Html;
import android.text.Spanned;
import android.text.style.URLSpan;
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
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class gf5 {
    public static final zma1 a = new zma1(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61439);

    public static final af5 a(String str, iu30 iu30Var) {
        int i = 0;
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        String string = ihc1.f1(spannedFromHtml.toString()).toString();
        StringBuilder sb = new StringBuilder(16);
        ArrayList arrayListM = xvj1.m();
        new ArrayList();
        sb.append(string);
        Object[] spans = spannedFromHtml.getSpans(0, string.length(), URLSpan.class);
        int length = spans.length;
        int i2 = 0;
        while (i2 < length) {
            URLSpan uRLSpan = (URLSpan) spans[i2];
            int spanStart = spannedFromHtml.getSpanStart(uRLSpan);
            int spanEnd = spannedFromHtml.getSpanEnd(uRLSpan);
            int length2 = string.length();
            if (spanEnd <= length2) {
                length2 = spanEnd;
            }
            arrayListM.add(new xe5(spanStart, length2, 8, new ljc0(uRLSpan.getURL(), new pae1(a, (zma1) null, 14), new ff5((byte) 0, uRLSpan, iu30Var)), (String) null));
            i2++;
            i = 0;
        }
        int i3 = i;
        String string2 = sb.toString();
        ArrayList arrayList = new ArrayList(arrayListM.size());
        int size = arrayListM.size();
        for (int iG = i3; iG < size; iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1)) {
        }
        return new af5(string2, arrayList);
    }

    public static final af5 b(af5 af5Var, String str) {
        String str2 = af5Var.b;
        int iW0 = ihc1.w0(str2, "{{COUNTDOWN}}", 0, false, 6);
        if (iW0 < 0) {
            return af5Var;
        }
        String strW = nhc1.W(str2, "{{COUNTDOWN}}", str);
        int length = str.length() - 13;
        StringBuilder sb = new StringBuilder(16);
        ArrayList arrayListM = xvj1.m();
        new ArrayList();
        sb.append(strW);
        for (ze5 ze5Var : af5Var.b()) {
            int length2 = ze5Var.b;
            int length3 = ze5Var.c;
            int i = 13 + iW0;
            if (length2 >= i) {
                length2 += length;
            } else if (length2 > iW0) {
                length2 = str.length() + iW0;
            }
            int i2 = length2;
            if (length3 > iW0) {
                length3 = length3 <= i ? str.length() + iW0 : length3 + length;
            }
            int i3 = length3;
            if (i2 < i3) {
                arrayListM.add(new xe5(i2, i3, 8, (zma1) ze5Var.a, (String) null));
            }
        }
        String string = sb.toString();
        ArrayList arrayList = new ArrayList(arrayListM.size());
        int size = arrayListM.size();
        for (int iG = 0; iG < size; iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1)) {
        }
        return new af5(string, arrayList);
    }
}
