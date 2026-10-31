package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m5n implements ObservableTransformer, SingleTransformer, FlowableTransformer {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ xds b;

    public m5n(iu30 iu30Var, iu30 iu30Var2) {
        this.b = new xds(k5n.a, iu30Var, iu30Var2);
    }

    public final moy0 a(Flowable flowable) {
        byte b = this.a;
        xds xdsVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return xdsVar.a(flowable);
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        xds xdsVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return xdsVar.apply(observable);
    }

    public final Single c(Single single) {
        byte b = this.a;
        xds xdsVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return xdsVar.c(single);
    }

    public m5n(zi50 zi50Var, wck0 wck0Var) {
        this.b = new xds(hh60.T0, zi50Var, wck0Var);
    }
}
