package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ed11 {
    public final xkk1 a;
    public final jo70 b;

    public ed11(jo70 jo70Var, xkk1 xkk1Var) {
        this.a = xkk1Var;
        this.b = jo70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed11)) {
            return false;
        }
        ed11 ed11Var = (ed11) obj;
        return this.a.equals(ed11Var.a) && this.b.equals(ed11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
