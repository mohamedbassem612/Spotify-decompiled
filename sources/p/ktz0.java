package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ktz0 {
    public final int a;

    public ktz0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ktz0) && this.a == ((ktz0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
