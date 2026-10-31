package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wc11 implements qq60 {
    public final String a;
    public final op80 b;
    public final cd11 c;
    public final x360 d;

    public wc11(String str, op80 op80Var, cd11 cd11Var, x360 x360Var) {
        this.a = str;
        this.b = op80Var;
        this.c = cd11Var;
        this.d = x360Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc11)) {
            return false;
        }
        wc11 wc11Var = (wc11) obj;
        return this.a.equals(wc11Var.a) && this.b.equals(wc11Var.b) && this.c.equals(wc11Var.c) && u890.j(this.d, wc11Var.d);
    }

    @Override // p.qq60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + x0d.i(this.b, this.a.hashCode() * 31, 31)) * 31;
        x360 x360Var = this.d;
        return iHashCode + (x360Var == null ? 0 : x360Var.hashCode());
    }
}
