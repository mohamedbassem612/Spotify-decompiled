package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j2x0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Scheduler b;

    public /* synthetic */ j2x0(Scheduler scheduler, byte b) {
        this.a = b;
        this.b = scheduler;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        Scheduler scheduler = this.b;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        switch (b) {
            case 0:
                return Observable.just(v2x0.a).delay(500L, timeUnit, scheduler);
            default:
                return ((pa41) obj).c ? Observable.just(new eb41(true)).delay(3000L, timeUnit, scheduler).startWithItem(new eb41(false)) : Observable.never();
        }
    }
}
