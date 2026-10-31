package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jxb implements mxb {
    public final int a;

    public jxb(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxb) && this.a == ((jxb) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
