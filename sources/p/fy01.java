package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fy01 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final p111 d;

    public fy01(int i, boolean z, boolean z2, p111 p111Var) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = p111Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy01)) {
            return false;
        }
        fy01 fy01Var = (fy01) obj;
        return this.a == fy01Var.a && this.b == fy01Var.b && this.c == fy01Var.c && this.d.equals(fy01Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(xcg1.g(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
