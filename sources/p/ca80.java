package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ca80 implements Iterator, ola0 {
    public final /* synthetic */ byte a;
    public int b;
    public final Object c;

    public /* synthetic */ ca80(Object obj, byte b) {
        this.a = b;
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((Iterator) obj).hasNext();
            default:
                return this.b < ((int[]) obj).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                int i = this.b;
                this.b = i + 1;
                if (i >= 0) {
                    return new aa80(i, ((Iterator) obj).next());
                }
                p7h.T();
                throw null;
            default:
                int i2 = this.b;
                int[] iArr = (int[]) obj;
                if (i2 < iArr.length) {
                    this.b = i2 + 1;
                    return u4h1.a(iArr[i2]);
                }
                bhn0.t(String.valueOf(i2));
                return null;
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
}
