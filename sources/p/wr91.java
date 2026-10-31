package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wr91 {
    public final yr91 a;
    public final ohd b;

    public wr91(yr91 yr91Var, ohd ohdVar) {
        this.a = yr91Var;
        this.b = ohdVar;
    }

    public final void a() {
        ohd ohdVar = this.b;
        if (ohdVar.s() instanceof ago0) {
            ohdVar.resumeWith(zt91.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wr91.class == obj.getClass()) {
            wr91 wr91Var = (wr91) obj;
            return u890.j(this.a, wr91Var.a) && this.b == wr91Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
