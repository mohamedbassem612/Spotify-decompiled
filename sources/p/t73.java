package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t73 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ x73 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t73(x73 x73Var, String str, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = x73Var;
        this.d = str;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        x73 x73Var = this.c;
        switch (b) {
            case 0:
                return new t73(x73Var, str, lnmVar, (byte) 0);
            default:
                return new t73(x73Var, str, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        String str = this.d;
        x73 x73Var = this.c;
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
                yg7 yg7Var = x73Var.m;
                this.b = true;
                Object objC = yg7Var.c(str, this);
                return objC == d9nVar ? d9nVar : objC;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    ezc ezcVarG = yoi1.g(x73Var.l.a(str));
                    this.b = true;
                    obj = b5p1.i(ezcVarG, this);
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
                return obj;
        }
    }
}
