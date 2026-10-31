package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lty0 extends dgo1 {
    public final rul1 c;

    public lty0(rul1 rul1Var) {
        this.c = rul1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lty0) && u890.j(this.c, ((lty0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
