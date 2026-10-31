package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class om0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public vr20 b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ vu30 e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ om0(vu30 vu30Var, Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = vu30Var;
        this.f = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        vu30 vu30Var = this.e;
        switch (b) {
            case 0:
                om0 om0Var = new om0(vu30Var, obj2, lnmVar, (byte) 0);
                om0Var.d = obj;
                return om0Var;
            default:
                om0 om0Var2 = new om0(vu30Var, obj2, lnmVar, (byte) 1);
                om0Var2.d = obj;
                return om0Var2;
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
        Object obj2 = this.f;
        vu30 vu30Var = this.e;
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
                    obj = vu30Var.invoke(obj2, this);
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
                    obj = vu30Var.invoke(obj2, this);
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
