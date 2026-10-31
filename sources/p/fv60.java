package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fv60 {
    public final os60 a;

    public fv60(os60 os60Var) {
        this.a = os60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fv60) && u890.j(this.a, ((fv60) obj).a);
    }

    public final int hashCode() {
        os60 os60Var = this.a;
        if (os60Var == null) {
            return 0;
        }
        return os60Var.hashCode();
    }
}
