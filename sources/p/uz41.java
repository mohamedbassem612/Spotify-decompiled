package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uz41 extends q151 {
    public final e940 a;

    public uz41(e940 e940Var) {
        this.a = e940Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uz41) && u890.j(this.a, ((uz41) obj).a);
    }

    public final int hashCode() {
        e940 e940Var = this.a;
        if (e940Var == null) {
            return 0;
        }
        return e940Var.hashCode();
    }
}
