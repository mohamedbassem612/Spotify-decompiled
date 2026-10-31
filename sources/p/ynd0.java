package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ynd0 implements qq60 {
    public final String a;
    public final op80 b;
    public final krk c;

    public ynd0(String str, op80 op80Var, krk krkVar) {
        this.a = str;
        this.b = op80Var;
        this.c = krkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynd0)) {
            return false;
        }
        ynd0 ynd0Var = (ynd0) obj;
        return this.a.equals(ynd0Var.a) && this.b.equals(ynd0Var.b) && this.c.equals(ynd0Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.i(this.b, this.a.hashCode() * 31, 31);
    }
}
