package io.reactivex.rxjava3.internal.queue;

import io.reactivex.rxjava3.operators.SimplePlainQueue;
import java.util.concurrent.atomic.AtomicReference;
import p.bhn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class MpscLinkedQueue<T> implements SimplePlainQueue<T> {
    public final AtomicReference a;
    public final AtomicReference b;

    public static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
        public Object a;
    }

    public MpscLinkedQueue() {
        AtomicReference atomicReference = new AtomicReference();
        this.a = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.b = atomicReference2;
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        atomicReference2.lazySet(linkedQueueNode);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return ((LinkedQueueNode) this.b.get()) == ((LinkedQueueNode) this.a.get());
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        if (obj == null) {
            bhn0.i("Null is not a valid element");
            return false;
        }
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        linkedQueueNode.a = obj;
        ((LinkedQueueNode) this.a.getAndSet(linkedQueueNode)).lazySet(linkedQueueNode);
        return true;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        LinkedQueueNode linkedQueueNode;
        AtomicReference atomicReference = this.b;
        LinkedQueueNode linkedQueueNode2 = (LinkedQueueNode) atomicReference.get();
        LinkedQueueNode linkedQueueNode3 = linkedQueueNode2.get();
        if (linkedQueueNode3 != null) {
            Object obj = linkedQueueNode3.a;
            linkedQueueNode3.a = null;
            atomicReference.lazySet(linkedQueueNode3);
            return obj;
        }
        if (linkedQueueNode2 == ((LinkedQueueNode) this.a.get())) {
            return null;
        }
        do {
            linkedQueueNode = linkedQueueNode2.get();
        } while (linkedQueueNode == null);
        Object obj2 = linkedQueueNode.a;
        linkedQueueNode.a = null;
        atomicReference.lazySet(linkedQueueNode);
        return obj2;
    }
}
