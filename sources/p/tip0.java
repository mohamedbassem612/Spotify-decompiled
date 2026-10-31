package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tip0 {
    public final lai1 a;
    public final dam b;
    public final gpy0 c;
    public final boolean d;

    public tip0(lai1 lai1Var, dam damVar, gpy0 gpy0Var, boolean z) {
        this.a = lai1Var;
        this.b = damVar;
        this.c = gpy0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tip0)) {
            return false;
        }
        tip0 tip0Var = (tip0) obj;
        return this.a.equals(tip0Var.a) && this.b.equals(tip0Var.b) && this.c.equals(tip0Var.c) && this.d == tip0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c.a);
    }
}
