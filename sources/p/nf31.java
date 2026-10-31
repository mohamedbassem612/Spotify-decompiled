package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nf31 implements tf31 {
    public final String a;

    public nf31(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nf31) && this.a.equals(((nf31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
