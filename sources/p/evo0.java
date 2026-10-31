package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class evo0 {
    public final k5a1 a;
    public final ya0 b;
    public final puo0 c;
    public final boolean d;

    public evo0(k5a1 k5a1Var, ya0 ya0Var, puo0 puo0Var, boolean z) {
        this.a = k5a1Var;
        this.b = ya0Var;
        this.c = puo0Var;
        this.d = z;
    }

    public static evo0 a(evo0 evo0Var, k5a1 k5a1Var, ya0 ya0Var, puo0 puo0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            k5a1Var = evo0Var.a;
        }
        if ((i & 2) != 0) {
            ya0Var = evo0Var.b;
        }
        if ((i & 4) != 0) {
            puo0Var = evo0Var.c;
        }
        if ((i & 8) != 0) {
            z = evo0Var.d;
        }
        return new evo0(k5a1Var, ya0Var, puo0Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evo0)) {
            return false;
        }
        evo0 evo0Var = (evo0) obj;
        return this.a.equals(evo0Var.a) && u890.j(this.b, evo0Var.b) && u890.j(this.c, evo0Var.c) && this.d == evo0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ya0 ya0Var = this.b;
        int iHashCode2 = (iHashCode + (ya0Var == null ? 0 : ya0Var.hashCode())) * 31;
        puo0 puo0Var = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (puo0Var != null ? puo0Var.hashCode() : 0)) * 31);
    }
}
