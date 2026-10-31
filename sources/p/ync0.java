package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ync0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ynh1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ync0(ynh1 ynh1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = ynh1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ynh1 ynh1Var = this.d;
        switch (b) {
            case 0:
                ync0 ync0Var = new ync0(ynh1Var, lnmVar, (byte) 0);
                ync0Var.c = obj;
                return ync0Var;
            default:
                ync0 ync0Var2 = new ync0(ynh1Var, lnmVar, (byte) 1);
                ync0Var2.c = obj;
                return ync0Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(vr20Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ynh1 ynh1Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var.emit(ynh1Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                vr20 vr20Var2 = (vr20) this.c;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var2.emit(ynh1Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
