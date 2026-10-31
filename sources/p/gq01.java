package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gq01 implements iq01 {
    public final j47 a;
    public final m87 b;

    public gq01(j47 j47Var, m87 m87Var) {
        this.a = j47Var;
        this.b = m87Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq01)) {
            return false;
        }
        gq01 gq01Var = (gq01) obj;
        return u890.j(this.a, gq01Var.a) && u890.j(this.b, gq01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
