package p;

import android.text.Html;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lk1 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final Scheduler b;

    public lk1(kk1 kk1Var, Scheduler scheduler) {
        this.a = (byte) 0;
        this.b = scheduler;
    }

    public static ktv0 a(ktv0 ktv0Var) {
        String string = ktv0Var.k;
        if (string != null) {
            string = Html.fromHtml(string, 63).toString();
        }
        return new ktv0(ktv0Var.b, ktv0Var.c, ktv0Var.d, ktv0Var.e, ktv0Var.f, ktv0Var.g, ktv0Var.h, ktv0Var.i, ktv0Var.j, string, ktv0Var.l, ktv0Var.m, null, null, ktv0Var.f9p);
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        Scheduler scheduler = this.b;
        switch (b) {
            case 0:
                return observable.publish(new fl1(this, (byte) 8));
            case 1:
                return observable.flatMap(new quo0(scheduler, (byte) 0));
            case 2:
                return observable.switchMap(new jkp0(scheduler, (byte) 0));
            case 3:
                return observable.map(new a0b(this, (byte) 18)).subscribeOn(scheduler);
            case 4:
                return observable.flatMapSingle(new quo0(scheduler, (byte) 1));
            case 5:
                return observable.flatMap(new j2x0(scheduler, (byte) 0));
            case 6:
                return observable.switchMap(new j2x0(scheduler, (byte) 1));
            case 7:
                return observable.groupBy(hcx0.X0).flatMap(new y1t0(scheduler, (byte) 17));
            default:
                return observable.switchMap(new owf1(scheduler, (byte) 12));
        }
    }

    public /* synthetic */ lk1(Scheduler scheduler, byte b) {
        this.a = b;
        this.b = scheduler;
    }
}
