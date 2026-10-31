package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t7f implements u7f {
    public final h290 a;
    public final long b;
    public final int c;
    public final int d;

    public t7f(h290 h290Var, long j, int i, int i2) {
        this.a = h290Var;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7f)) {
            return false;
        }
        t7f t7fVar = (t7f) obj;
        return this.a.equals(t7fVar.a) && this.b == t7fVar.b && this.c == t7fVar.c && this.d == t7fVar.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + ab80.k(this.c, cy30.f(this.a.hashCode() * 31, this.b, 31), 31);
    }
}
