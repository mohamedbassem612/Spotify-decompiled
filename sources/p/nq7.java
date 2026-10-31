package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nq7 implements pq7 {
    public final jlw0 a;
    public final int b;
    public final String c;
    public final String d;
    public final s171 e;

    public nq7(jlw0 jlw0Var, int i, String str, String str2, s171 s171Var) {
        this.a = jlw0Var;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = s171Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq7)) {
            return false;
        }
        nq7 nq7Var = (nq7) obj;
        return this.a.equals(nq7Var.a) && this.b == nq7Var.b && u890.j(this.c, nq7Var.c) && this.d.equals(nq7Var.d) && this.e.equals(nq7Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }
}
