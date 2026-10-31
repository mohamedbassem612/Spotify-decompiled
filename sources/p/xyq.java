package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xyq implements yyq {
    public final jh5 a;
    public final Object b;

    public xyq(jh5 jh5Var, Object obj) {
        this.a = jh5Var;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyq)) {
            return false;
        }
        xyq xyqVar = (xyq) obj;
        return u890.j(this.a, xyqVar.a) && u890.j(this.b, xyqVar.b);
    }

    @Override // p.yyq
    public final String getMessage() {
        return "Unexpected value for " + this.a + ": " + this.b;
    }

    public final int hashCode() {
        int i = this.a.c * 31;
        Object obj = this.b;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        jh5 jh5Var = this.a;
        zjd1 zjd1Var = jh5Var.a;
        Object obj = jh5Var.b;
        StringBuilder sb = new StringBuilder("UnexpectedValue(table=");
        sb.append(zjd1Var);
        sb.append(", key=");
        sb.append(obj);
        sb.append(", value=");
        return td6.l(sb, this.b, ")");
    }
}
