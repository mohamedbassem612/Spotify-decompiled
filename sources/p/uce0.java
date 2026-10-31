package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uce0 extends ov61 {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;
    public final mr20 d;

    public uce0(g0l g0lVar, bah1 bah1Var) {
        this.b = g0lVar;
        this.c = bah1Var;
        this.d = hu20.e(yoi1.g(((inr) g0lVar).l()), new zz90((lnm) null, this, (byte) 13));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(int i, onm onmVar) {
        tce0 tce0Var;
        if (onmVar instanceof tce0) {
            tce0Var = (tce0) onmVar;
            int i2 = tce0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tce0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                tce0Var = new tce0(this, onmVar);
            }
        } else {
            tce0Var = new tce0(this, onmVar);
        }
        Object objC = tce0Var.b;
        int i3 = tce0Var.d;
        if (i3 == 0) {
            hm5.M(objC);
            nnr nnrVarK = ((g0l) this.b).k();
            if (nnrVarK == null) {
                return new ht61((Integer) null, 0);
            }
            String str = nnrVarK.a;
            bah1 bah1Var = (bah1) this.c;
            tce0Var.a = i;
            tce0Var.d = 1;
            objC = bah1Var.c(i, str, tce0Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = tce0Var.a;
            hm5.M(objC);
        }
        return ((Boolean) objC).booleanValue() ? new it61(new Integer(i)) : new ht61((Integer) null, 0);
    }

    public final mr20 getValue() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public final Object setValue(Object obj, Object obj2, tv80 tv80Var, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return a(((Number) obj2).intValue(), (onm) lnmVar);
            default:
                return ((il0) this.c).b((String) this.b, (bl0) obj2, (onm) lnmVar);
        }
    }

    public uce0(String str, il0 il0Var) {
        this.b = str;
        this.c = il0Var;
        this.d = rqt0.u(new dt61(il0Var.d, new j2(this, (byte) 9), (byte) 0));
    }
}
