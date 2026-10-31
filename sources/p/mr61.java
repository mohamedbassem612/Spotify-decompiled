package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mr61 {
    public final ir61 a;
    public final boolean b;
    public final eq61 c;
    public final zq61 d;

    public mr61(ir61 ir61Var, boolean z, eq61 eq61Var, zq61 zq61Var) {
        this.a = ir61Var;
        this.b = z;
        this.c = eq61Var;
        this.d = zq61Var;
    }

    public static mr61 a(mr61 mr61Var, ir61 ir61Var, boolean z, eq61 eq61Var, zq61 zq61Var, int i) {
        if ((i & 1) != 0) {
            ir61Var = mr61Var.a;
        }
        if ((i & 2) != 0) {
            z = mr61Var.b;
        }
        if ((i & 4) != 0) {
            eq61Var = mr61Var.c;
        }
        if ((i & 8) != 0) {
            zq61Var = mr61Var.d;
        }
        return new mr61(ir61Var, z, eq61Var, zq61Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr61)) {
            return false;
        }
        mr61 mr61Var = (mr61) obj;
        return this.a.equals(mr61Var.a) && this.b == mr61Var.b && this.c.equals(mr61Var.c) && this.d.equals(mr61Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
