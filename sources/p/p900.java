package p;

import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p900 implements Consumer {
    public final Scheduler a;
    public final ArrayList b = new ArrayList();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final PublishSubject d = new PublishSubject();

    public p900(Scheduler scheduler) {
        this.a = scheduler;
    }

    public final Observable a() {
        return Observable.defer(new yj1(this, (byte) 7)).subscribeOn(this.a);
    }

    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        this.a.c(new xwn1(this, obj, (byte) 18));
    }
}
