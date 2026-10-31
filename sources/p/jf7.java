package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jf7 implements xf7 {
    public final hi90 a;
    public final tv80 b;

    public jf7(hi90 hi90Var, tv80 tv80Var) {
        this.a = hi90Var;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf7)) {
            return false;
        }
        jf7 jf7Var = (jf7) obj;
        return this.a.equals(jf7Var.a) && u890.j(this.b, jf7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
