package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wje0 extends d9p1 {
    public final String c;

    public wje0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wje0) && u890.j(this.c, ((wje0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
