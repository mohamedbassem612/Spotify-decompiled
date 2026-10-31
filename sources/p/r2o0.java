package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r2o0 {
    public final int a;
    public final vvi0 b;

    public r2o0(int i, vvi0 vvi0Var) {
        this.a = i;
        this.b = vvi0Var;
    }

    public final int a() {
        return this.a;
    }

    public final vvi0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2o0)) {
            return false;
        }
        r2o0 r2o0Var = (r2o0) obj;
        return this.a == r2o0Var.a && this.b.equals(r2o0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
