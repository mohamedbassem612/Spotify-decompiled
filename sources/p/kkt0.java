package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kkt0 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;

    public kkt0(long j, long j2, long j3, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    public static kkt0 a(kkt0 kkt0Var, long j) {
        String str = kkt0Var.a;
        String str2 = kkt0Var.b;
        long j2 = kkt0Var.c;
        long j3 = kkt0Var.e;
        kkt0Var.getClass();
        return new kkt0(j2, j, j3, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkt0)) {
            return false;
        }
        kkt0 kkt0Var = (kkt0) obj;
        return u890.j(this.a, kkt0Var.a) && u890.j(this.b, kkt0Var.b) && this.c == kkt0Var.c && this.d == kkt0Var.d && this.e == kkt0Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + cy30.f(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31);
    }
}
