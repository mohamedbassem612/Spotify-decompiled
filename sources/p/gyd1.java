package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gyd1 {
    public final int a;
    public final int b;
    public final boolean c;

    public gyd1(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyd1)) {
            return false;
        }
        gyd1 gyd1Var = (gyd1) obj;
        return this.a == gyd1Var.a && this.b == gyd1Var.b && this.c == gyd1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
