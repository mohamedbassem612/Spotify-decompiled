package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cmm0 {
    public final bmm0 a;

    public cmm0(bmm0 bmm0Var) {
        this.a = bmm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cmm0) && u890.j(this.a, ((cmm0) obj).a);
    }

    public final int hashCode() {
        bmm0 bmm0Var = this.a;
        if (bmm0Var == null) {
            return 0;
        }
        return bmm0Var.hashCode();
    }
}
