package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bvf0 extends w361 {
    public final String c;

    public bvf0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bvf0) && u890.j(this.c, ((bvf0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
