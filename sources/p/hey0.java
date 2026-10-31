package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hey0 {
    public final i281 a;
    public final boolean b;
    public final int c;
    public final c861 d;

    public hey0(i281 i281Var, boolean z, int i, c861 c861Var) {
        this.a = i281Var;
        this.b = z;
        this.c = i;
        this.d = c861Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hey0) {
            hey0 hey0Var = (hey0) obj;
            return this.a.equals(hey0Var.a) && this.b == hey0Var.b && this.c == hey0Var.c && this.d == hey0Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
