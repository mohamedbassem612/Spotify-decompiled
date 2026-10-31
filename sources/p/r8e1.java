package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r8e1 {
    public final int a;
    public final int b;
    public final id01 c;

    public r8e1(int i, int i2, id01 id01Var) {
        this.a = i;
        this.b = i2;
        this.c = id01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8e1)) {
            return false;
        }
        r8e1 r8e1Var = (r8e1) obj;
        return this.a == r8e1Var.a && this.b == r8e1Var.b && this.c == r8e1Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
