package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jt10 implements st10 {
    public final uv10 a;
    public final String b;

    public jt10(uv10 uv10Var, String str) {
        this.a = uv10Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt10)) {
            return false;
        }
        jt10 jt10Var = (jt10) obj;
        return this.a.equals(jt10Var.a) && u890.j(this.b, jt10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
