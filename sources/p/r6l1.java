package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r6l1 implements qq60 {
    public final String a;
    public final op80 b;
    public final s6l1 c;

    public r6l1(String str, op80 op80Var, s6l1 s6l1Var) {
        this.a = str;
        this.b = op80Var;
        this.c = s6l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6l1)) {
            return false;
        }
        r6l1 r6l1Var = (r6l1) obj;
        return this.a.equals(r6l1Var.a) && this.b.equals(r6l1Var.b) && this.c.equals(r6l1Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.i(this.b, this.a.hashCode() * 31, 31);
    }
}
