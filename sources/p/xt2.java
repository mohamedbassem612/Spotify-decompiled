package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xt2 {
    public final int a;
    public final int b;
    public final boolean c;
    public final float d;

    public xt2(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = (float) Math.atan2(i2 - 1.5f, i - 1.5f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt2)) {
            return false;
        }
        xt2 xt2Var = (xt2) obj;
        return this.a == xt2Var.a && this.b == xt2Var.b && this.c == xt2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
