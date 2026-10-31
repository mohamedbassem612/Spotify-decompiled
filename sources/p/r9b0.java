package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r9b0 {
    public static final a1i c = new a1i(k9b0.t, gsh.Y);
    public final int a;
    public final Boolean b;

    public r9b0(int i, int i2) {
        Boolean bool = (i2 & 4) != 0 ? null : Boolean.TRUE;
        this.a = i;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9b0)) {
            return false;
        }
        r9b0 r9b0Var = (r9b0) obj;
        return this.a == r9b0Var.a && u890.j(this.b, r9b0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 961;
        Boolean bool = this.b;
        return (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
    }
}
