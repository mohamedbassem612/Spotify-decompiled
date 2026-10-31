package p;

import com.google.protobuf.CodedOutputStream$OutOfSpaceException;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nwg extends rwg {
    public final byte[] d;
    public final int e;
    public int f;

    public nwg(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            Locale locale = Locale.US;
            hhg1.n(cy30.i(bArr.length, "Array range is invalid. Buffer.length=", i, ", offset=0, length="));
            throw null;
        }
        this.d = bArr;
        this.f = 0;
        this.e = i;
    }

    @Override // p.rwg
    public final void A(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        z(i, 0);
        B(i2);
    }

    @Override // p.rwg
    public final void B(int i) throws CodedOutputStream$OutOfSpaceException {
        int i2;
        int i3 = this.f;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.d;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(i2, this.e, 1, e);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(i2, this.e, 1, e);
        }
    }

    @Override // p.rwg
    public final void C(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        z(i, 0);
        D(j);
    }

    @Override // p.rwg
    public final void D(long j) throws CodedOutputStream$OutOfSpaceException {
        int i;
        int i2 = this.f;
        boolean z = rwg.c;
        byte[] bArr = this.d;
        if (!z || E() < 10) {
            while ((j & (-128)) != 0) {
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(i, this.e, 1, e);
                }
            }
            i = i2 + 1;
            bArr[i2] = (byte) j;
        } else {
            while ((j & (-128)) != 0) {
                dlh1.l(bArr, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            dlh1.l(bArr, i2, (byte) j);
        }
        this.f = i;
    }

    public final int E() {
        return this.e - this.f;
    }

    public final void F(byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i, this.d, this.f, i2);
            this.f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(this.f, this.e, i2, e);
        }
    }

    @Override // p.rwg
    public final void i(byte b) throws CodedOutputStream$OutOfSpaceException {
        int i = this.f;
        try {
            int i2 = i + 1;
            try {
                this.d[i] = b;
                this.f = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new CodedOutputStream$OutOfSpaceException(i, this.e, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // p.rwg
    public final void j(int i, boolean z) throws CodedOutputStream$OutOfSpaceException {
        z(i, 0);
        i(z ? (byte) 1 : (byte) 0);
    }

    @Override // p.rwg
    public final void k(byte[] bArr, int i) throws CodedOutputStream$OutOfSpaceException {
        B(i);
        F(bArr, 0, i);
    }

    @Override // p.rwg
    public final void l(int i, phc phcVar) throws CodedOutputStream$OutOfSpaceException {
        z(i, 2);
        m(phcVar);
    }

    @Override // p.rwg
    public final void m(phc phcVar) throws CodedOutputStream$OutOfSpaceException {
        B(phcVar.size());
        phcVar.w(this);
    }

    @Override // p.rwg
    public final void n(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        z(i, 5);
        o(i2);
    }

    @Override // p.rwg
    public final void o(int i) throws CodedOutputStream$OutOfSpaceException {
        int i2 = this.f;
        try {
            byte[] bArr = this.d;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(i2, this.e, 4, e);
        }
    }

    @Override // p.rwg
    public final void p(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        z(i, 1);
        q(j);
    }

    @Override // p.rwg
    public final void q(long j) throws CodedOutputStream$OutOfSpaceException {
        int i = this.f;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(i, this.e, 8, e);
        }
    }

    @Override // p.rwg
    public final void r(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        z(i, 0);
        s(i2);
    }

    @Override // p.rwg
    public final void s(int i) throws CodedOutputStream$OutOfSpaceException {
        if (i >= 0) {
            B(i);
        } else {
            D(i);
        }
    }

    @Override // p.rwg
    public final void t(int i, byte[] bArr, int i2) throws CodedOutputStream$OutOfSpaceException {
        F(bArr, i, i2);
    }

    @Override // p.rwg
    public final void u(s2j0 s2j0Var) throws CodedOutputStream$OutOfSpaceException {
        B(s2j0Var.getSerializedSize());
        s2j0Var.writeTo(this);
    }

    @Override // p.rwg
    public final void v(int i, s2j0 s2j0Var) throws CodedOutputStream$OutOfSpaceException {
        z(1, 3);
        A(2, i);
        z(3, 2);
        u(s2j0Var);
        z(1, 4);
    }

    @Override // p.rwg
    public final void w(int i, phc phcVar) throws CodedOutputStream$OutOfSpaceException {
        z(1, 3);
        A(2, i);
        l(3, phcVar);
        z(1, 4);
    }

    @Override // p.rwg
    public final void x(int i, String str) throws CodedOutputStream$OutOfSpaceException {
        z(i, 2);
        y(str);
    }

    @Override // p.rwg
    public final void y(String str) throws CodedOutputStream$OutOfSpaceException {
        int i = this.f;
        try {
            int iF = rwg.f(str.length() * 3);
            int iF2 = rwg.f(str.length());
            byte[] bArr = this.d;
            if (iF2 != iF) {
                B(toi1.a(str));
                this.f = toi1.a.u(str, bArr, this.f, E());
                return;
            }
            int i2 = i + iF2;
            this.f = i2;
            int iU = toi1.a.u(str, bArr, i2, E());
            this.f = i;
            B((iU - i) - iF2);
            this.f = iU;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(e);
        } catch (moi1 e2) {
            this.f = i;
            h(str, e2);
        }
    }

    @Override // p.rwg
    public final void z(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        B(poz0.E(i, i2));
    }
}
