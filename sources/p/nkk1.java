package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nkk1 {
    public final String a;
    public final wnw0 b;

    public nkk1(String str, wnw0 wnw0Var) {
        this.a = str;
        this.b = wnw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkk1)) {
            return false;
        }
        nkk1 nkk1Var = (nkk1) obj;
        return u890.j(this.a, nkk1Var.a) && this.b == nkk1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
