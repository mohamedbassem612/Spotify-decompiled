package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jcg1 {
    public final String a;
    public final tr80 b;
    public final n5f0 c;
    public final int d;

    public jcg1(String str, tr80 tr80Var, n5f0 n5f0Var, int i) {
        this.a = str;
        this.b = tr80Var;
        this.c = n5f0Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcg1)) {
            return false;
        }
        jcg1 jcg1Var = (jcg1) obj;
        return this.a.equals(jcg1Var.a) && this.b.equals(jcg1Var.b) && this.c.equals(jcg1Var.c) && this.d == jcg1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + lf51.e(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
