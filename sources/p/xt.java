package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xt implements oh81 {
    public final kw a;
    public final kly0 b;
    public final Observable c;
    public final kly0 d;
    public final Single e;
    public final kly0 f;
    public final idd1 g = new idd1(new g3(this, (byte) 6));

    public xt(kw kwVar, kly0 kly0Var, Observable observable, g5t g5tVar, Single single, thq thqVar) {
        this.a = kwVar;
        this.b = kly0Var;
        this.c = observable;
        this.d = g5tVar;
        this.e = single;
        this.f = thqVar;
    }

    @Override // p.oh81
    public final mr20 a() {
        return (mr20) this.g.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        tt ttVar;
        if (onmVar instanceof tt) {
            ttVar = (tt) onmVar;
            int i = ttVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttVar.c = i - Integer.MIN_VALUE;
            } else {
                ttVar = new tt(this, onmVar);
            }
        } else {
            ttVar = new tt(this, onmVar);
        }
        Object objJ = ttVar.a;
        int i2 = ttVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleA = ((ca40) this.d.get()).a();
            ttVar.c = 1;
            objJ = fc11.j(singleA, ttVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }
}
