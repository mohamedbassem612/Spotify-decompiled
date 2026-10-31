package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jn11 extends pn11 {
    public final int a;
    public final String b;
    public final String c;
    public final in11 d;

    public jn11(int i, String str, String str2, in11 in11Var) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = in11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn11)) {
            return false;
        }
        jn11 jn11Var = (jn11) obj;
        return this.a == jn11Var.a && this.b.equals(jn11Var.b) && this.c.equals(jn11Var.c) && this.d == jn11Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
