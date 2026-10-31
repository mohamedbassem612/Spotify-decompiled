package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jud1 implements nud1 {
    public final String a;
    public final ct10 b;

    public jud1(String str, ct10 ct10Var) {
        this.a = str;
        this.b = ct10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jud1)) {
            return false;
        }
        jud1 jud1Var = (jud1) obj;
        return u890.j(this.a, jud1Var.a) && this.b.equals(jud1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
