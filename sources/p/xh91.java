package p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xh91 implements Iterator {
    public static final xh91 b = new xh91(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ xh91(byte b2) {
        this.a = b2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                throw new NoSuchElementException();
            default:
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
