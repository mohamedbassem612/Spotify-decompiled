package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class reg1 {
    public final int a;
    public final int b;
    public final int c;

    public reg1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof reg1)) {
            return false;
        }
        reg1 reg1Var = (reg1) obj;
        return this.a == reg1Var.a && this.b == reg1Var.b && this.c == reg1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(8388611) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
