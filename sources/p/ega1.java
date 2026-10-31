package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ega1 {
    public final dga1 a;
    public final l620 b;
    public final cga1 c;

    public /* synthetic */ ega1(dga1 dga1Var, l620 l620Var, int i) {
        this((i & 1) != 0 ? yfa1.a : dga1Var, (i & 2) != 0 ? l620.a : l620Var, (cga1) null);
    }

    public static ega1 a(ega1 ega1Var, dga1 dga1Var, l620 l620Var, cga1 cga1Var, int i) {
        if ((i & 1) != 0) {
            dga1Var = ega1Var.a;
        }
        if ((i & 2) != 0) {
            l620Var = ega1Var.b;
        }
        if ((i & 4) != 0) {
            cga1Var = ega1Var.c;
        }
        ega1Var.getClass();
        return new ega1(dga1Var, l620Var, cga1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ega1)) {
            return false;
        }
        ega1 ega1Var = (ega1) obj;
        return u890.j(this.a, ega1Var.a) && this.b == ega1Var.b && u890.j(this.c, ega1Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        cga1 cga1Var = this.c;
        return iHashCode + (cga1Var == null ? 0 : cga1Var.hashCode());
    }

    public ega1(dga1 dga1Var, l620 l620Var, cga1 cga1Var) {
        this.a = dga1Var;
        this.b = l620Var;
        this.c = cga1Var;
    }
}
