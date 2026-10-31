package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xoj0 implements yoj0 {
    public final fqj0 b;
    public final Long c;

    public xoj0(fqj0 fqj0Var, Long l) {
        this.b = fqj0Var;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoj0)) {
            return false;
        }
        xoj0 xoj0Var = (xoj0) obj;
        return u890.j(this.b, xoj0Var.b) && u890.j(this.c, xoj0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        Long l = this.c;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }
}
