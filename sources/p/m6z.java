package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m6z extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6z(lnm lnmVar, q6z q6zVar, String str, lik1 lik1Var, String str2, String str3) {
        super(3, lnmVar);
        this.a = (byte) 0;
        this.e = q6zVar;
        this.f = str;
        this.i = lik1Var;
        this.g = str2;
        this.h = str3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        switch (b) {
            case 0:
                m6z m6zVar = new m6z((lnm) obj3, (q6z) obj8, (String) obj7, (lik1) obj4, (String) obj6, (String) obj5);
                m6zVar.c = (vr20) obj;
                m6zVar.d = obj2;
                return m6zVar.invokeSuspend(rih1Var);
            case 1:
                byte b2 = 1;
                m6z m6zVar2 = new m6z(b2, (kjm) obj8, (m1x0) obj7, (z6x0) obj6, (n1r) obj5, (n1r) obj4, (lnm) obj3);
                m6zVar2.c = (vr20) obj;
                m6zVar2.d = obj2;
                return m6zVar2.invokeSuspend(rih1Var);
            default:
                byte b3 = 2;
                m6z m6zVar3 = new m6z(b3, (g891) obj8, (mr20) obj7, (mr20) obj6, (mr20) obj5, (mr20) obj4, (lnm) obj3);
                m6zVar3.c = (vr20) obj;
                m6zVar3.d = obj2;
                return m6zVar3.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Object obj6 = this.d;
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
                boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                z6x z6xVar = z6x.a;
                o6z o6zVar = zBooleanValue ? new o6z(new huz(z6xVar, (byte) 10), (byte) 0) : new huz(new e6z(z6xVar, false), (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var, o6zVar, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                vr20 vr20Var2 = this.c;
                Object obj7 = this.d;
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
                huz huzVar = !u890.j((k9d0) obj7, i9d0.a) ? new huz((kjm) this.e, (byte) 10) : new m441(new hgo0((m1x0) obj5, (z6x0) obj4, (n1r) obj3, (n1r) obj2, (lnm) null, (byte) 6));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, huzVar, this) == d9nVar ? d9nVar : rih1Var;
            default:
                mr20 mr20Var = (mr20) obj5;
                vr20 vr20Var3 = this.c;
                Object obj8 = this.d;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Long l = (Long) obj8;
                evz tu41Var = (l == null || l.longValue() < 0) ? new tu41(mr20Var, (byte) 24) : h5p1.r((mr20) obj4, (mr20) obj3, (mr20) obj2, mr20Var, new e891(l, (lnm) null));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var3, tu41Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m6z(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, lnm lnmVar) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.i = obj5;
    }
}
