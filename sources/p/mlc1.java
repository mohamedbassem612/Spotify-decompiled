package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mlc1 implements aik1 {
    public final boolean a;
    public final klc1 b;

    public mlc1(boolean z, klc1 klc1Var) {
        this.a = z;
        this.b = klc1Var;
    }

    @Override // p.aik1
    public final int a() {
        return 5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlc1)) {
            return false;
        }
        mlc1 mlc1Var = (mlc1) obj;
        return this.a == mlc1Var.a && u890.j(this.b, mlc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
