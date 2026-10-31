package p;

import android.os.Build;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y710 implements c4v0 {
    public final t9v0 a;

    public y710(t9v0 t9v0Var) {
        this.a = t9v0Var;
    }

    public final CharSequence a(CharSequence charSequence) {
        int i;
        int i2;
        int i3;
        SpannableString spannableString = new SpannableString(charSequence);
        Object[] spans = spannableString.getSpans(0, charSequence.length(), Object.class);
        ArrayList<x710> arrayList = new ArrayList(spans.length);
        for (Object obj : spans) {
            obj.getClass();
            arrayList.add(new x710(obj, spannableString.getSpanStart(obj), spannableString.getSpanEnd(obj), spannableString.getSpanFlags(obj)));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Linkify.addLinks(spannableString, 3);
        } else {
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
            for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
                spannableString.removeSpan(uRLSpanArr[length]);
            }
            ArrayList<rlc0> arrayList2 = new ArrayList();
            lnn1.i(arrayList2, spannableString, v9s0.a, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter);
            lnn1.i(arrayList2, spannableString, v9s0.b, new String[]{"mailto:"}, (Linkify.MatchFilter) null);
            for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
                rlc0 rlc0Var = new rlc0();
                rlc0Var.a = uRLSpan;
                rlc0Var.c = spannableString.getSpanStart(uRLSpan);
                rlc0Var.d = spannableString.getSpanEnd(uRLSpan);
                arrayList2.add(rlc0Var);
            }
            Collections.sort(arrayList2, lnn1.a);
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size - 1) {
                rlc0 rlc0Var2 = (rlc0) arrayList2.get(i4);
                int i5 = i4 + 1;
                rlc0 rlc0Var3 = (rlc0) arrayList2.get(i5);
                int i6 = rlc0Var2.c;
                int i7 = rlc0Var3.c;
                if (i6 <= i7 && (i = rlc0Var2.d) > i7) {
                    int i8 = rlc0Var3.d;
                    int i9 = (i8 > i && (i2 = i - i6) <= (i3 = i8 - i7)) ? i2 < i3 ? i4 : -1 : i5;
                    if (i9 != -1) {
                        URLSpan uRLSpan2 = ((rlc0) arrayList2.get(i9)).a;
                        if (uRLSpan2 != null) {
                            spannableString.removeSpan(uRLSpan2);
                        }
                        arrayList2.remove(i9);
                        size--;
                    }
                }
                i4 = i5;
            }
            if (arrayList2.size() != 0) {
                for (rlc0 rlc0Var4 : arrayList2) {
                    if (rlc0Var4.a == null) {
                        spannableString.setSpan(new URLSpan(rlc0Var4.b), rlc0Var4.c, rlc0Var4.d, 33);
                    }
                }
            }
        }
        for (Object obj2 : spannableString.getSpans(0, charSequence.length(), URLSpan.class)) {
            URLSpan uRLSpan3 = (URLSpan) obj2;
            u9v0 u9v0VarA = this.a.a(uRLSpan3.getURL());
            int spanStart = spannableString.getSpanStart(uRLSpan3);
            int spanEnd = spannableString.getSpanEnd(uRLSpan3);
            int spanFlags = spannableString.getSpanFlags(uRLSpan3);
            spannableString.removeSpan(uRLSpan3);
            spannableString.setSpan(u9v0VarA, spanStart, spanEnd, spanFlags);
        }
        for (x710 x710Var : arrayList) {
            int i10 = x710Var.b;
            int i11 = x710Var.c;
            for (Object obj3 : spannableString.getSpans(i10, i11, u9v0.class)) {
                spannableString.removeSpan((u9v0) obj3);
            }
            spannableString.setSpan(x710Var.a, x710Var.b, i11, x710Var.d);
        }
        return spannableString;
    }
}
