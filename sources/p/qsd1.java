package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qsd1 implements tsd1 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public qsd1(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsd1)) {
            return false;
        }
        qsd1 qsd1Var = (qsd1) obj;
        return this.a == qsd1Var.a && this.b == qsd1Var.b && this.c == qsd1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
