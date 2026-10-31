package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ovm1 {
    public final nvm1 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public ovm1(nvm1 nvm1Var, boolean z, boolean z2, boolean z3) {
        this.a = nvm1Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovm1)) {
            return false;
        }
        ovm1 ovm1Var = (ovm1) obj;
        return this.a.equals(ovm1Var.a) && this.b == ovm1Var.b && this.c == ovm1Var.c && this.d == ovm1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
