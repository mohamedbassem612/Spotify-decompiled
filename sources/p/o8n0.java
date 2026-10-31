package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o8n0 extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8n0() {
        super(4, (lnm) null);
        this.a = (byte) 1;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 4;
        Number number = (Number) obj3;
        switch (b) {
            case 0:
                long jLongValue = number.longValue();
                o8n0 o8n0Var = new o8n0(i, (lnm) obj4, (byte) 0);
                o8n0Var.c = jLongValue;
                return o8n0Var.invokeSuspend(rih1Var);
            case 1:
                long jLongValue2 = number.longValue();
                o8n0 o8n0Var2 = new o8n0(i, (lnm) obj4, (byte) 1);
                o8n0Var2.c = jLongValue2;
                return o8n0Var2.invokeSuspend(rih1Var);
            case 2:
                long jLongValue3 = number.longValue();
                o8n0 o8n0Var3 = new o8n0(i, (lnm) obj4, (byte) 2);
                o8n0Var3.c = jLongValue3;
                return o8n0Var3.invokeSuspend(rih1Var);
            default:
                long jLongValue4 = number.longValue();
                o8n0 o8n0Var4 = new o8n0(i, (lnm) obj4, (byte) 3);
                o8n0Var4.c = jLongValue4;
                return o8n0Var4.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                long j = this.c;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    int i = (int) j;
                    if (i > 5) {
                        i = 5;
                    }
                    long j2 = 1000 << i;
                    if (j2 > 30000) {
                        j2 = 30000;
                    }
                    this.c = j;
                    this.b = true;
                    if (hap1.i(j2, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.TRUE;
            case 1:
                long j3 = this.c;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    if (j3 >= 3) {
                        return Boolean.FALSE;
                    }
                    this.c = j3;
                    this.b = true;
                    if (hap1.i((1 + j3) * 1000, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.TRUE;
            case 2:
                long j4 = this.c;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    if (j4 >= 3) {
                        return Boolean.FALSE;
                    }
                    this.c = j4;
                    this.b = true;
                    if (hap1.i((1 + j4) * 1000, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.TRUE;
            default:
                long j5 = this.c;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    if (j5 >= 2) {
                        return Boolean.FALSE;
                    }
                    this.c = j5;
                    this.b = true;
                    if (hap1.i(1000L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o8n0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
