package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dp20 {
    public final iys0 a;
    public final String b;

    public dp20(iys0 iys0Var, String str) {
        this.a = iys0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp20)) {
            return false;
        }
        dp20 dp20Var = (dp20) obj;
        return this.a.equals(dp20Var.a) && u890.j(this.b, dp20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
