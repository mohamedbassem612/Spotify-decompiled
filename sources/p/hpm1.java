package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hpm1 {
    public final int a;

    public hpm1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hpm1) && this.a == ((hpm1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
