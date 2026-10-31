package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n0t0 implements t0t0 {
    public final int a;

    public n0t0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0t0) && this.a == ((n0t0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
