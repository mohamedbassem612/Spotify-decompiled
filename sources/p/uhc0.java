package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uhc0 implements Comparable {
    public final int a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return u890.q(this.a, ((uhc0) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uhc0) {
            return this.a == ((uhc0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return gvg.e(this.a, "LineIndex(value=", ")");
    }
}
