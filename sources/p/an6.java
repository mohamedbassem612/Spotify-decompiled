package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class an6 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ an6(lnm lnmVar, iu30 iu30Var, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.e;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                an6 an6Var = new an6(lnmVar, iu30Var, (byte) 0);
                an6Var.c = vr20Var;
                an6Var.d = obj2;
                return an6Var.invokeSuspend(rih1Var);
            case 1:
                an6 an6Var2 = new an6(lnmVar, iu30Var, (byte) 1);
                an6Var2.c = vr20Var;
                an6Var2.d = obj2;
                return an6Var2.invokeSuspend(rih1Var);
            default:
                an6 an6Var3 = new an6(lnmVar, iu30Var, (byte) 2);
                an6Var3.c = vr20Var;
                an6Var3.d = obj2;
                return an6Var3.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        mr20 huzVar;
        tu41 huzVar2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Object obj2 = this.d;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    i1r i1rVar = (k1r) obj2;
                    if (i1rVar instanceof i1r) {
                        huzVar = (mr20) iu30Var.invoke(i1rVar.a);
                    } else if (i1rVar instanceof j1r) {
                        huzVar = new huz(j1r.a, (byte) 10);
                    } else if (i1rVar instanceof h1r) {
                        huzVar = new huz(new h1r(((h1r) i1rVar).a), (byte) 10);
                    } else {
                        eg.o();
                    }
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    return l4p1.s(vr20Var, huzVar, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
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
                mr20 mr20Var = obj3 != null ? (mr20) iu30Var.invoke(obj3) : r6x.a;
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, mr20Var, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var3 = this.c;
                Object obj4 = this.d;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    it61 it61Var = (jt61) obj4;
                    if (it61Var instanceof it61) {
                        huzVar2 = new tu41((mr20) iu30Var.invoke(it61Var.a), (byte) 8);
                    } else if (it61Var instanceof ht61) {
                        huzVar2 = new huz(new ht61(((ht61) it61Var).a, 0), (byte) 10);
                    } else {
                        eg.o();
                    }
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    return l4p1.s(vr20Var3, huzVar2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
