package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElementCompletable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hq8 {
    public final Scheduler a;
    public final Observable b;
    public final Context c;

    public hq8(Scheduler scheduler, Scheduler scheduler2, Flowable flowable, km3 km3Var, z141 z141Var, MaybeIgnoreElementCompletable maybeIgnoreElementCompletable, Context context) {
        this.a = scheduler;
        this.b = z141Var.a;
        this.c = context;
    }
}
