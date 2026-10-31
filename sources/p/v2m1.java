package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v2m1 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2m1(int i, lnm lnmVar, byte b) {
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
                v2m1 v2m1Var = new v2m1(i, lnmVar, (byte) 0);
                v2m1Var.c = vr20Var;
                return v2m1Var.invokeSuspend(rih1Var);
            default:
                v2m1 v2m1Var2 = new v2m1(i, lnmVar, (byte) 1);
                v2m1Var2.c = vr20Var;
                return v2m1Var2.invokeSuspend(rih1Var);
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
                    return vr20Var.emit((Object) null, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
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
                zam1 zam1Var = new zam1(null);
                this.c = null;
                this.b = true;
                return vr20Var2.emit(zam1Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
