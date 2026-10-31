package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tv61 {
    public final faa0 a;
    public final Object b;

    public tv61(faa0 faa0Var, Object obj) {
        this.a = faa0Var;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv61)) {
            return false;
        }
        tv61 tv61Var = (tv61) obj;
        return this.a.equals(tv61Var.a) && u890.j(this.b, tv61Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
