package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o81 extends u4p1 {
    public final String c;

    public o81(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o81) && u890.j(this.c, ((o81) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
