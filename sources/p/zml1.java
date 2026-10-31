package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zml1 {
    public final byte a;
    public final short b;
    public final int c;
    public final byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public zml1(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zml1)) {
            return false;
        }
        zml1 zml1Var = (zml1) obj;
        return this.a == zml1Var.a && this.b == zml1Var.b && this.c == zml1Var.c && this.d == zml1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
