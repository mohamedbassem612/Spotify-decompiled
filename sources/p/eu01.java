package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eu01 extends gu01 {
    public final x360 a;
    public final boolean b;

    public eu01(x360 x360Var, boolean z) {
        this.a = x360Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu01)) {
            return false;
        }
        eu01 eu01Var = (eu01) obj;
        return u890.j(this.a, eu01Var.a) && this.b == eu01Var.b;
    }

    public final int hashCode() {
        x360 x360Var = this.a;
        return Boolean.hashCode(this.b) + ((x360Var == null ? 0 : x360Var.hashCode()) * 31);
    }
}
