package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xtw0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public xtw0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtw0)) {
            return false;
        }
        xtw0 xtw0Var = (xtw0) obj;
        return this.a == xtw0Var.a && this.b == xtw0Var.b && this.c == xtw0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
