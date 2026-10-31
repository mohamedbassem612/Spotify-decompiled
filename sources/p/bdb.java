package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bdb implements udb {
    public final String a;

    public bdb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bdb) && u890.j(this.a, ((bdb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
