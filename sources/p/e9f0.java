package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e9f0 {
    public final int a;
    public final ivb1 b;
    public final c380 c;
    public final int d;

    public e9f0(int i, ivb1 ivb1Var, c380 c380Var, int i2) {
        this.a = i;
        this.b = ivb1Var;
        this.c = c380Var;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9f0)) {
            return false;
        }
        e9f0 e9f0Var = (e9f0) obj;
        return this.a == e9f0Var.a && u890.j(this.b, e9f0Var.b) && u890.j(this.c, e9f0Var.c) && this.d == e9f0Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + kk0.f(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31);
    }
}
