package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z8j0 {
    public final gdx a;
    public final byte b;
    public final vzq0 c;
    public final hw61 d;

    public z8j0(gdx gdxVar, int i) {
        this((i & 1) != 0 ? null : gdxVar, 3, null, er31.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8j0)) {
            return false;
        }
        z8j0 z8j0Var = (z8j0) obj;
        return u890.j(this.a, z8j0Var.a) && this.b == z8j0Var.b && u890.j(this.c, z8j0Var.c) && u890.j(this.d, z8j0Var.d);
    }

    public final int hashCode() {
        gdx gdxVar = this.a;
        int iF = kaa0.f(this.b, (gdxVar == null ? 0 : gdxVar.hashCode()) * 31, 31);
        vzq0 vzq0Var = this.c;
        return this.d.hashCode() + ((iF + (vzq0Var != null ? vzq0Var.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z8j0(gdx gdxVar, int i, zzq0 zzq0Var, hw61 hw61Var) {
        this.a = gdxVar;
        this.b = i;
        this.c = zzq0Var;
        this.d = hw61Var;
    }
}
