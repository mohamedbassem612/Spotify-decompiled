package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l691 {
    public final String a;
    public final boolean b;
    public final fvf1 c;

    public l691(String str, boolean z, fvf1 fvf1Var) {
        this.a = str;
        this.b = z;
        this.c = fvf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l691)) {
            return false;
        }
        l691 l691Var = (l691) obj;
        return this.a.equals(l691Var.a) && this.b == l691Var.b && this.c.equals(l691Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
