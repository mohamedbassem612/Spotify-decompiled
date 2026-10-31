package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hm61 {
    public final qfm0 a;
    public final pz11 b;
    public final xav0 c;

    public hm61(qfm0 qfm0Var, pz11 pz11Var, xav0 xav0Var) {
        this.a = qfm0Var;
        this.b = pz11Var;
        this.c = xav0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm61)) {
            return false;
        }
        hm61 hm61Var = (hm61) obj;
        return this.a.equals(hm61Var.a) && u890.j(this.b, hm61Var.b) && u890.j(this.c, hm61Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
