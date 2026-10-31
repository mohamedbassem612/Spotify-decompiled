package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sv61 {
    public final jt61 a;
    public final Object b;

    public sv61(jt61 jt61Var, Object obj) {
        this.a = jt61Var;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv61)) {
            return false;
        }
        sv61 sv61Var = (sv61) obj;
        return u890.j(this.a, sv61Var.a) && u890.j(this.b, sv61Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
