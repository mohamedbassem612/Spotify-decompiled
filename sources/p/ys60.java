package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ys60 extends gto1 {
    public final int b;

    public ys60(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ys60) && this.b == ((ys60) obj).b;
    }

    public final int hashCode() {
        return l1d.C(this.b);
    }
}
