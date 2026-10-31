package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class icl1 {
    public final z0i a;
    public final boolean b;

    public icl1(z0i z0iVar, boolean z) {
        this.a = z0iVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icl1)) {
            return false;
        }
        icl1 icl1Var = (icl1) obj;
        return u890.j(this.a, icl1Var.a) && this.b == icl1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
