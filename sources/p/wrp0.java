package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wrp0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public wrp0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrp0)) {
            return false;
        }
        wrp0 wrp0Var = (wrp0) obj;
        return this.a == wrp0Var.a && this.b == wrp0Var.b && this.c == wrp0Var.c && this.d == wrp0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
