package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y1l implements c2l {
    public final f0u a;
    public final boolean b;
    public final xvd1 c;
    public final boolean d;
    public final kpy0 e;
    public final int f;

    public y1l(f0u f0uVar, boolean z, xvd1 xvd1Var, boolean z2, kpy0 kpy0Var, int i) {
        this.a = f0uVar;
        this.b = z;
        this.c = xvd1Var;
        this.d = z2;
        this.e = kpy0Var;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1l)) {
            return false;
        }
        y1l y1lVar = (y1l) obj;
        return this.a == y1lVar.a && this.b == y1lVar.b && this.c == y1lVar.c && this.d == y1lVar.d && this.e == y1lVar.e && this.f == y1lVar.f;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + xcg1.g(xcg1.g((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31, 31, false), 31, this.d)) * 31;
        int i = this.f;
        return iHashCode + (i != 0 ? l1d.C(i) : 0);
    }
}
