package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lhb extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ayh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lhb(ayh ayhVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ayhVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ayh ayhVar = this.c;
        switch (b) {
            case 0:
                return new lhb(ayhVar, lnmVar, (byte) 0);
            case 1:
                return new lhb(ayhVar, lnmVar, (byte) 1);
            case 2:
                return new lhb(ayhVar, lnmVar, (byte) 2);
            case 3:
                return new lhb(ayhVar, lnmVar, (byte) 3);
            case 4:
                return new lhb(ayhVar, lnmVar, (byte) 4);
            case 5:
                return new lhb(ayhVar, lnmVar, (byte) 5);
            case 6:
                return new lhb(ayhVar, lnmVar, (byte) 6);
            default:
                return new lhb(ayhVar, lnmVar, (byte) 7);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ayh ayhVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    return ayhVar.Q(this) == d9nVar ? d9nVar : rih1Var;
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
                    return ayhVar.Q(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    Object objQ = ayhVar.Q(this);
                    return objQ == d9nVar ? d9nVar : objQ;
                }
                if (z3) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    this.b = true;
                    Object objQ2 = ayhVar.Q(this);
                    return objQ2 == d9nVar ? d9nVar : objQ2;
                }
                if (z4) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    this.b = true;
                    Object objQ3 = ayhVar.Q(this);
                    return objQ3 == d9nVar ? d9nVar : objQ3;
                }
                if (z5) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    this.b = true;
                    Object objQ4 = ayhVar.Q(this);
                    return objQ4 == d9nVar ? d9nVar : objQ4;
                }
                if (z6) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    this.b = true;
                    return ayhVar.Q(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z7) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z8 = this.b;
                hm5.M(obj);
                if (z8) {
                    return obj;
                }
                this.b = true;
                Object objQ5 = ayhVar.Q(this);
                return objQ5 == d9nVar ? d9nVar : objQ5;
        }
    }
}
