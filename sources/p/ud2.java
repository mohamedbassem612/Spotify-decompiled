package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ud2 {
    public final uqo a;
    public final Integer b;
    public final pb2 c;
    public final lax d;

    public ud2(uqo uqoVar, Integer num, pb2 pb2Var, lax laxVar) {
        this.a = uqoVar;
        this.b = num;
        this.c = pb2Var;
        this.d = laxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud2)) {
            return false;
        }
        ud2 ud2Var = (ud2) obj;
        return this.a.equals(ud2Var.a) && u890.j(this.b, ud2Var.b) && this.c == ud2Var.c && u890.j(this.d, ud2Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31);
    }
}
