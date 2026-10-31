package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bfn implements ugn {
    public final String a;

    public bfn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bfn) && this.a.equals(((bfn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
