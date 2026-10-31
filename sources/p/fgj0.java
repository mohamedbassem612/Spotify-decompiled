package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fgj0 extends hgj0 {
    public final int a;

    public fgj0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fgj0) && this.a == ((fgj0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
