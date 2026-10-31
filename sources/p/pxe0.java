package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pxe0 implements w11 {
    public final zxo1 a;
    public final uxe0 b;
    public final w01 c;

    public pxe0(zxo1 zxo1Var, uxe0 uxe0Var, w01 w01Var) {
        this.a = zxo1Var;
        this.b = uxe0Var;
        this.c = w01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxe0)) {
            return false;
        }
        pxe0 pxe0Var = (pxe0) obj;
        return u890.j(this.a, pxe0Var.a) && u890.j(this.b, pxe0Var.b) && u890.j(this.c, pxe0Var.c);
    }

    public final int hashCode() {
        zxo1 zxo1Var = this.a;
        int iHashCode = (zxo1Var == null ? 0 : zxo1Var.hashCode()) * 31;
        uxe0 uxe0Var = this.b;
        int iHashCode2 = (iHashCode + (uxe0Var == null ? 0 : uxe0Var.hashCode())) * 31;
        w01 w01Var = this.c;
        return iHashCode2 + (w01Var != null ? w01Var.hashCode() : 0);
    }
}
