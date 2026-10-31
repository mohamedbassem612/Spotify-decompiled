package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yu51 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ zu51 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yu51(zu51 zu51Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = zu51Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        zu51 zu51Var = this.c;
        switch (b) {
            case 0:
                return new yu51(zu51Var, lnmVar, (byte) 0);
            case 1:
                return new yu51(zu51Var, lnmVar, (byte) 1);
            default:
                return new yu51(zu51Var, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        zu51 zu51Var = this.c;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    if (smo1.s(new wp41(zu51Var, (lnm) null, (byte) 3), this) == d9nVar) {
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
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    p811 p811Var = new p811();
                    l811 l811Var = new l811();
                    zu51 zu51Var2 = this.c;
                    Object objCollect = new lt20(o4p1.l(new m441(new af0(foo1.q(zu51Var2.c, rqt0.w(new wzv0(new ph11(yoi1.g(zu51Var2.b.j()), (byte) 3), (byte) 15), wu51.b, rqt0.b)), (lnm) null, new hf31(p811Var, l811Var, (byte) 29), new gpc(l811Var, (byte) 6), new gpc(l811Var, (byte) 7), zu51Var2))), new ob00(3, (lnm) null, (byte) 28), (byte) 0).collect(ft1.d, this);
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect == d9nVar) {
                        return d9nVar;
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
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    Object objCollect2 = new lt20(o4p1.l(rqt0.t(new wzv0(new ph11(yoi1.g(zu51Var.b.j()), (byte) 2), (byte) 14), qr51.t)), new ob00(3, (lnm) null, (byte) 29), (byte) 0).collect(new j0z0((Object) zu51Var, (byte) 17), this);
                    if (objCollect2 != d9nVar) {
                        objCollect2 = rih1Var;
                    }
                    if (objCollect2 == d9nVar) {
                        return d9nVar;
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
