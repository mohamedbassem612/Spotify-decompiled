package p;

import android.text.Spanned;
import android.text.style.StyleSpan;
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
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b4v0 {
    public final LinkedHashSet a;

    public b4v0(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final af5 a(CharSequence charSequence) {
        Iterator it = this.a.iterator();
        CharSequence charSequenceA = charSequence;
        while (it.hasNext()) {
            charSequenceA = ((c4v0) it.next()).a(charSequenceA);
        }
        if (!(charSequenceA instanceof Spanned)) {
            return new af5(charSequenceA.toString());
        }
        ye5 ye5Var = new ye5();
        ye5Var.g(charSequenceA.toString());
        Spanned spanned = (Spanned) charSequenceA;
        for (Object obj : spanned.getSpans(0, ye5Var.a.length(), Object.class)) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            obj.getClass();
            if (obj instanceof StyleSpan) {
                ye5Var.d(new zma1(0L, 0L, ((StyleSpan) obj).getStyle() == 1 ? FontWeight.Z : FontWeight.t, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65531), spanStart, spanEnd);
            } else {
                boolean z = obj instanceof fys;
                TextDecoration textDecoration = TextDecoration.c;
                if (z) {
                    ye5Var.b(new ljc0(((fys) obj).getURL(), new pae1(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration, (Shadow) null, (PlatformSpanStyle) null, 61439), null, 14), null, 4), spanStart, spanEnd);
                } else if (obj instanceof URLSpan) {
                    ye5Var.b(new ljc0(((URLSpan) obj).getURL(), new pae1(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration, (Shadow) null, (PlatformSpanStyle) null, 61439), null, 14), null, 4), spanStart, spanEnd);
                }
            }
        }
        return ye5Var.p();
    }
}
