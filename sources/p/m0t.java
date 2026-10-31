package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m0t {
    public final BehaviorSubject a;
    public final BehaviorSubject b;
    public final PublishSubject c;
    public final Observable d;
    public final Observable e;
    public final PublishSubject f;

    public m0t(Scheduler scheduler) {
        BehaviorSubject behaviorSubjectG = BehaviorSubject.g(aal1.a);
        this.a = behaviorSubjectG;
        BehaviorSubject behaviorSubjectG2 = BehaviorSubject.g(Float.valueOf(1.0f));
        this.b = behaviorSubjectG2;
        PublishSubject publishSubject = new PublishSubject();
        this.c = publishSubject;
        this.d = behaviorSubjectG.observeOn(scheduler).distinctUntilChanged();
        this.e = behaviorSubjectG2.observeOn(scheduler).distinctUntilChanged();
        this.f = publishSubject;
    }

    public static void a(m0t m0tVar, int i) {
        m0tVar.a.onNext(new z9l1((i & 1) == 0));
    }

    public final void b() {
        this.a.onNext(aal1.a);
    }
}
