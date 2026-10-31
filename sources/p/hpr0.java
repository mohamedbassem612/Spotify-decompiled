package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hpr0 {
    public final int a;
    public final int b;
    public final ipr0 c;

    public hpr0(int i, int i2, ipr0 ipr0Var) {
        this.a = i;
        this.b = i2;
        this.c = ipr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpr0)) {
            return false;
        }
        hpr0 hpr0Var = (hpr0) obj;
        return this.a == hpr0Var.a && this.b == hpr0Var.b && u890.j(this.c, hpr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
