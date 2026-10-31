package p;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class iet {
    public final ydt a;
    public final long b;

    static {
        new SpannableStringBuilder();
    }

    public iet(ydt ydtVar, long j) {
        this.a = ydtVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iet)) {
            return false;
        }
        iet ietVar = (iet) obj;
        return u890.j(this.a, ietVar.a) && this.b == ietVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
