package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a891 implements d891 {
    public final i6h1 a;

    public a891(i6h1 i6h1Var) {
        this.a = i6h1Var;
    }

    @Override // p.d891
    public final i6h1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a891) && u890.j(this.a, ((a891) obj).a);
    }

    public final int hashCode() {
        i6h1 i6h1Var = this.a;
        if (i6h1Var == null) {
            return 0;
        }
        return i6h1Var.hashCode();
    }
}
