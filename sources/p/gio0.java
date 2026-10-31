package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gio0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gio0(lnm lnmVar, String str, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.e;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                gio0 gio0Var = new gio0(lnmVar, str, (byte) 0);
                gio0Var.c = vr20Var;
                gio0Var.d = obj2;
                return gio0Var.invokeSuspend(rih1Var);
            case 1:
                gio0 gio0Var2 = new gio0(lnmVar, str, (byte) 1);
                gio0Var2.c = vr20Var;
                gio0Var2.d = obj2;
                return gio0Var2.invokeSuspend(rih1Var);
            default:
                gio0 gio0Var3 = new gio0(lnmVar, str, (byte) 2);
                gio0Var3.c = vr20Var;
                gio0Var3.d = obj2;
                return gio0Var3.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        huz huzVar;
        byte b = this.a;
        mr20 huzVar2 = r6x.a;
        rih1 rih1Var = rih1.a;
        String str = this.e;
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
                        huzVar = new huz(new mmr0(str, i1rVar.a), (byte) 10);
                    } else if (i1rVar instanceof j1r) {
                        huzVar = new huz(new mmr0(str, new s2o((String) null, (String) null, true)), (byte) 10);
                    } else if (i1rVar instanceof h1r) {
                        huzVar = new huz(new mmr0(str, new s2o((String) null, (String) null, false)), (byte) 10);
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
                uq51 uq51Var = (uq51) ((Map) obj3).get(str);
                if (uq51Var != null) {
                    huzVar2 = new huz(new n5f0(uq51Var.a, uq51Var.b), (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, huzVar2, this) == d9nVar ? d9nVar : rih1Var;
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
                uq51 uq51Var2 = (uq51) ((Map) obj4).get(str);
                if (uq51Var2 != null) {
                    huzVar2 = new ht20(new zo51(uq51Var2.c, uq51Var2, (byte) 1), new lc41(uq51Var2, null, (byte) 18));
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var3, huzVar2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
