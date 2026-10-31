package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class flh implements hlh {
    public final int a;
    public final boolean b;
    public final pkh c;
    public final int d;
    public final sn51 e;

    public flh(int i, boolean z, pkh pkhVar, int i2, sn51 sn51Var) {
        this.a = i;
        this.b = z;
        this.c = pkhVar;
        this.d = i2;
        this.e = sn51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flh)) {
            return false;
        }
        flh flhVar = (flh) obj;
        return this.a == flhVar.a && this.b == flhVar.b && this.c.equals(flhVar.c) && this.d == flhVar.d && this.e.equals(flhVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kaa0.f(this.d, (this.c.hashCode() + xcg1.g(Integer.hashCode(this.a) * 31, 31, this.b)) * 31, 31);
    }
}
