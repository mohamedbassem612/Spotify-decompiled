package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uy implements m10 {
    public final int a;

    public uy(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uy) && this.a == ((uy) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
