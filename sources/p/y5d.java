package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y5d implements qq60 {
    public final d6d a;
    public final String b;
    public final op80 c;

    public y5d(d6d d6dVar, String str, op80 op80Var) {
        this.a = d6dVar;
        this.b = str;
        this.c = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5d)) {
            return false;
        }
        y5d y5dVar = (y5d) obj;
        return this.a.equals(y5dVar.a) && this.b.equals(y5dVar.b) && this.c.equals(y5dVar.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
