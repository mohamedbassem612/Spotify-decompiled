package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lzs extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qzs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lzs(qzs qzsVar, byte b) {
        super(1);
        this.a = b;
        this.b = qzsVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        qzs qzsVar = this.b;
        switch (b) {
            case 0:
                stk1 stk1Var = (stk1) obj;
                String str = stk1Var.g;
                if (str != null) {
                    return new qer(rqt0.u(new huz(new x68(((vk50) qzsVar.b.get()).a.f, str, (byte) 1), (byte) 13)), stk1Var, (byte) 29);
                }
                kzs kzsVar = ((szs) qzsVar.a.get()).a;
                inr inrVar = kzsVar.a;
                FlowableDistinctUntilChanged flowableDistinctUntilChangedS = Observable.combineLatest(inrVar.d(), inrVar.j(), s9w.Y0).filter(m9h.b1).map(p9w.Y0).toFlowable(BackpressureStrategy.d).s(q9w.Z0);
                wcr wcrVar = new wcr(kzsVar, (byte) 17);
                int i = Flowable.a;
                FlowableObserveOn flowableObserveOnL = flowableDistinctUntilChangedS.A(wcrVar, i, i).v(fcc.b1).L(kzsVar.d);
                vbm[] vbmVarArr = q601.a;
                return new pzs(new xy0(new kge(flowableObserveOnL), (byte) 15), stk1Var, (byte) 0);
            default:
                ((qtr) obj).b(new lu(qzsVar, null, (byte) 26));
                return rih1.a;
        }
    }
}
