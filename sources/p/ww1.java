package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ww1 {
    public final fu1 a;
    public final mj11 b;

    public ww1(fu1 fu1Var, mj11 mj11Var) {
        this.a = fu1Var;
        this.b = mj11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww1)) {
            return false;
        }
        ww1 ww1Var = (ww1) obj;
        return this.a.equals(ww1Var.a) && u890.j(this.b, ww1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
