package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qec0 {
    public final zec0 a;
    public final crb b;

    public qec0(zec0 zec0Var, crb crbVar) {
        this.a = zec0Var;
        this.b = crbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qec0)) {
            return false;
        }
        qec0 qec0Var = (qec0) obj;
        return u890.j(this.a, qec0Var.a) && this.b.equals(qec0Var.b);
    }

    public final int hashCode() {
        zec0 zec0Var = this.a;
        return this.b.hashCode() + ((zec0Var == null ? 0 : zec0Var.hashCode()) * 31);
    }
}
