package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qyv0 extends ryv0 {
    public final syv0 a;
    public final int b;

    public qyv0(syv0 syv0Var, int i) {
        this.a = syv0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyv0)) {
            return false;
        }
        qyv0 qyv0Var = (qyv0) obj;
        return this.a.equals(qyv0Var.a) && this.b == qyv0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
