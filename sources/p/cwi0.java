package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cwi0 extends ewi0 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final svi0 e;
    public final bwi0 f;

    public cwi0(String str, String str2, long j, long j2, svi0 svi0Var, bwi0 bwi0Var) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = svi0Var;
        this.f = bwi0Var;
    }

    public static cwi0 c(cwi0 cwi0Var, String str, long j, long j2, int i) {
        String str2 = cwi0Var.a;
        if ((i & 2) != 0) {
            str = cwi0Var.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            j = cwi0Var.c;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = cwi0Var.d;
        }
        return new cwi0(str2, str3, j3, j2, cwi0Var.e, cwi0Var.f);
    }

    public final String a() {
        return this.a;
    }

    public final svi0 b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwi0)) {
            return false;
        }
        cwi0 cwi0Var = (cwi0) obj;
        return u890.j(this.a, cwi0Var.a) && this.b.equals(cwi0Var.b) && this.c == cwi0Var.c && this.d == cwi0Var.d && u890.j(this.e, cwi0Var.e) && u890.j(this.f, cwi0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + cy30.f(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31)) * 31;
        bwi0 bwi0Var = this.f;
        return iHashCode + (bwi0Var == null ? 0 : bwi0Var.hashCode());
    }
}
