package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y081 implements qq60 {
    public final e181 a;
    public final String b;
    public final op80 c;

    public y081(e181 e181Var, String str, op80 op80Var) {
        this.a = e181Var;
        this.b = str;
        this.c = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y081)) {
            return false;
        }
        y081 y081Var = (y081) obj;
        return this.a.equals(y081Var.a) && this.b.equals(y081Var.b) && this.c.equals(y081Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
