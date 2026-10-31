package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zy11 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ az11 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zy11(az11 az11Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = az11Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        az11 az11Var = this.c;
        switch (b) {
            case 0:
                return new zy11(az11Var, lnmVar, (byte) 0);
            default:
                return new zy11(az11Var, lnmVar, (byte) 1);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        az11 az11Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                x010 x010Var = new x010(az11Var.d.c(), hu20.e(az11Var.e.b, new an6((lnm) null, fft0.Z, (byte) 1)), new x2a0(3, (lnm) null, (byte) 2), (byte) 1);
                yy11 yy11Var = new yy11(2, (lnm) null, (byte) 0);
                this.b = true;
                Object objJ = b5p1.j(x010Var, yy11Var, this);
                return objJ == d9nVar ? d9nVar : objJ;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    if (az11Var.a(this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
        }
    }
}
