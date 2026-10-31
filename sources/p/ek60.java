package p;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ek60 implements ListIterator, ola0 {
    public final /* synthetic */ byte a;
    public int b;
    public int c;
    public int d;
    public final Object e;

    public ek60(bw91 bw91Var, int i) {
        this.a = (byte) 2;
        this.e = bw91Var;
        this.b = i - 1;
        this.c = -1;
        this.d = pv91.f(bw91Var.a).e;
    }

    public void a() {
        if (smc0.d(((qmc0) this.e).e) == this.d) {
            return;
        }
        eg.d();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                qmc0 qmc0Var = (qmc0) obj2;
                int i = this.b;
                this.b = i + 1;
                qmc0Var.add(i, obj);
                this.c = -1;
                this.d = ((AbstractList) qmc0Var).modCount;
                return;
            default:
                b();
                bw91 bw91Var = (bw91) obj2;
                bw91Var.add(this.b + 1, obj);
                this.c = -1;
                this.b++;
                this.d = pv91.f(bw91Var.a).e;
                return;
        }
    }

    public void b() {
        if (pv91.f(((bw91) this.e).a).e == this.d) {
            return;
        }
        eg.d();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                return this.b < this.d;
            case 1:
                return this.b < ((qmc0) obj).c;
            default:
                return this.b < ((bw91) obj).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                return this.b > this.c;
            case 1:
                return this.b > 0;
            default:
                return this.b >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                wdn0 wdn0Var = ((gk60) obj).a;
                int i = this.b;
                this.b = i + 1;
                return (pim0) wdn0Var.g(i);
            case 1:
                a();
                int i2 = this.b;
                qmc0 qmc0Var = (qmc0) obj;
                if (i2 >= qmc0Var.c) {
                    hhg1.k();
                    return null;
                }
                this.b = i2 + 1;
                this.c = i2;
                return qmc0Var.a[qmc0Var.b + i2];
            default:
                b();
                int i3 = this.b + 1;
                this.c = i3;
                bw91 bw91Var = (bw91) obj;
                nho1.J(i3, bw91Var.size());
                Object obj2 = bw91Var.get(i3);
                this.b = i3;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
            case 0:
                return this.b - this.c;
            case 1:
                return this.b;
            default:
                return this.b + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                wdn0 wdn0Var = ((gk60) obj).a;
                int i = this.b - 1;
                this.b = i;
                return (pim0) wdn0Var.g(i);
            case 1:
                a();
                int i2 = this.b;
                if (i2 <= 0) {
                    hhg1.k();
                    return null;
                }
                int i3 = i2 - 1;
                this.b = i3;
                this.c = i3;
                qmc0 qmc0Var = (qmc0) obj;
                return qmc0Var.a[qmc0Var.b + i3];
            default:
                b();
                bw91 bw91Var = (bw91) obj;
                nho1.J(this.b, bw91Var.size());
                int i4 = this.b;
                this.c = i4;
                Object obj2 = bw91Var.get(i4);
                this.b--;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.a) {
            case 0:
                return (this.b - this.c) - 1;
            case 1:
                return this.b - 1;
            default:
                return this.b;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                qmc0 qmc0Var = (qmc0) obj;
                a();
                int i = this.c;
                if (i == -1) {
                    eg.m("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                qmc0Var.c(i);
                this.b = this.c;
                this.c = -1;
                this.d = ((AbstractList) qmc0Var).modCount;
                return;
            default:
                b();
                bw91 bw91Var = (bw91) obj;
                bw91Var.remove(this.c);
                this.b--;
                this.c = -1;
                this.d = pv91.f(bw91Var.a).e;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i = this.c;
                if (i != -1) {
                    ((qmc0) obj2).set(i, obj);
                    return;
                } else {
                    eg.m("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                bw91 bw91Var = (bw91) obj2;
                b();
                int i2 = this.c;
                if (i2 < 0) {
                    eg.m("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    bw91Var.set(i2, obj);
                    this.d = pv91.f(bw91Var.a).e;
                    return;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ek60(gk60 gk60Var, int i, int i2) {
        this(gk60Var, (i2 & 1) != 0 ? 0 : i, 0, gk60Var.a.b);
        this.a = (byte) 0;
    }

    public ek60(gk60 gk60Var, int i, int i2, int i3) {
        this.a = (byte) 0;
        this.e = gk60Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public ek60(qmc0 qmc0Var, int i) {
        this.a = (byte) 1;
        this.e = qmc0Var;
        this.b = i;
        this.c = -1;
        this.d = ((AbstractList) qmc0Var).modCount;
    }
}
