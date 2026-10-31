package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.android.AndroidLogger;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Cancellable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Objects;
import p.ms20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mo91 extends hab0 implements iu30 {
    public final /* synthetic */ PublishSubject a;
    public final /* synthetic */ EventSource b;
    public final /* synthetic */ Scheduler c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo91(PublishSubject publishSubject, EventSource eventSource, Scheduler scheduler) {
        super(1);
        this.a = publishSubject;
        this.b = eventSource;
        this.c = scheduler;
    }

    public final Object invoke(Object obj) {
        Scheduler scheduler = this.c;
        cas casVar = (a7m0) obj;
        casVar.d = new mw1(scheduler, (byte) 8);
        casVar.e = new mw1(scheduler, (byte) 9);
        final EventSource eventSource = this.b;
        casVar.b = RxEventSources.a(new ObservableSource[]{this.a, Observable.create(new ObservableOnSubscribe() { // from class: com.spotify.mobius.rx3.a
            public final void subscribe(ObservableEmitter observableEmitter) {
                Objects.requireNonNull(observableEmitter);
                final Disposable disposableA = eventSource.a(new ms20(observableEmitter, (byte) 2));
                Objects.requireNonNull(disposableA);
                observableEmitter.setCancellable(new Cancellable() { // from class: p.g241
                    public final void cancel() {
                        disposableA.dispose();
                    }
                });
            }
        })});
        casVar.g = new AndroidLogger();
        casVar.a = yd81.V0;
        return rih1.a;
    }
}
