package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ca60 implements da60 {
    public final k37 a;
    public final k37 b;
    public final k37 c;

    public ca60(k37 k37Var, k37 k37Var2, k37 k37Var3) {
        this.a = k37Var;
        this.b = k37Var2;
        this.c = k37Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca60)) {
            return false;
        }
        ca60 ca60Var = (ca60) obj;
        return this.a.equals(ca60Var.a) && this.b.equals(ca60Var.b) && this.c.equals(ca60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
