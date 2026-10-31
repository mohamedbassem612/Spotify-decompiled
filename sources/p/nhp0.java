package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nhp0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ qhp0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nhp0(qhp0 qhp0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = qhp0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        qhp0 qhp0Var = this.c;
        switch (b) {
            case 0:
                return new nhp0(qhp0Var, lnmVar, (byte) 0);
            default:
                return new nhp0(qhp0Var, lnmVar, (byte) 1);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        qhp0 qhp0Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(100L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                nif1 nif1Var = qhp0Var.b;
                if (nif1Var != null) {
                    nif1Var.e("ui.scrolling");
                }
                nif1 nif1Var2 = qhp0Var.b;
                if (nif1Var2 != null) {
                    nif1Var2.stop();
                }
                qhp0Var.b = null;
                return rih1Var;
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
                mr20 mr20VarU = rqt0.u(new any(new php0(qqn1.f(new en70(qhp0Var.a.b0(bn70.class))), (byte) 0), (byte) 18));
                fun0 fun0Var = new fun0((Object) qhp0Var, (byte) 6);
                this.b = true;
                return mr20VarU.collect(fun0Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
