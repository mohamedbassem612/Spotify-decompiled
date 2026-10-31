package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wqv {
    public final py21 a;
    public final boolean b;
    public final ibk0 c;
    public final boolean d;

    public wqv(py21 py21Var, boolean z, ibk0 ibk0Var, boolean z2) {
        this.a = py21Var;
        this.b = z;
        this.c = ibk0Var;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqv)) {
            return false;
        }
        wqv wqvVar = (wqv) obj;
        return u890.j(this.a, wqvVar.a) && this.b == wqvVar.b && u890.j(this.c, wqvVar.c) && this.d == wqvVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
