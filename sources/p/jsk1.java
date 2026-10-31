package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jsk1 implements qsk1 {
    public final String a;
    public final xl61 b;

    public jsk1(String str, xl61 xl61Var) {
        this.a = str;
        this.b = xl61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsk1)) {
            return false;
        }
        jsk1 jsk1Var = (jsk1) obj;
        return u890.j(this.a, jsk1Var.a) && this.b.equals(jsk1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
