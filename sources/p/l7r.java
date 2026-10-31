package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l7r implements z9h {
    public final long a;
    public final long b;

    public l7r(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32 ? this.b : this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7r)) {
            return false;
        }
        l7r l7rVar = (l7r) obj;
        long j = l7rVar.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, l7rVar.b);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DayNightColorProvider(day=");
        ktd.q(this.a, ", night=", sb);
        sb.append((Object) u7h.h(this.b));
        sb.append(')');
        return sb.toString();
    }
}
