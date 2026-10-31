package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rf7 implements xf7 {
    public final ou80 a;
    public final yd7 b;

    public rf7(ou80 ou80Var, yd7 yd7Var) {
        this.a = ou80Var;
        this.b = yd7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf7)) {
            return false;
        }
        rf7 rf7Var = (rf7) obj;
        return u890.j(this.a, rf7Var.a) && this.b.equals(rf7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }
}
