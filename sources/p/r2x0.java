package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r2x0 extends z2x0 {
    public final boolean a;
    public final String b;

    public r2x0(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2x0)) {
            return false;
        }
        r2x0 r2x0Var = (r2x0) obj;
        return this.a == r2x0Var.a && u890.j(this.b, r2x0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
