package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lqe0 extends qqe0 {
    public final moe0 a;

    public lqe0(moe0 moe0Var) {
        this.a = moe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqe0) && u890.j(this.a, ((lqe0) obj).a);
    }

    public final int hashCode() {
        moe0 moe0Var = this.a;
        if (moe0Var == null) {
            return 0;
        }
        return moe0Var.hashCode();
    }
}
