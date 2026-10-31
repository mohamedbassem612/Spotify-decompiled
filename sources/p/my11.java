package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class my11 extends r6 implements r8n {
    public final /* synthetic */ y3k b;
    public final /* synthetic */ ny11 c;

    /* JADX WARN: Illegal instructions before constructor call */
    public my11(y3k y3kVar, ny11 ny11Var) {
        olj0 olj0Var = olj0.T0;
        this.b = y3kVar;
        this.c = ny11Var;
        super(olj0Var);
    }

    public final void p(Throwable th, o8n o8nVar) throws Throwable {
        y3k y3kVar = this.b;
        ny11 ny11Var = this.c;
        jm5.r(th, new og(y3kVar, ny11Var, (byte) 18));
        o8n o8nVar2 = ny11Var.b;
        olj0 olj0Var = olj0.T0;
        r8n r8nVarA = o8nVar2.A(olj0Var);
        if (r8nVarA != null) {
            r8nVarA.p(th, o8nVar);
            return;
        }
        r8n r8nVarA2 = ny11Var.a.A(olj0Var);
        if (r8nVarA2 == null) {
            throw th;
        }
        r8nVarA2.p(th, o8nVar);
    }
}
