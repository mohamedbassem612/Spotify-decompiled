package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rv8 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ay8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rv8(ay8 ay8Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = ay8Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ay8 ay8Var = this.d;
        switch (b) {
            case 0:
                rv8 rv8Var = new rv8(ay8Var, lnmVar, (byte) 0);
                rv8Var.c = obj;
                return rv8Var;
            case 1:
                rv8 rv8Var2 = new rv8(ay8Var, lnmVar, (byte) 1);
                rv8Var2.c = obj;
                return rv8Var2;
            default:
                rv8 rv8Var3 = new rv8(ay8Var, lnmVar, (byte) 2);
                rv8Var3.c = obj;
                return rv8Var3;
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
            case 1:
                break;
        }
        return create(vr20Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        ay8 ay8Var = this.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
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
                nz7 nz7Var = new nz7(vr20Var, (byte) 5);
                this.c = null;
                this.b = true;
                ay8Var.collect(nz7Var, this);
                return d9nVar;
            case 1:
                vr20 vr20Var2 = (vr20) this.c;
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
                wmo wmoVar = new wmo(vr20Var2, (byte) 13);
                this.c = null;
                this.b = true;
                ay8Var.collect(wmoVar, this);
                return d9nVar;
            default:
                vr20 vr20Var3 = (vr20) this.c;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hv90 hv90Var = new hv90(cy30.u(obj), vr20Var3, (byte) 4);
                this.c = null;
                this.b = true;
                ay8Var.collect(hv90Var, this);
                return d9nVar;
        }
    }
}
