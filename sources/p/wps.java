package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wps extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ float c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wps(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        float fFloatValue = ((Number) obj2).floatValue();
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                wps wpsVar = new wps((i191) obj4, lnmVar, (byte) 0);
                wpsVar.c = fFloatValue;
                return wpsVar.invokeSuspend(rih1Var);
            default:
                wps wpsVar2 = new wps((szg1) obj4, lnmVar, (byte) 1);
                wpsVar2.c = fFloatValue;
                return wpsVar2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                a8f1 a8f1Var = ((i191) obj2).k;
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
                float f = this.c;
                b8f1 state = a8f1Var.getState();
                e9r e9rVarC = a8f1Var.c();
                fe5 fe5VarD = a8f1Var.d();
                this.b = true;
                return ti5.h(state, f, e9rVarC, fe5VarD, this) == d9nVar ? d9nVar : rih1Var;
            default:
                a8f1 a8f1Var2 = ((szg1) obj2).o;
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
                float f2 = this.c;
                b8f1 state2 = a8f1Var2.getState();
                e9r e9rVarC2 = a8f1Var2.c();
                fe5 fe5VarD2 = a8f1Var2.d();
                this.b = true;
                return ti5.h(state2, f2, e9rVarC2, fe5VarD2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
