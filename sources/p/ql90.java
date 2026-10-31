package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ql90 implements sl90 {
    public final int a;
    public final int b;
    public final float c;

    public ql90(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql90)) {
            return false;
        }
        ql90 ql90Var = (ql90) obj;
        return this.a == ql90Var.a && this.b == ql90Var.b && Float.compare(this.c, ql90Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
