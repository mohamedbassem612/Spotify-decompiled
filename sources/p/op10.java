package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class op10 implements sp10 {
    public final String a;
    public final eo10 b;

    public op10(String str, eo10 eo10Var) {
        this.a = str;
        this.b = eo10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op10)) {
            return false;
        }
        op10 op10Var = (op10) obj;
        return this.a.equals(op10Var.a) && this.b.equals(op10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
