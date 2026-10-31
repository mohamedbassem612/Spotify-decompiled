package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ct10 {
    public final String a;
    public final String b;
    public final long c;
    public final boolean d;
    public final boolean e;

    public ct10(String str, String str2, long j, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = z;
        this.e = z2;
    }

    public static ct10 a(ct10 ct10Var, String str, long j, boolean z, int i) {
        String str2 = ct10Var.a;
        if ((i & 2) != 0) {
            str = ct10Var.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            j = ct10Var.c;
        }
        return new ct10(str2, str3, j, z, ct10Var.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct10)) {
            return false;
        }
        ct10 ct10Var = (ct10) obj;
        return this.a.equals(ct10Var.a) && u890.j(this.b, ct10Var.b) && this.c == ct10Var.c && this.d == ct10Var.d && this.e == ct10Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), 31, this.d);
    }
}
