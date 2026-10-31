package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wqg1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public vr20 b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ hrg1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wqg1(hrg1 hrg1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = hrg1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        hrg1 hrg1Var = this.e;
        switch (b) {
            case 0:
                wqg1 wqg1Var = new wqg1(hrg1Var, lnmVar, (byte) 0);
                wqg1Var.d = obj;
                return wqg1Var;
            default:
                wqg1 wqg1Var2 = new wqg1(hrg1Var, lnmVar, (byte) 1);
                wqg1Var2.d = obj;
                return wqg1Var2;
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
        hrg1 hrg1Var = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.d;
                byte b2 = this.c;
                if (b2 == 0) {
                    hm5.M(obj);
                    this.d = null;
                    this.b = vr20Var;
                    this.c = (byte) 1;
                    obj = hrg1Var.c(this);
                    if (obj != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vr20Var = this.b;
                hm5.M(obj);
                this.d = null;
                this.b = null;
                this.c = (byte) 2;
                if (vr20Var.emit(obj, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                vr20 vr20Var2 = (vr20) this.d;
                byte b3 = this.c;
                if (b3 == 0) {
                    hm5.M(obj);
                    this.d = null;
                    this.b = vr20Var2;
                    this.c = (byte) 1;
                    obj = hrg1Var.g(this);
                    if (obj != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vr20Var2 = this.b;
                hm5.M(obj);
                this.d = null;
                this.b = null;
                this.c = (byte) 2;
                if (vr20Var2.emit(obj, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }
}
