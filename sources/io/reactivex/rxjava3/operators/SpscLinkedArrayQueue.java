package io.reactivex.rxjava3.operators;

import io.reactivex.rxjava3.internal.util.Pow2;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p.bhn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SpscLinkedArrayQueue<T> implements SimplePlainQueue<T> {
    public static final int i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object t = new Object();
    public final AtomicLong a;
    public final int b;
    public long c;
    public final int d;
    public AtomicReferenceArray e;
    public final int f;
    public AtomicReferenceArray g;
    public final AtomicLong h;

    public SpscLinkedArrayQueue(int i2) {
        AtomicLong atomicLong = new AtomicLong();
        this.a = atomicLong;
        this.h = new AtomicLong();
        int iA = Pow2.a(Math.max(8, i2));
        int i3 = iA - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iA + 1);
        this.e = atomicReferenceArray;
        this.d = i3;
        this.b = Math.min(iA / 4, i);
        this.g = atomicReferenceArray;
        this.f = i3;
        this.c = iA - 2;
        atomicLong.lazySet(0L);
    }

    public final void b(Serializable serializable, Object obj) {
        AtomicReferenceArray atomicReferenceArray = this.e;
        AtomicLong atomicLong = this.a;
        long j = atomicLong.get();
        long j2 = 2 + j;
        int i2 = this.d;
        if (atomicReferenceArray.get(((int) j2) & i2) == null) {
            int i3 = ((int) j) & i2;
            atomicReferenceArray.lazySet(i3 + 1, obj);
            atomicReferenceArray.lazySet(i3, serializable);
            atomicLong.lazySet(j2);
            return;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.e = atomicReferenceArray2;
        int i4 = ((int) j) & i2;
        atomicReferenceArray2.lazySet(i4 + 1, obj);
        atomicReferenceArray2.lazySet(i4, serializable);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i4, t);
        atomicLong.lazySet(j2);
    }

    public final Object c() {
        AtomicReferenceArray atomicReferenceArray = this.g;
        int i2 = (int) this.h.get();
        int i3 = this.f;
        int i4 = i2 & i3;
        Object obj = atomicReferenceArray.get(i4);
        if (obj != t) {
            return obj;
        }
        int i5 = i3 + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i5);
        atomicReferenceArray.lazySet(i5, null);
        this.g = atomicReferenceArray2;
        return atomicReferenceArray2.get(i4);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return this.a.get() == this.h.get();
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        if (obj == null) {
            bhn0.i("Null is not a valid element");
            return false;
        }
        AtomicReferenceArray atomicReferenceArray = this.e;
        AtomicLong atomicLong = this.a;
        long j = atomicLong.get();
        int i2 = this.d;
        int i3 = ((int) j) & i2;
        if (j < this.c) {
            atomicReferenceArray.lazySet(i3, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j2 = ((long) this.b) + j;
        if (atomicReferenceArray.get(((int) j2) & i2) == null) {
            this.c = j2 - 1;
            atomicReferenceArray.lazySet(i3, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j3 = j + 1;
        if (atomicReferenceArray.get(((int) j3) & i2) == null) {
            atomicReferenceArray.lazySet(i3, obj);
            atomicLong.lazySet(j3);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.e = atomicReferenceArray2;
        this.c = (j + ((long) i2)) - 1;
        atomicReferenceArray2.lazySet(i3, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i3, t);
        atomicLong.lazySet(j3);
        return true;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.g;
        AtomicLong atomicLong = this.h;
        long j = atomicLong.get();
        int i2 = this.f;
        int i3 = ((int) j) & i2;
        Object obj = atomicReferenceArray.get(i3);
        boolean z = obj == t;
        if (obj != null && !z) {
            atomicReferenceArray.lazySet(i3, null);
            atomicLong.lazySet(j + 1);
            return obj;
        }
        if (!z) {
            return null;
        }
        int i4 = i2 + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i4);
        atomicReferenceArray.lazySet(i4, null);
        this.g = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i3);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i3, null);
            atomicLong.lazySet(j + 1);
        }
        return obj2;
    }
}
