package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hv60 extends pto1 {
    public final int b;

    public hv60(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hv60) && this.b == ((hv60) obj).b;
    }

    public final int hashCode() {
        return l1d.C(this.b);
    }
}
