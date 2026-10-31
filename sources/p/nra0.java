package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nra0 implements sra0 {
    public final String a;

    public nra0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nra0) && this.a.equals(((nra0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
