package p;

import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pwa1 {
    public final oqa1 a;
    public final ov20 b;
    public final r241 c;

    public pwa1(oqa1 oqa1Var, ov20 ov20Var, r241 r241Var) {
        this.a = oqa1Var;
        this.b = ov20Var;
        this.c = r241Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, onm onmVar) {
        nwa1 nwa1Var;
        if (onmVar instanceof nwa1) {
            nwa1Var = (nwa1) onmVar;
            int i = nwa1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nwa1Var.c = i - Integer.MIN_VALUE;
            } else {
                nwa1Var = new nwa1(this, onmVar);
            }
        } else {
            nwa1Var = new nwa1(this, onmVar);
        }
        Object obj = nwa1Var.a;
        int i2 = nwa1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Completable completableB = this.c.b("speed-control", z ? "1" : "0");
                nwa1Var.c = 1;
                Object objI = fc11.i(completableB, nwa1Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (Throwable unused) {
        }
        return rih1.a;
    }
}
