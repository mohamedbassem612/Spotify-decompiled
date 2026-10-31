package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class afa0 {
    public final String a;
    public final b0s0 b;
    public final fj70 c;

    public afa0(String str, b0s0 b0s0Var, fj70 fj70Var) {
        this.a = str;
        this.b = b0s0Var;
        this.c = fj70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afa0)) {
            return false;
        }
        afa0 afa0Var = (afa0) obj;
        return this.a.equals(afa0Var.a) && this.b.equals(afa0Var.b) && u890.j(this.c, afa0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
