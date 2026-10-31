package com.spotify.mobius;

import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.internal_util.Preconditions;
import com.spotify.mobius.runners.WorkRunner;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p.bb00;
import p.eg;
import p.gvg;
import p.k220;
import p.l8m0;
import p.qau;
import p.ywx0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class MobiusLoop<M, E, F> implements Loop<M, E, F> {
    public final DiscardAfterDisposeWrapper a;
    public final DiscardAfterDisposeWrapper b;
    public final MessageDispatcher c;
    public final MessageDispatcher d;
    public final EventProcessor e;
    public final Connection f;
    public final QueuingConnection g;
    public volatile Object i;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public volatile RunState t = RunState.a;

    /* JADX INFO: renamed from: com.spotify.mobius.MobiusLoop$3, reason: invalid class name */
    class AnonymousClass3 implements Consumer<Object> {
        public AnonymousClass3() {
        }

        @Override // com.spotify.mobius.functions.Consumer
        public final void accept(Object obj) {
            MobiusLoop.this.i = obj;
            MobiusLoop.this.g.accept(obj);
            Iterator<E> it = MobiusLoop.this.h.iterator();
            while (it.hasNext()) {
                ((Consumer) it.next()).accept(obj);
            }
        }
    }

    public interface Builder<M, E, F> extends Factory<M, E, F> {
        Builder b(Producer producer);

        Builder c(EventSource eventSource, EventSource... eventSourceArr);

        Builder d(Producer producer);

        Builder e(Init init);

        Builder f(Logger logger);

        Builder h(EventSource eventSource);

        Builder i(Connectable connectable);
    }

    public interface Controller<M, E> {
        Object a();

        void b(qau qauVar);

        void c(Connectable connectable);

        void disconnect();

        boolean isRunning();

        void start();

        void stop();
    }

    public interface Factory<M, E, F> {
        MobiusLoop a(Object obj, Set set);

        MobiusLoop g(Object obj);
    }

    public interface Logger<M, E, F> {
        void a(Object obj, Object obj2, Next next);

        void b(Object obj, Object obj2, Exception exc);

        void c(Object obj, First first);

        void d(Object obj, Object obj2);

        void e(Object obj);

        void f(Object obj, Exception exc);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RunState {
        public static final RunState a;
        public static final RunState b;
        public static final RunState c;
        public static final /* synthetic */ RunState[] d;

        static {
            RunState runState = new RunState("RUNNING", 0);
            a = runState;
            RunState runState2 = new RunState("DISPOSING", 1);
            b = runState2;
            RunState runState3 = new RunState("DISPOSED", 2);
            c = runState3;
            d = new RunState[]{runState, runState2, runState3};
        }

        public static RunState valueOf(String str) {
            return (RunState) Enum.valueOf(RunState.class, str);
        }

        public static RunState[] values() {
            return (RunState[]) d.clone();
        }
    }

    public MobiusLoop(EventProcessor.Factory factory, Object obj, Set set, Connectable connectable, Connectable connectable2, WorkRunner workRunner, WorkRunner workRunner2) {
        DiscardAfterDisposeWrapper discardAfterDisposeWrapper = new DiscardAfterDisposeWrapper(new Consumer<Object>() { // from class: com.spotify.mobius.MobiusLoop.1
            @Override // com.spotify.mobius.functions.Consumer
            public final void accept(Object obj2) {
                Next nextA;
                final EventProcessor eventProcessor = MobiusLoop.this.e;
                synchronized (eventProcessor) {
                    MobiusStore mobiusStore = eventProcessor.a;
                    synchronized (mobiusStore) {
                        Update update = mobiusStore.a;
                        Object obj3 = mobiusStore.b;
                        Preconditions.b(obj2);
                        nextA = ((LoggingUpdate) update).a(obj3, obj2);
                        mobiusStore.b = nextA.f(mobiusStore.b);
                    }
                    nextA.e(new Consumer<Object>() { // from class: com.spotify.mobius.EventProcessor.1
                        @Override // com.spotify.mobius.functions.Consumer
                        public final void accept(Object obj4) {
                            ((MobiusLoop.AnonymousClass3) EventProcessor.this.c).accept(obj4);
                        }
                    });
                    Iterator it = ((AutoValue_Next) nextA).b.iterator();
                    while (it.hasNext()) {
                        ((MessageDispatcher) eventProcessor.b).accept(it.next());
                    }
                }
            }
        }, null);
        this.a = discardAfterDisposeWrapper;
        DiscardAfterDisposeWrapper discardAfterDisposeWrapper2 = new DiscardAfterDisposeWrapper(new Consumer<Object>() { // from class: com.spotify.mobius.MobiusLoop.2
            /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.mobius.ConnectionException */
            @Override // com.spotify.mobius.functions.Consumer
            public final void accept(Object obj2) throws ConnectionException {
                try {
                    MobiusLoop.this.f.accept(obj2);
                } catch (Throwable th) {
                    throw new ConnectionException(obj2, th);
                }
            }
        }, null);
        this.b = discardAfterDisposeWrapper2;
        this.g = new QueuingConnection();
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        this.c = new MessageDispatcher(workRunner, discardAfterDisposeWrapper);
        MessageDispatcher messageDispatcher = new MessageDispatcher(workRunner2, discardAfterDisposeWrapper2);
        this.d = messageDispatcher;
        this.e = new EventProcessor(factory.a, messageDispatcher, anonymousClass3);
        Consumer<Object> consumer = new Consumer<Object>() { // from class: com.spotify.mobius.MobiusLoop.4
            @Override // com.spotify.mobius.functions.Consumer
            public final void accept(Object obj2) {
                MobiusLoop.this.a(obj2);
            }
        };
        this.f = connectable.L(consumer);
        this.i = obj;
        anonymousClass3.accept(obj);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.d.accept(it.next());
        }
        QueuingConnection queuingConnection = this.g;
        Connection connectionL = connectable2.L(consumer);
        QueuingConnection.QueuingDelegate queuingDelegate = queuingConnection.a;
        AtomicReference atomicReference = queuingConnection.b;
        if (atomicReference.get() == QueuingConnection.c) {
            return;
        }
        if (!ywx0.o(atomicReference, queuingDelegate, connectionL)) {
            eg.m("Attempt at setting the active delegate twice");
            throw null;
        }
        QueuingConnection queuingConnection2 = QueuingConnection.this;
        Connection connection = (Connection) queuingConnection2.b.get();
        if (connection == queuingConnection2.a) {
            return;
        }
        while (true) {
            Object objPoll = queuingDelegate.a.poll();
            if (objPoll == null) {
                return;
            } else {
                connection.accept(objPoll);
            }
        }
    }

    public final void a(Object obj) {
        if (this.t == RunState.c) {
            throw new IllegalStateException(String.format("This loop has already been disposed. You cannot dispatch events after disposal - event received: %s=%s, currentModel: %s", obj.getClass().getName(), obj, this.i));
        }
        if (this.t == RunState.b) {
            return;
        }
        try {
            MessageDispatcher messageDispatcher = this.c;
            Preconditions.b(obj);
            messageDispatcher.accept(obj);
        } catch (RuntimeException e) {
            k220.p(gvg.g(obj, "Exception processing event: "), e);
        }
    }

    public final Disposable b(Consumer consumer) {
        if (this.t == RunState.c) {
            eg.m("This loop has already been disposed. You cannot observe a disposed loop");
            return null;
        }
        if (this.t == RunState.b) {
            return new l8m0();
        }
        final FireAtLeastOnceObserver fireAtLeastOnceObserver = new FireAtLeastOnceObserver(consumer);
        this.h.add(fireAtLeastOnceObserver);
        Object obj = this.i;
        if (obj != null) {
            if (bb00.m(fireAtLeastOnceObserver.d, new AtomicReference(obj))) {
                fireAtLeastOnceObserver.a();
            }
        }
        return new Disposable() { // from class: com.spotify.mobius.MobiusLoop.5
            @Override // com.spotify.mobius.disposables.Disposable
            public final void dispose() {
                MobiusLoop.this.h.remove(fireAtLeastOnceObserver);
            }
        };
    }

    @Override // com.spotify.mobius.disposables.Disposable
    public final synchronized void dispose() {
        RunState runState = this.t;
        RunState runState2 = RunState.c;
        if (runState == runState2) {
            return;
        }
        this.t = RunState.b;
        this.h.clear();
        this.a.dispose();
        this.b.dispose();
        this.g.dispose();
        this.f.dispose();
        this.c.dispose();
        this.d.dispose();
        this.t = runState2;
    }
}
