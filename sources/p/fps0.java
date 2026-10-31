package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class fps0 implements Iterator, ola0 {
    public final lug1[] a;
    public int b;
    public boolean c = true;

    public fps0(jug1 jug1Var, lug1[] lug1VarArr) {
        this.a = lug1VarArr;
        lug1VarArr[0].a(Integer.bitCount(jug1Var.a) * 2, 0, jug1Var.d);
        this.b = 0;
        a();
    }

    public final void a() {
        int i = this.b;
        lug1[] lug1VarArr = this.a;
        lug1 lug1Var = lug1VarArr[i];
        if (lug1Var.c < lug1Var.b) {
            return;
        }
        if (i >= 0) {
            while (true) {
                int i2 = i - 1;
                int iB = b(i);
                if (iB == -1) {
                    lug1 lug1Var2 = lug1VarArr[i];
                    int i3 = lug1Var2.c;
                    Object[] objArr = lug1Var2.a;
                    if (i3 < objArr.length) {
                        int length = objArr.length;
                        lug1Var2.c = i3 + 1;
                        iB = b(i);
                    }
                }
                if (iB != -1) {
                    this.b = iB;
                    return;
                }
                if (i > 0) {
                    lug1 lug1Var3 = lug1VarArr[i - 1];
                    int i4 = lug1Var3.c;
                    int length2 = lug1Var3.a.length;
                    lug1Var3.c = i4 + 1;
                }
                lug1VarArr[i].a(0, 0, jug1.e.d);
                if (i2 < 0) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        this.c = false;
    }

    public final int b(int i) {
        lug1[] lug1VarArr = this.a;
        lug1 lug1Var = lug1VarArr[i];
        int i2 = lug1Var.c;
        if (i2 < lug1Var.b) {
            return i;
        }
        Object[] objArr = lug1Var.a;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        if (obj == null) {
            bhn0.i("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
            return 0;
        }
        jug1 jug1Var = (jug1) obj;
        if (i == 6) {
            lug1 lug1Var2 = lug1VarArr[i + 1];
            Object[] objArr2 = jug1Var.d;
            lug1Var2.a(objArr2.length, 0, objArr2);
        } else {
            lug1VarArr[i + 1].a(Integer.bitCount(jug1Var.a) * 2, 0, jug1Var.d);
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
