package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cxg0 extends z0o1 {
    public final iug0 c;

    public cxg0(iug0 iug0Var) {
        this.c = iug0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cxg0) && this.c.equals(((cxg0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
