package p;

import android.text.Spannable;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ydt {
    public final Spannable a;
    public final boolean b;
    public final Integer c;

    public ydt(Spannable spannable, boolean z, Integer num) {
        this.a = spannable;
        this.b = z;
        this.c = num;
    }

    public static ydt a(ydt ydtVar, SpannableStringBuilder spannableStringBuilder, boolean z, int i) {
        Spannable spannable = spannableStringBuilder;
        if ((i & 1) != 0) {
            spannable = ydtVar.a;
        }
        if ((i & 2) != 0) {
            z = ydtVar.b;
        }
        Integer num = ydtVar.c;
        ydtVar.getClass();
        return new ydt(spannable, z, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydt)) {
            return false;
        }
        ydt ydtVar = (ydt) obj;
        return u890.j(this.a, ydtVar.a) && this.b == ydtVar.b && u890.j(this.c, ydtVar.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return iG + (num == null ? 0 : num.hashCode());
    }
}
