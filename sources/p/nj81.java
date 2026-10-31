package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nj81 extends pj81 {
    public final int a;

    public nj81(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nj81) && this.a == ((nj81) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
