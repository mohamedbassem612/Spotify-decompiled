package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class khq0 implements Iterator, ola0 {
    public final /* synthetic */ byte a;
    public boolean b = true;
    public final Object c;

    public /* synthetic */ khq0(Object obj, byte b) {
        this.a = b;
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (this.b) {
                    this.b = false;
                    return ((lhq0) obj).a;
                }
                hhg1.k();
                return null;
            default:
                if (this.b) {
                    this.b = false;
                    return obj;
                }
                hhg1.k();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }
}
