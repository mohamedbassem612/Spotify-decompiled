package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n0j0 implements w0j0 {
    public final int a;

    public n0j0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0j0) && this.a == ((n0j0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
