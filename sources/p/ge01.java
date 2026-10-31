package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ge01 {
    public final boolean a;
    public final int b;
    public final int c;

    public ge01(boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge01)) {
            return false;
        }
        ge01 ge01Var = (ge01) obj;
        return this.a == ge01Var.a && this.b == ge01Var.b && this.c == ge01Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Boolean.hashCode(this.a) * 31, 31);
    }
}
