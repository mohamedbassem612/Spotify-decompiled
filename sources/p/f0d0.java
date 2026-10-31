package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f0d0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0d0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    @Override // p.xu30
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                f0d0 f0d0Var = new f0d0(i, lnmVar, (byte) 0);
                f0d0Var.c = vr20Var;
                f0d0Var.d = obj2;
                return f0d0Var.invokeSuspend(rih1Var);
            default:
                f0d0 f0d0Var2 = new f0d0(i, lnmVar, (byte) 1);
                f0d0Var2.c = vr20Var;
                f0d0Var2.d = obj2;
                return f0d0Var2.invokeSuspend(rih1Var);
        }
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        mr20 mr20VarJ;
        mr20 mr20VarC;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mr20 mr20Var = r6x.a;
        d9n d9nVar = d9n.a;
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
                yzc0 yzc0Var = (yzc0) obj2;
                if (yzc0Var != null && (mr20VarJ = yzc0Var.j()) != null) {
                    mr20Var = mr20VarJ;
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var, mr20Var, this) == d9nVar ? d9nVar : rih1Var;
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
                s4j0 s4j0Var = (s4j0) obj3;
                if (s4j0Var != null && (mr20VarC = s4j0Var.c()) != null) {
                    mr20Var = mr20VarC;
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, mr20Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
