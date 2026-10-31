package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class do51 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ jo51 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ mhg1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ do51(jo51 jo51Var, Object obj, mhg1 mhg1Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = jo51Var;
        this.d = obj;
        this.e = mhg1Var;
    }

    public final lnm create(lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new do51(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new do51(this.c, this.d, this.e, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        float f;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        jo51 jo51Var = this.c;
        Object obj2 = this.d;
        mhg1 mhg1Var = this.e;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    hgo0 hgo0Var = new hgo0(jo51Var, obj2, mhg1Var, (lnm) null);
                    this.b = true;
                    return smo1.s(hgo0Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    jo51Var.w1();
                    hrr0 hrr0Var = jo51Var.c;
                    jo51Var.N0 = Long.MIN_VALUE;
                    jo51Var.C1(0.0f);
                    if (obj2.equals(jo51Var.d.getValue())) {
                        f = -4.0f;
                    } else {
                        f = obj2.equals(hrr0Var.getValue()) ? -5.0f : -3.0f;
                    }
                    mhg1Var.r(obj2);
                    mhg1Var.n(0L);
                    hrr0Var.setValue(obj2);
                    jo51Var.C1(0.0f);
                    jo51Var.o1(obj2);
                    mhg1Var.j(f);
                    if (f == -3.0f) {
                        this.b = true;
                        if (jo51Var.F1(this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                mhg1Var.i();
                return rih1Var;
        }
    }
}
