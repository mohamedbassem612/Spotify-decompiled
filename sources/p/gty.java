package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gty {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof gty) {
            return this.a.equals(((gty) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("SegmentUri(value=", this.a, ")");
    }
}
