package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mg80 implements og80 {
    public final at80 a;
    public final md80 b;
    public final md80 c;

    public mg80(at80 at80Var, md80 md80Var, md80 md80Var2) {
        this.a = at80Var;
        this.b = md80Var;
        this.c = md80Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg80)) {
            return false;
        }
        mg80 mg80Var = (mg80) obj;
        return this.a == mg80Var.a && this.b == mg80Var.b && this.c == mg80Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
