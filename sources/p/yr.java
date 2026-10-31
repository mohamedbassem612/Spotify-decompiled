package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class yr extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ cs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr(cs csVar, lnm lnmVar) {
        super(2, lnmVar);
        this.b = csVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new yr(this.b, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            cs csVar = this.b;
            iq iqVar = csVar.j;
            iqVar.getClass();
            mr20 mr20VarR = o4p1.r(new zp(r4p1.j(f5p1.t(h4p1.f(new cq(iqVar, null))), dq.a)), iqVar.d);
            yp ypVar = new yp(csVar, (byte) 1);
            this.a = true;
            Object objCollect = mr20VarR.collect(ypVar, this);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
