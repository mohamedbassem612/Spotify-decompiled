package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dmj0 {
    public final k1r a;
    public final k1r b;
    public final boolean c;
    public final k1r d;

    public dmj0(k1r k1rVar, k1r k1rVar2, boolean z, k1r k1rVar3) {
        this.a = k1rVar;
        this.b = k1rVar2;
        this.c = z;
        this.d = k1rVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmj0)) {
            return false;
        }
        dmj0 dmj0Var = (dmj0) obj;
        return u890.j(this.a, dmj0Var.a) && u890.j(this.b, dmj0Var.b) && this.c == dmj0Var.c && u890.j(this.d, dmj0Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        k1r k1rVar = this.d;
        return iG + (k1rVar == null ? 0 : k1rVar.hashCode());
    }
}
