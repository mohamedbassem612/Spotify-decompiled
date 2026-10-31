package p;

import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m0w implements Consumer {
    public final Scheduler a;
    public final ArrayList b = new ArrayList();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final PublishSubject d = new PublishSubject();

    public m0w(Scheduler scheduler) {
        this.a = scheduler;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(l0w l0wVar) {
        this.a.c(new nx30(this, l0wVar, (byte) 21));
    }
}
