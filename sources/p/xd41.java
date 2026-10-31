package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xd41 {
    public final Boolean a;
    public final Boolean b;

    public xd41(Boolean bool, Boolean bool2) {
        this.a = bool;
        this.b = bool2;
    }

    public final Boolean a() {
        return this.a;
    }

    public final Boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd41)) {
            return false;
        }
        xd41 xd41Var = (xd41) obj;
        return u890.j(this.a, xd41Var.a) && u890.j(this.b, xd41Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }
}
