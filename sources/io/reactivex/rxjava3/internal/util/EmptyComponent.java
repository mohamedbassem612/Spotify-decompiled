package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.pnc1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class EmptyComponent implements FlowableSubscriber<Object>, Observer<Object>, MaybeObserver<Object>, SingleObserver<Object>, CompletableObserver, pnc1, Disposable {
    public static final EmptyComponent a;
    public static final /* synthetic */ EmptyComponent[] b;

    static {
        EmptyComponent emptyComponent = new EmptyComponent("INSTANCE", 0);
        a = emptyComponent;
        b = new EmptyComponent[]{emptyComponent};
    }

    public static EmptyComponent valueOf(String str) {
        return (EmptyComponent) Enum.valueOf(EmptyComponent.class, str);
    }

    public static EmptyComponent[] values() {
        return (EmptyComponent[]) b.clone();
    }

    public final void cancel() {
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return true;
    }

    public final void onComplete() {
    }

    public final void onError(Throwable th) {
        RxJavaPlugins.b(th);
    }

    public final void onNext(Object obj) {
    }

    public final void onSubscribe(Disposable disposable) {
        disposable.dispose();
    }

    public final void onSuccess(Object obj) {
    }

    public final void request(long j) {
    }

    public final void onSubscribe(pnc1 pnc1Var) {
        pnc1Var.cancel();
    }
}
