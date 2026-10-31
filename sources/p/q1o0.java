package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q1o0 {
    public final ut71 a;
    public final Flowable b;
    public final Scheduler c;
    public final Scheduler d;
    public final Context e;

    public q1o0(Context context, ut71 ut71Var, Flowable flowable, Scheduler scheduler, Scheduler scheduler2) {
        this.a = ut71Var;
        this.b = flowable;
        this.c = scheduler;
        this.d = scheduler2;
        this.e = context.getApplicationContext();
    }

    public final Single a() {
        return b().map(new z8c0(this, (byte) 22));
    }

    public final Single b() {
        return this.b.x(ua20.P0).J(va20.P0).z().subscribeOn(this.c).observeOn(this.d);
    }
}
