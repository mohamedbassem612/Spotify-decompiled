package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tjh {
    public final Scheduler a;
    public final yqg b;
    public final n4b c;
    public final ujh d;
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();
    public final Observable h;
    public final PublishSubject i;
    public final Observable j;

    public tjh(Observable observable, Scheduler scheduler, yqg yqgVar, n4b n4bVar, ujh ujhVar) {
        this.a = scheduler;
        this.b = yqgVar;
        this.c = n4bVar;
        this.d = ujhVar;
        this.h = observable.filter(s321.R0).distinctUntilChanged();
        PublishSubject publishSubject = new PublishSubject();
        this.i = publishSubject;
        this.j = publishSubject.replay(1).a(0);
    }

    public final CompletableSubscribeOn a(String str, boolean z) {
        if (z) {
            this.e.clear();
        }
        return this.h.firstOrError().flatMapCompletable(new aod(this, str, (byte) 19)).s(this.a);
    }

    public final void b(long j, String str) {
        PublishSubject publishSubject = (PublishSubject) this.g.get(str);
        if (publishSubject != null) {
            publishSubject.onNext(new qjh(j, true));
        }
    }
}
