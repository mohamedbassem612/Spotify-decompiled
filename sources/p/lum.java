package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lum extends zgo1 {
    public final String c;

    public lum(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lum) && u890.j(this.c, ((lum) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
