package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d7f1 {
    public final rx7 a;
    public final boolean b;

    public d7f1(rx7 rx7Var, boolean z) {
        this.a = rx7Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7f1)) {
            return false;
        }
        d7f1 d7f1Var = (d7f1) obj;
        return u890.j(this.a, d7f1Var.a) && this.b == d7f1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
