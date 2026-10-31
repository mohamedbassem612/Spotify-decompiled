package p;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class kqs0 implements Iterator, ola0 {
    public final /* synthetic */ byte a;
    public Object b;
    public final Map c;
    public int d;

    public /* synthetic */ kqs0(Object obj, Map map, byte b) {
        this.a = b;
        this.b = obj;
        this.c = map;
    }

    public Object a() {
        return this.b;
    }

    public qlc0 b() {
        if (!hasNext()) {
            hhg1.k();
            return null;
        }
        Object obj = this.c.get(this.b);
        if (obj == null) {
            throw new ConcurrentModificationException(td6.l(new StringBuilder("Hash code of a key ("), this.b, ") has changed after it was added to the persistent map."));
        }
        qlc0 qlc0Var = (qlc0) obj;
        this.d++;
        this.b = qlc0Var.c;
        return qlc0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.d < this.c.size();
            default:
                return this.d < this.c.size();
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.a) {
            case 0:
                return b();
            default:
                if (!hasNext()) {
                    hhg1.k();
                    return null;
                }
                Object obj = this.b;
                this.d++;
                Object obj2 = this.c.get(obj);
                if (obj2 == null) {
                    throw new ConcurrentModificationException(cy30.m("Hash code of an element (", obj, ") has changed after it was added to the persistent set."));
                }
                this.b = ((ylc0) obj2).b;
                return obj;
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
}
