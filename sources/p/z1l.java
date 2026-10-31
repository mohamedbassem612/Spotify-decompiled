package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z1l implements c2l {
    public final f0u a;
    public final boolean b;
    public final xvd1 c;
    public final int d;

    public z1l(f0u f0uVar, boolean z, xvd1 xvd1Var, int i) {
        this.a = f0uVar;
        this.b = z;
        this.c = xvd1Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1l)) {
            return false;
        }
        z1l z1lVar = (z1l) obj;
        return this.a == z1lVar.a && this.b == z1lVar.b && this.c == z1lVar.c && this.d == z1lVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31;
        int i = this.d;
        return iHashCode + (i == 0 ? 0 : l1d.C(i));
    }
}
