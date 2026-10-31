package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class aa60 implements da60 {
    public final k37 a;
    public final k37 b;
    public final k37 c;

    public aa60(k37 k37Var, k37 k37Var2, k37 k37Var3) {
        this.a = k37Var;
        this.b = k37Var2;
        this.c = k37Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa60)) {
            return false;
        }
        aa60 aa60Var = (aa60) obj;
        return this.a.equals(aa60Var.a) && this.b.equals(aa60Var.b) && this.c.equals(aa60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
