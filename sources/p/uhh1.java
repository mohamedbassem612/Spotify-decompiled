package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uhh1 extends a8d1 implements zu30 {
    public boolean a;
    public /* synthetic */ long b;

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        uhh1 uhh1Var = new uhh1(4, (lnm) obj4);
        uhh1Var.b = jLongValue;
        return uhh1Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            long j = this.b;
            qs10 qs10VarA = qs10.a();
            int i = vhh1.a;
            qs10VarA.getClass();
            long jMin = Math.min(j * 30000, vhh1.a);
            this.a = true;
            Object objI = hap1.i(jMin, this);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return yah0.m(true);
    }
}
