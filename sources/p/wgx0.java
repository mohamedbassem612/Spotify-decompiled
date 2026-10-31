package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wgx0 {
    public final vgx0 a;
    public final iix0 b;

    public wgx0(vgx0 vgx0Var, iix0 iix0Var) {
        this.a = vgx0Var;
        this.b = iix0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgx0)) {
            return false;
        }
        wgx0 wgx0Var = (wgx0) obj;
        return this.a.equals(wgx0Var.a) && this.b.equals(wgx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
