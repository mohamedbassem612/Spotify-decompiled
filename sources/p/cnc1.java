package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cnc1 implements vr20 {
    public final vr20 a;
    public final vu30 b;

    public cnc1(vr20 vr20Var, vu30 vu30Var) {
        this.a = vr20Var;
        this.b = vu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) throws Throwable {
        bnc1 bnc1Var;
        Throwable th;
        h441 h441Var;
        if (onmVar instanceof bnc1) {
            bnc1Var = (bnc1) onmVar;
            int i = bnc1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bnc1Var.d = i - Integer.MIN_VALUE;
            } else {
                bnc1Var = new bnc1(this, onmVar);
            }
        } else {
            bnc1Var = new bnc1(this, onmVar);
        }
        Object obj = bnc1Var.b;
        int i2 = bnc1Var.d;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.a;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h441Var = bnc1Var.a;
            try {
                hm5.M(obj);
                h441Var.releaseIntercepted();
                if (vr20Var instanceof cnc1) {
                    bnc1Var.a = null;
                    bnc1Var.d = 2;
                    if (((cnc1) vr20Var).b(bnc1Var) == d9nVar) {
                    }
                }
                return rih1Var;
            } catch (Throwable th2) {
                th = th2;
                h441Var.releaseIntercepted();
                throw th;
            }
        }
        hm5.M(obj);
        h441 h441Var2 = new h441(vr20Var, bnc1Var.getContext());
        try {
            vu30 vu30Var = this.b;
            bnc1Var.a = h441Var2;
            bnc1Var.d = 1;
            if (vu30Var.invoke(h441Var2, bnc1Var) != d9nVar) {
                h441Var = h441Var2;
                h441Var.releaseIntercepted();
                if (vr20Var instanceof cnc1) {
                    bnc1Var.a = null;
                    bnc1Var.d = 2;
                    if (((cnc1) vr20Var).b(bnc1Var) == d9nVar) {
                    }
                }
                return rih1Var;
            }
        } catch (Throwable th3) {
            th = th3;
            h441Var = h441Var2;
            h441Var.releaseIntercepted();
            throw th;
        }
        return d9nVar;
    }

    @Override // p.vr20
    public final Object emit(Object obj, lnm lnmVar) {
        return this.a.emit(obj, lnmVar);
    }
}
