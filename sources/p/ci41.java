package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class ci41 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uw0 b;

    public /* synthetic */ ci41(uw0 uw0Var, byte b) {
        this.a = b;
        this.b = uw0Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        uw0 uw0Var = this.b;
        switch (b) {
            case 0:
                return ((kh41) uw0Var.d).a((String) obj).toObservable();
            default:
                ((c241) uw0Var.f).getClass();
                return Observable.fromCallable(new lhn((u141) obj, (byte) 5)).subscribeOn((Scheduler) uw0Var.c);
        }
    }
}
