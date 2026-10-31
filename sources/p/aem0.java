package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aem0 extends a8d1 implements xu30 {
    public /* synthetic */ float a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aem0(iu30 iu30Var, lnm lnmVar) {
        super(3, lnmVar);
        this.b = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        aem0 aem0Var = new aem0(this.b, (lnm) obj3);
        aem0Var.a = fFloatValue;
        rih1 rih1Var = rih1.a;
        aem0Var.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        this.b.invoke(new Float(this.a));
        return rih1.a;
    }
}
