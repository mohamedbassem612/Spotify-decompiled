package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sh81 {
    public final float a;
    public final int b;
    public final int c;

    public sh81(int i, int i2, float f) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh81)) {
            return false;
        }
        sh81 sh81Var = (sh81) obj;
        return Float.compare(this.a, sh81Var.a) == 0 && this.b == sh81Var.b && this.c == sh81Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Float.hashCode(this.a) * 31, 31);
    }
}
