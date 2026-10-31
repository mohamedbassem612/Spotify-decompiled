package p;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class get {
    public final SpannableStringBuilder a;
    public final long b;

    public get(SpannableStringBuilder spannableStringBuilder, long j) {
        this.a = spannableStringBuilder;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof get)) {
            return false;
        }
        get getVar = (get) obj;
        return this.a.equals(getVar.a) && this.b == getVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
