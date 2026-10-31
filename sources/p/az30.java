package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class az30 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ cz30 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ az30(cz30 cz30Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = cz30Var;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        cz30 cz30Var = this.c;
        switch (b) {
            case 0:
                return new az30(cz30Var, str, lnmVar, (byte) 0);
            default:
                return new az30(cz30Var, str, lnmVar, (byte) 1);
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
        String str = this.d;
        d9n d9nVar = d9n.a;
        cz30 cz30Var = this.c;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    obj = cz30Var.a(this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                r091 r091Var = (r091) obj;
                if (r091Var != null) {
                    ebp1.s(r091Var, cz30.b(str, true), (tv80) null, ijy0.a, 14);
                    r091Var.k();
                }
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    obj = cz30Var.a(this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                r091 r091Var2 = (r091) obj;
                if (r091Var2 != null) {
                    r091Var2.b(cz30.b(str, false));
                    r091Var2.h(0L);
                    r091.f(r091Var2, (tv80) null, (Long) null, ijy0.a, 7);
                    r091Var2.k();
                }
                return rih1Var;
        }
    }
}
