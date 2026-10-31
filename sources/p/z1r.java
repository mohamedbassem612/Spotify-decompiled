package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z1r extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ k2q e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1r(lnm lnmVar, k2q k2qVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = k2qVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        k2q k2qVar = this.e;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                z1r z1rVar = new z1r(lnmVar, k2qVar, (byte) 0);
                z1rVar.c = vr20Var;
                z1rVar.d = obj2;
                return z1rVar.invokeSuspend(rih1Var);
            case 1:
                z1r z1rVar2 = new z1r(lnmVar, k2qVar, (byte) 1);
                z1rVar2.c = vr20Var;
                z1rVar2.d = obj2;
                return z1rVar2.invokeSuspend(rih1Var);
            default:
                z1r z1rVar3 = new z1r(lnmVar, k2qVar, (byte) 2);
                z1rVar3.c = vr20Var;
                z1rVar3.d = obj2;
                return z1rVar3.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        jge huzVar;
        byte b = this.a;
        w1r w1rVar = w1r.a;
        rih1 rih1Var = rih1.a;
        k2q k2qVar = this.e;
        d9n d9nVar = d9n.a;
        byte b2 = 1;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Object obj2 = this.d;
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
                if (((Boolean) obj2).booleanValue()) {
                    t1r t1rVar = (t1r) k2qVar.b;
                    zia ziaVar = t1rVar.d;
                    if (!ziaVar.c()) {
                        ziaVar.accept(Boolean.valueOf(t1rVar.a.h(t1r.h, false)));
                    }
                    huzVar = hu20.c(yoi1.g(ziaVar), new xw0(k2qVar, (lnm) null, (byte) 2));
                } else {
                    huzVar = new huz(w1rVar, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var, huzVar, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                vr20 vr20Var2 = this.c;
                Object obj3 = this.d;
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
                jge jgeVarC = ((Boolean) obj3).booleanValue() ? hu20.c(((fal) ((kly0) k2qVar.c).get()).f, new n1o(k2qVar, null, (byte) 3)) : new huz(w1rVar, (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, jgeVarC, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var3 = this.c;
                Object obj4 = this.d;
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
                y1r y1rVar = (y1r) obj4;
                huz huzVar2 = y1rVar instanceof x1r ? new huz(y1rVar, (byte) 10) : hu20.e(yoi1.g(((t1r) k2qVar.b).a()), new z1r(lnmVar, k2qVar, b2));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var3, huzVar2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
