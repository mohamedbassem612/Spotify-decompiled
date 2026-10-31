package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hn20 implements z9h {
    public final long a;

    public hn20(long j) {
        this.a = j;
    }

    public final long a(Context context) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn20)) {
            return false;
        }
        long j = ((hn20) obj).a;
        int i = u7h.l;
        return z4h1.b(this.a, j);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "FixedColorProvider(color=" + ((Object) u7h.h(this.a)) + ')';
    }
}
