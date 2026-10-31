package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yqz0 {
    public final gj6 a;
    public final vu30 b;

    public yqz0(le6 le6Var, gj6 gj6Var) {
        this.a = gj6Var;
        this.b = le6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqz0)) {
            return false;
        }
        yqz0 yqz0Var = (yqz0) obj;
        return this.a.equals(yqz0Var.a) && u890.j(this.b, yqz0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vu30 vu30Var = this.b;
        return iHashCode + (vu30Var == null ? 0 : vu30Var.hashCode());
    }
}
