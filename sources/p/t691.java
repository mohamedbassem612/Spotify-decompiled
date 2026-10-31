package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t691 {
    public final String a;
    public final boolean b;
    public final fvf1 c;

    public t691(String str, boolean z, fvf1 fvf1Var) {
        this.a = str;
        this.b = z;
        this.c = fvf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t691)) {
            return false;
        }
        t691 t691Var = (t691) obj;
        return this.a.equals(t691Var.a) && this.b == t691Var.b && this.c.equals(t691Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
