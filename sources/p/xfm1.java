package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xfm1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ cik1 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xfm1(cik1 cik1Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = cik1Var;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        cik1 cik1Var = this.c;
        switch (b) {
            case 0:
                return new xfm1(cik1Var, str, lnmVar, (byte) 0);
            default:
                return new xfm1(cik1Var, str, lnmVar, (byte) 1);
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
        cik1 cik1Var = this.c;
        d9n d9nVar = d9n.a;
        String str = this.d;
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
                zfm1 zfm1Var = (zfm1) cik1Var.b;
                String strV0 = ihc1.V0(str, ':', str);
                this.b = true;
                Object objA = zfm1Var.a(strV0, this);
                return objA == d9nVar ? d9nVar : objA;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                obj = cik1Var.e(str, this);
                if (obj == d9nVar) {
                    return d9nVar;
                }
                bgm1 bgm1Var = (bgm1) obj;
                if (bgm1Var != null) {
                    return new mmr0(str, bgm1Var);
                }
                return null;
        }
    }
}
