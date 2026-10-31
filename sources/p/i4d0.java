package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i4d0 {
    public final int a;
    public final int b;
    public final int c;

    public i4d0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4d0)) {
            return false;
        }
        i4d0 i4d0Var = (i4d0) obj;
        return this.a == i4d0Var.a && this.b == i4d0Var.b && this.c == i4d0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
