package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pe3 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ uv11 c;
    public /* synthetic */ tv80 d;
    public final /* synthetic */ te3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pe3(te3 te3Var, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = te3Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        te3 te3Var = this.e;
        uv11 uv11Var = (uv11) obj;
        tv80 tv80Var = (tv80) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                pe3 pe3Var = new pe3(te3Var, lnmVar, (byte) 0);
                pe3Var.c = uv11Var;
                pe3Var.d = tv80Var;
                return pe3Var.invokeSuspend(rih1Var);
            case 1:
                pe3 pe3Var2 = new pe3(te3Var, lnmVar, (byte) 1);
                pe3Var2.c = uv11Var;
                pe3Var2.d = tv80Var;
                return pe3Var2.invokeSuspend(rih1Var);
            case 2:
                pe3 pe3Var3 = new pe3(te3Var, lnmVar, (byte) 2);
                pe3Var3.c = uv11Var;
                pe3Var3.d = tv80Var;
                return pe3Var3.invokeSuspend(rih1Var);
            default:
                pe3 pe3Var4 = new pe3(te3Var, lnmVar, (byte) 3);
                pe3Var4.c = uv11Var;
                pe3Var4.d = tv80Var;
                return pe3Var4.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        te3 te3Var = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                uv11 uv11Var = this.c;
                tv80 tv80Var = this.d;
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
                this.c = null;
                this.d = null;
                this.b = true;
                return te3Var.d(uv11Var, tv80Var, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                uv11 uv11Var2 = this.c;
                tv80 tv80Var2 = this.d;
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
                this.c = null;
                this.d = null;
                this.b = true;
                return te3Var.d(uv11Var2, tv80Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                uv11 uv11Var3 = this.c;
                tv80 tv80Var3 = this.d;
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
                this.c = null;
                this.d = null;
                this.b = true;
                return te3Var.e(uv11Var3, tv80Var3, this) == d9nVar ? d9nVar : rih1Var;
            default:
                uv11 uv11Var4 = this.c;
                tv80 tv80Var4 = this.d;
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
                this.c = null;
                this.d = null;
                this.b = true;
                return te3Var.e(uv11Var4, tv80Var4, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
