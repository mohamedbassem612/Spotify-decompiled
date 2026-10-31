package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kd5 implements qq60 {
    public final ld5 a;
    public final String b;
    public final op80 c;

    public kd5(ld5 ld5Var, String str, op80 op80Var) {
        this.a = ld5Var;
        this.b = str;
        this.c = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd5)) {
            return false;
        }
        kd5 kd5Var = (kd5) obj;
        return this.a.equals(kd5Var.a) && this.b.equals(kd5Var.b) && this.c.equals(kd5Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
