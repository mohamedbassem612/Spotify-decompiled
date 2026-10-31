package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h480 implements i480 {
    public final int a;
    public final int b;
    public final int c;

    public h480(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h480)) {
            return false;
        }
        h480 h480Var = (h480) obj;
        return this.a == h480Var.a && this.b == h480Var.b && this.c == h480Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
