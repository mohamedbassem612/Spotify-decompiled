package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ki41 implements mi41 {
    public final aj41 a;

    public ki41(aj41 aj41Var) {
        this.a = aj41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ki41) && u890.j(this.a, ((ki41) obj).a);
    }

    public final int hashCode() {
        aj41 aj41Var = this.a;
        if (aj41Var == null) {
            return 0;
        }
        return aj41Var.hashCode();
    }
}
