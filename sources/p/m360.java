package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m360 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public m360(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m360)) {
            return false;
        }
        m360 m360Var = (m360) obj;
        return this.a == m360Var.a && this.b == m360Var.b && this.c == m360Var.c && this.d == m360Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
