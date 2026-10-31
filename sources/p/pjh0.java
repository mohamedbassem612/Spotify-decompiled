package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pjh0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;

    public pjh0(int i, int i2, int i3, long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjh0)) {
            return false;
        }
        pjh0 pjh0Var = (pjh0) obj;
        return u890.j(this.a, pjh0Var.a) && u890.j(this.b, pjh0Var.b) && this.c == pjh0Var.c && this.d == pjh0Var.d && this.e == pjh0Var.e && this.f == pjh0Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + kaa0.f(this.e, kaa0.f(this.d, ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31);
    }
}
