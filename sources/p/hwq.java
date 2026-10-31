package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hwq {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final dwq e;
    public final d811 f;
    public final l7e0 g;

    public hwq(int i, boolean z, boolean z2, boolean z3, dwq dwqVar, d811 d811Var, l7e0 l7e0Var) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = dwqVar;
        this.f = d811Var;
        this.g = l7e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwq)) {
            return false;
        }
        hwq hwqVar = (hwq) obj;
        return this.a == hwqVar.a && this.b == hwqVar.b && this.c == hwqVar.c && this.d == hwqVar.d && u890.j(this.e, hwqVar.e) && u890.j(this.f, hwqVar.f) && this.g.equals(hwqVar.g);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        dwq dwqVar = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((iG + (dwqVar == null ? 0 : dwqVar.hashCode())) * 31)) * 31);
    }
}
