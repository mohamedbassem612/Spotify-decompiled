package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qrg1 {
    public static final qrg1 e = new qrg1(false, false, false, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public qrg1(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrg1)) {
            return false;
        }
        qrg1 qrg1Var = (qrg1) obj;
        return this.a == qrg1Var.a && this.b == qrg1Var.b && this.c == qrg1Var.c && this.d == qrg1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
