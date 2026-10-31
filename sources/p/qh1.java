package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qh1 {
    public final vnb1 a;
    public final boolean b;

    public qh1(vnb1 vnb1Var, boolean z) {
        this.a = vnb1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh1)) {
            return false;
        }
        qh1 qh1Var = (qh1) obj;
        return this.a.equals(qh1Var.a) && this.b == qh1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
