package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b3q0 {
    public final boolean a;
    public final int b;
    public final int c;

    public b3q0(boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3q0)) {
            return false;
        }
        b3q0 b3q0Var = (b3q0) obj;
        return this.a == b3q0Var.a && this.b == b3q0Var.b && this.c == b3q0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Boolean.hashCode(this.a) * 31, 31);
    }
}
