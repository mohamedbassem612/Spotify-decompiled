package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mjb0 {
    public final ji0 a;
    public final String b;

    public mjb0(String str, ji0 ji0Var) {
        this.a = ji0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjb0)) {
            return false;
        }
        mjb0 mjb0Var = (mjb0) obj;
        return u890.j(this.a, mjb0Var.a) && this.b.equals(mjb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
