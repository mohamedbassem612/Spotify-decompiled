package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ued0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ m5b0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ued0(m5b0 m5b0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = m5b0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        m5b0 m5b0Var = this.d;
        switch (b) {
            case 0:
                ued0 ued0Var = new ued0(m5b0Var, lnmVar, (byte) 0);
                ued0Var.c = obj;
                return ued0Var;
            default:
                ued0 ued0Var2 = new ued0(m5b0Var, lnmVar, (byte) 1);
                ued0Var2.c = obj;
                return ued0Var2;
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
        m5b0 m5b0Var = this.d;
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
                if (vr20Var.emit(rih1Var, this) == d9nVar) {
                    return d9nVar;
                }
                ve01 ve01Var = ((hfd0) m5b0Var.g).a;
                this.c = null;
                this.b = (byte) 2;
                if (l4p1.s(vr20Var, ve01Var, this) == d9nVar) {
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
                if (vr20Var2.emit(rih1Var, this) == d9nVar) {
                    return d9nVar;
                }
                ve01 ve01Var2 = ((hfd0) m5b0Var.g).a;
                this.c = null;
                this.b = (byte) 2;
                if (l4p1.s(vr20Var2, ve01Var2, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
        }
    }
}
