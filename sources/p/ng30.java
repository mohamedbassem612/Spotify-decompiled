package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ng30 implements yyf0 {
    public final int a;

    public ng30(int i) {
        this.a = i;
    }

    public final yyf0 a(yyf0 yyf0Var, float f) {
        return new ng30(dm5.U(this.a, ((ng30) yyf0Var).a, f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng30) && this.a == ((ng30) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
