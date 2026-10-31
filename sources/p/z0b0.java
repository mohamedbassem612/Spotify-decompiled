package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z0b0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ d1b0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0b0(lnm lnmVar, d1b0 d1b0Var, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = d1b0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d1b0 d1b0Var = this.e;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                z0b0 z0b0Var = new z0b0(lnmVar, d1b0Var, (byte) 0);
                z0b0Var.c = vr20Var;
                z0b0Var.d = obj2;
                return z0b0Var.invokeSuspend(rih1Var);
            default:
                z0b0 z0b0Var2 = new z0b0(lnmVar, d1b0Var, (byte) 1);
                z0b0Var2.c = vr20Var;
                z0b0Var2.d = obj2;
                return z0b0Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        huz lt20Var;
        huz huzVarE;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d1b0 d1b0Var = this.e;
        d9n d9nVar = d9n.a;
        byte b2 = 0;
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
                String str = (String) obj2;
                if (str == null) {
                    lt20Var = new huz(Boolean.FALSE, (byte) 10);
                } else {
                    lt20Var = new lt20(new xs4(yoi1.g(d1b0Var.f.b(new oi("kidsmode-playback-nudge", false, new ry40(str, (byte) 26)))), str, (byte) 9), new i440(3, (lnm) null, (byte) 6), (byte) 0);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var, lt20Var, this) == d9nVar ? d9nVar : rih1Var;
            default:
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
                if (((Boolean) obj3).booleanValue()) {
                    huzVarE = new huz(Boolean.FALSE, (byte) 10);
                } else {
                    int i = d1b0.i;
                    Flowable flowable = d1b0Var.d;
                    vbm[] vbmVarArr = q601.a;
                    huzVarE = hu20.e(new lt20(rqt0.u(new dy20(new kge(flowable), (byte) 2)), new i440(3, (lnm) null, (byte) 5), (byte) 0), new z0b0(lnmVar, d1b0Var, b2));
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, huzVarE, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
