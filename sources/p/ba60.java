package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ba60 implements da60 {
    public final k37 a;
    public final k37 b;

    public ba60(k37 k37Var, k37 k37Var2) {
        this.a = k37Var;
        this.b = k37Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba60)) {
            return false;
        }
        ba60 ba60Var = (ba60) obj;
        return this.a.equals(ba60Var.a) && this.b.equals(ba60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
