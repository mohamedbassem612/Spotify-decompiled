package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mum extends zgo1 {
    public final String c;

    public mum(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mum) && u890.j(this.c, ((mum) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
