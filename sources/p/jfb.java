package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jfb {
    public final Context a;
    public final ArrayList b = new ArrayList(2);
    public boolean c;
    public final ObservableRefCount d;

    static {
        new hfb((byte) 0);
    }

    public jfb(Context context, Scheduler scheduler) {
        this.a = context;
        this.d = Observable.create(new i3b(this, (byte) 1)).startWith(new pf90(this)).distinctUntilChanged().subscribeOn(scheduler).replay(1).f();
    }
}
