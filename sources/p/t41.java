package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t41 extends c51 {
    public final tn00 a;

    public t41(tn00 tn00Var) {
        this.a = tn00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t41) && u890.j(this.a, ((t41) obj).a);
    }

    public final int hashCode() {
        tn00 tn00Var = this.a;
        if (tn00Var == null) {
            return 0;
        }
        return tn00Var.hashCode();
    }
}
