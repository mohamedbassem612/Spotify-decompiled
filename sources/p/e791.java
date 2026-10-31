package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e791 {
    public final g791 a;
    public final String b;
    public final boolean c;
    public final long d;

    public e791(g791 g791Var, String str, boolean z, long j) {
        this.a = g791Var;
        this.b = str;
        this.c = z;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e791)) {
            return false;
        }
        e791 e791Var = (e791) obj;
        return u890.j(this.a, e791Var.a) && u890.j(this.b, e791Var.b) && this.c == e791Var.c && this.d == e791Var.d;
    }

    public final int hashCode() {
        g791 g791Var = this.a;
        int iHashCode = (g791Var == null ? 0 : g791Var.hashCode()) * 31;
        String str = this.b;
        return Long.hashCode(this.d) + xcg1.g((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.c);
    }
}
