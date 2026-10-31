package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nyn0 {
    public final son0 a;
    public final boolean b;
    public final boolean c;
    public final faa0 d;

    public nyn0(son0 son0Var, boolean z, boolean z2, faa0 faa0Var) {
        this.a = son0Var;
        this.b = z;
        this.c = z2;
        this.d = faa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyn0)) {
            return false;
        }
        nyn0 nyn0Var = (nyn0) obj;
        return this.a.equals(nyn0Var.a) && this.b == nyn0Var.b && this.c == nyn0Var.c && u890.j(this.d, nyn0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(xcg1.g(this.a.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
