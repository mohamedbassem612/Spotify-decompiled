package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mt51 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public mt51(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt51)) {
            return false;
        }
        mt51 mt51Var = (mt51) obj;
        return this.a == mt51Var.a && this.b == mt51Var.b && this.c == mt51Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
