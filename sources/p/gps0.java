package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class gps0 implements Iterator, ola0 {
    public final mug1[] a;
    public int b;
    public boolean c = true;

    public gps0(kug1 kug1Var, mug1[] mug1VarArr) {
        this.a = mug1VarArr;
        mug1VarArr[0].c(Integer.bitCount(kug1Var.a) * 2, 0, kug1Var.d);
        this.b = 0;
        a();
    }

    public final void a() {
        int i = this.b;
        mug1[] mug1VarArr = this.a;
        mug1 mug1Var = mug1VarArr[i];
        if (mug1Var.c < mug1Var.b) {
            return;
        }
        while (-1 < i) {
            int iB = b(i);
            if (iB == -1) {
                mug1 mug1Var2 = mug1VarArr[i];
                int i2 = mug1Var2.c;
                Object[] objArr = mug1Var2.a;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    mug1Var2.c = i2 + 1;
                    iB = b(i);
                }
            }
            if (iB != -1) {
                this.b = iB;
                return;
            }
            if (i > 0) {
                mug1 mug1Var3 = mug1VarArr[i - 1];
                int i3 = mug1Var3.c;
                int length2 = mug1Var3.a.length;
                mug1Var3.c = i3 + 1;
            }
            mug1VarArr[i].c(0, 0, kug1.e.d);
            i--;
        }
        this.c = false;
    }

    public final int b(int i) {
        mug1[] mug1VarArr = this.a;
        mug1 mug1Var = mug1VarArr[i];
        int i2 = mug1Var.c;
        if (i2 < mug1Var.b) {
            return i;
        }
        Object[] objArr = mug1Var.a;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        kug1 kug1Var = (kug1) objArr[i2];
        if (i == 6) {
            mug1 mug1Var2 = mug1VarArr[i + 1];
            Object[] objArr2 = kug1Var.d;
            mug1Var2.c(objArr2.length, 0, objArr2);
        } else {
            mug1VarArr[i + 1].c(Integer.bitCount(kug1Var.a) * 2, 0, kug1Var.d);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.c) {
            hhg1.k();
            return null;
        }
        Object next = this.a[this.b].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
