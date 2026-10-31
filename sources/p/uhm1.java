package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uhm1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wj41 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uhm1(boolean z, wj41 wj41Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = z;
        this.c = wj41Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new uhm1(this.b, this.c, lnmVar, (byte) 0);
            default:
                return new uhm1(this.b, this.c, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wj41 wj41Var = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (!z) {
                    wj41Var.d.m((Object) null, Boolean.FALSE);
                } else {
                    wj41Var.d.m((Object) null, Boolean.TRUE);
                }
                break;
            default:
                hm5.M(obj);
                if (!z) {
                    wj41Var.e.m((Object) null, Boolean.FALSE);
                } else {
                    wj41Var.e.m((Object) null, Boolean.TRUE);
                }
                break;
        }
        return rih1Var;
    }
}
