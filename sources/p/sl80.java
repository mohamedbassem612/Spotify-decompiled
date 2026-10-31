package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sl80 implements tl80 {
    public final String a;
    public final int b;

    public sl80(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl80)) {
            return false;
        }
        sl80 sl80Var = (sl80) obj;
        return u890.j(this.a, sl80Var.a) && this.b == sl80Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.b;
        return iHashCode + (i == 0 ? 0 : l1d.C(i));
    }
}
