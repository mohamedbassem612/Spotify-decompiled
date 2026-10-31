package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jai0 extends a8d1 implements bv30 {
    public boolean a;
    public /* synthetic */ mey0 b;
    public /* synthetic */ hob1 c;
    public /* synthetic */ c700 d;
    public /* synthetic */ tqw e;
    public final /* synthetic */ lo60 f;
    public final /* synthetic */ vgm g;
    public final /* synthetic */ dnc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jai0(lo60 lo60Var, vgm vgmVar, dnc dncVar, lnm lnmVar) {
        super(5, lnmVar);
        this.f = lo60Var;
        this.g = vgmVar;
        this.h = dncVar;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        vgm vgmVar = this.g;
        dnc dncVar = this.h;
        jai0 jai0Var = new jai0(this.f, vgmVar, dncVar, (lnm) obj5);
        jai0Var.b = (mey0) obj;
        jai0Var.c = (hob1) obj2;
        jai0Var.d = (c700) obj3;
        jai0Var.e = (tqw) obj4;
        return jai0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        mey0 mey0Var = this.b;
        hob1 hob1Var = this.c;
        c700 c700Var = this.d;
        tqw tqwVar = this.e;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            if (u890.j(c700Var, kwz.a) || (c700Var instanceof gzz)) {
                hqn1.q(this.f, mey0Var.d, tqwVar, (Bundle) null);
            } else if (u890.j(c700Var, nwz.a)) {
                wcm wcmVar = hob1Var.o;
                String str = wcmVar.a;
                tqwVar.getClass();
                vgm.b(this.g, str, (String) null, n3o1.y(tqwVar), (tgm) wcmVar.f.invoke(), 2);
            } else if (u890.j(c700Var, mxz.a)) {
                enc encVar = new enc(mey0Var.d, null, tqwVar != null ? n3o1.y(tqwVar) : null, false, false, null, 228);
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.a = true;
                Object objB = this.h.b(encVar, this);
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
