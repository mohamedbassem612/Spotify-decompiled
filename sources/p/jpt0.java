package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jpt0 {
    public final ipt0 a;
    public final boolean b;

    public /* synthetic */ jpt0(ipt0 ipt0Var, int i) {
        this((i & 1) != 0 ? fpt0.a : ipt0Var, (i & 2) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpt0)) {
            return false;
        }
        jpt0 jpt0Var = (jpt0) obj;
        return u890.j(this.a, jpt0Var.a) && this.b == jpt0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public jpt0(ipt0 ipt0Var, boolean z) {
        this.a = ipt0Var;
        this.b = z;
    }
}
