package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y9v implements Iterator, ola0 {
    public final Iterator b;
    public Object d;
    public final /* synthetic */ n561 e;
    public final /* synthetic */ byte a = 0;
    public int c = -1;

    public y9v(rlu rluVar, byte b) {
        this.e = rluVar;
        this.b = rluVar.b.iterator();
    }

    public void a() {
        Iterator it = this.b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((rlu) this.e).c.invoke(next)).booleanValue()) {
                this.c = 1;
                this.d = next;
                return;
            }
        }
        this.c = 0;
    }

    public void b() {
        Object next;
        do {
            Iterator it = this.b;
            if (!it.hasNext()) {
                this.c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((rlu) this.e).c.invoke(next)).booleanValue());
        this.d = next;
        this.c = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    b();
                }
                return this.c == 1 || this.b.hasNext();
            default:
                if (this.c == -1) {
                    a();
                }
                return this.c == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    b();
                }
                if (this.c != 1) {
                    return this.b.next();
                }
                Object obj = this.d;
                this.d = null;
                this.c = 0;
                return obj;
            default:
                if (this.c == -1) {
                    a();
                }
                if (this.c == 0) {
                    hhg1.k();
                    return null;
                }
                Object obj2 = this.d;
                this.d = null;
                this.c = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public y9v(rlu rluVar) {
        this.e = rluVar;
        this.b = rluVar.b.iterator();
    }
}
