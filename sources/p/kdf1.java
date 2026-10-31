package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kdf1 implements qq60 {
    public final pdf1 a;
    public final String b;
    public final op80 c;

    public kdf1(pdf1 pdf1Var, String str, op80 op80Var) {
        this.a = pdf1Var;
        this.b = str;
        this.c = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdf1)) {
            return false;
        }
        kdf1 kdf1Var = (kdf1) obj;
        return this.a.equals(kdf1Var.a) && this.b.equals(kdf1Var.b) && this.c.equals(kdf1Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
