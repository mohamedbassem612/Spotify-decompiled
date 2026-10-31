package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qld0 {
    public final l3s0 a;
    public final String b;

    public qld0(l3s0 l3s0Var, String str) {
        this.a = l3s0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qld0)) {
            return false;
        }
        qld0 qld0Var = (qld0) obj;
        return u890.j(this.a, qld0Var.a) && u890.j(this.b, qld0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
