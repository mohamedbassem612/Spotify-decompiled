package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class SchedulerPoolFactory {
    public static final boolean a;

    public static final class SystemPropertyAccessor implements Function<String, String> {
        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return System.getProperty((String) obj);
        }
    }

    static {
        boolean zEquals = true;
        try {
            String str = (String) new SystemPropertyAccessor().apply("rx3.purge-enabled");
            if (str != null) {
                zEquals = "true".equals(str);
            }
        } catch (Throwable th) {
            Exceptions.a(th);
        }
        a = zEquals;
    }
}
