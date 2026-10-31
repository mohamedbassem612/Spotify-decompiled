package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lei0 {
    public final t810 a;
    public final hei0 b;

    public lei0(t810 t810Var, hei0 hei0Var) {
        this.a = t810Var;
        this.b = hei0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lei0)) {
            return false;
        }
        lei0 lei0Var = (lei0) obj;
        return this.a.equals(lei0Var.a) && u890.j(this.b, lei0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
