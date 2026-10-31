package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ss60 extends hso1 {
    public final int b;

    public ss60(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ss60) && this.b == ((ss60) obj).b;
    }

    public final int hashCode() {
        return l1d.C(this.b);
    }
}
