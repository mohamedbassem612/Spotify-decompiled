package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sx00 implements tx00 {
    public final long a;
    public final String b;
    public final ex00 c;
    public final boolean d;
    public final boolean e;
    public final jx00 f;
    public final boolean g;

    public sx00(long j, String str, ex00 ex00Var, boolean z, boolean z2, jx00 jx00Var, boolean z3) {
        this.a = j;
        this.b = str;
        this.c = ex00Var;
        this.d = z;
        this.e = z2;
        this.f = jx00Var;
        this.g = z3;
    }

    public static sx00 b(sx00 sx00Var, long j, String str, ex00 ex00Var, boolean z, boolean z2, jx00 jx00Var, boolean z3, int i) {
        if ((i & 1) != 0) {
            j = sx00Var.a;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = sx00Var.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            ex00Var = sx00Var.c;
        }
        ex00 ex00Var2 = ex00Var;
        if ((i & 8) != 0) {
            z = sx00Var.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = sx00Var.e;
        }
        return new sx00(j2, str2, ex00Var2, z4, z2, (i & 32) != 0 ? sx00Var.f : jx00Var, (i & 64) != 0 ? sx00Var.g : z3);
    }

    public final ex00 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx00)) {
            return false;
        }
        sx00 sx00Var = (sx00) obj;
        return this.a == sx00Var.a && u890.j(this.b, sx00Var.b) && u890.j(this.c, sx00Var.c) && this.d == sx00Var.d && this.e == sx00Var.e && this.f == sx00Var.f && this.g == sx00Var.g;
    }

    public final String getEntityUri() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + xcg1.g(xcg1.g((this.c.hashCode() + cy30.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e)) * 31);
    }

    public /* synthetic */ sx00(long j, String str, ex00 ex00Var, boolean z) {
        this(j, str, ex00Var, z, false, jx00.a, false);
    }
}
