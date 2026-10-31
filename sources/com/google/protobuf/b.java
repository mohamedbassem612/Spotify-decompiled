package com.google.protobuf;

import java.util.Arrays;
import p.hhc;
import p.l290;
import p.lwg;
import p.phc;
import p.poz0;
import p.toi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b extends lwg {
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public b(byte[] bArr, int i, int i2, boolean z) {
        this.d = bArr;
        this.e = i2 + i;
        this.g = i;
        this.h = i;
    }

    @Override // p.lwg
    public final int A() {
        return G();
    }

    @Override // p.lwg
    public final long B() {
        return H();
    }

    @Override // p.lwg
    public final boolean C(int i) throws InvalidProtocolBufferException {
        int iX = poz0.x(i);
        int i2 = 0;
        if (iX != 0) {
            if (iX == 1) {
                K(8);
                return true;
            }
            if (iX == 2) {
                K(G());
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
            K(4);
            return true;
        }
        int i3 = this.e - this.g;
        byte[] bArr = this.d;
        if (i3 >= 10) {
            while (i2 < 10) {
                int i4 = this.g;
                this.g = i4 + 1;
                if (bArr[i4] < 0) {
                    i2++;
                }
            }
            throw InvalidProtocolBufferException.e();
        }
        while (i2 < 10) {
            int i5 = this.g;
            if (i5 == this.e) {
                throw InvalidProtocolBufferException.h();
            }
            this.g = i5 + 1;
            if (bArr[i5] < 0) {
                i2++;
            }
        }
        throw InvalidProtocolBufferException.e();
        return true;
    }

    public final int E() throws InvalidProtocolBufferException {
        int i = this.g;
        if (this.e - i < 4) {
            throw InvalidProtocolBufferException.h();
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long F() throws InvalidProtocolBufferException {
        int i = this.g;
        if (this.e - i < 8) {
            throw InvalidProtocolBufferException.h();
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int G() {
        int i;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
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
                this.g = i5;
                return i;
            }
        }
        return (int) I();
    }

    public final long H() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.g;
        int i2 = this.e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.d;
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
                this.g = i4;
                return j;
            }
        }
        return I();
    }

    public final long I() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.g;
            if (i2 == this.e) {
                throw InvalidProtocolBufferException.h();
            }
            this.g = i2 + 1;
            byte b = this.d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.e();
    }

    public final void J() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = i - this.h;
        int i3 = this.j;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f = i4;
        this.e = i - i4;
    }

    public final void K(int i) throws InvalidProtocolBufferException {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (i <= i2 - i3) {
                this.g = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw InvalidProtocolBufferException.h();
        }
        throw InvalidProtocolBufferException.f();
    }

    @Override // p.lwg
    public final void a(int i) throws InvalidProtocolBufferException {
        if (this.i != i) {
            throw InvalidProtocolBufferException.a();
        }
    }

    @Override // p.lwg
    public final int d() {
        return this.g - this.h;
    }

    @Override // p.lwg
    public final boolean e() {
        return this.g == this.e;
    }

    @Override // p.lwg
    public final void h(int i) {
        this.j = i;
        J();
    }

    @Override // p.lwg
    public final int i(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int iD = d() + i;
        if (iD < 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i2 = this.j;
        if (iD > i2) {
            throw InvalidProtocolBufferException.h();
        }
        this.j = iD;
        J();
        return i2;
    }

    @Override // p.lwg
    public final boolean j() {
        return H() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // p.lwg
    public final hhc k() throws InvalidProtocolBufferException {
        byte[] bArrCopyOfRange;
        int iG = G();
        byte[] bArr = this.d;
        if (iG > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iG <= i - i2) {
                hhc hhcVarE = phc.e(i2, bArr, iG);
                this.g += iG;
                return hhcVarE;
            }
        }
        if (iG == 0) {
            return phc.b;
        }
        if (iG > 0) {
            int i3 = this.e;
            int i4 = this.g;
            if (iG <= i3 - i4) {
                int i5 = iG + i4;
                this.g = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iG <= 0) {
                    throw InvalidProtocolBufferException.h();
                }
                if (iG == 0) {
                    throw InvalidProtocolBufferException.f();
                }
                bArrCopyOfRange = l290.b;
            }
        } else {
            if (iG <= 0) {
                throw InvalidProtocolBufferException.h();
            }
            if (iG == 0) {
                throw InvalidProtocolBufferException.f();
            }
            bArrCopyOfRange = l290.b;
        }
        hhc hhcVar = phc.b;
        return new hhc(bArrCopyOfRange);
    }

    @Override // p.lwg
    public final double l() {
        return Double.longBitsToDouble(F());
    }

    @Override // p.lwg
    public final int m() {
        return G();
    }

    @Override // p.lwg
    public final int n() {
        return E();
    }

    @Override // p.lwg
    public final long o() {
        return F();
    }

    @Override // p.lwg
    public final float p() {
        return Float.intBitsToFloat(E());
    }

    @Override // p.lwg
    public final int q() {
        return G();
    }

    @Override // p.lwg
    public final long r() {
        return H();
    }

    @Override // p.lwg
    public final int t() {
        return E();
    }

    @Override // p.lwg
    public final long u() {
        return F();
    }

    @Override // p.lwg
    public final int v() {
        return lwg.b(G());
    }

    @Override // p.lwg
    public final long w() {
        return lwg.c(H());
    }

    @Override // p.lwg
    public final String x() throws InvalidProtocolBufferException {
        int iG = G();
        if (iG > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iG <= i - i2) {
                String str = new String(this.d, i2, iG, l290.a);
                this.g += iG;
                return str;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG < 0) {
            throw InvalidProtocolBufferException.f();
        }
        throw InvalidProtocolBufferException.h();
    }

    @Override // p.lwg
    public final String y() throws InvalidProtocolBufferException {
        int iG = G();
        if (iG > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iG <= i - i2) {
                String strR = toi1.a.r(i2, this.d, iG);
                this.g += iG;
                return strR;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG <= 0) {
            throw InvalidProtocolBufferException.f();
        }
        throw InvalidProtocolBufferException.h();
    }

    @Override // p.lwg
    public final int z() throws InvalidProtocolBufferException {
        if (e()) {
            this.i = 0;
            return 0;
        }
        int iG = G();
        this.i = iG;
        if (poz0.w(iG) != 0) {
            return this.i;
        }
        throw InvalidProtocolBufferException.b();
    }
}
