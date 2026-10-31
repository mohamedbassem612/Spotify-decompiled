package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nfa extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ nav0 d;
    public final /* synthetic */ w5f1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nfa(nav0 nav0Var, w5f1 w5f1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = nav0Var;
        this.e = w5f1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                nfa nfaVar = new nfa(this.d, this.e, lnmVar, (byte) 0);
                nfaVar.c = obj;
                return nfaVar;
            default:
                nfa nfaVar2 = new nfa(this.d, this.e, lnmVar, (byte) 1);
                nfaVar2.c = obj;
                return nfaVar2;
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
        w5f1 w5f1Var = this.e;
        j8d1 j8d1Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    mfa mfaVar = new mfa((c9n) this.c, w5f1Var, null);
                    this.b = true;
                    return s9p1.D(j8d1Var, mfaVar, this) == d9nVar ? d9nVar : rih1Var;
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
                    pfa pfaVar = new pfa((c9n) this.c, w5f1Var, null);
                    this.b = true;
                    return j8d1Var.H1(pfaVar, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
