package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kra0 implements sra0 {
    public final iys0 a;

    public kra0(iys0 iys0Var) {
        this.a = iys0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kra0) && this.a.equals(((kra0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
