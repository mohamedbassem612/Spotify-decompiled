package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dw21 implements fw21 {
    public final sn51 a;

    public dw21(sn51 sn51Var) {
        this.a = sn51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dw21) && this.a.equals(((dw21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
