package com.spotify.mobius.rx3;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.concurrent.atomic.AtomicBoolean;
import p.t610;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class RxEventSources {
    public static EventSource a(ObservableSource... observableSourceArr) {
        final Observable observableMergeArray = Observable.mergeArray(observableSourceArr);
        return new EventSource<Object>() { // from class: com.spotify.mobius.rx3.RxEventSources.1
            @Override // com.spotify.mobius.EventSource
            public final Disposable a(Consumer consumer) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean();
                final io.reactivex.rxjava3.disposables.Disposable disposableSubscribe = observableMergeArray.subscribe(new t610(atomicBoolean, consumer, (byte) 1));
                return new Disposable() { // from class: p.f241
                    @Override // com.spotify.mobius.disposables.Disposable
                    public final void dispose() {
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        io.reactivex.rxjava3.disposables.Disposable disposable = disposableSubscribe;
                        synchronized (atomicBoolean2) {
                            disposable.dispose();
                            atomicBoolean2.set(true);
                        }
                    }
                };
            }
        };
    }
}
