package p;

import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mnr implements Consumer {
    public final Scheduler a;
    public final ArrayList b = new ArrayList();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final PublishSubject d = new PublishSubject();

    public mnr(Scheduler scheduler) {
        this.a = scheduler;
    }

    public final void accept(Object obj) {
        this.a.c(new xwn1(this, (p0l) obj, (byte) 15));
    }
}
