package com.spotify.mobius;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.internal_util.ImmutableUtil;
import com.spotify.mobius.internal_util.Preconditions;
import com.spotify.mobius.runners.ExecutorServiceWorkRunner;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p.hhg1;
import p.j3v;
import p.mjv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class Mobius {
    public static final b a = new b();
    public static final MobiusLoop.Logger b = new MobiusLoop.Logger<Object, Object, Object>() { // from class: com.spotify.mobius.Mobius.2
        @Override // com.spotify.mobius.MobiusLoop.Logger
        public final void a(Object obj, Object obj2, Next next) {
        }

        @Override // com.spotify.mobius.MobiusLoop.Logger
        public final void b(Object obj, Object obj2, Exception exc) {
            System.err.println("error updating model: '" + obj + "' with event: '" + obj2 + "' - " + exc);
            exc.printStackTrace(System.err);
        }

        @Override // com.spotify.mobius.MobiusLoop.Logger
        public final void c(Object obj, First first) {
        }

        @Override // com.spotify.mobius.MobiusLoop.Logger
        public final void d(Object obj, Object obj2) {
        }

        @Override // com.spotify.mobius.MobiusLoop.Logger
        public final void e(Object obj) {
        }

        @Override // com.spotify.mobius.MobiusLoop.Logger
        public final void f(Object obj, Exception exc) {
            System.err.println("error initialising from model: '" + obj + "' - " + exc);
            exc.printStackTrace(System.err);
        }
    };

    public static final class Builder<M, E, F> implements MobiusLoop.Builder<M, E, F> {
        public final Update a;
        public final Connectable b;
        public final Init c;
        public final Connectable d;
        public final Producer e;
        public final Producer f;
        public final MobiusLoop.Logger g;

        public Builder(Update update, Connectable connectable, Init init, Connectable connectable2, MobiusLoop.Logger logger, Producer producer, Producer producer2) {
            Preconditions.b(update);
            this.a = update;
            Preconditions.b(connectable);
            this.b = connectable;
            this.c = init;
            this.d = connectable2;
            Preconditions.b(producer);
            this.e = producer;
            this.f = producer2;
            Preconditions.b(logger);
            this.g = logger;
        }

        @Override // com.spotify.mobius.MobiusLoop.Factory
        public final MobiusLoop a(Object obj, Set set) {
            if (this.c == null) {
                return j(obj, set);
            }
            hhg1.n("cannot pass in start effects when a loop has init defined");
            return null;
        }

        @Override // com.spotify.mobius.MobiusLoop.Builder
        public final MobiusLoop.Builder b(Producer producer) {
            return new Builder(this.a, this.b, this.c, this.d, this.g, this.e, producer);
        }

        @Override // com.spotify.mobius.MobiusLoop.Builder
        public final MobiusLoop.Builder c(EventSource eventSource, EventSource... eventSourceArr) {
            return new Builder(this.a, this.b, this.c, new EventSourceConnectable(MergedEventSource.b(eventSource, eventSourceArr)), this.g, this.e, this.f);
        }

        @Override // com.spotify.mobius.MobiusLoop.Builder
        public final MobiusLoop.Builder d(Producer producer) {
            return new Builder(this.a, this.b, this.c, this.d, this.g, producer, this.f);
        }

        @Override // com.spotify.mobius.MobiusLoop.Builder
        public final MobiusLoop.Builder e(Init init) {
            Preconditions.b(init);
            return new Builder(this.a, this.b, init, this.d, this.g, this.e, this.f);
        }

        @Override // com.spotify.mobius.MobiusLoop.Builder
        public final MobiusLoop.Builder f(MobiusLoop.Logger logger) {
            return new Builder(this.a, this.b, this.c, this.d, logger, this.e, this.f);
        }

        @Override // com.spotify.mobius.MobiusLoop.Factory
        public final MobiusLoop g(Object obj) {
            ImmutableUtil.a();
            Set set = Collections.EMPTY_SET;
            Init init = this.c;
            if (init != null) {
                LoggingInit loggingInit = new LoggingInit(init, this.g);
                Preconditions.b(obj);
                First firstE0 = loggingInit.e0(obj);
                Object obj2 = ((AutoValue_First) firstE0).a;
                set = ((AutoValue_First) firstE0).b;
                obj = obj2;
            }
            return j(obj, set);
        }

        @Override // com.spotify.mobius.MobiusLoop.Builder
        public final MobiusLoop.Builder h(EventSource eventSource) {
            return new Builder(this.a, this.b, this.c, new EventSourceConnectable(eventSource), this.g, this.e, this.f);
        }

        @Override // com.spotify.mobius.MobiusLoop.Builder
        public final MobiusLoop.Builder i(Connectable connectable) {
            return new Builder(this.a, this.b, this.c, connectable, this.g, this.e, this.f);
        }

        public final MobiusLoop j(Object obj, Set set) {
            LoggingUpdate loggingUpdate = new LoggingUpdate(this.a, this.g);
            WorkRunner workRunner = (WorkRunner) this.e.get();
            Preconditions.b(workRunner);
            WorkRunner workRunner2 = (WorkRunner) this.f.get();
            Preconditions.b(workRunner2);
            Preconditions.b(obj);
            EventProcessor.Factory factory = new EventProcessor.Factory(new MobiusStore(loggingUpdate, obj));
            Preconditions.b(set);
            Connectable connectable = this.b;
            Preconditions.b(connectable);
            return new MobiusLoop(factory, obj, set, connectable, this.d, workRunner, workRunner2);
        }
    }

    public static MobiusLoop.Controller a(MobiusLoop.Factory factory, Object obj, Init init) {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
        return new MobiusLoopController(factory, obj, init, new ImmediateWorkRunner());
    }

    public static MobiusLoop.Controller b(MobiusLoop.Factory factory, Object obj, Init init, WorkRunner workRunner) {
        return new MobiusLoopController(factory, obj, init, workRunner);
    }

    public static MobiusLoop.Controller c(MobiusLoop.Factory factory, Object obj, WorkRunner workRunner) {
        return new MobiusLoopController(factory, obj, null, workRunner);
    }

    public static MobiusLoop.Builder d(Update update, Connectable connectable) {
        return new Builder(update, connectable, null, a, b, new Producer<WorkRunner>() { // from class: com.spotify.mobius.Mobius.3
            @Override // com.spotify.mobius.functions.Producer
            public final Object get() {
                mjv mjvVar = MobiusPlugins.b;
                return mjvVar != null ? (WorkRunner) mjvVar.get() : WorkRunners.a();
            }
        }, new Producer<WorkRunner>() { // from class: com.spotify.mobius.Mobius.4
            @Override // com.spotify.mobius.functions.Producer
            public final Object get() {
                j3v j3vVar = MobiusPlugins.a;
                if (j3vVar != null) {
                    return (WorkRunner) j3vVar.get();
                }
                ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(WorkRunners.a);
                Preconditions.b(executorServiceNewCachedThreadPool);
                return new ExecutorServiceWorkRunner(executorServiceNewCachedThreadPool);
            }
        });
    }
}
