package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j9x0 extends w361 {
    public final String c;

    public j9x0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j9x0) && u890.j(this.c, ((j9x0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
