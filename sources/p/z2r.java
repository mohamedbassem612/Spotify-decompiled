package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z2r {
    public final y2r a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public z2r(y2r y2rVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = y2rVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2r)) {
            return false;
        }
        z2r z2rVar = (z2r) obj;
        return this.a.equals(z2rVar.a) && this.b == z2rVar.b && this.c == z2rVar.c && this.d == z2rVar.d && this.e == z2rVar.e && this.f == z2rVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
