package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class whg {
    public final ewe1 a;
    public final sn51 b;
    public final d6t0 c;

    public whg(ewe1 ewe1Var, sn51 sn51Var, d6t0 d6t0Var) {
        this.a = ewe1Var;
        this.b = sn51Var;
        this.c = d6t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whg)) {
            return false;
        }
        whg whgVar = (whg) obj;
        return this.a.equals(whgVar.a) && this.b.equals(whgVar.b) && this.c.equals(whgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
