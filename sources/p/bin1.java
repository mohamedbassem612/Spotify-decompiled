package p;

import com.google.android.recaptcha.internal.zzals;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bin1 extends din1 {
    public final byte[] d;
    public final int e;
    public int f;
    public int g;
    public final int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public /* synthetic */ bin1(byte[] bArr, int i, int i2) {
        this.d = bArr;
        int i3 = i2 + i;
        this.e = i3;
        this.f = i3;
        this.g = i;
        this.h = i;
    }

    public final long A() {
        long j;
        long j2;
        long j3;
        int i = this.g;
        int i2 = this.f;
        byte[] bArr = this.d;
        if (i2 != i) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.g = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j = (-2080896) ^ i9;
                            i4 = i8;
                        } else {
                            i6 = i + 5;
                            long j4 = (((long) bArr[i8]) << 28) ^ ((long) i9);
                            if (j4 >= 0) {
                                j = j4 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j5 = (((long) bArr[i6]) << 35) ^ j4;
                                if (j5 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j6 = j5 ^ (((long) bArr[i4]) << 42);
                                    if (j6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j5 = j6 ^ (((long) bArr[i10]) << 49);
                                        if (j5 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            j6 = j5 ^ (((long) bArr[i4]) << 56);
                                            if (j6 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                byte b2 = bArr[i10];
                                                long j7 = j6 ^ (((long) b2) << 63);
                                                if (j7 >= 0) {
                                                    int i11 = i + 10;
                                                    if (b2 >= 0) {
                                                        j = j7 ^ (-9151873028817141888L);
                                                        i4 = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                    i4 = i10;
                                }
                                j = j3 ^ j5;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.g = i4;
                return j;
            }
        }
        long j8 = 0;
        for (int i12 = 0; i12 < 64; i12 += 7) {
            int i13 = this.g;
            if (i13 == this.f) {
                x4n1.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
            this.g = i13 + 1;
            byte b3 = bArr[i13];
            j8 |= ((long) (b3 & 127)) << i12;
            if ((b3 & 128) == 0) {
                return j8;
            }
        }
        x4n1.g("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int B() {
        int i = this.g;
        if (this.f - i < 4) {
            x4n1.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final long C() {
        int i = this.g;
        if (this.f - i < 8) {
            x4n1.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0L;
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        return ((((long) bArr[i + 7]) & 255) << 56) | j2 | (j & 255) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // p.din1
    public final boolean a() {
        return this.g == this.f;
    }

    @Override // p.din1
    public final int b() {
        return this.g - this.h;
    }

    @Override // p.din1
    public final int d() throws zzals {
        if (a()) {
            this.i = 0;
            return 0;
        }
        int iW = w();
        this.i = iW;
        if ((iW >>> 3) != 0) {
            return iW;
        }
        x4n1.g("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // p.din1
    public final void e() {
        if (this.i == 0) {
            return;
        }
        x4n1.g("Protocol message end-group tag did not match expected tag.");
    }

    @Override // p.din1
    public final double f() {
        return Double.longBitsToDouble(C());
    }

    @Override // p.din1
    public final float g() {
        return Float.intBitsToFloat(B());
    }

    @Override // p.din1
    public final long h() {
        return A();
    }

    @Override // p.din1
    public final long i() {
        return A();
    }

    @Override // p.din1
    public final int j() {
        return w();
    }

    @Override // p.din1
    public final long k() {
        return C();
    }

    @Override // p.din1
    public final int l() {
        return B();
    }

    @Override // p.din1
    public final boolean m() {
        return A() != 0;
    }

    @Override // p.din1
    public final String n() throws zzals {
        int iW = w();
        if (iW > 0) {
            int i = this.f;
            int i2 = this.g;
            if (iW <= i - i2) {
                String str = new String(this.d, i2, iW, StandardCharsets.UTF_8);
                this.g += iW;
                return str;
            }
        }
        if (iW == 0) {
            return "";
        }
        if (iW < 0) {
            x4n1.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        x4n1.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // p.din1
    public final String o() throws zzals {
        int iW = w();
        if (iW > 0) {
            int i = this.f;
            int i2 = this.g;
            if (iW <= i - i2) {
                String strC = fkn1.c(i2, this.d, iW);
                this.g += iW;
                return strC;
            }
        }
        if (iW == 0) {
            return "";
        }
        if (iW <= 0) {
            x4n1.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        x4n1.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // p.din1
    public final vhn1 p() throws zzals {
        int iW = w();
        byte[] bArr = this.d;
        if (iW > 0) {
            int i = this.f;
            int i2 = this.g;
            if (iW <= i - i2) {
                vhn1 vhn1VarY = ain1.y(i2, bArr, iW);
                this.g += iW;
                return vhn1VarY;
            }
        }
        if (iW == 0) {
            return ain1.b;
        }
        if (iW > 0) {
            int i3 = this.f;
            int i4 = this.g;
            if (iW <= i3 - i4) {
                int i5 = iW + i4;
                this.g = i5;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
                vhn1 vhn1Var = ain1.b;
                return bArrCopyOfRange.length == 0 ? ain1.b : new vhn1(bArrCopyOfRange);
            }
        }
        if (iW <= 0) {
            x4n1.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        x4n1.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // p.din1
    public final int q() {
        return w();
    }

    @Override // p.din1
    public final int r() {
        return w();
    }

    @Override // p.din1
    public final int s() {
        return B();
    }

    @Override // p.din1
    public final long t() {
        return C();
    }

    @Override // p.din1
    public final int u() throws zzals {
        int iW = w();
        return (-(iW & 1)) ^ (iW >>> 1);
    }

    @Override // p.din1
    public final long v() {
        long jA = A();
        return (-(jA & 1)) ^ (jA >>> 1);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0072 A[PHI: r5
      0x0072: PHI (r5v5 int) = (r5v4 int), (r5v9 int), (r5v11 int) binds: [B:17:0x0045, B:21:0x0051, B:25:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p.din1
    public final int w() throws zzals {
        try {
            int i = this.g;
            byte[] bArr = this.d;
            int i2 = i + 1;
            int i3 = bArr[i];
            if (i3 < 0) {
                int i4 = i + 2;
                int i5 = (bArr[i2] << 7) ^ i3;
                if (i5 < 0) {
                    i3 = (i5 == true ? 1 : 0) ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (i5 == true ? 1 : 0) ^ (bArr[i4] << 14);
                    if (i7 >= 0) {
                        int i8 = i7 ^ 16256;
                        i2 = i6;
                        i3 = i8;
                    } else {
                        i4 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            i3 = i9 ^ (-2080896);
                        } else {
                            int i10 = i + 5;
                            int i11 = bArr[i4];
                            int i12 = (i9 ^ (i11 << 28)) ^ 266354560;
                            if (i11 < 0) {
                                i4 = i + 6;
                                if (bArr[i10] < 0) {
                                    i10 = i + 7;
                                    if (bArr[i4] < 0) {
                                        i4 = i + 8;
                                        if (bArr[i10] < 0) {
                                            i10 = i + 9;
                                            if (bArr[i4] < 0) {
                                                int i13 = i + 10;
                                                if (bArr[i10] < 0) {
                                                    throw new zzals("CodedInputStream encountered a malformed varint.");
                                                }
                                                i3 = i12;
                                                i2 = i13;
                                            } else {
                                                int i14 = i10;
                                                i3 = i12;
                                                i2 = i14;
                                            }
                                        }
                                    } else {
                                        int i15 = i10;
                                        i3 = i12;
                                        i2 = i15;
                                    }
                                }
                                i3 = i12;
                            } else {
                                int i16 = i10;
                                i3 = i12;
                                i2 = i16;
                            }
                        }
                    }
                }
                i2 = i4;
            }
            this.g = i2;
            if (i2 <= this.f) {
                return i3;
            }
            throw new zzals("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (zzals e) {
            if (this.g <= this.f) {
                throw e;
            }
            x4n1.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        } catch (IndexOutOfBoundsException unused) {
            x4n1.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
    }

    @Override // p.din1
    public final int x(int i) {
        if (i < 0) {
            x4n1.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.g;
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
            if (i > Integer.MAX_VALUE - (i2 - this.h)) {
                x4n1.g("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
                return 0;
            }
        }
        int i4 = this.j;
        if (i3 > i4) {
            x4n1.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.j = i3;
        int i5 = this.e;
        if (i3 > i5) {
            i3 = i5;
        }
        this.f = i3;
        return i4;
    }

    @Override // p.din1
    public final void y(int i) {
        this.j = i;
        int i2 = this.e;
        if (i > i2) {
            i = i2;
        }
        this.f = i;
    }

    @Override // p.din1
    public final int z() {
        int i = this.j;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.g;
    }
}
