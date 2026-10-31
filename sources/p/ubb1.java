package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ubb1 {
    public final Boolean a;
    public final boolean b;
    public final boolean c;
    public final nbb1 d;

    public ubb1(Boolean bool, boolean z, boolean z2, nbb1 nbb1Var) {
        this.a = bool;
        this.b = z;
        this.c = z2;
        this.d = nbb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubb1)) {
            return false;
        }
        ubb1 ubb1Var = (ubb1) obj;
        return u890.j(this.a, ubb1Var.a) && this.b == ubb1Var.b && this.c == ubb1Var.c && this.d.equals(ubb1Var.d);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        return this.d.hashCode() + xcg1.g(xcg1.g((bool == null ? 0 : bool.hashCode()) * 31, 31, this.b), 31, this.c);
    }
}
