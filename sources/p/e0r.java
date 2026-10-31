package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e0r extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vr20 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0r(vr20 vr20Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = vr20Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                e0r e0rVar = new e0r(this.d, lnmVar, (byte) 0);
                e0rVar.c = obj;
                return e0rVar;
            case 1:
                e0r e0rVar2 = new e0r(this.d, lnmVar, (byte) 1);
                e0rVar2.c = obj;
                return e0rVar2;
            case 2:
                e0r e0rVar3 = new e0r(this.d, lnmVar, (byte) 2);
                e0rVar3.c = obj;
                return e0rVar3;
            default:
                e0r e0rVar4 = new e0r(this.d, lnmVar, (byte) 3);
                e0rVar4.c = obj;
                return e0rVar4;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create(obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                k1r k1rVar = (k1r) this.c;
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
                Object objS = t2p1.s(k1rVar);
                this.c = null;
                this.b = true;
                return vr20Var.emit(objS, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                k1r k1rVar2 = (k1r) this.c;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var.emit(k1rVar2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                k1r k1rVar3 = (k1r) this.c;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var.emit(k1rVar3, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                Object obj2 = this.c;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var.emit(obj2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
