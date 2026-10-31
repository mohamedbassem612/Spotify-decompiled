package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vh9 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vh9(long j, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                vh9 vh9Var = new vh9(this.d, lnmVar, (byte) 0);
                vh9Var.c = obj;
                return vh9Var;
            default:
                vh9 vh9Var2 = new vh9(this.d, lnmVar, (byte) 1);
                vh9Var2.c = obj;
                return vh9Var2;
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
        long j = this.d;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
                byte b2 = this.b;
                if (b2 != 0) {
                    if (b2 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b2 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                }
                hm5.M(obj);
                this.c = vr20Var;
                this.b = (byte) 1;
                if (hap1.i(j, this) == d9nVar) {
                    return d9nVar;
                }
                this.c = null;
                this.b = (byte) 2;
                if (vr20Var.emit(rih1Var, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            default:
                vr20 vr20Var2 = (vr20) this.c;
                byte b3 = this.b;
                if (b3 != 0) {
                    if (b3 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b3 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                }
                hm5.M(obj);
                this.c = vr20Var2;
                this.b = (byte) 1;
                if (hap1.i(j, this) == d9nVar) {
                    return d9nVar;
                }
                this.c = null;
                this.b = (byte) 2;
                if (vr20Var2.emit(rih1Var, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
        }
    }
}
