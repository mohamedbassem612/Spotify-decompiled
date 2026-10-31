package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bdd0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bdd0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        byte b2 = 0;
        switch (b) {
            case 0:
                p811 p811Var = new p811();
                mdd0 mdd0Var = (mdd0) obj3;
                lmy0 lmy0Var = mdd0Var.a;
                String str = (String) obj2;
                return d5p1.r(new iib(hu20.d(new mr20[]{hu20.e(hu20.d(new mr20[]{new s1g(new fu20(rqt0.u(hu20.e(lmy0Var.b, new an6((lnm) null, fft0.Z, (byte) 1))), new hak(p811Var, (lnm) null, (byte) 2), (byte) 1), (byte) 4), new b8d0(new ycd0(mdd0Var.g, str, b2), p811Var, (byte) 2)}), new qd0((byte) 26, mdd0Var, str, (lnm) null)), new tf2(lmy0Var.a("hm://listening-activity/", new j2d0(mdd0Var, str, (byte) 1)), (byte) 14)}), new zz90(mdd0Var, p811Var, str, null), (byte) 6), mdd0Var.e, new alb1(5000L, 90000L), 1);
            case 1:
                fip0 fip0Var = (fip0) obj3;
                a201 a201Var = (a201) fip0Var.b;
                ConnectableObservable connectableObservableReplay = a201Var.a.map(new hwb(a201Var, (byte) 26)).distinctUntilChanged().onErrorReturnItem(new hgc1(4)).switchMap(new bnj0(fip0Var, (String) obj2)).replay(1);
                connectableObservableReplay.getClass();
                Scheduler scheduler = Schedulers.b;
                ObjectHelper.a(1, "observerCount");
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Objects.requireNonNull(timeUnit, "unit is null");
                Objects.requireNonNull(scheduler, "scheduler is null");
                return new ObservableRefCount(connectableObservableReplay, 5L, timeUnit, scheduler);
            default:
                cqa1 cqa1Var = (cqa1) obj3;
                return fn31.q(cqa1Var.b, (o8n) null, 0, new bqa1(cqa1Var, (zpa1) obj2, null, (byte) 1), 3);
        }
    }
}
