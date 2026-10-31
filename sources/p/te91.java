package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class te91 implements qq60 {
    public final String a;
    public final op80 b;
    public final ef91 c;

    public te91(String str, op80 op80Var, ef91 ef91Var) {
        this.a = str;
        this.b = op80Var;
        this.c = ef91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te91)) {
            return false;
        }
        te91 te91Var = (te91) obj;
        return this.a.equals(te91Var.a) && this.b.equals(te91Var.b) && this.c == te91Var.c;
    }

    @Override // p.qq60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.i(this.b, this.a.hashCode() * 31, 31);
    }
}
