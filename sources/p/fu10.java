package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fu10 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ mu10 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fu10(Object obj, lnm lnmVar, mu10 mu10Var, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = mu10Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        mu10 mu10Var = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                fu10 fu10Var = new fu10(obj2, lnmVar, mu10Var, (byte) 0);
                fu10Var.c = obj;
                return fu10Var;
            default:
                fu10 fu10Var2 = new fu10(obj2, lnmVar, mu10Var, (byte) 1);
                fu10Var2.c = obj;
                return fu10Var2;
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
        mu10 mu10Var = this.e;
        Object obj2 = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    return rih1Var;
                }
                hm5.M(obj);
                pt10 pt10Var = (pt10) obj2;
                m7o0 m7o0Var = mu10Var.b;
                String str = pt10Var.a;
                String str2 = pt10Var.b;
                this.c = null;
                this.b = true;
                return m7o0Var.d(str, str2, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    return rih1Var;
                }
                hm5.M(obj);
                vr20 vr20Var = (vr20) this.c;
                jt10 jt10Var = (jt10) obj2;
                if (!mu10Var.d.a(jt10Var.a)) {
                    return rih1Var;
                }
                yu10 yu10Var = new yu10(jt10Var.b);
                this.c = null;
                this.b = true;
                return vr20Var.emit(yu10Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
