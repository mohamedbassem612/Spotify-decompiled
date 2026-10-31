package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tah0 {
    public final String a;
    public final o091 b;
    public final long c;
    public final long d;

    public /* synthetic */ tah0(String str, int i) {
        this((i & 1) != 0 ? null : str, null, 0L, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tah0)) {
            return false;
        }
        tah0 tah0Var = (tah0) obj;
        return u890.j(this.a, tah0Var.a) && u890.j(this.b, tah0Var.b) && this.c == tah0Var.c && this.d == tah0Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        o091 o091Var = this.b;
        return Long.hashCode(this.d) + cy30.f((iHashCode + (o091Var != null ? o091Var.hashCode() : 0)) * 31, this.c, 31);
    }

    public tah0(String str, o091 o091Var, long j, long j2) {
        this.a = str;
        this.b = o091Var;
        this.c = j;
        this.d = j2;
    }
}
