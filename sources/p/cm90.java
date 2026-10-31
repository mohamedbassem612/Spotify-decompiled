package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cm90 {
    public static final cm90 d = new cm90(0, 0, 0);
    public final int a;
    public final int b;
    public final int c;

    public cm90(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm90)) {
            return false;
        }
        cm90 cm90Var = (cm90) obj;
        return this.a == cm90Var.a && this.b == cm90Var.b && this.c == cm90Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
