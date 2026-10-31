package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hda1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ pda1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hda1(pda1 pda1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = pda1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        pda1 pda1Var = this.c;
        switch (b) {
            case 0:
                return new hda1(pda1Var, lnmVar, (byte) 0);
            default:
                return new hda1(pda1Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9n.a;
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        pda1 pda1Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                xe01 xe01Var = pda1Var.c.d;
                bda1 bda1Var = new bda1(pda1Var, (byte) 1);
                this.b = true;
                if (xe01Var.a.collect(bda1Var, this) == d9nVar) {
                    return d9nVar;
                }
                jah.d();
                return null;
            default:
                boolean z2 = this.b;
                rih1 rih1Var = rih1.a;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    p811 p811Var = new p811();
                    p811Var.a = pda1Var.g(pda1Var.h());
                    mr20 mr20VarQ = rwq.q(new gda1(pda1Var, (byte) 3));
                    mr20 mr20Var = pda1Var.c.d;
                    Object objS = fc11.s(vrl.c, this, new hv90(new ip61((Object) p811Var, (Object) pda1Var, (byte) 10), p811Var, (byte) 5), new ekv(new dwf0(pda1Var, (lnm) null, (byte) 25), (lnm) null), new mr20[]{mr20VarQ, mr20Var});
                    if (objS != d9nVar) {
                        objS = rih1Var;
                    }
                    if (objS != d9nVar) {
                        objS = rih1Var;
                    }
                    if (objS != d9nVar) {
                        objS = rih1Var;
                    }
                    if (objS == d9nVar) {
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
        }
    }
}
