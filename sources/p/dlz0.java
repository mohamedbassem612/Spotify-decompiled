package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dlz0 {
    public final String a;
    public final c380 b;
    public final vu30 c;

    public dlz0(String str, c380 c380Var, vu30 vu30Var) {
        this.a = str;
        this.b = c380Var;
        this.c = vu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlz0)) {
            return false;
        }
        dlz0 dlz0Var = (dlz0) obj;
        return u890.j(this.a, dlz0Var.a) && u890.j(this.b, dlz0Var.b) && u890.j(this.c, dlz0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kk0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
