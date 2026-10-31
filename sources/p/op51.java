package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class op51 {
    public final String a;
    public final int b;

    public op51(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op51)) {
            return false;
        }
        op51 op51Var = (op51) obj;
        return u890.j(this.a, op51Var.a) && this.b == op51Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
