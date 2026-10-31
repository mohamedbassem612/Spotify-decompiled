package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jfd0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public jfd0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfd0)) {
            return false;
        }
        jfd0 jfd0Var = (jfd0) obj;
        return this.a == jfd0Var.a && this.b == jfd0Var.b && this.c == jfd0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
