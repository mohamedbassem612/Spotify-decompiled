package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.NoSuchElementException;
import p.moy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class SingleInternalHelper {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NoSuchElementSupplier implements Supplier<NoSuchElementException> {
        public static final NoSuchElementSupplier a;
        public static final /* synthetic */ NoSuchElementSupplier[] b;

        static {
            NoSuchElementSupplier noSuchElementSupplier = new NoSuchElementSupplier("INSTANCE", 0);
            a = noSuchElementSupplier;
            b = new NoSuchElementSupplier[]{noSuchElementSupplier};
        }

        public static NoSuchElementSupplier valueOf(String str) {
            return (NoSuchElementSupplier) Enum.valueOf(NoSuchElementSupplier.class, str);
        }

        public static NoSuchElementSupplier[] values() {
            return (NoSuchElementSupplier[]) b.clone();
        }

        public final Object get() {
            return new NoSuchElementException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ToFlowable implements Function<SingleSource, moy0> {
        public static final ToFlowable a;
        public static final /* synthetic */ ToFlowable[] b;

        static {
            ToFlowable toFlowable = new ToFlowable("INSTANCE", 0);
            a = toFlowable;
            b = new ToFlowable[]{toFlowable};
        }

        public static ToFlowable valueOf(String str) {
            return (ToFlowable) Enum.valueOf(ToFlowable.class, str);
        }

        public static ToFlowable[] values() {
            return (ToFlowable[]) b.clone();
        }

        public final Object apply(Object obj) {
            return new SingleToFlowable((SingleSource) obj);
        }
    }

    public static Supplier a() {
        return NoSuchElementSupplier.a;
    }

    public static Function b() {
        return ToFlowable.a;
    }
}
