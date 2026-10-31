package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lxe0 implements w11 {
    public final fww a;
    public final String b;
    public final String c;
    public final int d;

    public lxe0(fww fwwVar, String str, String str2, int i) {
        this.a = fwwVar;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxe0)) {
            return false;
        }
        lxe0 lxe0Var = (lxe0) obj;
        return this.a.equals(lxe0Var.a) && this.b.equals(lxe0Var.b) && u890.j(this.c, lxe0Var.c) && this.d == lxe0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
