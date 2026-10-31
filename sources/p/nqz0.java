package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nqz0 {
    public final int a;

    public nqz0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nqz0) && this.a == ((nqz0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) + (Integer.hashCode(0) * 31);
    }
}
