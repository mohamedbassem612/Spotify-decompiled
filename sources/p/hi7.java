package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hi7 {
    public final rf01 a;
    public final zy70 b;
    public final gi7 c;

    public hi7(rf01 rf01Var, zy70 zy70Var, gi7 gi7Var) {
        this.a = rf01Var;
        this.b = zy70Var;
        this.c = gi7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi7)) {
            return false;
        }
        hi7 hi7Var = (hi7) obj;
        if (!u890.j(this.a, hi7Var.a)) {
            return false;
        }
        gi7 gi7Var = hi7Var.c;
        gi7 gi7Var2 = this.c;
        return u890.j(gi7Var2, gi7Var) && gi7Var2.a(this.b, hi7Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        gi7 gi7Var = this.c;
        return gi7Var.b(this.b) + ((gi7Var.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.a + ", request=" + this.b + ", modelEqualityDelegate=" + this.c + ")";
    }
}
