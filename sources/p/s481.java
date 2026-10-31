package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s481 implements w481 {
    public final zoy0 a;
    public final va81 b;

    public s481(zoy0 zoy0Var, va81 va81Var) {
        this.a = zoy0Var;
        this.b = va81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s481)) {
            return false;
        }
        s481 s481Var = (s481) obj;
        return u890.j(this.a, s481Var.a) && u890.j(this.b, s481Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        va81 va81Var = this.b;
        return iHashCode + (va81Var == null ? 0 : va81Var.hashCode());
    }
}
