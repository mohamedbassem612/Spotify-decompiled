package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q9d1 implements s9d1 {
    public final vu11 a;
    public final vu11 b;

    public q9d1(vu11 vu11Var, vu11 vu11Var2) {
        this.a = vu11Var;
        this.b = vu11Var2;
    }

    public final vu11 a() {
        return this.a;
    }

    public final vu11 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9d1)) {
            return false;
        }
        q9d1 q9d1Var = (q9d1) obj;
        return u890.j(this.a, q9d1Var.a) && u890.j(this.b, q9d1Var.b);
    }

    public final int hashCode() {
        vu11 vu11Var = this.a;
        int iHashCode = (vu11Var == null ? 0 : vu11Var.hashCode()) * 31;
        vu11 vu11Var2 = this.b;
        return iHashCode + (vu11Var2 != null ? vu11Var2.hashCode() : 0);
    }
}
