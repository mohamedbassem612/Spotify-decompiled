package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yl51 {
    public final String a;
    public final boolean b;
    public final xp91 c;
    public final long d;

    public yl51(String str, boolean z, xp91 xp91Var, long j) {
        this.a = str;
        this.b = z;
        this.c = xp91Var;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl51)) {
            return false;
        }
        yl51 yl51Var = (yl51) obj;
        return this.a.equals(yl51Var.a) && this.b == yl51Var.b && this.c.equals(yl51Var.c) && this.d == yl51Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
