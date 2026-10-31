package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v3s0 implements x3s0 {
    public final y6b1 a;
    public final long b;
    public final long c;
    public final String d;

    public v3s0(y6b1 y6b1Var, long j, long j2, String str) {
        this.a = y6b1Var;
        this.b = j;
        this.c = j2;
        this.d = str;
    }

    public final long a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3s0)) {
            return false;
        }
        v3s0 v3s0Var = (v3s0) obj;
        return this.a.equals(v3s0Var.a) && this.b == v3s0Var.b && this.c == v3s0Var.c && u890.j(this.d, v3s0Var.d);
    }

    public final String getEventId() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }
}
