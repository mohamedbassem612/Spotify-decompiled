package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yh1 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final sg90 e;

    public yh1(String str, String str2, long j, long j2, sg90 sg90Var) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = sg90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh1)) {
            return false;
        }
        yh1 yh1Var = (yh1) obj;
        return u890.j(this.a, yh1Var.a) && u890.j(this.b, yh1Var.b) && this.c == yh1Var.c && this.d == yh1Var.d && u890.j(this.e, yh1Var.e);
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31);
        sg90 sg90Var = this.e;
        return iF + (sg90Var == null ? 0 : sg90Var.hashCode());
    }
}
