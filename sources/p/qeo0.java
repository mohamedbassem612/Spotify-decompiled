package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qeo0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ tv80 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ bjx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qeo0(boolean z, bjx bjxVar, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = z;
        this.e = bjxVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bjx bjxVar = this.e;
        boolean z = this.d;
        tv80 tv80Var = (tv80) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                qeo0 qeo0Var = new qeo0(z, bjxVar, lnmVar, (byte) 0);
                qeo0Var.c = tv80Var;
                return qeo0Var.invokeSuspend(rih1Var);
            default:
                qeo0 qeo0Var2 = new qeo0(z, bjxVar, lnmVar, (byte) 1);
                qeo0Var2.c = tv80Var;
                return qeo0Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        u6n u6nVar = u6n.a;
        bjx bjxVar = this.e;
        boolean z = this.d;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                tv80 tv80Var = this.c;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    if (z) {
                        ((xv61) bjxVar.g).a(rc11.a.b(uce0.class), rih1Var).a((Object) null, new Integer(5), tv80Var);
                    } else {
                        b7n b7nVar = (b7n) bjxVar.f;
                        Integer num = new Integer(5);
                        this.c = null;
                        this.b = true;
                        if (b7nVar.b(u6nVar, num, this) == d9nVar) {
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
                return rih1Var;
            default:
                tv80 tv80Var2 = this.c;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    if (z) {
                        ((xv61) bjxVar.g).a(rc11.a.b(uce0.class), rih1Var).a((Object) null, new Integer(6), tv80Var2);
                    } else {
                        b7n b7nVar2 = (b7n) bjxVar.f;
                        Integer num2 = new Integer(6);
                        this.c = null;
                        this.b = true;
                        if (b7nVar2.b(u6nVar, num2, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }
}
