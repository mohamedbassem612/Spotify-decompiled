package p;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tdn0 implements ListIterator, ola0 {
    public final /* synthetic */ byte a;
    public final List b;
    public int c;

    public tdn0(List list, int i, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = list;
                this.c = i;
                break;
            default:
                this.b = list;
                this.c = i - 1;
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                int i = this.c + 1;
                this.c = i;
                list.add(i, obj);
                return;
            case 1:
                list.add(this.c, obj);
                this.c++;
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                return this.c < list.size() - 1;
            case 1:
                return this.c < list.size();
            default:
                return this.c < ((rqz0) list).a.size();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                return this.c >= 0;
            case 1:
                return this.c > 0;
            default:
                throw sqz0.a;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                int i = this.c + 1;
                this.c = i;
                return list.get(i);
            case 1:
                int i2 = this.c;
                this.c = i2 + 1;
                return list.get(i2);
            default:
                if (!hasNext()) {
                    hhg1.k();
                    return null;
                }
                int i3 = this.c;
                this.c = i3 + 1;
                return ((rqz0) list).get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
            case 0:
                return this.c + 1;
            case 1:
                return this.c;
            default:
                throw sqz0.a;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                int i = this.c;
                this.c = i - 1;
                return list.get(i);
            case 1:
                int i2 = this.c - 1;
                this.c = i2;
                return list.get(i2);
            default:
                throw sqz0.a;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.a) {
            case 0:
                return this.c;
            case 1:
                return this.c - 1;
            default:
                throw sqz0.a;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                list.remove(this.c);
                this.c--;
                return;
            case 1:
                int i = this.c - 1;
                this.c = i;
                list.remove(i);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                list.set(this.c, obj);
                return;
            case 1:
                list.set(this.c, obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public tdn0(rqz0 rqz0Var) {
        this.a = (byte) 2;
        this.b = rqz0Var;
    }
}
