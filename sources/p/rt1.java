package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rt1 {
    public final int a;
    public final int b;
    public final int c;

    public rt1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt1)) {
            return false;
        }
        rt1 rt1Var = (rt1) obj;
        return this.a == rt1Var.a && this.b == rt1Var.b && this.c == rt1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
