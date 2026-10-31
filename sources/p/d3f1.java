package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d3f1 extends upf {
    public final int d;

    public d3f1(int i) {
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3f1) && this.d == ((d3f1) obj).d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d);
    }
}
