package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class td2 {
    public final Integer a;
    public final pb2 b;
    public final lax c;

    public td2(Integer num, pb2 pb2Var, lax laxVar) {
        this.a = num;
        this.b = pb2Var;
        this.c = laxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td2)) {
            return false;
        }
        td2 td2Var = (td2) obj;
        return u890.j(this.a, td2Var.a) && this.b == td2Var.b && u890.j(this.c, td2Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }
}
