package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xw90 {
    public final fey a;
    public final z5a0 b;
    public final t0a0 c;
    public final tq90 d;
    public final j5a1 e;
    public final gz90 f;
    public final e831 g;

    public xw90(fey feyVar, z5a0 z5a0Var, t0a0 t0a0Var, tq90 tq90Var, j5a1 j5a1Var, gz90 gz90Var, e831 e831Var) {
        this.a = feyVar;
        this.b = z5a0Var;
        this.c = t0a0Var;
        this.d = tq90Var;
        this.e = j5a1Var;
        this.f = gz90Var;
        this.g = e831Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw90)) {
            return false;
        }
        xw90 xw90Var = (xw90) obj;
        return this.a == xw90Var.a && this.b == xw90Var.b && this.c == xw90Var.c && this.d == xw90Var.d && this.e == xw90Var.e && this.f == xw90Var.f && this.g == xw90Var.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
