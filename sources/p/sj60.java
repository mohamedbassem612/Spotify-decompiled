package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sj60 {
    public final zi60 a;
    public final bh60 b;
    public final int c;
    public final long d;
    public final String e;
    public final h290 f;
    public final boolean g;

    public sj60(zi60 zi60Var, bh60 bh60Var, int i, long j, String str, h290 h290Var, boolean z) {
        this.a = zi60Var;
        this.b = bh60Var;
        this.c = i;
        this.d = j;
        this.e = str;
        this.f = h290Var;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj60)) {
            return false;
        }
        sj60 sj60Var = (sj60) obj;
        return this.a.equals(sj60Var.a) && this.b.equals(sj60Var.b) && this.c == sj60Var.c && this.d == sj60Var.d && this.e.equals(sj60Var.e) && this.f.equals(sj60Var.f) && this.g == sj60Var.g;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = this.c;
        return Boolean.hashCode(this.g) + kk0.g(this.f, cy30.d(cy30.f((iHashCode + (i == 0 ? 0 : l1d.C(i))) * 31, this.d, 961), 31, this.e), 31);
    }
}
