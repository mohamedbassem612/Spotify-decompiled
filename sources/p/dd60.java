package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dd60 implements gd60 {
    public final k37 a;
    public final k37 b;
    public final k37 c;

    public dd60(k37 k37Var, k37 k37Var2, k37 k37Var3) {
        this.a = k37Var;
        this.b = k37Var2;
        this.c = k37Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd60)) {
            return false;
        }
        dd60 dd60Var = (dd60) obj;
        return this.a.equals(dd60Var.a) && this.b.equals(dd60Var.b) && this.c.equals(dd60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
