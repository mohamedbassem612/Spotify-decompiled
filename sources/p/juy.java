package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class juy extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kuy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ juy(kuy kuyVar, byte b) {
        super(1);
        this.a = b;
        this.b = kuyVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        kuy kuyVar = this.b;
        switch (b) {
            case 0:
                boolean z = kuyVar.c;
                Flowable flowable = (Flowable) kuyVar.f;
                if (!z) {
                    flowable.getClass();
                    return o4p1.r(hu20.c(rqt0.u(new p3t(yoi1.g(new ObservableFromPublisher(flowable)), (byte) 15)), new ymu(kuyVar, (lnm) null, (byte) 22)), (q8n) kuyVar.i);
                }
                Flowable flowableX = flowable.J(uh21.c1).t(Functions.a).X(new efr(kuyVar, (byte) 26));
                flowableX.getClass();
                return yoi1.g(new ObservableFromPublisher(flowableX));
            case 1:
                return kuyVar.c ? fuy.a : new guy((String) null, (String) null);
            default:
                ((qtr) obj).b(new skv(kuyVar, (lnm) null, (byte) 1));
                return rih1.a;
        }
    }
}
