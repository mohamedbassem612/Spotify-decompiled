package com.spotify.mobius.rx3;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Update;
import com.spotify.mobius.internal_util.Preconditions;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import java.util.HashMap;
import p.eg;
import p.h9k1;
import p.lxh1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class RxMobius {
    public static MobiusLoop.Builder a(Update update, ObservableTransformer observableTransformer) {
        return Mobius.d(update, RxConnectables.a(observableTransformer));
    }

    public static ObservableTransformer b(MobiusLoop.Factory factory, Object obj) {
        return new RxMobiusLoop(factory, obj);
    }

    public static SubtypeEffectHandlerBuilder c() {
        return new SubtypeEffectHandlerBuilder(0);
    }

    public static class SubtypeEffectHandlerBuilder<F, E> {
        public final HashMap a;
        public final b b;

        private SubtypeEffectHandlerBuilder() {
            this.a = new HashMap();
            this.b = new b();
        }

        public final void a(Class cls, Action action) {
            g(cls, Transformers.b(action));
        }

        public final void b(Class cls, Action action, Scheduler scheduler) {
            g(cls, Transformers.a(scheduler, action));
        }

        public final void c(Class cls, Consumer consumer) {
            Preconditions.b(consumer);
            g(cls, Transformers.c(consumer));
        }

        public final void d(Class cls, Consumer consumer, Scheduler scheduler) {
            Preconditions.b(consumer);
            g(cls, Transformers.d(consumer, scheduler));
        }

        public final void e(Class cls, Function function) {
            Preconditions.b(function);
            g(cls, Transformers.e(function));
        }

        public final void f(lxh1 lxh1Var, Scheduler scheduler) {
            g(h9k1.class, Transformers.f(lxh1Var, scheduler));
        }

        public final void g(Class cls, ObservableTransformer observableTransformer) {
            Preconditions.b(cls);
            Preconditions.b(observableTransformer);
            HashMap map = this.a;
            for (Class<?> cls2 : map.keySet()) {
                if (cls2.isAssignableFrom(cls) || cls.isAssignableFrom(cls2)) {
                    eg.i("Effect classes may not be assignable to each other, collision found: ", cls.getSimpleName(), " <-> ", cls2.getSimpleName());
                    return;
                }
            }
            map.put(cls, new c(this, cls, observableTransformer));
        }

        public final ObservableTransformer h() {
            HashMap map = this.a;
            return new MobiusEffectRouter(map.keySet(), map.values());
        }

        public /* synthetic */ SubtypeEffectHandlerBuilder(int i) {
            this();
        }
    }
}
