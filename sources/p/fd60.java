package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fd60 implements gd60 {
    public final k37 a;
    public final k37 b;
    public final k37 c;

    public fd60(k37 k37Var, k37 k37Var2, k37 k37Var3) {
        this.a = k37Var;
        this.b = k37Var2;
        this.c = k37Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd60)) {
            return false;
        }
        fd60 fd60Var = (fd60) obj;
        return this.a.equals(fd60Var.a) && this.b.equals(fd60Var.b) && this.c.equals(fd60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
