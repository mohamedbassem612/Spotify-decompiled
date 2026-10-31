package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sqw {
    public final laa a;
    public final o8n b;
    public final btw c;
    public final ctw d;
    public final ctw e;
    public final ctw f;
    public final ctw g;
    public ztw h;
    public boolean i;
    public boolean j;
    public llm k;
    public u601 l;

    public sqw(laa laaVar, o8n o8nVar, btw btwVar, ctw ctwVar, ctw ctwVar2, ctw ctwVar3, ctw ctwVar4) {
        this.a = laaVar;
        this.b = o8nVar;
        this.c = btwVar;
        this.d = ctwVar;
        this.e = ctwVar2;
        this.f = ctwVar3;
        this.g = ctwVar4;
    }

    public final void a(int i) {
        ztw ztwVarC = c();
        if ((ztwVarC == null || !ztwVarC.a()) && this.i && i == 0) {
            this.h = null;
            this.i = false;
        }
    }

    public final op80 b() {
        u601 u601Var = this.l;
        if (u601Var != null) {
            return (op80) u601Var.getValue();
        }
        return null;
    }

    public final ztw c() {
        auw auwVarI;
        ztw ztwVarCreate = this.h;
        if (ztwVarCreate == null) {
            op80 op80VarB = b();
            ztwVarCreate = (op80VarB == null || (auwVarI = sap1.i(op80VarB)) == null) ? null : auwVarI.create();
            this.h = ztwVarCreate;
        }
        return ztwVarCreate;
    }
}
