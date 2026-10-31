package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y5x0 extends q6x0 {
    public final boolean a;
    public final String b;

    public y5x0(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5x0)) {
            return false;
        }
        y5x0 y5x0Var = (y5x0) obj;
        return this.a == y5x0Var.a && u890.j(this.b, y5x0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
