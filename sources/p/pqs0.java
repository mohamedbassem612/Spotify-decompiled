package p;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class pqs0 implements Iterator, ola0 {
    public final /* synthetic */ byte a = 0;
    public int b;
    public Object c;
    public final Object d;

    public pqs0(blc1 blc1Var) {
        this.d = blc1Var;
        this.c = blc1.d(blc1Var).iterator();
    }

    public void a() {
        Iterator it = (Iterator) this.c;
        while (this.b < blc1.e((blc1) this.d) && it.hasNext()) {
            it.next();
            this.b++;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                return this.b < ((Map) obj).size();
            default:
                a();
                return this.b < blc1.c((blc1) obj) && ((Iterator) this.c).hasNext();
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        byte b = this.a;
        Object obj = null;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                if (hasNext()) {
                    obj = this.c;
                    this.b++;
                    Object obj3 = ((Map) obj2).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException(cy30.m("Hash code of an element (", obj, ") has changed after it was added to the persistent set."));
                    }
                    this.c = ((xlc0) obj3).a();
                } else {
                    hhg1.k();
                }
                return obj;
            default:
                a();
                if (this.b < blc1.c((blc1) obj2)) {
                    this.b++;
                    return ((Iterator) this.c).next();
                }
                hhg1.k();
                return null;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public pqs0(Object obj, Map map) {
        this.c = obj;
        this.d = map;
    }
}
