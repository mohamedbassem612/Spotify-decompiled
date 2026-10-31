package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zcd1 {
    public final jo70 a;
    public final xkk1 b;
    public final Float c;

    public zcd1(jo70 jo70Var, xkk1 xkk1Var, Float f) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcd1)) {
            return false;
        }
        zcd1 zcd1Var = (zcd1) obj;
        return u890.j(this.a, zcd1Var.a) && u890.j(this.b, zcd1Var.b) && u890.j(this.c, zcd1Var.c);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        int iHashCode = (jo70Var == null ? 0 : jo70Var.hashCode()) * 31;
        xkk1 xkk1Var = this.b;
        int iHashCode2 = (iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        Float f = this.c;
        return iHashCode2 + (f != null ? f.hashCode() : 0);
    }
}
