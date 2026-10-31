package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mb01 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ long c;
    public /* synthetic */ long d;
    public final /* synthetic */ qb01 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb01(qb01 qb01Var, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = qb01Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qb01 qb01Var = this.e;
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                mb01 mb01Var = new mb01(qb01Var, lnmVar, (byte) 0);
                mb01Var.c = jLongValue;
                mb01Var.d = jLongValue2;
                return mb01Var.invokeSuspend(rih1Var);
            default:
                mb01 mb01Var2 = new mb01(qb01Var, lnmVar, (byte) 1);
                mb01Var2.c = jLongValue;
                mb01Var2.d = jLongValue2;
                return mb01Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        long j = this.c;
        long j2 = this.d;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Boolean bool = Boolean.FALSE;
                this.c = j;
                this.d = j2;
                this.b = true;
                return qb01.d(this.e, null, j, j2, bool, null, this, 17) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Boolean bool2 = Boolean.TRUE;
                this.c = j;
                this.d = j2;
                this.b = true;
                return qb01.d(this.e, null, j, j2, bool2, null, this, 17) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
