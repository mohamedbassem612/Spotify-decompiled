package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mtj1 {
    public final boolean a;
    public final y2u0 b;

    public mtj1(boolean z, y2u0 y2u0Var) {
        this.a = z;
        this.b = y2u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mtj1)) {
            return false;
        }
        mtj1 mtj1Var = (mtj1) obj;
        return this.a == mtj1Var.a && u890.j(this.b, mtj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
