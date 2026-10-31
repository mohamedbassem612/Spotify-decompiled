package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class us6 implements ez00 {
    public final h290 a;
    public final h290 b;
    public final h290 c;

    public us6(h290 h290Var, h290 h290Var2, h290 h290Var3) {
        this.a = h290Var;
        this.b = h290Var2;
        this.c = h290Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us6)) {
            return false;
        }
        us6 us6Var = (us6) obj;
        return this.a.equals(us6Var.a) && this.b.equals(us6Var.b) && this.c.equals(us6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kk0.g(this.b, this.a.hashCode() * 31, 31);
    }
}
