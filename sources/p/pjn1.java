package p;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pjn1 extends ain1 {
    public static final int[] h = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int c;
    public final ain1 d;
    public final ain1 e;
    public final int f;
    public final int g;

    public pjn1(ain1 ain1Var, ain1 ain1Var2) {
        this.d = ain1Var;
        this.e = ain1Var2;
        int iF = ain1Var.f();
        this.f = iF;
        this.c = ain1Var2.f() + iF;
        this.g = Math.max(ain1Var.t(), ain1Var2.t()) + 1;
    }

    public static int B(int i) {
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return h[i];
    }

    @Override // p.ain1
    public final byte e(int i) {
        int i2 = this.f;
        return i < i2 ? this.d.e(i) : this.e.e(i - i2);
    }

    @Override // p.ain1
    public final int f() {
        return this.c;
    }

    @Override // p.ain1
    public final ain1 i(int i, int i2) {
        return k(i, i2);
    }

    @Override // p.ain1, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new ojn1(this);
    }

    @Override // p.ain1
    public final ain1 k(int i, int i2) {
        int i3 = this.c;
        int iC = ain1.c(i, i2, i3);
        if (iC == 0) {
            return ain1.b;
        }
        if (iC == i3) {
            return this;
        }
        ain1 ain1Var = this.d;
        int i4 = this.f;
        if (i2 <= i4) {
            return ain1Var.i(i, i2);
        }
        int i5 = i2 - i4;
        ain1 ain1Var2 = this.e;
        return i >= i4 ? ain1Var2.i(i - i4, i5) : new pjn1(ain1Var.i(i, ain1Var.f()), ain1Var2.i(0, i5));
    }

    @Override // p.ain1
    public final void l(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        ain1 ain1Var = this.d;
        int i5 = this.f;
        if (i4 <= i5) {
            ain1Var.l(bArr, i, i2, i3);
            return;
        }
        ain1 ain1Var2 = this.e;
        if (i >= i5) {
            ain1Var2.l(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        ain1Var.l(bArr, i, i2, i6);
        ain1Var2.l(bArr, 0, i2 + i6, i3 - i6);
    }

    @Override // p.ain1
    public final void n(w4c0 w4c0Var) {
        this.d.n(w4c0Var);
        this.e.n(w4c0Var);
    }

    @Override // p.ain1
    public final boolean p(ain1 ain1Var) {
        uhn1 uhn1VarB;
        kng0 kng0Var = new kng0(this);
        uhn1 uhn1VarB2 = kng0Var.b();
        kng0 kng0Var2 = new kng0(ain1Var);
        uhn1 uhn1VarB3 = kng0Var2.b();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iF = uhn1VarB2.f() - i;
            int iF2 = uhn1VarB3.f() - i2;
            int iMin = Math.min(iF, iF2);
            if (!(i == 0 ? uhn1VarB2.B(uhn1VarB3, i2, iMin) : uhn1VarB3.B(uhn1VarB2, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.c;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                bhn0.w();
                return false;
            }
            if (iMin == iF) {
                uhn1VarB = kng0Var.b();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == iF2) {
                uhn1VarB2 = uhn1VarB2;
                uhn1VarB2 = uhn1VarB;
                uhn1VarB3 = kng0Var2.b();
                i2 = 0;
            } else {
                uhn1VarB2 = uhn1VarB2;
                uhn1VarB2 = uhn1VarB;
                i2 += iMin;
            }
        }
    }

    @Override // p.ain1
    public final int r(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ain1 ain1Var = this.d;
        int i5 = this.f;
        if (i4 <= i5) {
            return ain1Var.r(i, i2, i3);
        }
        ain1 ain1Var2 = this.e;
        if (i2 >= i5) {
            return ain1Var2.r(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return ain1Var2.r(ain1Var.r(i, i2, i6), 0, i3 - i6);
    }

    @Override // p.ain1
    public final din1 s() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.g);
        arrayDeque.push(this);
        ain1 ain1Var = this.d;
        while (ain1Var instanceof pjn1) {
            pjn1 pjn1Var = (pjn1) ain1Var;
            arrayDeque.push(pjn1Var);
            ain1Var = pjn1Var.d;
        }
        uhn1 uhn1Var = (uhn1) ain1Var;
        while (true) {
            if (!(uhn1Var != null)) {
                yin1 yin1Var = new yin1();
                yin1Var.a = arrayList.iterator();
                yin1Var.c = 0;
                for (ByteBuffer byteBuffer : arrayList) {
                    yin1Var.c++;
                }
                yin1Var.d = -1;
                if (!yin1Var.a()) {
                    yin1Var.b = xin1.b;
                    yin1Var.e = 0;
                }
                return new cin1(yin1Var);
            }
            uhn1 uhn1Var2 = null;
            if (uhn1Var == null) {
                hhg1.k();
                return null;
            }
            while (!arrayDeque.isEmpty()) {
                ain1 ain1Var2 = ((pjn1) arrayDeque.pop()).e;
                while (ain1Var2 instanceof pjn1) {
                    pjn1 pjn1Var2 = (pjn1) ain1Var2;
                    arrayDeque.push(pjn1Var2);
                    ain1Var2 = pjn1Var2.d;
                }
                uhn1 uhn1Var3 = (uhn1) ain1Var2;
                if (!uhn1Var3.w()) {
                    uhn1Var2 = uhn1Var3;
                    break;
                }
            }
            arrayList.add(uhn1Var.m());
            uhn1Var = uhn1Var2;
        }
    }

    @Override // p.ain1
    public final int t() {
        return this.g;
    }

    @Override // p.ain1
    public final boolean u() {
        return this.c >= B(this.g);
    }

    @Override // p.ain1
    /* JADX INFO: renamed from: v */
    public final k5n1 iterator() {
        return new ojn1(this);
    }
}
