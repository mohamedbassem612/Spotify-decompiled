package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tk21 {
    public final Scheduler a;
    public final PublishSubject b = new PublishSubject();

    public tk21(Scheduler scheduler) {
        this.a = scheduler;
    }
}
