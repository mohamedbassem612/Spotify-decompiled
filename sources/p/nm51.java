package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nm51 {
    public final String a;
    public final boolean b;
    public final xp91 c;
    public final boolean d;
    public final long e;

    public nm51(String str, boolean z, xp91 xp91Var, boolean z2, long j) {
        this.a = str;
        this.b = z;
        this.c = xp91Var;
        this.d = z2;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm51)) {
            return false;
        }
        nm51 nm51Var = (nm51) obj;
        return this.a.equals(nm51Var.a) && this.b == nm51Var.b && this.c.equals(nm51Var.c) && this.d == nm51Var.d && this.e == nm51Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + xcg1.g((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }
}
