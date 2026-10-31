package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a210 {
    public final k1r a;
    public final k1r b;
    public final k1r c;
    public final k1r d;
    public final k1r e;
    public final k1r f;

    public a210(k1r k1rVar, k1r k1rVar2, k1r k1rVar3, k1r k1rVar4, k1r k1rVar5, k1r k1rVar6) {
        this.a = k1rVar;
        this.b = k1rVar2;
        this.c = k1rVar3;
        this.d = k1rVar4;
        this.e = k1rVar5;
        this.f = k1rVar6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a210)) {
            return false;
        }
        a210 a210Var = (a210) obj;
        return this.a.equals(a210Var.a) && this.b.equals(a210Var.b) && this.c.equals(a210Var.c) && this.d.equals(a210Var.d) && this.e.equals(a210Var.e) && this.f.equals(a210Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
