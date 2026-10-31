package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ij11 {
    public final int a;

    public ij11(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ij11) && this.a == ((ij11) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(2131167147) + (Integer.hashCode(this.a) * 31);
    }
}
