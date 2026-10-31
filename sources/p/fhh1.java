package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fhh1 extends fn41 {
    public final ThreadLocal f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public fhh1(lnm lnmVar, o8n o8nVar) {
        xhd xhdVar = xhd.d;
        super(lnmVar, o8nVar.A(xhdVar) == null ? o8nVar.y(xhdVar) : o8nVar);
        this.f = new ThreadLocal();
        if (lnmVar.getContext().A(wdu0.Y) instanceof q8n) {
            return;
        }
        Object objW = flo1.w(o8nVar, (Object) null);
        flo1.p(o8nVar, objW);
        E0(o8nVar, objW);
    }

    @Override // p.fn41
    public final void B0() {
        D0();
    }

    public final boolean C0() {
        boolean z = this.threadLocalIsSet && this.f.get() == null;
        this.f.remove();
        return !z;
    }

    public final void D0() {
        if (this.threadLocalIsSet) {
            mmr0 mmr0Var = (mmr0) this.f.get();
            if (mmr0Var != null) {
                flo1.p((o8n) mmr0Var.a, mmr0Var.b);
            }
            this.f.remove();
        }
    }

    public final void E0(o8n o8nVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f.set(oqn1.n(o8nVar, obj));
    }

    @Override // p.fn41, p.saa0
    public final void P(Object obj) {
        D0();
        Object objO = uap1.o(obj);
        lnm lnmVar = this.e;
        o8n context = lnmVar.getContext();
        Object objW = flo1.w(context, (Object) null);
        fhh1 fhh1VarU = objW != flo1.a ? ulo1.u(lnmVar, context, objW) : null;
        try {
            lnmVar.resumeWith(objO);
        } finally {
            if (fhh1VarU == null || fhh1VarU.C0()) {
                flo1.p(context, objW);
            }
        }
    }
}
