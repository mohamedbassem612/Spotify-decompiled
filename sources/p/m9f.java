package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m9f extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9f(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                m9f m9fVar = new m9f(i, lnmVar, (byte) 0);
                m9fVar.c = vr20Var;
                return m9fVar.invokeSuspend(rih1Var);
            case 1:
                m9f m9fVar2 = new m9f(i, lnmVar, (byte) 1);
                m9fVar2.c = vr20Var;
                return m9fVar2.invokeSuspend(rih1Var);
            default:
                m9f m9fVar3 = new m9f(i, lnmVar, (byte) 2);
                m9fVar3.c = vr20Var;
                return m9fVar3.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var.emit(g9f.a, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                vr20 vr20Var2 = this.c;
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
                Boolean boolM = yah0.m(false);
                this.c = null;
                this.b = true;
                return vr20Var2.emit(boolM, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var3 = this.c;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var3.emit(ay21.a, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
