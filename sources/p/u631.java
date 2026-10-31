package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u631 extends xbk1 {
    public final gal b;
    public Boolean c;

    public u631(gal galVar) {
        this.b = galVar;
    }

    public final void S() {
        if (u890.j(this.c, Boolean.TRUE)) {
            fns fnsVar = igu.a;
            bs50 bs50Var = pyf0.a.f;
            gaa0 gaa0VarF = op71.f();
            bs50Var.getClass();
            llm llmVarE = smo1.e(flo1.l(bs50Var, gaa0VarF));
            fn31.T(llmVarE, (o8n) null, 0, new w6i0(this, null, (byte) 1), 3).L(new zw11(llmVarE, (byte) 11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object T(onm onmVar) {
        t631 t631Var;
        if (onmVar instanceof t631) {
            t631Var = (t631) onmVar;
            int i = t631Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                t631Var.d = i - Integer.MIN_VALUE;
            } else {
                t631Var = new t631(this, onmVar);
            }
        } else {
            t631Var = new t631(this, onmVar);
        }
        Object objI = t631Var.b;
        int i2 = t631Var.d;
        if (i2 == 0) {
            hm5.M(objI);
            if (this.c == null) {
                t631Var.a = this;
                t631Var.d = 1;
                objI = this.b.i(t631Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = t631Var.a;
        hm5.M(objI);
        this.c = (Boolean) objI;
        return rih1.a;
    }
}
