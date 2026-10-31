package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rb01 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public rb01(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb01)) {
            return false;
        }
        rb01 rb01Var = (rb01) obj;
        return this.a == rb01Var.a && this.b == rb01Var.b && this.c == rb01Var.c && this.d == rb01Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
