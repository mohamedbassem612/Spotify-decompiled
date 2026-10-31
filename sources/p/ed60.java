package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ed60 implements gd60 {
    public final k37 a;
    public final k37 b;

    public ed60(k37 k37Var, k37 k37Var2) {
        this.a = k37Var;
        this.b = k37Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed60)) {
            return false;
        }
        ed60 ed60Var = (ed60) obj;
        return this.a.equals(ed60Var.a) && this.b.equals(ed60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
