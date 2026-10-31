package p;

import androidx.glance.appwidget.protobuf.CodedOutputStream$OutOfSpaceException;
import androidx.glance.appwidget.protobuf.a;
import app.p000rive.semantics.SemanticState;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class owg extends eth {
    public static final Logger w = Logger.getLogger(owg.class.getName());
    public static final boolean x = blh1.e;
    public fp8 r;
    public final byte[] s;
    public final int t;
    public int u;
    public final v091 v;

    public owg(v091 v091Var, int i) {
        if (i < 0) {
            hhg1.n("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.s = new byte[iMax];
        this.t = iMax;
        this.v = v091Var;
    }

    public static int i0(int i, fhc fhcVar) {
        int iK0 = k0(i);
        int size = fhcVar.size();
        return l0(size) + size + iK0;
    }

    public static int j0(String str) {
        int length;
        try {
            length = roi1.a(str);
        } catch (koi1 unused) {
            length = str.getBytes(j290.a).length;
        }
        return l0(length) + length;
    }

    public static int k0(int i) {
        return l0(i << 3);
    }

    public static int l0(int i) {
        return gvg.b(i, 9, 352) >>> 6;
    }

    public static int m0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void A0(int i, int i2) {
        C0((i << 3) | i2);
    }

    public final void B0(int i, int i2) {
        o0(20);
        f0(i, 0);
        g0(i2);
    }

    public final void C0(int i) {
        o0(5);
        g0(i);
    }

    public final void D0(int i, long j) {
        o0(20);
        f0(i, 0);
        h0(j);
    }

    public final void E0(long j) {
        o0(10);
        h0(j);
    }

    public final void b0(int i, byte[] bArr, int i2) {
        p0(bArr, i, i2);
    }

    public final void d0(int i) {
        int i2 = this.u;
        int i3 = i2 + 1;
        this.u = i3;
        byte[] bArr = this.s;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.u = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.u = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.u = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void e0(long j) {
        int i = this.u;
        int i2 = i + 1;
        this.u = i2;
        byte[] bArr = this.s;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.u = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.u = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.u = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.u = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.u = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.u = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.u = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void f0(int i, int i2) {
        g0((i << 3) | i2);
    }

    public final void g0(int i) {
        boolean z = x;
        byte[] bArr = this.s;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.u;
                if (i2 == 0) {
                    this.u = i3 + 1;
                    blh1.k(bArr, i3, (byte) i);
                    return;
                } else {
                    this.u = i3 + 1;
                    blh1.k(bArr, i3, (byte) ((i | SemanticState.Focused) & 255));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.u;
                if (i4 == 0) {
                    this.u = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.u = i5 + 1;
                    bArr[i5] = (byte) ((i | SemanticState.Focused) & 255);
                    i >>>= 7;
                }
            }
        }
    }

    public final void h0(long j) {
        boolean z = x;
        byte[] bArr = this.s;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.u;
                if (j2 == 0) {
                    this.u = i + 1;
                    blh1.k(bArr, i, (byte) j);
                    return;
                } else {
                    this.u = i + 1;
                    blh1.k(bArr, i, (byte) ((((int) j) | SemanticState.Focused) & 255));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.u;
                if (j3 == 0) {
                    this.u = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.u = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) | SemanticState.Focused) & 255);
                    j >>>= 7;
                }
            }
        }
    }

    public final void n0() {
        this.v.write(this.s, 0, this.u);
        this.u = 0;
    }

    public final void o0(int i) {
        if (this.t - this.u < i) {
            n0();
        }
    }

    public final void p0(byte[] bArr, int i, int i2) {
        int i3 = this.u;
        int i4 = this.t;
        int i5 = i4 - i3;
        byte[] bArr2 = this.s;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.u += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.u = i4;
        n0();
        if (i7 > i4) {
            this.v.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.u = i7;
        }
    }

    public final void q0(int i, boolean z) {
        o0(11);
        f0(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.u;
        this.u = i2 + 1;
        this.s[i2] = b;
    }

    public final void r0(int i, fhc fhcVar) {
        A0(i, 2);
        C0(fhcVar.size());
        b0(fhcVar.e(), fhcVar.b, fhcVar.size());
    }

    public final void s0(int i, int i2) {
        o0(14);
        f0(i, 5);
        d0(i2);
    }

    public final void t0(int i) {
        o0(4);
        d0(i);
    }

    public final void u0(int i, long j) {
        o0(18);
        f0(i, 1);
        e0(j);
    }

    public final void v0(long j) {
        o0(8);
        e0(j);
    }

    public final void w0(int i, int i2) {
        o0(20);
        f0(i, 0);
        if (i2 >= 0) {
            g0(i2);
        } else {
            h0(i2);
        }
    }

    public final void x0(int i) {
        if (i >= 0) {
            C0(i);
        } else {
            E0(i);
        }
    }

    public final void y0(int i, a aVar, qm41 qm41Var) {
        A0(i, 2);
        C0(aVar.a(qm41Var));
        qm41Var.f(aVar, this.r);
    }

    public final void z0(int i, String str) throws CodedOutputStream$OutOfSpaceException {
        A0(i, 2);
        try {
            int length = str.length() * 3;
            int iL0 = l0(length);
            int i2 = iL0 + length;
            int i3 = this.t;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int iO = roi1.a.o(str, bArr, 0, length);
                C0(iO);
                p0(bArr, 0, iO);
                return;
            }
            if (i2 > i3 - this.u) {
                n0();
            }
            int iL1 = l0(str.length());
            int i4 = this.u;
            byte[] bArr2 = this.s;
            try {
                if (iL1 != iL0) {
                    int iA = roi1.a(str);
                    g0(iA);
                    this.u = roi1.a.o(str, bArr2, this.u, iA);
                    return;
                }
                int i5 = i4 + iL1;
                this.u = i5;
                int iO2 = roi1.a.o(str, bArr2, i5, i3 - i5);
                this.u = i4;
                g0((iO2 - i4) - iL1);
                this.u = iO2;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new CodedOutputStream$OutOfSpaceException(e);
            } catch (koi1 e2) {
                this.u = i4;
                throw e2;
            }
        } catch (koi1 e3) {
            w.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(j290.a);
            try {
                C0(bytes.length);
                b0(0, bytes, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new CodedOutputStream$OutOfSpaceException(e4);
            }
        }
    }
}
