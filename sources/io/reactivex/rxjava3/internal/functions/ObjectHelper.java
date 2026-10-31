package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.functions.BiPredicate;
import java.util.Objects;
import p.hhg1;
import p.l1d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class ObjectHelper {
    public static final BiPredicate a = new BiObjectPredicate();

    public static final class BiObjectPredicate implements BiPredicate<Object, Object> {
        @Override // io.reactivex.rxjava3.functions.BiPredicate
        public final boolean test(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }
    }

    public static void a(int i, String str) {
        if (i > 0) {
            return;
        }
        hhg1.n(l1d.k(i, str, " > 0 required but it was "));
    }

    public static void b(long j, String str) {
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j);
    }
}
