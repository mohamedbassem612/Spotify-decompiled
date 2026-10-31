package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tk20 {
    public final String a;
    public final sk20 b;

    public tk20(String str, sk20 sk20Var) {
        this.a = str;
        this.b = sk20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk20)) {
            return false;
        }
        tk20 tk20Var = (tk20) obj;
        return u890.j(this.a, tk20Var.a) && this.b == tk20Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
