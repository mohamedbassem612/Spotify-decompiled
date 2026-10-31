package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sxe0 implements w11 {
    public final r341 a;
    public final String b;
    public final String c;
    public final int d;

    public sxe0(r341 r341Var, String str, String str2, int i) {
        this.a = r341Var;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxe0)) {
            return false;
        }
        sxe0 sxe0Var = (sxe0) obj;
        return this.a.equals(sxe0Var.a) && this.b.equals(sxe0Var.b) && u890.j(this.c, sxe0Var.c) && this.d == sxe0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
