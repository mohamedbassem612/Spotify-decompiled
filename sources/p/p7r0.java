package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p7r0 implements t2r0 {
    public final /* synthetic */ s7r0 a;

    public p7r0(s7r0 s7r0Var) {
        this.a = s7r0Var;
    }

    @Override // p.t2r0
    public final void c(u2r0 u2r0Var) {
        c7r0 c7r0VarA = this.a.a();
        t2r0 t2r0Var = c7r0VarA instanceof t2r0 ? (t2r0) c7r0VarA : null;
        if (t2r0Var != null) {
            t2r0Var.c(u2r0Var);
        }
    }

    @Override // p.um70
    public final String h() {
        c7r0 c7r0VarA = this.a.a();
        um70 um70Var = c7r0VarA instanceof um70 ? (um70) c7r0VarA : null;
        if (um70Var != null) {
            return um70Var.h();
        }
        return null;
    }
}
