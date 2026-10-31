package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qn1 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ qn1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return observable.flatMap(new bv40(this, (byte) 7));
            case 1:
                lur lurVar = (lur) obj2;
                return Observable.combineLatest((ObservableSource) m5n1.o(((art) lurVar.b.get()).a, new String[]{"DeviceLastConnection"}, new qrk((byte) 14)).subscribeOn(lurVar.d).map(cq41.V0), (ObservableSource) observable, (BiFunction) new rmr(this, (byte) 15));
            case 2:
                return observable.concatMap(new n980((FlowableElementAtSingle) obj, (io91) obj2));
            default:
                return observable.concatMap(new yge0((Set) obj, (kcs) obj2, (byte) 23));
        }
    }
}
