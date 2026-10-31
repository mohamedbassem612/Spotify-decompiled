package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class quo0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Scheduler b;

    public /* synthetic */ quo0(Scheduler scheduler, byte b) {
        this.a = b;
        this.b = scheduler;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        Scheduler scheduler = this.b;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        switch (b) {
            case 0:
                return Single.timer(1000L, timeUnit, scheduler).map(new zud0((auo0) obj, (byte) 21)).toObservable();
            default:
                return Observable.just(nuv0.a).delay(500L, timeUnit, scheduler).singleOrError();
        }
    }
}
