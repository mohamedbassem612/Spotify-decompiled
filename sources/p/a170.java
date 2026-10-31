package p;

import android.text.Html;
import android.text.Spannable;
import android.text.style.QuoteSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a170 implements c4v0 {
    public final e5v0 a;
    public final qkn0 b;

    public a170(e5v0 e5v0Var, qkn0 qkn0Var) {
        this.a = e5v0Var;
        this.b = qkn0Var;
    }

    public final CharSequence a(CharSequence charSequence) {
        String string;
        String string2;
        Pattern patternCompile = Pattern.compile("<li>([^<]*)<p>(.*?)</p>\\s*(.*?)</li>");
        svu0 svu0Var = svu0.e1;
        mbh0 mbh0VarM = mno1.m(patternCompile.matcher(charSequence), 0, charSequence);
        if (mbh0VarM == null) {
            string = charSequence.toString();
        } else {
            int length = charSequence.length();
            StringBuilder sb = new StringBuilder(length);
            int i = 0;
            do {
                sb.append(charSequence, i, ((rr80) mbh0VarM.b()).a);
                sb.append((CharSequence) svu0Var.invoke(mbh0VarM));
                i = ((rr80) mbh0VarM.b()).b + 1;
                mbh0VarM = mbh0VarM.c();
                if (i >= length) {
                    break;
                }
            } while (mbh0VarM != null);
            if (i < length) {
                sb.append(charSequence, i, length);
            }
            string = sb.toString();
        }
        mbh0 mbh0VarM2 = mno1.m(Pattern.compile("<(/?)(ul|ol|li)>").matcher(string), 0, string);
        if (mbh0VarM2 == null) {
            string2 = string.toString();
        } else {
            int length2 = string.length();
            StringBuilder sb2 = new StringBuilder(length2);
            int i2 = 0;
            do {
                sb2.append((CharSequence) string, i2, ((rr80) mbh0VarM2.b()).a);
                sb2.append((CharSequence) ("<" + mbh0VarM2.a().get(1) + "custom-" + mbh0VarM2.a().get(2) + ">"));
                i2 = ((rr80) mbh0VarM2.b()).b + 1;
                mbh0VarM2 = mbh0VarM2.c();
                if (i2 >= length2) {
                    break;
                }
            } while (mbh0VarM2 != null);
            if (i2 < length2) {
                sb2.append((CharSequence) string, i2, length2);
            }
            string2 = sb2.toString();
        }
        Spannable spannable = (Spannable) Html.fromHtml(string2, 0, null, this.a);
        for (Object obj : spannable.getSpans(0, spannable.length(), RelativeSizeSpan.class)) {
            RelativeSizeSpan relativeSizeSpan = (RelativeSizeSpan) obj;
            int spanStart = spannable.getSpanStart(relativeSizeSpan);
            int spanEnd = spannable.getSpanEnd(relativeSizeSpan);
            spannable.removeSpan(relativeSizeSpan);
            spannable.setSpan(new StyleSpan(1), spanStart, spanEnd, 33);
        }
        for (Object obj2 : spannable.getSpans(0, spannable.length(), QuoteSpan.class)) {
            spannable.removeSpan((QuoteSpan) obj2);
        }
        for (Object obj3 : spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            URLSpan uRLSpan = (URLSpan) obj3;
            int spanStart2 = spannable.getSpanStart(uRLSpan);
            int spanEnd2 = spannable.getSpanEnd(uRLSpan);
            spannable.removeSpan(uRLSpan);
            spannable.setSpan(this.b.a(uRLSpan.getURL()), spanStart2, spanEnd2, 33);
        }
        return spannable;
    }
}
