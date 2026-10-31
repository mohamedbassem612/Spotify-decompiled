package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xoy0 implements yoy0 {
    public final int a;
    public final int b;
    public final int c;

    public xoy0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoy0)) {
            return false;
        }
        xoy0 xoy0Var = (xoy0) obj;
        return this.a == xoy0Var.a && this.b == xoy0Var.b && this.c == xoy0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
