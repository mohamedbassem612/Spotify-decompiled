package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qkk1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public qkk1(int i, int i2, int i3, int i4, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkk1)) {
            return false;
        }
        qkk1 qkk1Var = (qkk1) obj;
        return this.a == qkk1Var.a && this.b == qkk1Var.b && this.c == qkk1Var.c && this.d == qkk1Var.d && Float.compare(this.e, qkk1Var.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + kaa0.f(this.d, kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }
}
