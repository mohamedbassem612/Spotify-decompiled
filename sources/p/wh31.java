package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wh31 {
    public final long a = u7h.k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh31)) {
            return false;
        }
        long j = ((wh31) obj).a;
        int i = u7h.l;
        return z4h1.b(this.a, j);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return f4i1.f("RippleConfiguration(color=", u7h.h(this.a), ", rippleAlpha=null)");
    }
}
