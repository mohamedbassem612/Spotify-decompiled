package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n6k implements qq60 {
    public final udk a;
    public final String b;
    public final op80 c;

    public n6k(udk udkVar, String str, op80 op80Var) {
        this.a = udkVar;
        this.b = str;
        this.c = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6k)) {
            return false;
        }
        n6k n6kVar = (n6k) obj;
        return this.a.equals(n6kVar.a) && this.b.equals(n6kVar.b) && this.c.equals(n6kVar.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
