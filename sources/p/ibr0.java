package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ibr0 {
    public final sq61 a;
    public final Object b;

    public ibr0(sq61 sq61Var, Object obj) {
        this.a = sq61Var;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibr0)) {
            return false;
        }
        ibr0 ibr0Var = (ibr0) obj;
        return u890.j(this.a, ibr0Var.a) && u890.j(this.b, ibr0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
