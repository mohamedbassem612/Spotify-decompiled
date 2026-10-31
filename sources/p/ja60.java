package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ja60 implements la60 {
    public final String a;
    public final za60 b;
    public final za60 c;
    public final da60 d;

    public ja60(String str, za60 za60Var, za60 za60Var2, da60 da60Var) {
        this.a = str;
        this.b = za60Var;
        this.c = za60Var2;
        this.d = da60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja60)) {
            return false;
        }
        ja60 ja60Var = (ja60) obj;
        return this.a.equals(ja60Var.a) && this.b.equals(ja60Var.b) && this.c.equals(ja60Var.c) && u890.j(this.d, ja60Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        da60 da60Var = this.d;
        return iHashCode + (da60Var == null ? 0 : da60Var.hashCode());
    }
}
