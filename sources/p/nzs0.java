package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nzs0 implements vzs0 {
    public final int a;

    public nzs0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nzs0) && this.a == ((nzs0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
