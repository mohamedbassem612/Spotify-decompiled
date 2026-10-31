package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rkh {
    public final c380 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public rkh(c380 c380Var, boolean z, boolean z2, boolean z3, int i) {
        this.a = c380Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkh)) {
            return false;
        }
        rkh rkhVar = (rkh) obj;
        return u890.j(this.a, rkhVar.a) && this.b == rkhVar.b && this.c == rkhVar.c && this.d == rkhVar.d && this.e == rkhVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
