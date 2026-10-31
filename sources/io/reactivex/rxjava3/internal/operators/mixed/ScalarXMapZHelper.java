package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToObservable;
import io.reactivex.rxjava3.internal.operators.single.SingleToObservable;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
abstract class ScalarXMapZHelper {
    public static boolean a(Object obj, Function function, CompletableObserver completableObserver) {
        CompletableSource completableSource;
        EmptyDisposable emptyDisposable = EmptyDisposable.a;
        if (!(obj instanceof Supplier)) {
            return false;
        }
        try {
            Object obj2 = ((Supplier) obj).get();
            if (obj2 != null) {
                Object objApply = function.apply(obj2);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                completableSource = (CompletableSource) objApply;
            } else {
                completableSource = null;
            }
            if (completableSource != null) {
                completableSource.subscribe(completableObserver);
                return true;
            }
            completableObserver.onSubscribe(emptyDisposable);
            completableObserver.onComplete();
            return true;
        } catch (Throwable th) {
            Exceptions.a(th);
            completableObserver.onSubscribe(emptyDisposable);
            completableObserver.onError(th);
            return true;
        }
    }

    public static boolean b(Object obj, Function function, Observer observer) {
        MaybeSource maybeSource;
        if (!(obj instanceof Supplier)) {
            return false;
        }
        try {
            Object obj2 = ((Supplier) obj).get();
            if (obj2 != null) {
                Object objApply = function.apply(obj2);
                Objects.requireNonNull(objApply, "The mapper returned a null MaybeSource");
                maybeSource = (MaybeSource) objApply;
            } else {
                maybeSource = null;
            }
            if (maybeSource == null) {
                EmptyDisposable.b(observer);
                return true;
            }
            maybeSource.subscribe(MaybeToObservable.a(observer));
            return true;
        } catch (Throwable th) {
            Exceptions.a(th);
            EmptyDisposable.c(th, observer);
            return true;
        }
    }

    public static boolean c(Object obj, Function function, Observer observer) {
        SingleSource singleSource;
        if (!(obj instanceof Supplier)) {
            return false;
        }
        try {
            Object obj2 = ((Supplier) obj).get();
            if (obj2 != null) {
                Object objApply = function.apply(obj2);
                Objects.requireNonNull(objApply, "The mapper returned a null SingleSource");
                singleSource = (SingleSource) objApply;
            } else {
                singleSource = null;
            }
            if (singleSource == null) {
                EmptyDisposable.b(observer);
                return true;
            }
            singleSource.subscribe(SingleToObservable.a(observer));
            return true;
        } catch (Throwable th) {
            Exceptions.a(th);
            EmptyDisposable.c(th, observer);
            return true;
        }
    }
}
