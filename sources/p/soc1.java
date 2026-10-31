package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class soc1 {
    public final String a;
    public final int b;
    public final sj51 c;
    public final yjd1 d;

    public soc1(String str, int i, sj51 sj51Var, yjd1 yjd1Var, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        i = (i2 & 2) != 0 ? 1 : i;
        sj51Var = (i2 & 4) != 0 ? new sj51(7, null, false) : sj51Var;
        yjd1Var = (i2 & 8) != 0 ? new yjd1(0, 15, null, false) : yjd1Var;
        this.a = str;
        this.b = i;
        this.c = sj51Var;
        this.d = yjd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof soc1)) {
            return false;
        }
        soc1 soc1Var = (soc1) obj;
        return this.a.equals(soc1Var.a) && this.b == soc1Var.b && this.c.equals(soc1Var.c) && this.d.equals(soc1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31)) * 31);
    }
}
