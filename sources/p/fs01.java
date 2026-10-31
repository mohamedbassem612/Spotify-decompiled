package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fs01 extends vxo1 {
    public final String c;

    public fs01(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fs01) && u890.j(this.c, ((fs01) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
