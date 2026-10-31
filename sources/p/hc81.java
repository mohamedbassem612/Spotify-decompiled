package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hc81 implements qq60 {
    public final String a;
    public final op80 b;
    public final id81 c;

    public hc81(String str, op80 op80Var, id81 id81Var) {
        this.a = str;
        this.b = op80Var;
        this.c = id81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc81)) {
            return false;
        }
        hc81 hc81Var = (hc81) obj;
        return this.a.equals(hc81Var.a) && this.b.equals(hc81Var.b) && this.c.equals(hc81Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.i(this.b, this.a.hashCode() * 31, 31);
    }
}
