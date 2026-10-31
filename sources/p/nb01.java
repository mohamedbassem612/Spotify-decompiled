package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nb01 extends a8d1 implements xu30 {
    public boolean a;
    public /* synthetic */ long b;
    public /* synthetic */ long c;
    public final /* synthetic */ qb01 d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb01(qb01 qb01Var, boolean z, lnm lnmVar) {
        super(3, lnmVar);
        this.d = qb01Var;
        this.e = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        nb01 nb01Var = new nb01(this.d, this.e, (lnm) obj3);
        nb01Var.b = jLongValue;
        nb01Var.c = jLongValue2;
        return nb01Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        long j = this.b;
        long j2 = this.c;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            Boolean boolValueOf = Boolean.valueOf(this.e);
            this.b = j;
            this.c = j2;
            this.a = true;
            Object objD = qb01.d(this.d, null, j, j2, null, boolValueOf, this, 9);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
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
