package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ipj0 {
    public final long a;
    public final long b;
    public final mpj0 c;
    public final String d;

    public ipj0(long j, long j2, mpj0 mpj0Var, String str) {
        this.a = j;
        this.b = j2;
        this.c = mpj0Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipj0)) {
            return false;
        }
        ipj0 ipj0Var = (ipj0) obj;
        return this.a == ipj0Var.a && this.b == ipj0Var.b && this.c.equals(ipj0Var.c) && u890.j(this.d, ipj0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.f(Long.hashCode(this.a) * 31, this.b, 31)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
