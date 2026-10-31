package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class prs0 {
    public final vcl a;
    public final iu30 b;

    public prs0(vcl vclVar, iu30 iu30Var) {
        this.a = vclVar;
        this.b = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof prs0)) {
            return false;
        }
        prs0 prs0Var = (prs0) obj;
        return this.a.equals(prs0Var.a) && u890.j(this.b, prs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
