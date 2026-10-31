package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yr0 implements wyo0 {
    public final k9r a;
    public final idd1 b;
    public final mr20 c;

    public yr0(k9r k9rVar, dg30 dg30Var, thq thqVar, ObservableFromPublisher observableFromPublisher, qq0 qq0Var) {
        this.a = k9rVar;
        this.b = new idd1(new tr0(dg30Var, (byte) 0));
        this.c = rqt0.u(new ht20(hu20.e(rqt0.u(new x010(qq0Var.d, yoi1.g(observableFromPublisher), new qr0(this, null, (byte) 0), (byte) 1)), new vr0(null, this, dg30Var, thqVar)), new sd0(2, (lnm) null, (byte) 2)));
    }

    public final mr20 a() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) {
        ur0 ur0Var;
        if (onmVar instanceof ur0) {
            ur0Var = (ur0) onmVar;
            int i = ur0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ur0Var.c = i - Integer.MIN_VALUE;
            } else {
                ur0Var = new ur0(this, onmVar);
            }
        } else {
            ur0Var = new ur0(this, onmVar);
        }
        Object objJ = ur0Var.a;
        int i2 = ur0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            if (str == null) {
                str = "";
            }
            int iIntValue = ((Number) this.b.getValue()).intValue();
            k9r k9rVar = this.a;
            Single singleOnErrorReturn = Single.create(new lbq(k9rVar, str, (byte) 21)).subscribeOn((Scheduler) k9rVar.d).map(new ij81(k9rVar, iIntValue)).map(ios.U0).onErrorReturn(new ij81(iIntValue, (byte) 11));
            ur0Var.c = 1;
            objJ = fc11.j(singleOnErrorReturn, ur0Var);
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
