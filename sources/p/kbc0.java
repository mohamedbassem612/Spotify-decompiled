package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kbc0 {
    public final t6g1 a;
    public final rrt0 b;
    public final n6u c;
    public final boolean d;

    public kbc0(t6g1 t6g1Var, rrt0 rrt0Var, n6u n6uVar, boolean z) {
        this.a = t6g1Var;
        this.b = rrt0Var;
        this.c = n6uVar;
        this.d = z;
    }

    public static kbc0 a(kbc0 kbc0Var, t6g1 t6g1Var, rrt0 rrt0Var, n6u n6uVar, boolean z, int i) {
        if ((i & 1) != 0) {
            t6g1Var = kbc0Var.a;
        }
        if ((i & 2) != 0) {
            rrt0Var = kbc0Var.b;
        }
        if ((i & 4) != 0) {
            n6uVar = kbc0Var.c;
        }
        if ((i & 8) != 0) {
            z = kbc0Var.d;
        }
        return new kbc0(t6g1Var, rrt0Var, n6uVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbc0)) {
            return false;
        }
        kbc0 kbc0Var = (kbc0) obj;
        return this.a.equals(kbc0Var.a) && this.b == kbc0Var.b && this.c.equals(kbc0Var.c) && this.d == kbc0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
