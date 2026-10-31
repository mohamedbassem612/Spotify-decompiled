package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.observers.BlockingObserver;
import io.reactivex.rxjava3.internal.observers.LambdaObserver;
import io.reactivex.rxjava3.internal.util.BlockingIgnoringReceiver;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import p.k220;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ObservableBlockingSubscribe {
    public static <T> void subscribe(ObservableSource<? extends T> observableSource, Observer<? super T> observer) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        BlockingObserver blockingObserver = new BlockingObserver(linkedBlockingQueue);
        observer.onSubscribe(blockingObserver);
        observableSource.subscribe(blockingObserver);
        while (!blockingObserver.isDisposed()) {
            Object objPoll = linkedBlockingQueue.poll();
            if (objPoll == null) {
                try {
                    objPoll = linkedBlockingQueue.take();
                } catch (InterruptedException e) {
                    blockingObserver.dispose();
                    observer.onError(e);
                    return;
                }
            }
            if (blockingObserver.isDisposed() || objPoll == BlockingObserver.b || NotificationLite.c(observer, objPoll)) {
                return;
            }
        }
    }

    public static <T> void subscribe(ObservableSource<? extends T> observableSource) {
        BlockingIgnoringReceiver blockingIgnoringReceiver = new BlockingIgnoringReceiver();
        Consumer consumer = Functions.d;
        LambdaObserver lambdaObserver = new LambdaObserver(consumer, blockingIgnoringReceiver, blockingIgnoringReceiver, consumer);
        observableSource.subscribe(lambdaObserver);
        if (blockingIgnoringReceiver.getCount() != 0) {
            try {
                blockingIgnoringReceiver.await();
            } catch (InterruptedException e) {
                lambdaObserver.dispose();
                Thread.currentThread().interrupt();
                k220.p("Interrupted while waiting for subscription to complete.", e);
                return;
            }
        }
        Throwable th = blockingIgnoringReceiver.a;
        if (th != null) {
            throw ExceptionHelper.f(th);
        }
    }

    public static <T> void subscribe(ObservableSource<? extends T> observableSource, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        Objects.requireNonNull(consumer, "onNext is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        subscribe(observableSource, new LambdaObserver(consumer, consumer2, action, Functions.d));
    }
}
