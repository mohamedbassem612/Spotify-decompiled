package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x4r implements Comparable {
    public final long a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return u890.r(this.a, ((x4r) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x4r) {
            return this.a == ((x4r) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return gvg.f(this.a, "DataUnit(bytes=", ")");
    }
}
