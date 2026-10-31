package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jtq0 extends z1a1 {
    public final vq31 c;
    public final tw4 d;

    public jtq0(vq31 vq31Var) {
        tw4 tw4VarA;
        this.c = vq31Var;
        if (ila0.w(vq31Var)) {
            tw4VarA = null;
        } else {
            tw4VarA = ww4.a();
            tw4VarA.e(vq31Var, 1);
        }
        this.d = tw4VarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jtq0) {
            return this.c.equals(((jtq0) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final n511 j() {
        vq31 vq31Var = this.c;
        return new n511(vq31Var.a, vq31Var.b, vq31Var.c, vq31Var.d);
    }
}
