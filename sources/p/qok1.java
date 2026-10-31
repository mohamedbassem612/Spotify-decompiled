package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qok1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ wok1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qok1(wok1 wok1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = wok1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        wok1 wok1Var = this.c;
        switch (b) {
            case 0:
                return new qok1(wok1Var, lnmVar, (byte) 0);
            default:
                return new qok1(wok1Var, lnmVar, (byte) 1);
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
        wok1 wok1Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    ty60 ty60Var = wok1Var.i;
                    this.b = true;
                    if (ty60Var.a(this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                wok1Var.h.m((Object) null, b090.a);
                return rih1.a;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                int i = wok1.f48p;
                Object objI = wok1Var.i(this);
                return objI == d9nVar ? d9nVar : objI;
        }
    }
}
