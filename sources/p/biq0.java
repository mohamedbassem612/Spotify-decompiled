package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class biq0 {
    public final String a;
    public final int b;
    public final byte c;
    public final byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public biq0(int i, int i2, int i3, String str) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof biq0)) {
            return false;
        }
        biq0 biq0Var = (biq0) obj;
        return this.a.equals(biq0Var.a) && this.b == biq0Var.b && this.c == biq0Var.c && this.d == biq0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, ab80.k(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
