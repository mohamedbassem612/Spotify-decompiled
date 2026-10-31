package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ idn0 c;
    public final /* synthetic */ r9w0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(r9w0 r9w0Var, idn0 idn0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.d = r9w0Var;
        this.c = idn0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        r9w0 r9w0Var = this.d;
        idn0 idn0Var = this.c;
        switch (b) {
            case 0:
                return new e6(r9w0Var, idn0Var, lnmVar);
            case 1:
                return new e6(idn0Var, r9w0Var, lnmVar, (byte) 1);
            default:
                return new e6(idn0Var, r9w0Var, lnmVar, (byte) 2);
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
        rih1 rih1Var = rih1.a;
        r9w0 r9w0Var = this.d;
        idn0 idn0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    s9w0 s9w0Var = new s9w0(r9w0Var);
                    this.b = true;
                    return idn0Var.b(s9w0Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    return idn0Var.b(r9w0Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    return idn0Var.b(r9w0Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6(idn0 idn0Var, r9w0 r9w0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = idn0Var;
        this.d = r9w0Var;
    }
}
