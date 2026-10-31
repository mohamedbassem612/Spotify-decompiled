package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u481 implements v481 {
    public final jo70 a;
    public final va81 b;
    public final zoy0 c;

    public u481(jo70 jo70Var, va81 va81Var, zoy0 zoy0Var) {
        this.a = jo70Var;
        this.b = va81Var;
        this.c = zoy0Var;
    }

    @Override // p.v481
    public final zoy0 a() {
        return this.c;
    }

    @Override // p.v481
    public final va81 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u481)) {
            return false;
        }
        u481 u481Var = (u481) obj;
        return this.a.equals(u481Var.a) && u890.j(this.b, u481Var.b) && u890.j(this.c, u481Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        va81 va81Var = this.b;
        int iHashCode2 = (iHashCode + (va81Var == null ? 0 : va81Var.hashCode())) * 31;
        zoy0 zoy0Var = this.c;
        return iHashCode2 + (zoy0Var != null ? zoy0Var.hashCode() : 0);
    }
}
