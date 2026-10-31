package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wdg1 {
    public final String a;
    public final iu30 b;

    public wdg1(String str, iu30 iu30Var) {
        this.a = str;
        this.b = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdg1)) {
            return false;
        }
        wdg1 wdg1Var = (wdg1) obj;
        return u890.j(this.a, wdg1Var.a) && u890.j(this.b, wdg1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        iu30 iu30Var = this.b;
        return iHashCode + (iu30Var == null ? 0 : iu30Var.hashCode());
    }
}
