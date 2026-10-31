package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jdb implements udb {
    public final og80 a;

    public jdb(og80 og80Var) {
        this.a = og80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jdb) && this.a.equals(((jdb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
