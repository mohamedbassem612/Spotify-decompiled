package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bzf0 implements dzf0 {
    public final xpw a;
    public final Object b;
    public final zob1 c;

    public bzf0(xpw xpwVar, Object obj, zob1 zob1Var) {
        this.a = xpwVar;
        this.b = obj;
        this.c = zob1Var;
    }

    @Override // p.dzf0
    public final zob1 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzf0)) {
            return false;
        }
        bzf0 bzf0Var = (bzf0) obj;
        return u890.j(this.a, bzf0Var.a) && this.b.equals(bzf0Var.b) && u890.j(this.c, bzf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
