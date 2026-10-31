package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m460 implements qq60 {
    public final String a;
    public final s460 b;
    public final op80 c;

    public m460(String str, s460 s460Var, op80 op80Var) {
        this.a = str;
        this.b = s460Var;
        this.c = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m460)) {
            return false;
        }
        m460 m460Var = (m460) obj;
        return this.a.equals(m460Var.a) && this.b.equals(m460Var.b) && this.c.equals(m460Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
