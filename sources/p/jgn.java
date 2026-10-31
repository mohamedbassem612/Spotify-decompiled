package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jgn implements ugn {
    public final String a;

    public jgn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jgn) && this.a.equals(((jgn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
