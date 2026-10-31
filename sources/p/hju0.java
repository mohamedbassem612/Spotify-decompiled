package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hju0 implements kju0 {
    public final int a;

    public hju0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hju0) && this.a == ((hju0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
