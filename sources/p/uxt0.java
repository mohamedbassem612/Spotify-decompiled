package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uxt0 implements zxt0 {
    public final y6b1 a;
    public final long b;
    public final long c;
    public final String d;

    public uxt0(y6b1 y6b1Var, long j, long j2, String str) {
        this.a = y6b1Var;
        this.b = j;
        this.c = j2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxt0)) {
            return false;
        }
        uxt0 uxt0Var = (uxt0) obj;
        return this.a.equals(uxt0Var.a) && this.b == uxt0Var.b && this.c == uxt0Var.c && u890.j(this.d, uxt0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }
}
