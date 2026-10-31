package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class az90 implements cz90 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public az90(String str, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az90)) {
            return false;
        }
        az90 az90Var = (az90) obj;
        return u890.j(this.a, az90Var.a) && this.b == az90Var.b && this.c == az90Var.c && this.d == az90Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
