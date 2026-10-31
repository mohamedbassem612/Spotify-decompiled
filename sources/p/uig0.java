package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uig0 extends ern1 {
    public final le20 c;

    public uig0(le20 le20Var) {
        this.c = le20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uig0) && this.c.equals(((uig0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
