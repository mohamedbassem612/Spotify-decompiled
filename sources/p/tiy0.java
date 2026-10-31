package p;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tiy0 extends j9 implements RandomAccess {
    public static final tiy0 d;
    public Object[] b;
    public int c;

    static {
        tiy0 tiy0Var = new tiy0(0, new Object[0]);
        d = tiy0Var;
        tiy0Var.a = false;
    }

    public tiy0(int i, Object[] objArr) {
        this.b = objArr;
        this.c = i;
    }

    public static tiy0 e() {
        return d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        b();
        if (i < 0 || i > (i2 = this.c)) {
            k220.e(this.c, cy30.r(i, "Index:", ", Size:"));
            return;
        }
        Object[] objArr = this.b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[ywx0.j(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.b, i, objArr2, i + 1, this.c - i);
            this.b = objArr2;
        }
        this.b[i] = obj;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    public final void f(int i) {
        if (i < 0 || i >= this.c) {
            k220.e(this.c, cy30.r(i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f(i);
        return this.b[i];
    }

    @Override // p.i290
    public final i290 h(int i) {
        if (i >= this.c) {
            return new tiy0(this.c, Arrays.copyOf(this.b, i));
        }
        bhn0.q();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        f(i);
        Object[] objArr = this.b;
        Object obj = objArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        f(i);
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // p.j9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i = this.c;
        Object[] objArrCopyOf = this.b;
        if (i == objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, ((i * 3) / 2) + 1);
            this.b = objArrCopyOf;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
