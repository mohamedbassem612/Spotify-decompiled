package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qsy0 extends rsy0 {
    public final m560 a;
    public final boolean b;

    public qsy0(m560 m560Var, boolean z) {
        this.a = m560Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsy0)) {
            return false;
        }
        qsy0 qsy0Var = (qsy0) obj;
        return u890.j(this.a, qsy0Var.a) && this.b == qsy0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
