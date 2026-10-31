package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import p.eg;
import p.gvg;
import p.hhc;
import p.l290;
import p.lwg;
import p.phc;
import p.poz0;
import p.toi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c extends lwg {
    public final InputStream d;
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k = Integer.MAX_VALUE;

    public c(InputStream inputStream) {
        l290.a(inputStream, "input");
        this.d = inputStream;
        this.e = new byte[4096];
        this.f = 0;
        this.h = 0;
        this.j = 0;
    }

    @Override // p.lwg
    public final int A() {
        return J();
    }

    @Override // p.lwg
    public final long B() {
        return K();
    }

    @Override // p.lwg
    public final boolean C(int i) throws InvalidProtocolBufferException {
        int iX = poz0.x(i);
        int i2 = 0;
        if (iX != 0) {
            if (iX == 1) {
                O(8);
                return true;
            }
            if (iX == 2) {
                O(J());
                return true;
            }
            if (iX == 3) {
                D();
                a(poz0.E(poz0.w(i), 4));
                return true;
            }
            if (iX == 4) {
                if (this.b == 0) {
                    a(0);
                }
                return false;
            }
            if (iX != 5) {
                throw InvalidProtocolBufferException.d();
            }
            O(4);
            return true;
        }
        int i3 = this.f - this.h;
        byte[] bArr = this.e;
        if (i3 >= 10) {
            while (i2 < 10) {
                int i4 = this.h;
                this.h = i4 + 1;
                if (bArr[i4] < 0) {
                    i2++;
                }
            }
            throw InvalidProtocolBufferException.e();
        }
        while (i2 < 10) {
            if (this.h == this.f) {
                N(1);
            }
            int i5 = this.h;
            this.h = i5 + 1;
            if (bArr[i5] < 0) {
                i2++;
            }
        }
        throw InvalidProtocolBufferException.e();
        return true;
    }

    public final byte[] E(int i) throws IOException {
        byte[] bArrF = F(i);
        if (bArrF != null) {
            return bArrF;
        }
        int i2 = this.h;
        int i3 = this.f;
        int length = i3 - i2;
        this.j += i3;
        this.h = 0;
        this.f = 0;
        ArrayList<byte[]> arrayListG = G(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListG) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] F(int i) throws IOException {
        if (i == 0) {
            return l290.b;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.k;
        if (i4 > i5) {
            O((i5 - i2) - i3);
            throw InvalidProtocolBufferException.h();
        }
        int i6 = this.f - i3;
        int i7 = i - i6;
        InputStream inputStream = this.d;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e) {
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
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.h();
                }
                this.j += i8;
                i6 += i8;
            } catch (InvalidProtocolBufferException e2) {
                e2.a = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList G(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.d.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw InvalidProtocolBufferException.h();
                }
                this.j += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int H() throws InvalidProtocolBufferException {
        int i = this.h;
        if (this.f - i < 4) {
            N(4);
            i = this.h;
        }
        this.h = i + 4;
        byte[] bArr = this.e;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long I() throws InvalidProtocolBufferException {
        int i = this.h;
        if (this.f - i < 8) {
            N(8);
            i = this.h;
        }
        this.h = i + 8;
        byte[] bArr = this.e;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int J() {
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
        return (int) L();
    }

    public final long K() {
        long j;
        long j2;
        long j3;
        long j4;
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
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.h = i4;
                return j;
            }
        }
        return L();
    }

    public final long L() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.h == this.f) {
                N(1);
            }
            int i2 = this.h;
            this.h = i2 + 1;
            byte b = this.e[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.e();
    }

    public final void M() {
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

    public final void N(int i) throws InvalidProtocolBufferException {
        if (P(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.j) - this.h) {
            throw InvalidProtocolBufferException.h();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final void O(int i) throws InvalidProtocolBufferException {
        int i2 = this.f;
        int i3 = this.h;
        if (i <= i2 - i3 && i >= 0) {
            this.h = i3 + i;
            return;
        }
        InputStream inputStream = this.d;
        if (i < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int i4 = this.j;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.k;
        if (i6 > i7) {
            O((i7 - i4) - i3);
            throw InvalidProtocolBufferException.h();
        }
        this.j = i5;
        int i8 = i2 - i3;
        this.f = 0;
        this.h = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i8 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.j += i8;
                M();
                throw th;
            }
        }
        this.j += i8;
        M();
        if (i8 >= i) {
            return;
        }
        int i9 = this.f;
        int i10 = i9 - this.h;
        this.h = i9;
        N(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f;
            if (i11 <= i12) {
                this.h = i11;
                return;
            } else {
                i10 += i12;
                this.h = i12;
                N(1);
            }
        }
    }

    public final boolean P(int i) throws IOException {
        InputStream inputStream = this.d;
        int i2 = this.h;
        int i3 = i2 + i;
        int i4 = this.f;
        if (i3 <= i4) {
            eg.m(gvg.e(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.j;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.k) {
            byte[] bArr = this.e;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.j + i2;
                this.j = i5;
                i4 = this.f - i2;
                this.f = i4;
                this.h = 0;
            }
            try {
                int i6 = inputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
                if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                    throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#read(byte[]) returned invalid result: " + i6 + "\nThe InputStream implementation is buggy.");
                }
                if (i6 > 0) {
                    this.f += i6;
                    M();
                    if (this.f >= i || P(i)) {
                        return true;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                e.a = true;
                throw e;
            }
        }
        return false;
    }

    @Override // p.lwg
    public final void a(int i) throws InvalidProtocolBufferException {
        if (this.i != i) {
            throw InvalidProtocolBufferException.a();
        }
    }

    @Override // p.lwg
    public final int d() {
        return this.j + this.h;
    }

    @Override // p.lwg
    public final boolean e() {
        return this.h == this.f && !P(1);
    }

    @Override // p.lwg
    public final void h(int i) {
        this.k = i;
        M();
    }

    @Override // p.lwg
    public final int i(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int i2 = this.j + this.h + i;
        if (i2 < 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.k;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.h();
        }
        this.k = i2;
        M();
        return i3;
    }

    @Override // p.lwg
    public final boolean j() {
        return K() != 0;
    }

    @Override // p.lwg
    public final hhc k() throws IOException {
        int iJ = J();
        int i = this.f;
        int i2 = this.h;
        int i3 = i - i2;
        byte[] bArr = this.e;
        if (iJ <= i3 && iJ > 0) {
            hhc hhcVarE = phc.e(i2, bArr, iJ);
            this.h += iJ;
            return hhcVarE;
        }
        if (iJ == 0) {
            return phc.b;
        }
        if (iJ < 0) {
            throw InvalidProtocolBufferException.f();
        }
        byte[] bArrF = F(iJ);
        if (bArrF != null) {
            return phc.e(0, bArrF, bArrF.length);
        }
        int i4 = this.h;
        int i5 = this.f;
        int length = i5 - i4;
        this.j += i5;
        this.h = 0;
        this.f = 0;
        ArrayList<byte[]> arrayListG = G(iJ - length);
        byte[] bArr2 = new byte[iJ];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListG) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        hhc hhcVar = phc.b;
        return new hhc(bArr2);
    }

    @Override // p.lwg
    public final double l() {
        return Double.longBitsToDouble(I());
    }

    @Override // p.lwg
    public final int m() {
        return J();
    }

    @Override // p.lwg
    public final int n() {
        return H();
    }

    @Override // p.lwg
    public final long o() {
        return I();
    }

    @Override // p.lwg
    public final float p() {
        return Float.intBitsToFloat(H());
    }

    @Override // p.lwg
    public final int q() {
        return J();
    }

    @Override // p.lwg
    public final long r() {
        return K();
    }

    @Override // p.lwg
    public final int t() {
        return H();
    }

    @Override // p.lwg
    public final long u() {
        return I();
    }

    @Override // p.lwg
    public final int v() {
        return lwg.b(J());
    }

    @Override // p.lwg
    public final long w() {
        return lwg.c(K());
    }

    @Override // p.lwg
    public final String x() throws InvalidProtocolBufferException {
        int iJ = J();
        byte[] bArr = this.e;
        if (iJ > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iJ <= i - i2) {
                String str = new String(bArr, i2, iJ, l290.a);
                this.h += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (iJ > this.f) {
            return new String(E(iJ), l290.a);
        }
        N(iJ);
        String str2 = new String(bArr, this.h, iJ, l290.a);
        this.h += iJ;
        return str2;
    }

    @Override // p.lwg
    public final String y() throws IOException {
        int iJ = J();
        int i = this.h;
        int i2 = this.f;
        int i3 = i2 - i;
        byte[] bArrE = this.e;
        if (iJ <= i3 && iJ > 0) {
            this.h = i + iJ;
        } else {
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw InvalidProtocolBufferException.f();
            }
            i = 0;
            if (iJ <= i2) {
                N(iJ);
                this.h = iJ;
            } else {
                bArrE = E(iJ);
            }
        }
        return toi1.a.r(i, bArrE, iJ);
    }

    @Override // p.lwg
    public final int z() throws InvalidProtocolBufferException {
        if (e()) {
            this.i = 0;
            return 0;
        }
        int iJ = J();
        this.i = iJ;
        if (poz0.w(iJ) != 0) {
            return this.i;
        }
        throw InvalidProtocolBufferException.b();
    }
}
