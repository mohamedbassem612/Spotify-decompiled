package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m441 implements mr20, phd {
    public final vu30 a;

    public m441(vu30 vu30Var) {
        this.a = vu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.mr20
    public final Object collect(vr20 vr20Var, lnm lnmVar) throws Throwable {
        u6 u6Var;
        h441 h441Var;
        if (lnmVar instanceof u6) {
            u6Var = (u6) lnmVar;
            int i = u6Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                u6Var.d = i - Integer.MIN_VALUE;
            } else {
                u6Var = new u6(this, lnmVar);
            }
        } else {
            u6Var = new u6(this, lnmVar);
        }
        Object obj = u6Var.b;
        int i2 = u6Var.d;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h441Var = u6Var.a;
            try {
                hm5.M(obj);
                h441Var.releaseIntercepted();
                return rih1Var;
            } catch (Throwable th) {
                th = th;
                h441Var.releaseIntercepted();
                throw th;
            }
        }
        hm5.M(obj);
        h441 h441Var2 = new h441(vr20Var, u6Var.getContext());
        try {
            u6Var.a = h441Var2;
            u6Var.d = 1;
            try {
                Object objInvoke = this.a.invoke(h441Var2, u6Var);
                d9n d9nVar = d9n.a;
                if (objInvoke != d9nVar) {
                    objInvoke = rih1Var;
                }
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
                h441Var = h441Var2;
                h441Var.releaseIntercepted();
                return rih1Var;
            } catch (Throwable th2) {
                th = th2;
                h441Var = h441Var2;
                h441Var.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
