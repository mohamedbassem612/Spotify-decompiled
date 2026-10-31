package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wib0 {
    public final rib0 a;
    public final String b;

    public wib0(rib0 rib0Var, String str) {
        this.a = rib0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wib0)) {
            return false;
        }
        wib0 wib0Var = (wib0) obj;
        return this.a.equals(wib0Var.a) && u890.j(this.b, wib0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
