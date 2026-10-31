package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nfn implements ugn {
    public final String a;

    public nfn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nfn) && this.a.equals(((nfn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
