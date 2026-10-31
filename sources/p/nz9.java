package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nz9 {
    public final llw0 a;
    public final float b;
    public final jlw0 c;

    public nz9(llw0 llw0Var, float f, jlw0 jlw0Var) {
        this.a = llw0Var;
        this.b = f;
        this.c = jlw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz9)) {
            return false;
        }
        nz9 nz9Var = (nz9) obj;
        return this.a.equals(nz9Var.a) && Float.compare(this.b, nz9Var.b) == 0 && u890.j(this.c, nz9Var.c);
    }

    public final int hashCode() {
        int iF = x0d.f(this.a.hashCode() * 31, 31, this.b);
        jlw0 jlw0Var = this.c;
        return iF + (jlw0Var == null ? 0 : jlw0Var.hashCode());
    }
}
