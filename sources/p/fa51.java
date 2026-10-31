package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fa51 {
    public final int a;
    public final wq61 b;
    public final ib60 c;
    public final boolean d;

    public fa51(int i, wq61 wq61Var, ib60 ib60Var, boolean z) {
        this.a = i;
        this.b = wq61Var;
        this.c = ib60Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa51)) {
            return false;
        }
        fa51 fa51Var = (fa51) obj;
        return this.a == fa51Var.a && u890.j(this.b, fa51Var.b) && u890.j(this.c, fa51Var.c) && this.d == fa51Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        ib60 ib60Var = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (ib60Var == null ? 0 : ib60Var.hashCode())) * 31);
    }
}
