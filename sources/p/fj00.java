package p;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fj00 extends ef30 implements Serializable {
    public final ArrayDeque a = new ArrayDeque(10);

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        obj.getClass();
        int size = size();
        ArrayDeque arrayDeque = this.a;
        if (size == 10) {
            arrayDeque.remove();
        }
        arrayDeque.add(obj);
        return true;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < 10) {
            return t890.h(this, collection.iterator());
        }
        clear();
        return hr80.j(hr80.z(size - 10, collection), this);
    }

    @Override // p.cf30
    public final Object delegate() {
        return this.a;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }
}
