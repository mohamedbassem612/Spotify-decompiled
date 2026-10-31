package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t481 implements v481 {
    public final va81 a;
    public final zoy0 b;

    public t481(zoy0 zoy0Var, va81 va81Var) {
        this.a = va81Var;
        this.b = zoy0Var;
    }

    @Override // p.v481
    public final zoy0 a() {
        return this.b;
    }

    @Override // p.v481
    public final va81 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t481)) {
            return false;
        }
        t481 t481Var = (t481) obj;
        return this.a.equals(t481Var.a) && u890.j(this.b, t481Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zoy0 zoy0Var = this.b;
        return iHashCode + (zoy0Var == null ? 0 : zoy0Var.hashCode());
    }
}
