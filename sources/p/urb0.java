package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class urb0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ xrb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ urb0(xrb0 xrb0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = xrb0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        xrb0 xrb0Var = this.c;
        switch (b) {
            case 0:
                return new urb0(xrb0Var, lnmVar, (byte) 0);
            case 1:
                return new urb0(xrb0Var, lnmVar, (byte) 1);
            case 2:
                return new urb0(xrb0Var, lnmVar, (byte) 2);
            case 3:
                return new urb0(xrb0Var, lnmVar, (byte) 3);
            default:
                return new urb0(xrb0Var, lnmVar, (byte) 4);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xrb0 xrb0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
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
                o95 o95Var = xrb0Var.q;
                Float f = new Float(1.0f);
                this.b = true;
                return o95Var.g(f, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    o95 o95Var2 = xrb0Var.p;
                    qr80 qr80Var = new qr80(0L);
                    this.b = true;
                    if (o95Var2.g(qr80Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                xrb0Var.e(0L);
                xrb0Var.h.setValue(Boolean.FALSE);
                return rih1Var;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    o95 o95Var3 = xrb0Var.p;
                    this.b = true;
                    return o95Var3.h(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    o95 o95Var4 = xrb0Var.q;
                    this.b = true;
                    return o95Var4.h(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    o95 o95Var5 = xrb0Var.q;
                    this.b = true;
                    return o95Var5.h(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z5) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
