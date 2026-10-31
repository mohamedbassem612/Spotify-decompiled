package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g2x0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ g2x0(Scheduler scheduler, Object obj, byte b) {
        this.a = b;
        this.b = scheduler;
        this.c = obj;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        byte b2 = 18;
        byte b3 = 22;
        byte b4 = 8;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return observable.switchMap(new yeu0((o241) obj2, (Scheduler) obj, (byte) 23));
            case 1:
                return observable.switchMapSingle(new xmu0((g341) obj2, (Scheduler) obj, (byte) 18));
            case 2:
                return observable.observeOn((Scheduler) obj).flatMap(new l1p0((m1x0) obj2, (byte) 26));
            case 3:
                return observable.flatMap(new yqu0((o3x0) obj2, (zsc) obj, (byte) 19));
            case 4:
                return observable.switchMap(new zgz0(this, (byte) 9));
            case 5:
                return observable.withLatestFrom(yoi1.i(((zwz0) obj2).c(), o6x.a), mgx0.f).filter(bjx0.g).switchMap(new m7y0(this, (byte) 12)).map(djx0.g);
            case 6:
                return observable.switchMap(new dc31((f420) obj2, (s080) obj, b4));
            case 7:
                return observable.switchMap(new m021((Scheduler) obj, (yqg) obj2, b2));
            case 8:
                return observable.flatMapMaybe(new dc31((nt8) obj2, (cs61) obj, b3));
            case 9:
                return observable.switchMapSingle(new n381((Scheduler) obj, (p5a0) obj2, b3));
            case 10:
                return observable.doOnSubscribe(new qcc1(this, (byte) 0)).flatMap(new ep31(this, (byte) 25)).doOnDispose(new ruz0(this, (byte) 14)).doOnError(new qcc1(this, (byte) 1));
            case 11:
                return observable.debounce(new h5a1(this, (byte) 16)).switchMap(new y281(this, (byte) 26));
            case 12:
                return observable.switchMap(new iqh1(this));
            case 13:
                return observable.map(new csj1((onr) obj2, (byte) 2)).observeOn((Scheduler) obj).map(ybx0.X0);
            case 14:
                return observable.flatMap(new qpj1((j1l1) obj2, (Scheduler) obj, (byte) 8));
            case 15:
                return observable.flatMap(new qpj1((j1l1) obj2, (vu30) obj, (byte) 9));
            default:
                return observable.flatMapCompletable(new dmj1(this, (byte) 5)).w();
        }
    }

    public /* synthetic */ g2x0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }
}
