package p;

import com.google.protobuf.CodedOutputStream$OutOfSpaceException;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pwg extends rwg {
    public final byte[] d;
    public final int e;
    public int f;
    public final OutputStream g;

    public pwg(OutputStream outputStream, int i) {
        if (i < 0) {
            hhg1.n("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.d = new byte[iMax];
        this.e = iMax;
        if (outputStream != null) {
            this.g = outputStream;
        } else {
            bhn0.i("out");
            throw null;
        }
    }

    @Override // p.rwg
    public final void A(int i, int i2) {
        K(20);
        G(i, 0);
        H(i2);
    }

    @Override // p.rwg
    public final void B(int i) {
        K(5);
        H(i);
    }

    @Override // p.rwg
    public final void C(int i, long j) {
        K(20);
        G(i, 0);
        I(j);
    }

    @Override // p.rwg
    public final void D(long j) {
        K(10);
        I(j);
    }

    public final void E(int i) {
        int i2 = this.f;
        byte[] bArr = this.d;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f = i2 + 4;
    }

    public final void F(long j) {
        int i = this.f;
        byte[] bArr = this.d;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.f = i + 8;
    }

    public final void G(int i, int i2) {
        H(poz0.E(i, i2));
    }

    public final void H(int i) {
        boolean z = rwg.c;
        byte[] bArr = this.d;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.f;
                if (i2 == 0) {
                    this.f = i3 + 1;
                    dlh1.l(bArr, i3, (byte) i);
                    return;
                } else {
                    this.f = i3 + 1;
                    dlh1.l(bArr, i3, (byte) (i | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.f;
                if (i4 == 0) {
                    this.f = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.f = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    public final void I(long j) {
        boolean z = rwg.c;
        byte[] bArr = this.d;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.f;
                if (j2 == 0) {
                    this.f = i + 1;
                    dlh1.l(bArr, i, (byte) j);
                    return;
                } else {
                    this.f = i + 1;
                    dlh1.l(bArr, i, (byte) (((int) j) | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.f;
                if (j3 == 0) {
                    this.f = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.f = i2 + 1;
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                }
            }
        }
    }

    public final void J() {
        this.g.write(this.d, 0, this.f);
        this.f = 0;
    }

    public final void K(int i) {
        if (this.e - this.f < i) {
            J();
        }
    }

    public final void L(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f;
        int i4 = this.e;
        int i5 = i4 - i3;
        byte[] bArr2 = this.d;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f = i4;
        J();
        if (i7 > i4) {
            this.g.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f = i7;
        }
    }

    @Override // p.rwg
    public final void i(byte b) {
        if (this.f == this.e) {
            J();
        }
        int i = this.f;
        this.d[i] = b;
        this.f = i + 1;
    }

    @Override // p.rwg
    public final void j(int i, boolean z) {
        K(11);
        G(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f;
        this.d[i2] = b;
        this.f = i2 + 1;
    }

    @Override // p.rwg
    public final void k(byte[] bArr, int i) throws IOException {
        B(i);
        L(bArr, 0, i);
    }

    @Override // p.rwg
    public final void l(int i, phc phcVar) {
        z(i, 2);
        m(phcVar);
    }

    @Override // p.rwg
    public final void m(phc phcVar) {
        B(phcVar.size());
        phcVar.w(this);
    }

    @Override // p.rwg
    public final void n(int i, int i2) {
        K(14);
        G(i, 5);
        E(i2);
    }

    @Override // p.rwg
    public final void o(int i) {
        K(4);
        E(i);
    }

    @Override // p.rwg
    public final void p(int i, long j) {
        K(18);
        G(i, 1);
        F(j);
    }

    @Override // p.rwg
    public final void q(long j) {
        K(8);
        F(j);
    }

    @Override // p.rwg
    public final void r(int i, int i2) {
        K(20);
        G(i, 0);
        if (i2 >= 0) {
            H(i2);
        } else {
            I(i2);
        }
    }

    @Override // p.rwg
    public final void s(int i) {
        if (i >= 0) {
            B(i);
        } else {
            D(i);
        }
    }

    @Override // p.rwg
    public final void t(int i, byte[] bArr, int i2) throws IOException {
        L(bArr, i, i2);
    }

    @Override // p.rwg
    public final void u(s2j0 s2j0Var) {
        B(s2j0Var.getSerializedSize());
        s2j0Var.writeTo(this);
    }

    @Override // p.rwg
    public final void v(int i, s2j0 s2j0Var) {
        z(1, 3);
        A(2, i);
        z(3, 2);
        u(s2j0Var);
        z(1, 4);
    }

    @Override // p.rwg
    public final void w(int i, phc phcVar) {
        z(1, 3);
        A(2, i);
        l(3, phcVar);
        z(1, 4);
    }

    @Override // p.rwg
    public final void x(int i, String str) throws IOException {
        z(i, 2);
        y(str);
    }

    @Override // p.rwg
    public final void y(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iF = rwg.f(length);
            int i = iF + length;
            int i2 = this.e;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iU = toi1.a.u(str, bArr, 0, length);
                B(iU);
                L(bArr, 0, iU);
                return;
            }
            if (i > i2 - this.f) {
                J();
            }
            int iF2 = rwg.f(str.length());
            int i3 = this.f;
            byte[] bArr2 = this.d;
            try {
                try {
                    if (iF2 == iF) {
                        int i4 = i3 + iF2;
                        this.f = i4;
                        int iU2 = toi1.a.u(str, bArr2, i4, i2 - i4);
                        this.f = i3;
                        H((iU2 - i3) - iF2);
                        this.f = iU2;
                    } else {
                        int iA = toi1.a(str);
                        H(iA);
                        this.f = toi1.a.u(str, bArr2, this.f, iA);
                    }
                } catch (moi1 e) {
                    this.f = i3;
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new CodedOutputStream$OutOfSpaceException(e2);
            }
        } catch (moi1 e3) {
            h(str, e3);
        }
    }

    @Override // p.rwg
    public final void z(int i, int i2) {
        B(poz0.E(i, i2));
    }
}
