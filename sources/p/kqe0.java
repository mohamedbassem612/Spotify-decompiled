package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kqe0 extends qqe0 {
    public final moe0 a;
    public final String b;

    public kqe0(moe0 moe0Var, String str) {
        this.a = moe0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqe0)) {
            return false;
        }
        kqe0 kqe0Var = (kqe0) obj;
        return u890.j(this.a, kqe0Var.a) && u890.j(this.b, kqe0Var.b);
    }

    public final int hashCode() {
        moe0 moe0Var = this.a;
        return this.b.hashCode() + ((moe0Var == null ? 0 : moe0Var.hashCode()) * 31);
    }
}
