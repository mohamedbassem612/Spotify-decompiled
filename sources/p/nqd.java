package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nqd extends pqd {
    public final String a;

    public nqd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nqd) && this.a.equals(((nqd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
