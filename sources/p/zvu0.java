package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zvu0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ phi0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ dwu0 e;
    public final /* synthetic */ rss f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zvu0(phi0 phi0Var, String str, dwu0 dwu0Var, rss rssVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = phi0Var;
        this.d = str;
        this.e = dwu0Var;
        this.f = rssVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new zvu0(this.c, this.d, this.e, this.f, lnmVar, (byte) 0);
            default:
                return new zvu0(this.c, this.d, this.e, this.f, lnmVar, (byte) 1);
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
        dwu0 dwu0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    return this.c.x(this.d, this.e, true, this.f, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    int iOrdinal = this.e.ordinal();
                    if (iOrdinal == 0) {
                        dwu0Var = dwu0.b;
                    } else if (iOrdinal == 1) {
                        dwu0Var = dwu0.a;
                    } else {
                        eg.o();
                    }
                    dwu0 dwu0Var2 = dwu0Var;
                    this.b = true;
                    return this.c.x(this.d, dwu0Var2, false, this.f, this) == d9nVar ? d9nVar : rih1Var;
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
