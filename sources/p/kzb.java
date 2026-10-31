package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kzb extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ ozb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzb(ozb ozbVar, lnm lnmVar) {
        super(2, lnmVar);
        this.b = ozbVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new kzb(this.b, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        rih1 rih1Var = rih1.a;
        if (!z) {
            hm5.M(obj);
            ozb ozbVar = this.b;
            mr20 mr20Var = ozbVar.k;
            mr20 mr20Var2 = ozbVar.l;
            ce2 ce2Var = new ce2(3, (lnm) null, (byte) 7);
            hb0 hb0Var = new hb0(ozbVar, (byte) 26);
            this.a = true;
            Object objS = fc11.s(vrl.c, this, hb0Var, new ekv(ce2Var, (lnm) null), new mr20[]{mr20Var, mr20Var2});
            d9n d9nVar = d9n.a;
            if (objS != d9nVar) {
                objS = rih1Var;
            }
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1Var;
    }
}
