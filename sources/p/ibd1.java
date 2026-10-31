package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ibd1 implements igb1 {
    public final zad1 a;
    public final hbd1 b;

    public ibd1(zad1 zad1Var, hbd1 hbd1Var) {
        this.a = zad1Var;
        this.b = hbd1Var;
    }

    @Override // p.igb1
    public final hgb1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibd1)) {
            return false;
        }
        ibd1 ibd1Var = (ibd1) obj;
        return this.a.equals(ibd1Var.a) && this.b.equals(ibd1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
