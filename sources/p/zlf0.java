package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zlf0 implements amf0 {
    public final long a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zlf0)) {
            return false;
        }
        long j = ((zlf0) obj).a;
        int i = u7h.l;
        return z4h1.b(this.a, j);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return f4i1.f("RoundRect(color=", u7h.h(this.a), ")");
    }
}
