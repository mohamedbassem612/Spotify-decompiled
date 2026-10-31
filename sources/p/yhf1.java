package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yhf1 {
    public final int a;
    public final int b;
    public final int c;

    public yhf1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhf1)) {
            return false;
        }
        yhf1 yhf1Var = (yhf1) obj;
        return this.a == yhf1Var.a && this.b == yhf1Var.b && this.c == yhf1Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
