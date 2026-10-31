package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class clk extends vlk {
    public final ma00 a;

    public clk(ma00 ma00Var) {
        this.a = ma00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof clk) && u890.j(this.a, ((clk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
