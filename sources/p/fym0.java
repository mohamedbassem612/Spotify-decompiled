package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fym0 extends a8d1 implements dv30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ km61 c;
    public /* synthetic */ lp61 d;
    public /* synthetic */ tqw e;
    public /* synthetic */ igb1 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fym0(Object obj, lnm lnmVar, byte b) {
        super(6, lnmVar);
        this.a = b;
        this.h = obj;
    }

    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj7 = this.h;
        km61 km61Var = (km61) obj;
        switch (b) {
            case 0:
                fym0 fym0Var = new fym0((a680) obj7, (lnm) obj6, (byte) 0);
                fym0Var.c = km61Var;
                fym0Var.f = (xxm0) obj2;
                fym0Var.d = (lp61) obj3;
                fym0Var.g = (cym0) obj4;
                fym0Var.e = (tqw) obj5;
                return fym0Var.invokeSuspend(rih1Var);
            default:
                fym0 fym0Var2 = new fym0((d520) obj7, (lnm) obj6, (byte) 1);
                fym0Var2.c = km61Var;
                fym0Var2.f = (ibd1) obj2;
                fym0Var2.d = (lp61) obj3;
                fym0Var2.g = (obd1) obj4;
                fym0Var2.e = (tqw) obj5;
                return fym0Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.h;
        switch (b) {
            case 0:
                a680 a680Var = (a680) obj2;
                km61 km61Var = this.c;
                xxm0 xxm0Var = (xxm0) this.f;
                lp61 lp61Var = this.d;
                cym0 cym0Var = (cym0) this.g;
                tqw tqwVar = this.e;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    if (cym0Var instanceof bym0) {
                        Integer num = (Integer) lp61Var.c;
                        qxm0 qxm0Var = ((bym0) cym0Var).a;
                        this.c = null;
                        this.f = null;
                        this.d = null;
                        this.g = null;
                        this.e = null;
                        this.b = true;
                        return a680Var.v(km61Var, xxm0Var, num, qxm0Var, tqwVar, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    if (cym0Var instanceof aym0) {
                        ((i9i1) a680Var.e).b(((aym0) cym0Var).a);
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                d520 d520Var = (d520) obj2;
                km61 km61Var2 = this.c;
                ibd1 ibd1Var = (ibd1) this.f;
                lp61 lp61Var2 = this.d;
                obd1 obd1Var = (obd1) this.g;
                tqw tqwVar2 = this.e;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    if (obd1Var instanceof mbd1) {
                        Boolean bool = (Boolean) lp61Var2.c;
                        boolean z3 = ((mbd1) obd1Var).a;
                        this.c = null;
                        this.f = null;
                        this.d = null;
                        this.g = null;
                        this.e = null;
                        this.b = true;
                        return d520Var.g0(km61Var2, ibd1Var, bool, z3, tqwVar2, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    if (obd1Var instanceof nbd1) {
                        ((i9i1) d520Var.f).b(((nbd1) obd1Var).a);
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }
}
