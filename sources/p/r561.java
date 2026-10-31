package p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r561 implements Iterator, lnm, ola0 {
    public byte a;
    public Object b;
    public Iterator c;
    public lnm d;

    public final RuntimeException a() {
        byte b = this.a;
        if (b == 4) {
            return new NoSuchElementException();
        }
        if (b == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + ((int) this.a));
    }

    public final void b(Object obj, lnm lnmVar) {
        this.b = obj;
        this.a = (byte) 3;
        this.d = lnmVar;
    }

    @Override // p.lnm
    public final o8n getContext() {
        return o6x.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            byte b = this.a;
            if (b != 0) {
                if (b != 1) {
                    if (b == 2 || b == 3) {
                        return true;
                    }
                    if (b == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.c;
                it.getClass();
                if (it.hasNext()) {
                    this.a = (byte) 2;
                    return true;
                }
                this.c = null;
            }
            this.a = (byte) 5;
            lnm lnmVar = this.d;
            lnmVar.getClass();
            this.d = null;
            lnmVar.resumeWith(rih1.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        if (b == 0 || b == 1) {
            if (hasNext()) {
                return next();
            }
            hhg1.k();
            return null;
        }
        if (b == 2) {
            this.a = (byte) 1;
            Iterator it = this.c;
            it.getClass();
            return it.next();
        }
        if (b != 3) {
            throw a();
        }
        this.a = (byte) 0;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p.lnm
    public final void resumeWith(Object obj) {
        hm5.M(obj);
        this.a = (byte) 4;
    }
}
