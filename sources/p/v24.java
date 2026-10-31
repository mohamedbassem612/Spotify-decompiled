package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v24 implements qq60 {
    public final y24 a;
    public final String b;
    public final op80 c;

    public v24(y24 y24Var, String str, op80 op80Var) {
        this.a = y24Var;
        this.b = str;
        this.c = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v24)) {
            return false;
        }
        v24 v24Var = (v24) obj;
        return this.a.equals(v24Var.a) && this.b.equals(v24Var.b) && this.c.equals(v24Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
