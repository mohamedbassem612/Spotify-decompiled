package p;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class th31 extends g7 implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public th31(int i, Object[] objArr) {
        this.a = objArr;
        if (i < 0) {
            hhg1.f(f4i1.c(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i <= objArr.length) {
            this.b = objArr.length;
            this.d = i;
        } else {
            t8e1.l(objArr.length, cy30.r(i, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
            throw null;
        }
    }

    public final int b() {
        return this.d;
    }

    public final void c(Object obj) {
        if (e()) {
            eg.m("ring buffer is full");
            return;
        }
        this.a[(b() + this.c) % this.b] = obj;
        this.d = b() + 1;
    }

    public final th31 d(int i) {
        int i2 = this.b;
        int i3 = i2 + (i2 >> 1) + 1;
        if (i3 <= i) {
            i = i3;
        }
        return new th31(b(), this.c == 0 ? Arrays.copyOf(this.a, i) : toArray(new Object[i]));
    }

    public final boolean e() {
        return b() == this.b;
    }

    public final void f(int i) {
        if (i < 0) {
            hhg1.f(f4i1.c(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > this.d) {
            t8e1.l(this.d, cy30.r(i, "n shouldn't be greater than the buffer size: n = ", ", size = "));
            return;
        }
        if (i > 0) {
            int i2 = this.c;
            int i3 = this.b;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.a;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.c = i4;
            this.d -= i;
        }
    }

    public final Object get(int i) {
        int iB = b();
        if (i < 0 || i >= iB) {
            eg.g(cy30.i(i, "index: ", iB, ", size: "));
            return null;
        }
        return this.a[(this.c + i) % this.b];
    }

    public final Iterator iterator() {
        return new sh31(this);
    }

    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        int length = objArr.length;
        int i = this.d;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.d;
        int i3 = this.c;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.a;
            if (i5 >= i2 || i3 >= this.b) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        k4p1.D(i2, objArr);
        return objArr;
    }

    public th31(int i) {
        this(0, new Object[i]);
    }

    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }
}
