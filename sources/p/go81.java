package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class go81 extends s9p1 {
    public final cg2 c;

    public go81(cg2 cg2Var) {
        this.c = cg2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof go81) && this.c.equals(((go81) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
