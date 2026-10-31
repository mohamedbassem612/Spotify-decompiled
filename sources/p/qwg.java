package p;

import androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException;
import androidx.datastore.preferences.protobuf.a;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qwg extends dm5 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Logger f103p = Logger.getLogger(qwg.class.getName());
    public static final boolean q = elh1.f;
    public jc9 k;
    public final byte[] l;
    public final int m;
    public int n;
    public final v091 o;

    public qwg(v091 v091Var, int i) {
        if (i < 0) {
            hhg1.n("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.l = new byte[iMax];
        this.m = iMax;
        this.o = v091Var;
    }

    public static int A0(a aVar) {
        return aVar.a();
    }

    public static int B0(int i, int i2) {
        return C0(i2) + R0(i);
    }

    public static int C0(int i) {
        if (i >= 0) {
            return T0(i);
        }
        return 10;
    }

    public static int D0(int i, long j) {
        return V0(j) + R0(i);
    }

    public static int E0(long j) {
        return V0(j);
    }

    public static int F0(int i, a aVar, tm41 tm41Var) {
        return H0(aVar, tm41Var) + R0(i);
    }

    public static int G0(a aVar) {
        int iA = aVar.a();
        return T0(iA) + iA;
    }

    public static int H0(a aVar, tm41 tm41Var) {
        int iB = aVar.b(tm41Var);
        return T0(iB) + iB;
    }

    public static int I0(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int J0(int i) {
        return R0(i) + 4;
    }

    public static int K0(int i) {
        return R0(i) + 8;
    }

    public static int L0(int i, int i2) {
        return M0(i2) + R0(i);
    }

    public static int M0(int i) {
        return T0((i >> 31) ^ (i << 1));
    }

    public static int N0(int i, long j) {
        return O0(j) + R0(i);
    }

    public static int O0(long j) {
        return V0((j >> 63) ^ (j << 1));
    }

    public static int P0(int i, String str) {
        return Q0(str) + R0(i);
    }

    public static int Q0(String str) {
        int length;
        try {
            length = uoi1.a(str);
        } catch (noi1 unused) {
            length = str.getBytes(n290.a).length;
        }
        return T0(length) + length;
    }

    public static int R0(int i) {
        return T0(i << 3);
    }

    public static int S0(int i, int i2) {
        return T0(i2) + R0(i);
    }

    public static int T0(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int U0(int i, long j) {
        return V0(j) + R0(i);
    }

    public static int V0(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int p0(int i) {
        return R0(i) + 1;
    }

    public static int q0(byte[] bArr) {
        int length = bArr.length;
        return T0(length) + length;
    }

    public static int r0(int i, ihc ihcVar) {
        return s0(ihcVar) + R0(i);
    }

    public static int s0(ihc ihcVar) {
        int size = ihcVar.size();
        return T0(size) + size;
    }

    public static int t0(int i) {
        return R0(i) + 8;
    }

    public static int u0(int i, int i2) {
        return C0(i2) + R0(i);
    }

    public static int v0(int i) {
        return C0(i);
    }

    public static int w0(int i) {
        return R0(i) + 4;
    }

    public static int x0(int i) {
        return R0(i) + 8;
    }

    public static int y0(int i) {
        return R0(i) + 4;
    }

    public static int z0(int i, a aVar, tm41 tm41Var) {
        return aVar.b(tm41Var) + (R0(i) * 2);
    }

    public final void W0() {
        this.o.write(this.l, 0, this.n);
        this.n = 0;
    }

    public final void X0(int i) {
        if (this.m - this.n < i) {
            W0();
        }
    }

    public final void Y0(byte b) {
        if (this.n == this.m) {
            W0();
        }
        int i = this.n;
        this.n = i + 1;
        this.l[i] = b;
    }

    public final void Z0(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.n;
        int i4 = this.m;
        int i5 = i4 - i3;
        byte[] bArr2 = this.l;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.n += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.n = i4;
        W0();
        if (i7 > i4) {
            this.o.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.n = i7;
        }
    }

    public final void a1(int i, boolean z) {
        X0(11);
        m0(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.n;
        this.n = i2 + 1;
        this.l[i2] = b;
    }

    public final void b1(int i, ihc ihcVar) {
        p1(i, 2);
        c1(ihcVar);
    }

    public final void c1(ihc ihcVar) {
        r1(ihcVar.size());
        i0(ihcVar.c(), ihcVar.b, ihcVar.size());
    }

    public final void d1(double d) {
        h1(Double.doubleToRawLongBits(d));
    }

    public final void e1(int i, int i2) {
        X0(14);
        m0(i, 5);
        k0(i2);
    }

    public final void f1(int i) {
        X0(4);
        k0(i);
    }

    public final void g1(int i, long j) {
        X0(18);
        m0(i, 1);
        l0(j);
    }

    public final void h1(long j) {
        X0(8);
        l0(j);
    }

    @Override // p.dm5
    public final void i0(int i, byte[] bArr, int i2) throws IOException {
        Z0(bArr, i, i2);
    }

    public final void i1(float f) {
        f1(Float.floatToRawIntBits(f));
    }

    public final void j1(int i, int i2) {
        X0(20);
        m0(i, 0);
        if (i2 >= 0) {
            n0(i2);
        } else {
            o0(i2);
        }
    }

    public final void k0(int i) {
        int i2 = this.n;
        int i3 = i2 + 1;
        this.n = i3;
        byte[] bArr = this.l;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.n = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.n = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.n = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void k1(int i) {
        if (i >= 0) {
            r1(i);
        } else {
            t1(i);
        }
    }

    public final void l0(long j) {
        int i = this.n;
        int i2 = i + 1;
        this.n = i2;
        byte[] bArr = this.l;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.n = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.n = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.n = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.n = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.n = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.n = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.n = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void l1(int i) {
        r1((i >> 31) ^ (i << 1));
    }

    public final void m0(int i, int i2) {
        n0(ot11.J(i, i2));
    }

    public final void m1(long j) {
        t1((j >> 63) ^ (j << 1));
    }

    public final void n0(int i) {
        boolean z = q;
        byte[] bArr = this.l;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.n;
                if (i2 == 0) {
                    this.n = i3 + 1;
                    elh1.k(bArr, i3, (byte) i);
                    return;
                } else {
                    this.n = i3 + 1;
                    elh1.k(bArr, i3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.n;
                if (i4 == 0) {
                    this.n = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.n = i5 + 1;
                    bArr[i5] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
            }
        }
    }

    public final void n1(int i, String str) throws IOException {
        p1(i, 2);
        o1(str);
    }

    public final void o0(long j) {
        boolean z = q;
        byte[] bArr = this.l;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.n;
                if (j2 == 0) {
                    this.n = i + 1;
                    elh1.k(bArr, i, (byte) j);
                    return;
                } else {
                    this.n = i + 1;
                    elh1.k(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.n;
                if (j3 == 0) {
                    this.n = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.n = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
            }
        }
    }

    public final void o1(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iT0 = T0(length);
            int i = iT0 + length;
            int i2 = this.m;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iT = uoi1.a.t(str, bArr, 0, length);
                r1(iT);
                Z0(bArr, 0, iT);
                return;
            }
            if (i > i2 - this.n) {
                W0();
            }
            int iT1 = T0(str.length());
            int i3 = this.n;
            byte[] bArr2 = this.l;
            try {
                try {
                    if (iT1 == iT0) {
                        int i4 = i3 + iT1;
                        this.n = i4;
                        int iT2 = uoi1.a.t(str, bArr2, i4, i2 - i4);
                        this.n = i3;
                        n0((iT2 - i3) - iT1);
                        this.n = iT2;
                    } else {
                        int iA = uoi1.a(str);
                        n0(iA);
                        this.n = uoi1.a.t(str, bArr2, this.n, iA);
                    }
                } catch (noi1 e) {
                    this.n = i3;
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new CodedOutputStream$OutOfSpaceException(e2);
            }
        } catch (noi1 e3) {
            f103p.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(n290.a);
            try {
                r1(bytes.length);
                i0(0, bytes, bytes.length);
            } catch (CodedOutputStream$OutOfSpaceException e4) {
                throw e4;
            } catch (IndexOutOfBoundsException e5) {
                throw new CodedOutputStream$OutOfSpaceException(e5);
            }
        }
    }

    public final void p1(int i, int i2) {
        r1(ot11.J(i, i2));
    }

    public final void q1(int i, int i2) {
        X0(20);
        m0(i, 0);
        n0(i2);
    }

    public final void r1(int i) {
        X0(5);
        n0(i);
    }

    public final void s1(int i, long j) {
        X0(20);
        m0(i, 0);
        o0(j);
    }

    public final void t1(long j) {
        X0(10);
        o0(j);
    }
}
