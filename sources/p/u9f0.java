package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u9f0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ w9f0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9f0(lnm lnmVar, w9f0 w9f0Var, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = w9f0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        w9f0 w9f0Var = this.e;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                u9f0 u9f0Var = new u9f0(lnmVar, w9f0Var, (byte) 0);
                u9f0Var.c = vr20Var;
                u9f0Var.d = obj2;
                return u9f0Var.invokeSuspend(rih1Var);
            default:
                u9f0 u9f0Var2 = new u9f0(lnmVar, w9f0Var, (byte) 1);
                u9f0Var2.c = vr20Var;
                u9f0Var2.d = obj2;
                return u9f0Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        t181 t181Var = t181.a;
        w9f0 w9f0Var = this.e;
        d9n d9nVar = d9n.a;
        byte b2 = 1;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Object obj2 = this.d;
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
                jge jgeVarE = ((Boolean) obj2).booleanValue() ? hu20.e(((iur) w9f0Var.h).b, new u9f0(lnmVar, w9f0Var, b2)) : new huz(t181Var, (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var, jgeVarE, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var2 = this.c;
                Object obj3 = this.d;
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
                mr20 huzVar = ((Boolean) obj3).booleanValue() ? (mr20) ((hgo) w9f0Var.e).invoke() : new huz(t181Var, (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, huzVar, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
