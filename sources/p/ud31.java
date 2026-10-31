package p;

import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ud31 implements ListIterator, ola0 {
    public final /* synthetic */ byte a = 2;
    public final Object b;
    public final /* synthetic */ Object c;

    public ud31(wd31 wd31Var, int i) {
        this.c = wd31Var;
        this.b = wd31Var.a.listIterator(o7h.S0(i, wd31Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                ListIterator listIterator = (ListIterator) this.b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            case 1:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((n811) obj).a < ((zkc1) this.c).d - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((ListIterator) obj).hasNext();
            case 1:
                return ((ListIterator) obj).hasNext();
            default:
                return ((n811) obj).a >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((ListIterator) obj).previous();
            case 1:
                return ((ListIterator) obj).previous();
            default:
                n811 n811Var = (n811) obj;
                int i = n811Var.a + 1;
                zkc1 zkc1Var = (zkc1) this.c;
                nho1.J(i, zkc1Var.d);
                n811Var.a = i;
                return zkc1Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int iPreviousIndex;
        int iL;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                iL = p7h.L((vd31) obj);
                break;
            case 1:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                iL = p7h.L((wd31) obj);
                break;
            default:
                return ((n811) obj2).a + 1;
        }
        return iL - iPreviousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((ListIterator) obj).next();
            case 1:
                return ((ListIterator) obj).next();
            default:
                n811 n811Var = (n811) obj;
                int i = n811Var.a;
                zkc1 zkc1Var = (zkc1) this.c;
                nho1.J(i, zkc1Var.d);
                n811Var.a = i - 1;
                return zkc1Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int iNextIndex;
        int iL;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                iL = p7h.L((vd31) obj);
                break;
            case 1:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                iL = p7h.L((wd31) obj);
                break;
            default:
                return ((n811) obj2).a;
        }
        return iL - iNextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                ((ListIterator) this.b).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                ((ListIterator) this.b).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ud31(vd31 vd31Var, int i) {
        this.c = vd31Var;
        this.b = vd31Var.a.listIterator(o7h.S0(i, vd31Var));
    }

    public ud31(n811 n811Var, zkc1 zkc1Var) {
        this.b = n811Var;
        this.c = zkc1Var;
    }
}
