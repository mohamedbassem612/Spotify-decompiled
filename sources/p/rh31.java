package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rh31 {
    public final long a;
    public final float b;
    public final zsc c;
    public final o95 d;

    public rh31(long j, float f, zsc zscVar, o95 o95Var) {
        this.a = j;
        this.b = f;
        this.c = zscVar;
        this.d = o95Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rh31) {
            rh31 rh31Var = (rh31) obj;
            long j = rh31Var.a;
            int i = u7h.l;
            return z4h1.b(this.a, j) && Float.compare(this.b, rh31Var.b) == 0 && this.c == rh31Var.c && this.d == rh31Var.d;
        }
        return false;
    }

    public final int hashCode() {
        int i = u7h.l;
        return this.d.hashCode() + ((this.c.hashCode() + x0d.f(Long.hashCode(this.a) * 31, 31, this.b)) * 31);
    }
}
