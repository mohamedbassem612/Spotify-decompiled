package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gpb1 implements u601 {
    public final zob1 a;

    public gpb1(zob1 zob1Var) {
        this.a = zob1Var;
    }

    @Override // p.u601
    public final mr20 a() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.u601
    public final Object b(vu30 vu30Var, lnm lnmVar) {
        fpb1 fpb1Var;
        if (lnmVar instanceof fpb1) {
            fpb1Var = (fpb1) lnmVar;
            int i = fpb1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fpb1Var.c = i - Integer.MIN_VALUE;
            } else {
                fpb1Var = new fpb1(this, lnmVar);
            }
        } else {
            fpb1Var = new fpb1(this, lnmVar);
        }
        Object obj = fpb1Var.a;
        int i2 = fpb1Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            vr20 t940Var = new t940(vu30Var, (byte) 0);
            fpb1Var.c = 1;
            Object objCollect = this.a.collect(t940Var, fpb1Var);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        jah.d();
        return null;
    }

    @Override // p.u601
    public final Object getValue() {
        return this.a.getValue();
    }
}
