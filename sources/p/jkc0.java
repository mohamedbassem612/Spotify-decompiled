package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jkc0 {
    public final f7q0 a;
    public final String b;

    public jkc0(f7q0 f7q0Var, String str) {
        this.a = f7q0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkc0)) {
            return false;
        }
        jkc0 jkc0Var = (jkc0) obj;
        return this.a.equals(jkc0Var.a) && u890.j(this.b, jkc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
