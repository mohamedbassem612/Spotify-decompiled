package com.spotify.mobius;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
class QueuingConnection<I> implements Connection<I> {
    public static final Connection c = new Connection<Object>() { // from class: com.spotify.mobius.QueuingConnection.1
        @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
        public final void accept(Object obj) {
        }

        @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
        public final void dispose() {
        }
    };
    public final QueuingDelegate a;
    public final AtomicReference b;

    public class QueuingDelegate implements Connection<I> {
        public final LinkedBlockingQueue a = new LinkedBlockingQueue();

        public QueuingDelegate() {
        }

        @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
        public final void accept(Object obj) {
            LinkedBlockingQueue linkedBlockingQueue = this.a;
            linkedBlockingQueue.add(obj);
            QueuingConnection queuingConnection = QueuingConnection.this;
            Connection connection = (Connection) queuingConnection.b.get();
            if (connection == queuingConnection.a) {
                return;
            }
            while (true) {
                Object objPoll = linkedBlockingQueue.poll();
                if (objPoll == null) {
                    return;
                } else {
                    connection.accept(objPoll);
                }
            }
        }

        @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
        public final void dispose() {
            this.a.clear();
        }
    }

    public QueuingConnection() {
        QueuingDelegate queuingDelegate = new QueuingDelegate();
        this.a = queuingDelegate;
        this.b = new AtomicReference(queuingDelegate);
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        ((Connection) this.b.get()).accept(obj);
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        ((Connection) this.b.getAndSet(c)).dispose();
    }
}
