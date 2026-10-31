package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yxr0 {
    public final k1r a;
    public final ayr0 b;

    public yxr0(k1r k1rVar, ayr0 ayr0Var) {
        this.a = k1rVar;
        this.b = ayr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxr0)) {
            return false;
        }
        yxr0 yxr0Var = (yxr0) obj;
        return u890.j(this.a, yxr0Var.a) && u890.j(this.b, yxr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
