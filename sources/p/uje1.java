package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uje1 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public uje1(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uje1)) {
            return false;
        }
        uje1 uje1Var = (uje1) obj;
        return this.a == uje1Var.a && this.b == uje1Var.b && this.c == uje1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
