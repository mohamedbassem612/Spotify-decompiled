package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ i6 c;
    public final /* synthetic */ r9w0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6(i6 i6Var, r9w0 r9w0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = i6Var;
        this.d = r9w0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        r9w0 r9w0Var = this.d;
        i6 i6Var = this.c;
        switch (b) {
            case 0:
                return new g6(i6Var, r9w0Var, lnmVar, (byte) 0);
            case 1:
                return new g6(i6Var, r9w0Var, lnmVar, (byte) 1);
            case 2:
                return new g6(i6Var, r9w0Var, lnmVar, (byte) 2);
            default:
                return new g6(i6Var, r9w0Var, lnmVar, (byte) 3);
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
            case 2:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        r9w0 r9w0Var = this.d;
        i6 i6Var = this.c;
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
                idn0 idn0Var = i6Var.Q0;
                if (idn0Var == null) {
                    return rih1Var;
                }
                q9w0 q9w0Var = new q9w0(r9w0Var);
                this.b = true;
                return idn0Var.b(q9w0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
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
                idn0 idn0Var2 = i6Var.Q0;
                if (idn0Var2 == null) {
                    return rih1Var;
                }
                q9w0 q9w0Var2 = new q9w0(r9w0Var);
                this.b = true;
                return idn0Var2.b(q9w0Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                idn0 idn0Var3 = i6Var.Q0;
                if (idn0Var3 == null) {
                    return rih1Var;
                }
                this.b = true;
                return idn0Var3.b(r9w0Var, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                idn0 idn0Var4 = i6Var.Q0;
                if (idn0Var4 == null) {
                    return rih1Var;
                }
                s9w0 s9w0Var = new s9w0(r9w0Var);
                this.b = true;
                return idn0Var4.b(s9w0Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
