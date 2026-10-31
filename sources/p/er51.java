package p;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class er51 extends rhc {
    public final transient byte[][] e;
    public final transient int[] f;

    public er51(byte[][] bArr, int[] iArr) {
        super(rhc.d.a);
        this.e = bArr;
        this.f = iArr;
    }

    private final Object writeReplace() {
        return t();
    }

    @Override // p.rhc
    public final ByteBuffer a() {
        return ByteBuffer.wrap(q()).asReadOnlyBuffer();
    }

    @Override // p.rhc
    public final String b() {
        throw null;
    }

    @Override // p.rhc
    public final int d() {
        return this.f[this.e.length - 1];
    }

    @Override // p.rhc
    public final String e() {
        return t().e();
    }

    @Override // p.rhc
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rhc) {
            rhc rhcVar = (rhc) obj;
            if (rhcVar.d() == d() && k(0, rhcVar, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // p.rhc
    public final int f(byte[] bArr, int i) {
        return t().f(bArr, i);
    }

    @Override // p.rhc
    public final byte[] h() {
        return q();
    }

    @Override // p.rhc
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.b = i3;
        return i3;
    }

    @Override // p.rhc
    public final byte i(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length - 1;
        int[] iArr = this.f;
        zod.u(iArr[length], i, 1L);
        int iL0 = lro1.l0(this, i);
        return bArr[iL0][(i - (iL0 == 0 ? 0 : iArr[iL0 - 1])) + iArr[bArr.length + iL0]];
    }

    @Override // p.rhc
    public final int j(byte[] bArr) {
        return t().j(bArr);
    }

    @Override // p.rhc
    public final boolean k(int i, rhc rhcVar, int i2) {
        if (i >= 0 && i <= d() - i2) {
            int i3 = i2 + i;
            int iL0 = lro1.l0(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.f;
                int i5 = iL0 == 0 ? 0 : iArr[iL0 - 1];
                int i6 = iArr[iL0] - i5;
                byte[][] bArr = this.e;
                int i7 = iArr[bArr.length + iL0];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (rhcVar.l(i4, bArr[iL0], (i - i5) + i7, iMin)) {
                    i4 += iMin;
                    i += iMin;
                    iL0++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // p.rhc
    public final boolean l(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0 && i <= d() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iL0 = lro1.l0(this, i);
            while (i < i4) {
                int[] iArr = this.f;
                int i5 = iL0 == 0 ? 0 : iArr[iL0 - 1];
                int i6 = iArr[iL0] - i5;
                byte[][] bArr2 = this.e;
                int i7 = iArr[bArr2.length + iL0];
                int iMin = Math.min(i4, i6 + i5) - i;
                if (zod.i((i - i5) + i7, i2, iMin, bArr2[iL0], bArr)) {
                    i2 += iMin;
                    i += iMin;
                    iL0++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // p.rhc
    public final String m(Charset charset) {
        return t().m(charset);
    }

    @Override // p.rhc
    public final rhc n(int i, int i2) {
        int I = zod.I(i2, this);
        if (i < 0) {
            hhg1.f(gvg.e(i, "beginIndex=", " < 0"));
            return null;
        }
        if (I > d()) {
            StringBuilder sbR = cy30.r(I, "endIndex=", " > length(");
            sbR.append(d());
            sbR.append(')');
            throw new IllegalArgumentException(sbR.toString().toString());
        }
        int i3 = I - i;
        if (i3 < 0) {
            hhg1.f(cy30.i(I, "endIndex=", i, " < beginIndex="));
            return null;
        }
        if (i == 0 && I == d()) {
            return this;
        }
        if (i == I) {
            return rhc.d;
        }
        int iL0 = lro1.l0(this, i);
        int iL1 = lro1.l0(this, I - 1);
        byte[][] bArr = this.e;
        byte[][] bArr2 = (byte[][]) f46.a0(iL0, iL1 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f;
        if (iL0 <= iL1) {
            int i4 = iL0;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iL1) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iL0 != 0 ? iArr2[iL0 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new er51(bArr2, iArr);
    }

    @Override // p.rhc
    public final rhc p() {
        return t().p();
    }

    @Override // p.rhc
    public final byte[] q() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            f46.O(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // p.rhc
    public final void s(nac nacVar, int i) {
        int iL0 = lro1.l0(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f;
            int i3 = iL0 == 0 ? 0 : iArr[iL0 - 1];
            int i4 = iArr[iL0] - i3;
            byte[][] bArr = this.e;
            int i5 = iArr[bArr.length + iL0];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            ip51 ip51Var = new ip51(bArr[iL0], i6, i6 + iMin, true, false);
            ip51 ip51Var2 = nacVar.a;
            if (ip51Var2 == null) {
                ip51Var.g = ip51Var;
                ip51Var.f = ip51Var;
                nacVar.a = ip51Var;
            } else {
                ip51 ip51Var3 = ip51Var2.g;
                ip51Var3.getClass();
                ip51Var3.b(ip51Var);
            }
            i2 += iMin;
            iL0++;
        }
        nacVar.b += (long) i;
    }

    public final rhc t() {
        return new rhc(q());
    }

    @Override // p.rhc
    public final String toString() {
        return t().toString();
    }
}
