package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fwe0 implements gwe0 {
    public final hwe0 a;

    public fwe0(hwe0 hwe0Var) {
        this.a = hwe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fwe0) && this.a.equals(((fwe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
