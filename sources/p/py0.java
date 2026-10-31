package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class py0 implements qy0 {
    public final ji0 a;
    public final mr20 b;
    public final mr20 c;

    public py0(ji0 ji0Var, mr20 mr20Var, mr20 mr20Var2) {
        this.a = ji0Var;
        this.b = mr20Var;
        this.c = mr20Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py0)) {
            return false;
        }
        py0 py0Var = (py0) obj;
        return u890.j(this.a, py0Var.a) && this.b.equals(py0Var.b) && this.c.equals(py0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
