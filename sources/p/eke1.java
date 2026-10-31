package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eke1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ fke1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eke1(fke1 fke1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = fke1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        fke1 fke1Var = this.c;
        switch (b) {
            case 0:
                return new eke1(fke1Var, lnmVar, (byte) 0);
            default:
                return new eke1(fke1Var, lnmVar, (byte) 1);
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
        fke1 fke1Var = this.c;
        d9n d9nVar = d9n.a;
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
                o95 o95Var = fke1Var.b1;
                Float f = new Float(0.0f);
                n8b1 n8b1VarL0 = irn1.l0(0.0f, 0.0f, (Object) null, 7);
                dke1 dke1Var = new dke1(fke1Var, (byte) 0);
                this.b = true;
                return o95.b(o95Var, f, n8b1VarL0, (Float) null, dke1Var, this, 4) == d9nVar ? d9nVar : rih1Var;
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
                o95 o95Var2 = fke1Var.b1;
                Float f2 = new Float(fke1Var.K1());
                this.b = true;
                return o95Var2.g(f2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
