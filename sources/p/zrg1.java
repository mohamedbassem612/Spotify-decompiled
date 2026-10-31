package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zrg1 {
    public final trg1 a;
    public final urg1 b;
    public final yrg1 c;
    public final srg1 d;

    public zrg1(trg1 trg1Var, urg1 urg1Var, yrg1 yrg1Var, srg1 srg1Var) {
        this.a = trg1Var;
        this.b = urg1Var;
        this.c = yrg1Var;
        this.d = srg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrg1)) {
            return false;
        }
        zrg1 zrg1Var = (zrg1) obj;
        return this.a.equals(zrg1Var.a) && this.b.equals(zrg1Var.b) && this.c.equals(zrg1Var.c) && this.d.equals(zrg1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
