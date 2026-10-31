package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mxz0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ nxz0 c;
    public final /* synthetic */ jxz0 d;
    public final /* synthetic */ y301 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mxz0(nxz0 nxz0Var, jxz0 jxz0Var, y301 y301Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = nxz0Var;
        this.d = jxz0Var;
        this.e = y301Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new mxz0(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new mxz0(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        rih1 rih1Var = rih1.a;
        s301 s301Var = this.e;
        jxz0 jxz0Var = this.d;
        nxz0 nxz0Var = this.c;
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
                uqv0 uqv0Var = nxz0Var.c;
                String str = nxz0Var.a;
                String str2 = jxz0Var.d;
                String str3 = s301Var.a;
                this.b = true;
                return uqv0Var.c(str, str2, str3, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                uqv0 uqv0Var2 = nxz0Var.c;
                String str4 = nxz0Var.a;
                String str5 = jxz0Var.d;
                String str6 = ((q301) s301Var).a;
                this.b = true;
                return uqv0Var2.h(str4, str5, str6, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
