package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.functions.Function6;
import io.reactivex.rxjava3.functions.Function7;
import io.reactivex.rxjava3.functions.Function8;
import io.reactivex.rxjava3.functions.Function9;
import io.reactivex.rxjava3.functions.LongConsumer;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p.bhn0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class Functions {
    public static final Function a = new Identity();
    public static final Runnable b = new EmptyRunnable();
    public static final Action c = new EmptyAction();
    public static final Consumer d = new EmptyConsumer();
    public static final Consumer e = new ErrorConsumer();
    public static final Consumer f = new OnErrorMissingConsumer();
    public static final LongConsumer g = new EmptyLongConsumer();
    public static final Predicate h = new TruePredicate();
    public static final Predicate i = new FalsePredicate();
    public static final Supplier j = new NullProvider();

    public static final class Array2Func<T1, T2, R> implements Function<Object[], R> {
        public final BiFunction a;

        public Array2Func(BiFunction biFunction) {
            this.a = biFunction;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 2) {
                bhn0.e(objArr.length, "Array of size 2 expected but got ");
                return null;
            }
            return this.a.apply(objArr[0], objArr[1]);
        }
    }

    public static final class Array3Func<T1, T2, T3, R> implements Function<Object[], R> {
        public final Function3 a;

        public Array3Func(Function3 function3) {
            this.a = function3;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 3) {
                bhn0.e(objArr.length, "Array of size 3 expected but got ");
                return null;
            }
            return this.a.n(objArr[0], objArr[1], objArr[2]);
        }
    }

    public static final class Array4Func<T1, T2, T3, T4, R> implements Function<Object[], R> {
        public final Function4 a;

        public Array4Func(Function4 function4) {
            this.a = function4;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 4) {
                bhn0.e(objArr.length, "Array of size 4 expected but got ");
                return null;
            }
            return this.a.N(objArr[0], objArr[1], objArr[2], objArr[3]);
        }
    }

    public static final class Array6Func<T1, T2, T3, T4, T5, T6, R> implements Function<Object[], R> {
        public final Function6 a;

        public Array6Func(Function6 function6) {
            this.a = function6;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 6) {
                bhn0.e(objArr.length, "Array of size 6 expected but got ");
                return null;
            }
            return this.a.c(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
        }
    }

    public static final class Array7Func<T1, T2, T3, T4, T5, T6, T7, R> implements Function<Object[], R> {
        public final Function7 a;

        public Array7Func(Function7 function7) {
            this.a = function7;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 7) {
                bhn0.e(objArr.length, "Array of size 7 expected but got ");
                return null;
            }
            return this.a.i(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
        }
    }

    public static final class CastToClass<T, U> implements Function<T, U> {
        public final Class a;

        public CastToClass(Class cls) {
            this.a = cls;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return this.a.cast(obj);
        }
    }

    public static final class ClassFilter<T, U> implements Predicate<T> {
        public final Class a;

        public ClassFilter(Class cls) {
            this.a = cls;
        }

        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            return this.a.isInstance(obj);
        }
    }

    public static final class EmptyAction implements Action {
        @Override // io.reactivex.rxjava3.functions.Action
        public final void run() {
        }

        public final String toString() {
            return "EmptyAction";
        }
    }

    public static final class EmptyConsumer implements Consumer<Object> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
        }

        public final String toString() {
            return "EmptyConsumer";
        }
    }

    public static final class EmptyLongConsumer implements LongConsumer {
    }

    public static final class EmptyRunnable implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }

        public final String toString() {
            return "EmptyRunnable";
        }
    }

    public static final class ErrorConsumer implements Consumer<Throwable> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            RxJavaPlugins.b((Throwable) obj);
        }
    }

    public static final class FalsePredicate implements Predicate<Object> {
        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            return false;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class HashSetSupplier implements Supplier<Set<Object>> {
        public static final HashSetSupplier a;
        public static final /* synthetic */ HashSetSupplier[] b;

        static {
            HashSetSupplier hashSetSupplier = new HashSetSupplier("INSTANCE", 0);
            a = hashSetSupplier;
            b = new HashSetSupplier[]{hashSetSupplier};
        }

        public static HashSetSupplier valueOf(String str) {
            return (HashSetSupplier) Enum.valueOf(HashSetSupplier.class, str);
        }

        public static HashSetSupplier[] values() {
            return (HashSetSupplier[]) b.clone();
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return new HashSet();
        }
    }

    public static final class Identity implements Function<Object, Object> {
        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return obj;
        }

        public final String toString() {
            return "IdentityFunction";
        }
    }

    public static final class JustValue<T, U> implements Callable<U>, Supplier<U>, Function<T, U> {
        public final Object a;

        public JustValue(Object obj) {
            this.a = obj;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return this.a;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return this.a;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return this.a;
        }
    }

    public static final class MaxRequestSubscription implements Consumer<pnc1> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            ((pnc1) obj).request(Long.MAX_VALUE);
        }
    }

    public static final class NotificationOnComplete<T> implements Action {
        public final Consumer a;

        public NotificationOnComplete(Consumer consumer) {
            this.a = consumer;
        }

        @Override // io.reactivex.rxjava3.functions.Action
        public final void run() {
            this.a.accept(Notification.b);
        }
    }

    public static final class NotificationOnError<T> implements Consumer<Throwable> {
        public final Consumer a;

        public NotificationOnError(Consumer consumer) {
            this.a = consumer;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            this.a.accept(Notification.a((Throwable) obj));
        }
    }

    public static final class NotificationOnNext<T> implements Consumer<T> {
        public final Consumer a;

        public NotificationOnNext(Consumer consumer) {
            this.a = consumer;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            this.a.accept(Notification.b(obj));
        }
    }

    public static final class NullProvider implements Supplier<Object> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return null;
        }
    }

    public static final class OnErrorMissingConsumer implements Consumer<Throwable> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            RxJavaPlugins.b(new OnErrorNotImplementedException((Throwable) obj));
        }
    }

    public static final class TruePredicate implements Predicate<Object> {
        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            return true;
        }
    }

    static {
        new MaxRequestSubscription();
    }

    public static Consumer a(Action action) {
        return new ActionConsumer(action);
    }

    public static Function b(Class cls) {
        return new CastToClass(cls);
    }

    public static Supplier c(int i2) {
        return new ArrayListCapacityCallable(i2);
    }

    public static Supplier d() {
        return HashSetSupplier.a;
    }

    public static Predicate e(Object obj) {
        return new EqualsPredicate(obj);
    }

    public static Predicate f(Class cls) {
        return new ClassFilter(cls);
    }

    public static Function g(Object obj) {
        return new JustValue(obj);
    }

    public static Supplier h(Object obj) {
        return new JustValue(obj);
    }

    public static Function i(Comparator comparator) {
        return new ListSorter(comparator);
    }

    public static Comparator j() {
        return NaturalComparator.a;
    }

    public static Action k(Consumer consumer) {
        return new NotificationOnComplete(consumer);
    }

    public static Consumer l(Consumer consumer) {
        return new NotificationOnError(consumer);
    }

    public static Consumer m(Consumer consumer) {
        return new NotificationOnNext(consumer);
    }

    public static Predicate n(BooleanSupplier booleanSupplier) {
        return new BooleanSupplierPredicateReverse(booleanSupplier);
    }

    public static Function o(TimeUnit timeUnit, Scheduler scheduler) {
        return new TimestampFunction(timeUnit, scheduler);
    }

    public static Function p(BiFunction biFunction) {
        return new Array2Func(biFunction);
    }

    public static Function q(Function3 function3) {
        return new Array3Func(function3);
    }

    public static Function r(Function4 function4) {
        return new Array4Func(function4);
    }

    public static Function s(Function5 function5) {
        return new Array5Func(function5);
    }

    public static Function t(Function6 function6) {
        return new Array6Func(function6);
    }

    public static Function u(Function7 function7) {
        return new Array7Func(function7);
    }

    public static Function v(Function8 function8) {
        return new Array8Func(function8);
    }

    public static Function w(Function9 function9) {
        return new Array9Func(function9);
    }

    public static BiConsumer x(Function function) {
        return new ToMapKeySelector(function);
    }

    public static BiConsumer y(Function function, Function function2) {
        return new ToMapKeyValueSelector(function2, function);
    }

    public static BiConsumer z(Function function, Function function2, Function function3) {
        return new ToMultimapKeyValueSelector(function3, function2, function);
    }
}
