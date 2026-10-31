package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class scr0 {
    public final rcr0 a;
    public final iu30 b;

    public scr0(rcr0 rcr0Var, iu30 iu30Var) {
        this.a = rcr0Var;
        this.b = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scr0)) {
            return false;
        }
        scr0 scr0Var = (scr0) obj;
        return this.a.equals(scr0Var.a) && u890.j(this.b, scr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
