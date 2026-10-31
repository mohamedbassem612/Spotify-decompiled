package p;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nac implements gbc, fbc, Cloneable, ByteChannel {
    public ip51 a;
    public long b;

    public final long A() {
        int i;
        if (this.b == 0) {
            eg.l();
            return 0L;
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            ip51 ip51Var = this.a;
            ip51Var.getClass();
            byte[] bArr = ip51Var.a;
            int i3 = ip51Var.b;
            int i4 = ip51Var.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i2 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(zod.V(b)));
                        }
                        z = true;
                        break;
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    nac nacVar = new nac();
                    nacVar.T(j);
                    nacVar.R(b);
                    throw new NumberFormatException("Number too large: ".concat(nacVar.I()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.a = ip51Var.a();
                pq51.a(ip51Var);
            } else {
                ip51Var.b = i3;
            }
            if (z) {
                break;
            }
        } while (this.a != null);
        this.b -= (long) i2;
        return j;
    }

    @Override // p.fbc
    public final long B(fka1 fka1Var) {
        long j = 0;
        while (true) {
            long jO0 = fka1Var.O0(this, 8192L);
            if (jO0 == -1) {
                return j;
            }
            j += jO0;
        }
    }

    @Override // p.c291
    public final void B0(nac nacVar, long j) {
        ip51 ip51VarB;
        if (nacVar == this) {
            hhg1.n("source == this");
            return;
        }
        zod.u(nacVar.b, 0L, j);
        while (j > 0) {
            ip51 ip51Var = nacVar.a;
            ip51Var.getClass();
            int i = ip51Var.c;
            ip51 ip51Var2 = nacVar.a;
            ip51Var2.getClass();
            long j2 = i - ip51Var2.b;
            int i2 = 0;
            if (j < j2) {
                ip51 ip51Var3 = this.a;
                ip51 ip51Var4 = ip51Var3 != null ? ip51Var3.g : null;
                if (ip51Var4 != null && ip51Var4.e) {
                    if ((((long) ip51Var4.c) + j) - ((long) (ip51Var4.d ? 0 : ip51Var4.b)) <= 8192) {
                        ip51 ip51Var5 = nacVar.a;
                        ip51Var5.getClass();
                        ip51Var5.d(ip51Var4, (int) j);
                        nacVar.b -= j;
                        this.b += j;
                        return;
                    }
                }
                ip51 ip51Var6 = nacVar.a;
                ip51Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > ip51Var6.c - ip51Var6.b) {
                    hhg1.n("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    ip51VarB = ip51Var6.c();
                } else {
                    ip51VarB = pq51.b();
                    byte[] bArr = ip51Var6.a;
                    byte[] bArr2 = ip51VarB.a;
                    int i4 = ip51Var6.b;
                    f46.U(i4, i4 + i3, 2, bArr, bArr2);
                }
                ip51VarB.c = ip51VarB.b + i3;
                ip51Var6.b += i3;
                ip51 ip51Var7 = ip51Var6.g;
                ip51Var7.getClass();
                ip51Var7.b(ip51VarB);
                nacVar.a = ip51VarB;
            }
            ip51 ip51Var8 = nacVar.a;
            ip51Var8.getClass();
            long j3 = ip51Var8.c - ip51Var8.b;
            nacVar.a = ip51Var8.a();
            ip51 ip51Var9 = this.a;
            if (ip51Var9 == null) {
                this.a = ip51Var8;
                ip51Var8.g = ip51Var8;
                ip51Var8.f = ip51Var8;
            } else {
                ip51 ip51Var10 = ip51Var9.g;
                ip51Var10.getClass();
                ip51Var10.b(ip51Var8);
                ip51 ip51Var11 = ip51Var8.g;
                if (ip51Var11 == ip51Var8) {
                    eg.m("cannot compact");
                    return;
                }
                ip51Var11.getClass();
                if (ip51Var11.e) {
                    int i5 = ip51Var8.c - ip51Var8.b;
                    ip51 ip51Var12 = ip51Var8.g;
                    ip51Var12.getClass();
                    int i6 = 8192 - ip51Var12.c;
                    ip51 ip51Var13 = ip51Var8.g;
                    ip51Var13.getClass();
                    if (!ip51Var13.d) {
                        ip51 ip51Var14 = ip51Var8.g;
                        ip51Var14.getClass();
                        i2 = ip51Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        ip51 ip51Var15 = ip51Var8.g;
                        ip51Var15.getClass();
                        ip51Var8.d(ip51Var15, i5);
                        ip51Var8.a();
                        pq51.a(ip51Var8);
                    }
                }
            }
            nacVar.b -= j3;
            this.b += j3;
            j -= j3;
        }
    }

    public final int C() {
        if (this.b < 4) {
            eg.l();
            return 0;
        }
        ip51 ip51Var = this.a;
        ip51Var.getClass();
        int i = ip51Var.b;
        int i2 = ip51Var.c;
        if (i2 - i < 4) {
            return (u() & 255) | ((u() & 255) << 24) | ((u() & 255) << 16) | ((u() & 255) << 8);
        }
        byte[] bArr = ip51Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 4;
        if (i5 != i2) {
            ip51Var.b = i5;
            return i6;
        }
        this.a = ip51Var.a();
        pq51.a(ip51Var);
        return i6;
    }

    public final long D() {
        if (this.b < 8) {
            eg.l();
            return 0L;
        }
        ip51 ip51Var = this.a;
        ip51Var.getClass();
        int i = ip51Var.b;
        int i2 = ip51Var.c;
        if (i2 - i < 8) {
            return ((((long) C()) & 4294967295L) << 32) | (4294967295L & ((long) C()));
        }
        byte[] bArr = ip51Var.a;
        int i3 = i + 7;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (((long) bArr[i3]) & 255);
        this.b -= 8;
        if (i4 != i2) {
            ip51Var.b = i4;
            return j2;
        }
        this.a = ip51Var.a();
        pq51.a(ip51Var);
        return j2;
    }

    public final short E() {
        if (this.b < 2) {
            eg.l();
            return (short) 0;
        }
        ip51 ip51Var = this.a;
        ip51Var.getClass();
        int i = ip51Var.b;
        int i2 = ip51Var.c;
        if (i2 - i < 2) {
            return (short) ((u() & 255) | ((u() & 255) << 8));
        }
        byte[] bArr = ip51Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 2;
        if (i5 == i2) {
            this.a = ip51Var.a();
            pq51.a(ip51Var);
        } else {
            ip51Var.b = i5;
        }
        return (short) i6;
    }

    public final short F() {
        return zod.O(E());
    }

    public final String G(long j, Charset charset) {
        if (j < 0 || j > 2147483647L) {
            hhg1.f(l1d.l(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            eg.l();
            return null;
        }
        if (j == 0) {
            return "";
        }
        ip51 ip51Var = this.a;
        ip51Var.getClass();
        int i = ip51Var.b;
        if (((long) i) + j > ip51Var.c) {
            return new String(v(j), charset);
        }
        int i2 = (int) j;
        String str = new String(ip51Var.a, i, i2, charset);
        int i3 = ip51Var.b + i2;
        ip51Var.b = i3;
        this.b -= j;
        if (i3 == ip51Var.c) {
            this.a = ip51Var.a();
            pq51.a(ip51Var);
        }
        return str;
    }

    public final String I() {
        return G(this.b, nne.a);
    }

    @Override // p.gbc
    public final String I0(Charset charset) {
        return G(this.b, charset);
    }

    public final rhc J() {
        long j = this.b;
        if (j <= 2147483647L) {
            return L((int) j);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    public final rhc L(int i) {
        if (i == 0) {
            return rhc.d;
        }
        zod.u(this.b, 0L, i);
        ip51 ip51Var = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            ip51Var.getClass();
            int i5 = ip51Var.c;
            int i6 = ip51Var.b;
            if (i5 == i6) {
                eg.f("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            ip51Var = ip51Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        ip51 ip51Var2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            ip51Var2.getClass();
            bArr[i7] = ip51Var2.a;
            i2 += ip51Var2.c - ip51Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = ip51Var2.b;
            ip51Var2.d = true;
            i7++;
            ip51Var2 = ip51Var2.f;
        }
        return new er51(bArr, iArr);
    }

    @Override // p.gbc
    public final int L0() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.b == 0) {
            eg.l();
            return 0;
        }
        byte bG = g(0L);
        if ((bG & 128) == 0) {
            i = bG & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bG & 224) == 192) {
            i = bG & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bG & 240) == 224) {
            i = bG & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bG & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bG & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.b < j) {
            StringBuilder sbR = cy30.r(i2, "size < ", ": ");
            sbR.append(this.b);
            sbR.append(" (to read code point prefixed 0x");
            sbR.append(zod.V(bG));
            sbR.append(')');
            throw new EOFException(sbR.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bG2 = g(j2);
            if ((bG2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bG2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    public final ip51 M(int i) {
        if (i < 1 || i > 8192) {
            hhg1.n("unexpected capacity");
            return null;
        }
        ip51 ip51Var = this.a;
        if (ip51Var == null) {
            ip51 ip51VarB = pq51.b();
            this.a = ip51VarB;
            ip51VarB.g = ip51VarB;
            ip51VarB.f = ip51VarB;
            return ip51VarB;
        }
        ip51 ip51Var2 = ip51Var.g;
        ip51Var2.getClass();
        if (ip51Var2.c + i <= 8192 && ip51Var2.e) {
            return ip51Var2;
        }
        ip51 ip51VarB2 = pq51.b();
        ip51Var2.b(ip51VarB2);
        return ip51VarB2;
    }

    public final void N(rhc rhcVar) {
        rhcVar.s(this, rhcVar.d());
    }

    @Override // p.fbc
    public final /* bridge */ /* synthetic */ fbc O(byte[] bArr, int i) {
        write(bArr, 0, i);
        return this;
    }

    @Override // p.fka1
    public final long O0(nac nacVar, long j) {
        if (j < 0) {
            hhg1.f(l1d.l(j, "byteCount < 0: "));
            return 0L;
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        nacVar.B0(this, j);
        return j;
    }

    @Override // p.fbc
    public final fbc P(ff01 ff01Var, long j) {
        while (j > 0) {
            long jO0 = ff01Var.O0(this, j);
            if (jO0 == -1) {
                eg.l();
                return null;
            }
            j -= jO0;
        }
        return this;
    }

    @Override // p.fbc
    public final /* bridge */ /* synthetic */ fbc Q(String str) {
        Y(str);
        return this;
    }

    public final void R(int i) {
        ip51 ip51VarM = M(1);
        byte[] bArr = ip51VarM.a;
        int i2 = ip51VarM.c;
        ip51VarM.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    public final void S(long j) {
        boolean z;
        if (j == 0) {
            R(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                Y("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = b.a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > b.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        ip51 ip51VarM = M(i);
        byte[] bArr2 = ip51VarM.a;
        int i2 = ip51VarM.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = b.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        ip51VarM.c += i;
        this.b += (long) i;
    }

    public final void T(long j) {
        if (j == 0) {
            R(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        ip51 ip51VarM = M(i);
        byte[] bArr = ip51VarM.a;
        int i2 = ip51VarM.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        ip51VarM.c += i;
        this.b += (long) i;
    }

    @Override // p.fbc
    public final /* bridge */ /* synthetic */ fbc T0(rhc rhcVar) {
        N(rhcVar);
        return this;
    }

    public final void U(int i) {
        ip51 ip51VarM = M(4);
        byte[] bArr = ip51VarM.a;
        int i2 = ip51VarM.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        ip51VarM.c = i2 + 4;
        this.b += 4;
    }

    public final void V(int i) {
        ip51 ip51VarM = M(2);
        byte[] bArr = ip51VarM.a;
        int i2 = ip51VarM.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        ip51VarM.c = i2 + 2;
        this.b += 2;
    }

    public final void X(int i, int i2, String str) {
        char cCharAt;
        if (i < 0) {
            hhg1.f(f4i1.c(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            hhg1.f(cy30.i(i2, "endIndex < beginIndex: ", i, " < "));
            return;
        }
        if (i2 > str.length()) {
            t8e1.l(str.length(), cy30.r(i2, "endIndex > string.length: ", " > "));
            return;
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                ip51 ip51VarM = M(1);
                byte[] bArr = ip51VarM.a;
                int i3 = ip51VarM.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = ip51VarM.c;
                int i6 = (i3 + i) - i5;
                ip51VarM.c = i5 + i6;
                this.b += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    ip51 ip51VarM2 = M(2);
                    byte[] bArr2 = ip51VarM2.a;
                    int i7 = ip51VarM2.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    ip51VarM2.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    ip51 ip51VarM3 = M(3);
                    byte[] bArr3 = ip51VarM3.a;
                    int i8 = ip51VarM3.c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    ip51VarM3.c = i8 + 3;
                    this.b += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        R(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        ip51 ip51VarM4 = M(4);
                        byte[] bArr4 = ip51VarM4.a;
                        int i11 = ip51VarM4.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        ip51VarM4.c = i11 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void Y(String str) {
        X(0, str.length(), str);
    }

    public final void Z(int i) {
        if (i < 128) {
            R(i);
            return;
        }
        if (i < 2048) {
            ip51 ip51VarM = M(2);
            byte[] bArr = ip51VarM.a;
            int i2 = ip51VarM.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            ip51VarM.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            R(63);
            return;
        }
        if (i < 65536) {
            ip51 ip51VarM2 = M(3);
            byte[] bArr2 = ip51VarM2.a;
            int i3 = ip51VarM2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            ip51VarM2.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i > 1114111) {
            hhg1.n("Unexpected code point: 0x".concat(zod.W(i)));
            return;
        }
        ip51 ip51VarM3 = M(4);
        byte[] bArr3 = ip51VarM3.a;
        int i4 = ip51VarM3.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        ip51VarM3.c = i4 + 4;
        this.b += 4;
    }

    @Override // p.gbc
    public final long Z0(fbc fbcVar) {
        long j = this.b;
        if (j > 0) {
            fbcVar.B0(this, j);
        }
        return j;
    }

    public final void a() {
        skip(this.b);
    }

    public final Object clone() {
        nac nacVar = new nac();
        if (this.b == 0) {
            return nacVar;
        }
        ip51 ip51Var = this.a;
        ip51Var.getClass();
        ip51 ip51VarC = ip51Var.c();
        nacVar.a = ip51VarC;
        ip51VarC.g = ip51VarC;
        ip51VarC.f = ip51VarC;
        for (ip51 ip51Var2 = ip51Var.f; ip51Var2 != ip51Var; ip51Var2 = ip51Var2.f) {
            ip51 ip51Var3 = ip51VarC.g;
            ip51Var3.getClass();
            ip51Var2.getClass();
            ip51Var3.b(ip51Var2.c());
        }
        nacVar.b = this.b;
        return nacVar;
    }

    public final long d() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        ip51 ip51Var = this.a;
        ip51Var.getClass();
        ip51 ip51Var2 = ip51Var.g;
        ip51Var2.getClass();
        int i = ip51Var2.c;
        return (i >= 8192 || !ip51Var2.e) ? j : j - ((long) (i - ip51Var2.b));
    }

    public final void e(nac nacVar, long j, long j2) {
        long j3 = j;
        zod.u(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        nacVar.b += j2;
        ip51 ip51Var = this.a;
        while (true) {
            ip51Var.getClass();
            long j4 = ip51Var.c - ip51Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            ip51Var = ip51Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            ip51Var.getClass();
            ip51 ip51VarC = ip51Var.c();
            int i = ip51VarC.b + ((int) j3);
            ip51VarC.b = i;
            ip51VarC.c = Math.min(i + ((int) j5), ip51VarC.c);
            ip51 ip51Var2 = nacVar.a;
            if (ip51Var2 == null) {
                ip51VarC.g = ip51VarC;
                ip51VarC.f = ip51VarC;
                nacVar.a = ip51VarC;
            } else {
                ip51 ip51Var3 = ip51Var2.g;
                ip51Var3.getClass();
                ip51Var3.b(ip51VarC);
            }
            j5 -= (long) (ip51VarC.c - ip51VarC.b);
            ip51Var = ip51Var.f;
            j3 = 0;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nac)) {
            return false;
        }
        long j = this.b;
        nac nacVar = (nac) obj;
        if (j != nacVar.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        ip51 ip51Var = this.a;
        ip51Var.getClass();
        ip51 ip51Var2 = nacVar.a;
        ip51Var2.getClass();
        int i = ip51Var.b;
        int i2 = ip51Var2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long jMin = Math.min(ip51Var.c - i, ip51Var2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (ip51Var.a[i] != ip51Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == ip51Var.c) {
                ip51Var = ip51Var.f;
                ip51Var.getClass();
                i = ip51Var.b;
            }
            if (i2 == ip51Var2.c) {
                ip51Var2 = ip51Var2.f;
                ip51Var2.getClass();
                i2 = ip51Var2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    public final byte g(long j) {
        zod.u(this.b, j, 1L);
        ip51 ip51Var = this.a;
        ip51Var.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                ip51Var = ip51Var.g;
                ip51Var.getClass();
                j2 -= (long) (ip51Var.c - ip51Var.b);
            }
            return ip51Var.a[(int) ((((long) ip51Var.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = ip51Var.c;
            int i2 = ip51Var.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return ip51Var.a[(int) ((((long) i2) + j) - j3)];
            }
            ip51Var = ip51Var.f;
            ip51Var.getClass();
            j3 = j4;
        }
    }

    public final long h(byte b, long j, long j2) {
        ip51 ip51Var;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            throw new IllegalArgumentException(("size=" + this.b + " fromIndex=" + j3 + " toIndex=" + j4).toString());
        }
        long j6 = this.b;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (ip51Var = this.a) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                ip51Var = ip51Var.g;
                ip51Var.getClass();
                j6 -= (long) (ip51Var.c - ip51Var.b);
            }
            while (j6 < j4) {
                byte[] bArr = ip51Var.a;
                long j8 = j7;
                int iMin = (int) Math.min(ip51Var.c, (((long) ip51Var.b) + j4) - j6);
                for (int i = (int) ((((long) ip51Var.b) + j3) - j6); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - ip51Var.b)) + j6;
                    }
                }
                j6 += (long) (ip51Var.c - ip51Var.b);
                ip51Var = ip51Var.f;
                ip51Var.getClass();
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = ((long) (ip51Var.c - ip51Var.b)) + j5;
            if (j9 > j3) {
                break;
            }
            ip51Var = ip51Var.f;
            ip51Var.getClass();
            j5 = j9;
        }
        while (j5 < j4) {
            byte[] bArr2 = ip51Var.a;
            int iMin2 = (int) Math.min(ip51Var.c, (((long) ip51Var.b) + j4) - j5);
            for (int i2 = (int) ((((long) ip51Var.b) + j3) - j5); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - ip51Var.b)) + j5;
                }
            }
            j5 += (long) (ip51Var.c - ip51Var.b);
            ip51Var = ip51Var.f;
            ip51Var.getClass();
            j3 = j5;
        }
        return -1L;
    }

    @Override // p.gbc
    public final InputStream h1() {
        return new mac(this);
    }

    public final int hashCode() {
        ip51 ip51Var = this.a;
        if (ip51Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = ip51Var.c;
            for (int i3 = ip51Var.b; i3 < i2; i3++) {
                i = (i * 31) + ip51Var.a[i3];
            }
            ip51Var = ip51Var.f;
            ip51Var.getClass();
        } while (ip51Var != this.a);
        return i;
    }

    public final long i(long j, rhc rhcVar) {
        long j2 = 0;
        if (j < 0) {
            hhg1.f(l1d.l(j, "fromIndex < 0: "));
            return 0L;
        }
        ip51 ip51Var = this.a;
        if (ip51Var == null) {
            return -1L;
        }
        long j3 = this.b;
        if (j3 - j < j) {
            while (j3 > j) {
                ip51Var = ip51Var.g;
                ip51Var.getClass();
                j3 -= (long) (ip51Var.c - ip51Var.b);
            }
            if (rhcVar.d() == 2) {
                byte bI = rhcVar.i(0);
                byte bI2 = rhcVar.i(1);
                while (j3 < this.b) {
                    byte[] bArr = ip51Var.a;
                    int i = ip51Var.c;
                    for (int i2 = (int) ((((long) ip51Var.b) + j) - j3); i2 < i; i2++) {
                        byte b = bArr[i2];
                        if (b == bI || b == bI2) {
                            return ((long) (i2 - ip51Var.b)) + j3;
                        }
                    }
                    j3 += (long) (ip51Var.c - ip51Var.b);
                    ip51Var = ip51Var.f;
                    ip51Var.getClass();
                    j = j3;
                }
            } else {
                byte[] bArrH = rhcVar.h();
                while (j3 < this.b) {
                    byte[] bArr2 = ip51Var.a;
                    int i3 = ip51Var.c;
                    for (int i4 = (int) ((((long) ip51Var.b) + j) - j3); i4 < i3; i4++) {
                        byte b2 = bArr2[i4];
                        for (byte b3 : bArrH) {
                            if (b2 == b3) {
                                return ((long) (i4 - ip51Var.b)) + j3;
                            }
                        }
                    }
                    j3 += (long) (ip51Var.c - ip51Var.b);
                    ip51Var = ip51Var.f;
                    ip51Var.getClass();
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (ip51Var.c - ip51Var.b)) + j2;
            if (j4 > j) {
                break;
            }
            ip51Var = ip51Var.f;
            ip51Var.getClass();
            j2 = j4;
        }
        if (rhcVar.d() == 2) {
            byte bI3 = rhcVar.i(0);
            byte bI4 = rhcVar.i(1);
            while (j2 < this.b) {
                byte[] bArr3 = ip51Var.a;
                int i5 = ip51Var.c;
                for (int i6 = (int) ((((long) ip51Var.b) + j) - j2); i6 < i5; i6++) {
                    byte b4 = bArr3[i6];
                    if (b4 == bI3 || b4 == bI4) {
                        return ((long) (i6 - ip51Var.b)) + j2;
                    }
                }
                j2 += (long) (ip51Var.c - ip51Var.b);
                ip51Var = ip51Var.f;
                ip51Var.getClass();
                j = j2;
            }
        } else {
            byte[] bArrH2 = rhcVar.h();
            while (j2 < this.b) {
                byte[] bArr4 = ip51Var.a;
                int i7 = ip51Var.c;
                for (int i8 = (int) ((((long) ip51Var.b) + j) - j2); i8 < i7; i8++) {
                    byte b5 = bArr4[i8];
                    for (byte b6 : bArrH2) {
                        if (b5 == b6) {
                            return ((long) (i8 - ip51Var.b)) + j2;
                        }
                    }
                }
                j2 += (long) (ip51Var.c - ip51Var.b);
                ip51Var = ip51Var.f;
                ip51Var.getClass();
                j = j2;
            }
        }
        return -1L;
    }

    @Override // p.gbc
    public final boolean i0(long j, rhc rhcVar) {
        return j(rhcVar.d(), j, rhcVar);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final boolean j(int i, long j, rhc rhcVar) {
        if (i >= 0 && j >= 0 && ((long) i) + j <= this.b && i <= rhcVar.d()) {
            return i == 0 || b.a(this, rhcVar, j, j + 1, i) != -1;
        }
        return false;
    }

    @Override // p.fka1
    public final gve1 l() {
        return gve1.d;
    }

    @Override // p.fbc
    public final /* bridge */ /* synthetic */ fbc m0(long j) {
        S(j);
        return this;
    }

    @Override // p.gbc
    public final ff01 peek() {
        return sj1.g(new xes0(this));
    }

    public final lac q(lac lacVar) {
        byte[] bArr = b.a;
        lac lacVarK = zod.K(lacVar);
        if (lacVarK.a != null) {
            eg.m("already attached to a buffer");
            return null;
        }
        lacVarK.a = this;
        lacVarK.b = true;
        return lacVarK;
    }

    public final int read(byte[] bArr, int i, int i2) {
        zod.u(bArr.length, i, i2);
        ip51 ip51Var = this.a;
        if (ip51Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, ip51Var.c - ip51Var.b);
        byte[] bArr2 = ip51Var.a;
        int i3 = ip51Var.b;
        f46.O(i, i3, i3 + iMin, bArr2, bArr);
        int i4 = ip51Var.b + iMin;
        ip51Var.b = i4;
        this.b -= (long) iMin;
        if (i4 == ip51Var.c) {
            this.a = ip51Var.a();
            pq51.a(ip51Var);
        }
        return iMin;
    }

    @Override // p.gbc
    public final boolean request(long j) {
        return this.b >= j;
    }

    @Override // p.gbc
    public final int s0(cqq0 cqq0Var) {
        int iD = b.d(this, cqq0Var, false);
        if (iD == -1) {
            return -1;
        }
        skip(cqq0Var.a[iD].d());
        return iD;
    }

    @Override // p.gbc
    public final void skip(long j) {
        while (j > 0) {
            ip51 ip51Var = this.a;
            if (ip51Var == null) {
                eg.l();
                return;
            }
            int iMin = (int) Math.min(j, ip51Var.c - ip51Var.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = ip51Var.b + iMin;
            ip51Var.b = i;
            if (i == ip51Var.c) {
                this.a = ip51Var.a();
                pq51.a(ip51Var);
            }
        }
    }

    public final String toString() {
        return J().toString();
    }

    public final byte u() {
        if (this.b == 0) {
            eg.l();
            return (byte) 0;
        }
        ip51 ip51Var = this.a;
        ip51Var.getClass();
        int i = ip51Var.b;
        int i2 = ip51Var.c;
        int i3 = i + 1;
        byte b = ip51Var.a[i];
        this.b--;
        if (i3 != i2) {
            ip51Var.b = i3;
            return b;
        }
        this.a = ip51Var.a();
        pq51.a(ip51Var);
        return b;
    }

    public final byte[] v(long j) {
        if (j < 0 || j > 2147483647L) {
            hhg1.f(l1d.l(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            eg.l();
            return null;
        }
        byte[] bArr = new byte[(int) j];
        z(bArr);
        return bArr;
    }

    public final rhc w(long j) {
        if (j < 0 || j > 2147483647L) {
            hhg1.f(l1d.l(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            eg.l();
            return null;
        }
        if (j < 4096) {
            return new rhc(v(j));
        }
        rhc rhcVarL = L((int) j);
        skip(j);
        return rhcVarL;
    }

    public final void write(byte[] bArr, int i, int i2) {
        long j = i2;
        zod.u(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            ip51 ip51VarM = M(1);
            int iMin = Math.min(i3 - i, 8192 - ip51VarM.c);
            int i4 = i + iMin;
            f46.O(ip51VarM.c, i, i4, bArr, ip51VarM.a);
            ip51VarM.c += iMin;
            i = i4;
        }
        this.b += j;
    }

    @Override // p.fbc
    public final /* bridge */ /* synthetic */ fbc writeByte(int i) {
        R(i);
        return this;
    }

    public final long y() {
        long j;
        byte b;
        long j2 = 0;
        if (this.b == 0) {
            eg.l();
            return 0L;
        }
        int i = 0;
        boolean z = false;
        long j3 = 0;
        long j4 = -7;
        boolean z2 = false;
        loop0: while (true) {
            ip51 ip51Var = this.a;
            ip51Var.getClass();
            byte[] bArr = ip51Var.a;
            int i2 = ip51Var.b;
            int i3 = ip51Var.c;
            while (true) {
                if (i2 >= i3) {
                    j = j2;
                    break;
                }
                b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j3 < -922337203685477580L) {
                        break loop0;
                    }
                    j = j2;
                    if (j3 == -922337203685477580L && i4 < j4) {
                        break loop0;
                    }
                    j3 = (j3 * 10) + ((long) i4);
                } else {
                    j = j2;
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j4--;
                    z = true;
                }
                i2++;
                i++;
                j2 = j;
            }
            if (i2 == i3) {
                this.a = ip51Var.a();
                pq51.a(ip51Var);
            } else {
                ip51Var.b = i2;
            }
            if (z2 || this.a == null) {
                long j5 = this.b - ((long) i);
                this.b = j5;
                if (i >= (z ? 2 : 1)) {
                    return z ? j3 : -j3;
                }
                if (j5 != j) {
                    StringBuilder sbG = dv20.g(z ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                    sbG.append(zod.V(g(j)));
                    throw new NumberFormatException(sbG.toString());
                }
                long j6 = j;
                eg.l();
                return j6;
            }
            j2 = j;
        }
        nac nacVar = new nac();
        nacVar.S(j3);
        nacVar.R(b);
        if (!z) {
            nacVar.u();
        }
        throw new NumberFormatException("Number too large: ".concat(nacVar.I()));
    }

    @Override // p.gbc
    public final byte[] y0() {
        return v(this.b);
    }

    public final void z(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                eg.l();
                return;
            }
            i += i2;
        }
    }

    @Override // p.gbc
    public final boolean z0() {
        return this.b == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p.c291
    public final void close() {
    }

    @Override // p.c291, java.io.Flushable
    public final void flush() {
    }

    @Override // p.gbc
    public final nac k() {
        return this;
    }

    @Override // p.fbc
    public final fbc write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            ip51 ip51VarM = M(1);
            int iMin = Math.min(i, 8192 - ip51VarM.c);
            byteBuffer.get(ip51VarM.a, ip51VarM.c, iMin);
            i -= iMin;
            ip51VarM.c += iMin;
        }
        this.b += (long) iRemaining;
        return iRemaining;
    }

    @Override // p.gbc
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        ip51 ip51Var = this.a;
        if (ip51Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), ip51Var.c - ip51Var.b);
        byteBuffer.put(ip51Var.a, ip51Var.b, iMin);
        int i = ip51Var.b + iMin;
        ip51Var.b = i;
        this.b -= (long) iMin;
        if (i == ip51Var.c) {
            this.a = ip51Var.a();
            pq51.a(ip51Var);
        }
        return iMin;
    }
}
