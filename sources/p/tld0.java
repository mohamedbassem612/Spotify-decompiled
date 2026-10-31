package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tld0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ qld0 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tld0(qld0 qld0Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = qld0Var;
        this.e = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.e;
        qld0 qld0Var = this.d;
        switch (b) {
            case 0:
                tld0 tld0Var = new tld0(qld0Var, str, lnmVar, (byte) 0);
                tld0Var.c = obj;
                return tld0Var;
            default:
                tld0 tld0Var2 = new tld0(qld0Var, str, lnmVar, (byte) 1);
                tld0Var2.c = obj;
                return tld0Var2;
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
        rih1 rih1Var = rih1.a;
        String str = this.e;
        qld0 qld0Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
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
                ezc ezcVarG = yoi1.g(qld0Var.a.d(qld0Var.b, str));
                this.c = null;
                this.b = true;
                return l4p1.s(vr20Var, ezcVarG, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var2 = (vr20) this.c;
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
                ezc ezcVarG2 = yoi1.g(qld0Var.a.c(qld0Var.b, str));
                this.c = null;
                this.b = true;
                return l4p1.s(vr20Var2, ezcVarG2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
