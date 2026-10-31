package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jzr0 {
    public final fr2 a;
    public final dr2 b;
    public final String c;

    public jzr0(fr2 fr2Var, dr2 dr2Var, String str) {
        this.a = fr2Var;
        this.b = dr2Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzr0)) {
            return false;
        }
        jzr0 jzr0Var = (jzr0) obj;
        return this.a == jzr0Var.a && this.b.equals(jzr0Var.b) && u890.j(this.c, jzr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
