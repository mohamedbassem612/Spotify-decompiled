package com.spotify.mobius.extras;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class QueueingEventSubject<E> implements EventSource<E>, Consumer<E> {
    public final ArrayBlockingQueue a = new ArrayBlockingQueue(10);
    public State b = State.a;
    public Consumer c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        public static final State a;
        public static final State b;
        public static final /* synthetic */ State[] c;

        static {
            State state = new State("NO_SUBSCRIBER", 0);
            a = state;
            State state2 = new State("SUBSCRIBED", 1);
            b = state2;
            c = new State[]{state, state2};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) c.clone();
        }
    }

    public class Unsubscriber implements Disposable {
        public boolean a = false;

        public Unsubscriber() {
        }

        public final synchronized void dispose() {
            if (this.a) {
                return;
            }
            this.a = true;
            QueueingEventSubject queueingEventSubject = QueueingEventSubject.this;
            synchronized (queueingEventSubject) {
                queueingEventSubject.b = State.a;
                queueingEventSubject.c = null;
            }
        }
    }

    public final Disposable a(Consumer consumer) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            State state = this.b;
            State state2 = State.b;
            if (state == state2) {
                throw new IllegalStateException("Only a single subscription is supported, previous subscriber is: " + this.c);
            }
            this.b = state2;
            this.c = consumer;
            this.a.drainTo(arrayList);
        }
        Iterator<E> it = arrayList.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
        return new Unsubscriber();
    }

    public final void accept(Object obj) {
        Consumer consumer;
        synchronized (this) {
            try {
                int iOrdinal = this.b.ordinal();
                if (iOrdinal == 0) {
                    this.a.add(obj);
                } else if (iOrdinal == 1) {
                    consumer = this.c;
                }
                consumer = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (consumer != null) {
            consumer.accept(obj);
        }
    }
}
