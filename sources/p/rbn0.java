package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rbn0 {
    public final String a;
    public final boolean b;
    public final pbn0 c;

    public rbn0(String str, boolean z, pbn0 pbn0Var) {
        this.a = str;
        this.b = z;
        this.c = pbn0Var;
    }

    public static rbn0 a(rbn0 rbn0Var, boolean z, pbn0 pbn0Var, int i) {
        String str = rbn0Var.a;
        if ((i & 2) != 0) {
            z = rbn0Var.b;
        }
        if ((i & 4) != 0) {
            pbn0Var = rbn0Var.c;
        }
        return new rbn0(str, z, pbn0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbn0)) {
            return false;
        }
        rbn0 rbn0Var = (rbn0) obj;
        return u890.j(this.a, rbn0Var.a) && this.b == rbn0Var.b && u890.j(this.c, rbn0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }

    public /* synthetic */ rbn0(String str, boolean z) {
        this(str, z, obn0.a);
    }
}
