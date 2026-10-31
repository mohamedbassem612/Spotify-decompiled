package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ubg {
    public final lbg a;
    public final boolean b;

    public ubg(lbg lbgVar, boolean z) {
        this.a = lbgVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubg)) {
            return false;
        }
        ubg ubgVar = (ubg) obj;
        return u890.j(this.a, ubgVar.a) && this.b == ubgVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
