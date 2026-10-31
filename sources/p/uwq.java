package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uwq {
    public final vnb1 a;

    public uwq(vnb1 vnb1Var) {
        this.a = vnb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uwq) && u890.j(this.a, ((uwq) obj).a);
    }

    public final int hashCode() {
        vnb1 vnb1Var = this.a;
        if (vnb1Var == null) {
            return 0;
        }
        return vnb1Var.hashCode();
    }
}
