package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jej1 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;
    public final String j;
    public final m4m k;
    public final boolean l;
    public final String m;

    public jej1(boolean z, String str, String str2, String str3, String str4, long j, long j2, String str5, int i, String str6, m4m m4mVar, boolean z2, String str7) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j;
        this.g = j2;
        this.h = str5;
        this.i = i;
        this.j = str6;
        this.k = m4mVar;
        this.l = z2;
        this.m = str7;
    }

    public static jej1 a(jej1 jej1Var, int i) {
        boolean z = jej1Var.a;
        String str = jej1Var.b;
        String str2 = jej1Var.c;
        String str3 = jej1Var.d;
        String str4 = jej1Var.e;
        long j = jej1Var.f;
        long j2 = jej1Var.g;
        String str5 = jej1Var.h;
        jej1Var.getClass();
        String str6 = jej1Var.j;
        m4m m4mVar = jej1Var.k;
        boolean z2 = jej1Var.l;
        String str7 = jej1Var.m;
        jej1Var.getClass();
        return new jej1(z, str, str2, str3, str4, j, j2, str5, i, str6, m4mVar, z2, str7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jej1)) {
            return false;
        }
        jej1 jej1Var = (jej1) obj;
        return this.a == jej1Var.a && u890.j(this.b, jej1Var.b) && u890.j(this.c, jej1Var.c) && u890.j(this.d, jej1Var.d) && u890.j(this.e, jej1Var.e) && this.f == jej1Var.f && this.g == jej1Var.g && u890.j(this.h, jej1Var.h) && this.i == jej1Var.i && u890.j(this.j, jej1Var.j) && this.k == jej1Var.k && this.l == jej1Var.l && this.m.equals(jej1Var.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + xcg1.g((this.k.hashCode() + cy30.d(ab80.k(this.i, cy30.f(cy30.d(cy30.f(cy30.f(cy30.d(cy30.d(cy30.d(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31), this.g, 31), 31, this.h), 0L, 31), 31), 31, this.j)) * 31, 31, this.l);
    }
}
