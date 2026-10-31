package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fvg1 implements gvg1 {
    public final dxn0 a;

    public fvg1(dxn0 dxn0Var) {
        this.a = dxn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fvg1) && this.a.equals(((fvg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
