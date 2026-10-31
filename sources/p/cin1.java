package p;

import com.google.android.recaptcha.internal.zzals;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cin1 extends din1 {
    public final yin1 d;
    public int g;
    public int i;
    public int k = Integer.MAX_VALUE;
    public final byte[] e = new byte[4096];
    public int f = 0;
    public int h = 0;
    public int j = 0;

    public /* synthetic */ cin1(yin1 yin1Var) {
        this.d = yin1Var;
    }

    public static boolean I(int i, int i2, int i3) {
        return i3 < i || i2 > i3 - i;
    }

    public final long A() {
        int i = this.h;
        if (this.f - i < 8) {
            D(8);
            i = this.h;
        }
        this.h = i + 8;
        byte[] bArr = this.e;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        return ((((long) bArr[i + 7]) & 255) << 56) | j2 | (j & 255) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final void B(int i) {
        yin1 yin1Var = this.d;
        int i2 = this.f;
        int i3 = this.h;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.h = i3 + i;
            return;
        }
        if (i < 0) {
            x4n1.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return;
        }
        int i5 = this.j + i3;
        if (I(i5, i, Integer.MAX_VALUE)) {
            x4n1.g("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return;
        }
        int i6 = this.k;
        if (I(i5, i, i6)) {
            if (i6 >= i5) {
                B(i6 - i5);
            }
            x4n1.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return;
        }
        this.j = i5;
        this.f = 0;
        this.h = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = yin1Var.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        String strValueOf = String.valueOf(yin1.class);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb.append(strValueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(jSkip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (zzals e) {
                    e.a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.j += i4;
                C();
                throw th;
            }
        }
        this.j += i4;
        C();
        if (i4 >= i) {
            return;
        }
        int i7 = this.f;
        int i8 = i7 - this.h;
        this.h = i7;
        D(1);
        while (true) {
            int i9 = i - i8;
            int i10 = this.f;
            if (i9 <= i10) {
                this.h = i9;
                return;
            } else {
                i8 += i10;
                this.h = i10;
                D(1);
            }
        }
    }

    public final void C() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = this.j + i;
        int i3 = this.k;
        if (i2 <= i3) {
            this.g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.g = i4;
        this.f = i - i4;
    }

    public final void D(int i) {
        if (E(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.j) - this.h) {
            x4n1.g("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        } else {
            x4n1.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final boolean E(int i) throws zzals {
        yin1 yin1Var = this.d;
        int i2 = this.h;
        int i3 = i2 + i;
        int i4 = this.f;
        if (i3 <= i4) {
            eg.m(fd21.h(new StringBuilder(String.valueOf(i).length() + 66), "refillBuffer() called when ", i, " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.j + i2;
        if (!I(i5, i, Integer.MAX_VALUE) && !I(i5, i, this.k)) {
            byte[] bArr = this.e;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.j += i2;
                this.f -= i2;
                this.h = 0;
            }
            while (true) {
                int i6 = this.f;
                if (i6 >= i) {
                    return true;
                }
                try {
                    int i7 = yin1Var.read(bArr, i6, Math.min(4096 - i6, (Integer.MAX_VALUE - this.j) - i6));
                    if (i7 == 0 || i7 < -1 || i7 > 4096) {
                        String strValueOf = String.valueOf(yin1.class);
                        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + strValueOf.length() + 39 + 41);
                        sb.append(strValueOf);
                        sb.append("#read(byte[]) returned invalid result: ");
                        sb.append(i7);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (i7 > 0) {
                        this.f += i7;
                        C();
                    }
                } catch (zzals e) {
                    e.a = true;
                    throw e;
                }
            }
        }
        return false;
    }

    public final byte[] F(int i) throws zzals {
        byte[] bArrG = G(i);
        if (bArrG != null) {
            return bArrG;
        }
        int i2 = this.h;
        int i3 = this.f;
        int i4 = i3 - i2;
        this.j += i3;
        this.h = 0;
        this.f = 0;
        ArrayList<byte[]> arrayListH = H(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, i2, bArr, 0, i4);
        for (byte[] bArr2 : arrayListH) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    public final byte[] G(int i) throws zzals {
        if (i == 0) {
            return xin1.a;
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i2 + i3;
        if (I(i4, i, Integer.MAX_VALUE)) {
            x4n1.g("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return null;
        }
        int i5 = this.k;
        if (I(i4, i, i5)) {
            if (i5 >= i4) {
                B(i5 - i4);
            }
            x4n1.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        int i6 = this.f - i3;
        int i7 = i - i6;
        yin1 yin1Var = this.d;
        if (i7 >= 4096) {
            try {
                if (i7 > yin1Var.available()) {
                    return null;
                }
            } catch (zzals e) {
                e.a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, this.h, bArr, 0, i6);
        this.j += this.f;
        this.h = 0;
        this.f = 0;
        while (i6 < i) {
            try {
                int i8 = yin1Var.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    x4n1.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
                this.j += i8;
                i6 += i8;
            } catch (zzals e2) {
                e2.a = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList H(int i) throws zzals {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                try {
                    int i3 = this.d.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        x4n1.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return null;
                    }
                    this.j += i3;
                    i2 += i3;
                } catch (zzals e) {
                    e.a = true;
                    throw e;
                }
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final long J() {
        long j;
        long j2;
        long j3;
        int i = this.h;
        int i2 = this.f;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.e;
            byte b = bArr[i];
            if (b >= 0) {
                this.h = i3;
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
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = ((long) i9) ^ (((long) bArr[i8]) << 28);
                            if (j5 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (((long) bArr[i6]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i6 = i + 7;
                                    j5 = j6 ^ (((long) bArr[i10]) << 42);
                                    if (j5 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (((long) bArr[i6]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i6 = i + 9;
                                            j5 = j6 ^ (((long) bArr[i10]) << 56);
                                            if (j5 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                byte b2 = bArr[i6];
                                                long j7 = j5 ^ (((long) b2) << 63);
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
                                }
                                j = j6 ^ j3;
                                i4 = i10;
                            }
                            j = j5 ^ j2;
                        }
                    }
                    i4 = i6;
                }
                this.h = i4;
                return j;
            }
        }
        return K();
    }

    public final long K() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.h == this.f) {
                D(1);
            }
            int i2 = this.h;
            this.h = i2 + 1;
            byte b = this.e[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        x4n1.g("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int L() {
        int i = this.h;
        if (this.f - i < 4) {
            D(4);
            i = this.h;
        }
        this.h = i + 4;
        byte[] bArr = this.e;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    @Override // p.din1
    public final boolean a() {
        return this.h == this.f && !E(1);
    }

    @Override // p.din1
    public final int b() {
        return this.j + this.h;
    }

    @Override // p.din1
    public final int d() {
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
        return Double.longBitsToDouble(A());
    }

    @Override // p.din1
    public final float g() {
        return Float.intBitsToFloat(L());
    }

    @Override // p.din1
    public final long h() {
        return J();
    }

    @Override // p.din1
    public final long i() {
        return J();
    }

    @Override // p.din1
    public final int j() {
        return w();
    }

    @Override // p.din1
    public final long k() {
        return A();
    }

    @Override // p.din1
    public final int l() {
        return L();
    }

    @Override // p.din1
    public final boolean m() {
        return J() != 0;
    }

    @Override // p.din1
    public final String n() {
        int iW = w();
        byte[] bArr = this.e;
        if (iW > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iW <= i - i2) {
                String str = new String(bArr, i2, iW, StandardCharsets.UTF_8);
                this.h += iW;
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
        if (iW > this.f) {
            return new String(F(iW), StandardCharsets.UTF_8);
        }
        D(iW);
        String str2 = new String(bArr, this.h, iW, StandardCharsets.UTF_8);
        this.h += iW;
        return str2;
    }

    @Override // p.din1
    public final String o() throws zzals {
        int iW = w();
        int i = this.h;
        int i2 = this.f;
        int i3 = i2 - i;
        byte[] bArrF = this.e;
        if (iW <= i3 && iW > 0) {
            this.h = i + iW;
        } else {
            if (iW == 0) {
                return "";
            }
            if (iW < 0) {
                x4n1.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
            i = 0;
            if (iW <= i2) {
                D(iW);
                this.h = iW;
            } else {
                bArrF = F(iW);
            }
        }
        return fkn1.c(i, bArrF, iW);
    }

    @Override // p.din1
    public final vhn1 p() throws zzals {
        int iW = w();
        int i = this.f;
        int i2 = this.h;
        int i3 = i - i2;
        byte[] bArr = this.e;
        if (iW <= i3 && iW > 0) {
            vhn1 vhn1VarY = ain1.y(i2, bArr, iW);
            this.h += iW;
            return vhn1VarY;
        }
        if (iW == 0) {
            return ain1.b;
        }
        if (iW < 0) {
            x4n1.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        byte[] bArrG = G(iW);
        if (bArrG != null) {
            return ain1.y(0, bArrG, bArrG.length);
        }
        int i4 = this.h;
        int i5 = this.f;
        int i6 = i5 - i4;
        this.j += i5;
        this.h = 0;
        this.f = 0;
        ArrayList<byte[]> arrayListH = H(iW - i6);
        byte[] bArr2 = new byte[iW];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        for (byte[] bArr3 : arrayListH) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i6, length);
            i6 += length;
        }
        try {
            return iW == 0 ? ain1.b : new vhn1(bArr2);
        } catch (zzals e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
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
        return L();
    }

    @Override // p.din1
    public final long t() {
        return A();
    }

    @Override // p.din1
    public final int u() {
        int iW = w();
        return (-(iW & 1)) ^ (iW >>> 1);
    }

    @Override // p.din1
    public final long v() {
        long J = J();
        return (-(J & 1)) ^ (J >>> 1);
    }

    @Override // p.din1
    public final int w() {
        int i;
        int i2 = this.h;
        int i3 = this.f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.h = i5;
                return i;
            }
        }
        return (int) K();
    }

    @Override // p.din1
    public final int x(int i) {
        if (i < 0) {
            x4n1.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.j + this.h;
        if (i > Integer.MAX_VALUE - i2) {
            x4n1.g("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.k;
        if (I(i2, i, i3)) {
            x4n1.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.k = i2 + i;
        C();
        return i3;
    }

    @Override // p.din1
    public final void y(int i) {
        this.k = i;
        C();
    }

    @Override // p.din1
    public final int z() {
        int i = this.k;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.j + this.h);
    }
}
