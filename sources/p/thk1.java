package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class thk1 implements ldv0, iv30 {
    public final /* synthetic */ uhk1 a;

    public thk1(uhk1 uhk1Var) {
        this.a = uhk1Var;
    }

    @Override // p.ldv0
    public final void a() {
        uhk1 uhk1Var = this.a;
        llm llmVar = (llm) uhk1Var.d;
        if (llmVar != null) {
            smo1.q(llmVar);
        }
        uhk1Var.d = null;
        uhk1Var.e = null;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ldv0) && (obj instanceof iv30)) {
            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
        }
        return false;
    }

    public final cv30 getFunctionDelegate() {
        return new tv30(0, this.a, uhk1.class, "dispose", "dispose()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
