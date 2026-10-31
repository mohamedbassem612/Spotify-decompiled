package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fei0 extends a8d1 implements bv30 {
    public boolean a;
    public /* synthetic */ mey0 b;
    public /* synthetic */ hob1 c;
    public /* synthetic */ c700 d;
    public /* synthetic */ tqw e;
    public final /* synthetic */ lo60 f;
    public final /* synthetic */ vgm g;
    public final /* synthetic */ vu30 h;
    public final /* synthetic */ dnc i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fei0(lo60 lo60Var, vgm vgmVar, vu30 vu30Var, dnc dncVar, lnm lnmVar) {
        super(5, lnmVar);
        this.f = lo60Var;
        this.g = vgmVar;
        this.h = vu30Var;
        this.i = dncVar;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        vu30 vu30Var = this.h;
        dnc dncVar = this.i;
        fei0 fei0Var = new fei0(this.f, this.g, vu30Var, dncVar, (lnm) obj5);
        fei0Var.b = (mey0) obj;
        fei0Var.c = (hob1) obj2;
        fei0Var.d = (c700) obj3;
        fei0Var.e = (tqw) obj4;
        return fei0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        mey0 mey0Var = this.b;
        hob1 hob1Var = this.c;
        c700 c700Var = this.d;
        tqw tqwVar = this.e;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            if ((c700Var instanceof kwz) || (c700Var instanceof gzz)) {
                hqn1.q(this.f, hob1Var.d, tqwVar, (Bundle) null);
            } else if (c700Var instanceof nwz) {
                tgm tgmVar = (tgm) hob1Var.o.f.invoke();
                String str = hob1Var.o.a;
                tqwVar.getClass();
                vgm.b(this.g, str, (String) null, n3o1.y(tqwVar), tgm.a(tgmVar, false, false, 0, false, (sgm) null, new eei0(this.h, mey0Var, (byte) 0), (p860) null, false, -134217729), 2);
            } else if (c700Var instanceof mxz) {
                enc encVarE = upo1.E(mey0Var, hob1Var, tqwVar, false, (Long) null, false);
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.a = true;
                Object objB = this.i.b(encVarE, this);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
