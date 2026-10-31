package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fyd1 {
    public final int a;
    public final int b;
    public final boolean c;

    public fyd1(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyd1)) {
            return false;
        }
        fyd1 fyd1Var = (fyd1) obj;
        return this.a == fyd1Var.a && this.b == fyd1Var.b && this.c == fyd1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public /* synthetic */ fyd1(int i, int i2) {
        this(i, i2, false);
    }
}
