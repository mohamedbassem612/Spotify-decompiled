package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class utn0 implements yyf0 {
    public final int a;
    public final int b;
    public final float c;

    public utn0(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final yyf0 a(yyf0 yyf0Var, float f) {
        utn0 utn0Var = (utn0) yyf0Var;
        return new utn0(dm5.U(this.a, utn0Var.a, f), dm5.U(this.b, utn0Var.b, f), dm5.T(this.c, utn0Var.c, f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utn0)) {
            return false;
        }
        utn0 utn0Var = (utn0) obj;
        return this.a == utn0Var.a && this.b == utn0Var.b && Float.compare(this.c, utn0Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
