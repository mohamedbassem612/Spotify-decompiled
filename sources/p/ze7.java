package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ze7 extends iqo1 {
    public final ou80 d;
    public final yd7 e;

    public ze7(ou80 ou80Var, yd7 yd7Var) {
        this.d = ou80Var;
        this.e = yd7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze7)) {
            return false;
        }
        ze7 ze7Var = (ze7) obj;
        return u890.j(this.d, ze7Var.d) && this.e.equals(ze7Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.a.hashCode() * 31);
    }
}
