package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class l2a0 implements whm0 {
    public final a5a0 a;
    public final boolean b;

    public l2a0(a5a0 a5a0Var, boolean z) {
        this.a = a5a0Var;
        this.b = z;
    }

    public static l2a0 b(l2a0 l2a0Var, a5a0 a5a0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            a5a0Var = l2a0Var.a;
        }
        if ((i & 2) != 0) {
            z = l2a0Var.b;
        }
        l2a0Var.getClass();
        return new l2a0(a5a0Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2a0)) {
            return false;
        }
        l2a0 l2a0Var = (l2a0) obj;
        return u890.j(this.a, l2a0Var.a) && this.b == l2a0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public /* synthetic */ l2a0() {
        this(y4a0.a, false);
    }
}
