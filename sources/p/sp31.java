package p;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sp31 extends qhc {
    public static final int[] h;
    public final int b;
    public final qhc c;
    public final qhc d;
    public final int e;
    public final int f;
    public int g = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        h = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = h;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public sp31(qhc qhcVar, qhc qhcVar2) {
        this.c = qhcVar;
        this.d = qhcVar2;
        int size = qhcVar.size();
        this.e = size;
        this.b = qhcVar2.size() + size;
        this.f = Math.max(qhcVar.f(), qhcVar2.f()) + 1;
    }

    @Override // p.qhc
    public final void e(int i, byte[] bArr, int i2, int i3) {
        int i4 = i + i3;
        qhc qhcVar = this.c;
        int i5 = this.e;
        if (i4 <= i5) {
            qhcVar.e(i, bArr, i2, i3);
            return;
        }
        qhc qhcVar2 = this.d;
        if (i >= i5) {
            qhcVar2.e(i - i5, bArr, i2, i3);
            return;
        }
        int i6 = i5 - i;
        qhcVar.e(i, bArr, i2, i6);
        qhcVar2.e(0, bArr, i2 + i6, i3 - i6);
    }

    public final boolean equals(Object obj) {
        int iO;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qhc) {
            qhc qhcVar = (qhc) obj;
            int size = qhcVar.size();
            int i = this.b;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.g == 0 || (iO = qhcVar.o()) == 0 || this.g == iO) {
                    kng0 kng0Var = new kng0(this);
                    qmd0 qmd0VarA = kng0Var.a();
                    kng0 kng0Var2 = new kng0(qhcVar);
                    qmd0 qmd0VarA2 = kng0Var2.a();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int length = qmd0VarA.b.length - i2;
                        int length2 = qmd0VarA2.b.length - i3;
                        int iMin = Math.min(length, length2);
                        if (!(i2 == 0 ? qmd0VarA.s(qmd0VarA2, i3, iMin) : qmd0VarA2.s(qmd0VarA, i2, iMin))) {
                            break;
                        }
                        i4 += iMin;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            bhn0.w();
                            return false;
                        }
                        if (iMin == length) {
                            qmd0VarA = kng0Var.a();
                            i2 = 0;
                        } else {
                            i2 += iMin;
                        }
                        if (iMin == length2) {
                            qmd0VarA2 = kng0Var2.a();
                            i3 = 0;
                        } else {
                            i3 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p.qhc
    public final int f() {
        return this.f;
    }

    public final int hashCode() {
        int iM = this.g;
        if (iM == 0) {
            int i = this.b;
            iM = m(i, 0, i);
            if (iM == 0) {
                iM = 1;
            }
            this.g = iM;
        }
        return iM;
    }

    @Override // p.qhc
    public final boolean i() {
        return this.b >= h[this.f];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new rp31(this);
    }

    @Override // p.qhc
    public final boolean k() {
        int iN = this.c.n(0, 0, this.e);
        qhc qhcVar = this.d;
        return qhcVar.n(iN, 0, qhcVar.size()) == 0;
    }

    @Override // p.qhc
    public final int m(int i, int i2, int i3) {
        int i4 = i2 + i3;
        qhc qhcVar = this.c;
        int i5 = this.e;
        if (i4 <= i5) {
            return qhcVar.m(i, i2, i3);
        }
        qhc qhcVar2 = this.d;
        if (i2 >= i5) {
            return qhcVar2.m(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return qhcVar2.m(qhcVar.m(i, i2, i6), 0, i3 - i6);
    }

    @Override // p.qhc
    public final int n(int i, int i2, int i3) {
        int i4 = i2 + i3;
        qhc qhcVar = this.c;
        int i5 = this.e;
        if (i4 <= i5) {
            return qhcVar.n(i, i2, i3);
        }
        qhc qhcVar2 = this.d;
        if (i2 >= i5) {
            return qhcVar2.n(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return qhcVar2.n(qhcVar.n(i, i2, i6), 0, i3 - i6);
    }

    @Override // p.qhc
    public final int o() {
        return this.g;
    }

    @Override // p.qhc
    public final String p() {
        byte[] bArr;
        int i = this.b;
        if (i == 0) {
            bArr = m290.a;
        } else {
            byte[] bArr2 = new byte[i];
            e(0, bArr2, 0, i);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // p.qhc
    public final void r(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        qhc qhcVar = this.c;
        int i4 = this.e;
        if (i3 <= i4) {
            qhcVar.r(outputStream, i, i2);
            return;
        }
        qhc qhcVar2 = this.d;
        if (i >= i4) {
            qhcVar2.r(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        qhcVar.r(outputStream, i, i5);
        qhcVar2.r(outputStream, 0, i2 - i5);
    }

    @Override // p.qhc
    public final int size() {
        return this.b;
    }
}
