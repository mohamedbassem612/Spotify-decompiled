package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pay0 {
    public final String a;
    public final u771 b;

    public pay0(String str, u771 u771Var) {
        this.a = str;
        this.b = u771Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pay0)) {
            return false;
        }
        pay0 pay0Var = (pay0) obj;
        return u890.j(this.a, pay0Var.a) && u890.j(this.b, pay0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
