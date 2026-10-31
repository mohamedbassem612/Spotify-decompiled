package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u110 {
    public final k1r a;
    public final k1r b;
    public final k1r c;
    public final k1r d;

    public u110(k1r k1rVar, k1r k1rVar2, k1r k1rVar3, k1r k1rVar4) {
        this.a = k1rVar;
        this.b = k1rVar2;
        this.c = k1rVar3;
        this.d = k1rVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u110)) {
            return false;
        }
        u110 u110Var = (u110) obj;
        return this.a.equals(u110Var.a) && this.b.equals(u110Var.b) && this.c.equals(u110Var.c) && this.d.equals(u110Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
