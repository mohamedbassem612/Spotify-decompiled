package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y6d1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public y6d1(String str, boolean z, String str2, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public static y6d1 a(y6d1 y6d1Var, boolean z) {
        String str = y6d1Var.a;
        String str2 = y6d1Var.b;
        boolean z2 = y6d1Var.c;
        y6d1Var.getClass();
        return new y6d1(str, z2, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6d1)) {
            return false;
        }
        y6d1 y6d1Var = (y6d1) obj;
        return this.a.equals(y6d1Var.a) && this.b.equals(y6d1Var.b) && this.c == y6d1Var.c && this.d == y6d1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
