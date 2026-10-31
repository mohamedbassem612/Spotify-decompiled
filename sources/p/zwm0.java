package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zwm0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ m0t c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zwm0(m0t m0tVar, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = m0tVar;
        this.d = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ven0 ven0Var = this.d;
        m0t m0tVar = this.c;
        switch (b) {
            case 0:
                return new zwm0(m0tVar, ven0Var, lnmVar, (byte) 0);
            default:
                return new zwm0(m0tVar, ven0Var, lnmVar, (byte) 1);
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
        ven0 ven0Var = this.d;
        m0t m0tVar = this.c;
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
                ezc ezcVarG = yoi1.g(m0tVar.e);
                mp0 mp0Var = new mp0(ven0Var, (byte) 17);
                this.b = true;
                return ezcVarG.collect(mp0Var, this) == d9nVar ? d9nVar : rih1Var;
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
                ezc ezcVarG2 = yoi1.g(m0tVar.d);
                cff cffVar = new cff(ven0Var, (byte) 17);
                this.b = true;
                return ezcVarG2.collect(cffVar, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
