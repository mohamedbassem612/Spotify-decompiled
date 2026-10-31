package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mo41 {
    public final ko41 a;
    public final int b;
    public final int c;

    public mo41(ko41 ko41Var, int i, int i2) {
        this.a = ko41Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo41)) {
            return false;
        }
        mo41 mo41Var = (mo41) obj;
        return this.a == mo41Var.a && this.b == mo41Var.b && this.c == mo41Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
