package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ldc1 implements eec1 {
    public final mdc1 a;
    public final rm5 b;

    public ldc1(mdc1 mdc1Var, rm5 rm5Var) {
        this.a = mdc1Var;
        this.b = rm5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldc1)) {
            return false;
        }
        ldc1 ldc1Var = (ldc1) obj;
        return this.a == ldc1Var.a && this.b == ldc1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
