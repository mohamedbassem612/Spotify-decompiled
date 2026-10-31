package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xn60 implements yn60 {
    public final un60 a;
    public final vn60 b;

    public xn60(un60 un60Var, vn60 vn60Var) {
        this.a = un60Var;
        this.b = vn60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn60)) {
            return false;
        }
        xn60 xn60Var = (xn60) obj;
        return this.a.equals(xn60Var.a) && u890.j(this.b, xn60Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vn60 vn60Var = this.b;
        return iHashCode + (vn60Var == null ? 0 : vn60Var.hashCode());
    }
}
