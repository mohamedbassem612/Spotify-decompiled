package androidx.datastore.preferences.protobuf;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import p.ihc;
import p.jme;
import p.n290;
import p.uoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b extends jme {
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public b(byte[] bArr, int i) {
        super((byte) 1);
        this.h = Alert.DURATION_SHOW_INDEFINITELY;
        this.c = bArr;
        this.d = i;
        this.f = 0;
    }

    @Override // p.jme
    public final boolean A0() {
        return Y0() != 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // p.jme
    public final ihc B0() throws InvalidProtocolBufferException {
        byte[] bArrCopyOfRange;
        int iX0 = X0();
        byte[] bArr = this.c;
        if (iX0 > 0) {
            int i = this.d;
            int i2 = this.f;
            if (iX0 <= i - i2) {
                ihc ihcVarB = ihc.b(i2, bArr, iX0);
                this.f += iX0;
                return ihcVarB;
            }
        }
        if (iX0 == 0) {
            return ihc.c;
        }
        if (iX0 > 0) {
            int i3 = this.d;
            int i4 = this.f;
            if (iX0 <= i3 - i4) {
                int i5 = iX0 + i4;
                this.f = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iX0 <= 0) {
                    throw InvalidProtocolBufferException.f();
                }
                if (iX0 == 0) {
                    throw InvalidProtocolBufferException.d();
                }
                bArrCopyOfRange = n290.b;
            }
        } else {
            if (iX0 <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (iX0 == 0) {
                throw InvalidProtocolBufferException.d();
            }
            bArrCopyOfRange = n290.b;
        }
        ihc ihcVar = ihc.c;
        return new ihc(bArrCopyOfRange);
    }

    @Override // p.jme
    public final double C0() {
        return Double.longBitsToDouble(W0());
    }

    @Override // p.jme
    public final int D0() {
        return X0();
    }

    @Override // p.jme
    public final int E0() {
        return V0();
    }

    @Override // p.jme
    public final long F0() {
        return W0();
    }

    @Override // p.jme
    public final float G0() {
        return Float.intBitsToFloat(V0());
    }

    @Override // p.jme
    public final int H0() {
        return X0();
    }

    @Override // p.jme
    public final long I0() {
        return Y0();
    }

    @Override // p.jme
    public final int J0() {
        return V0();
    }

    @Override // p.jme
    public final long K0() {
        return W0();
    }

    @Override // p.jme
    public final int L0() {
        int iX0 = X0();
        return (-(iX0 & 1)) ^ (iX0 >>> 1);
    }

    @Override // p.jme
    public final long M0() {
        long jY0 = Y0();
        return (-(jY0 & 1)) ^ (jY0 >>> 1);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    @Override // p.jme
    public final String N0() throws InvalidProtocolBufferException {
        int iX0 = X0();
        if (iX0 > 0) {
            int i = this.d;
            int i2 = this.f;
            if (iX0 <= i - i2) {
                String str = new String(this.c, i2, iX0, n290.a);
                this.f += iX0;
                return str;
            }
        }
        if (iX0 == 0) {
            return "";
        }
        if (iX0 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.f();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    @Override // p.jme
    public final String O0() throws InvalidProtocolBufferException {
        int iX0 = X0();
        if (iX0 > 0) {
            int i = this.d;
            int i2 = this.f;
            if (iX0 <= i - i2) {
                String strS = uoi1.a.s(i2, this.c, iX0);
                this.f += iX0;
                return strS;
            }
        }
        if (iX0 == 0) {
            return "";
        }
        if (iX0 <= 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.f();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    @Override // p.jme
    public final int P0() throws InvalidProtocolBufferException {
        if (o0()) {
            this.g = 0;
            return 0;
        }
        int iX0 = X0();
        this.g = iX0;
        if ((iX0 >>> 3) != 0) {
            return iX0;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    @Override // p.jme
    public final int Q0() {
        return X0();
    }

    @Override // p.jme
    public final long R0() {
        return Y0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.jme
    public final boolean T0(int i) throws InvalidProtocolBufferException, InvalidProtocolBufferException.InvalidWireTypeException {
        int iP0;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.d - this.f;
            byte[] bArr = this.c;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f;
                    this.f = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.c();
            }
            while (i3 < 10) {
                int i6 = this.f;
                if (i6 == this.d) {
                    throw InvalidProtocolBufferException.f();
                }
                this.f = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.c();
            return true;
        }
        if (i2 == 1) {
            b1(8);
            return true;
        }
        if (i2 == 2) {
            b1(X0());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            b1(4);
            return true;
        }
        do {
            iP0 = P0();
            if (iP0 == 0) {
                break;
            }
        } while (T0(iP0));
        j0(((i >>> 3) << 3) | 4);
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    public final int V0() throws InvalidProtocolBufferException {
        int i = this.f;
        if (this.d - i < 4) {
            throw InvalidProtocolBufferException.f();
        }
        this.f = i + 4;
        byte[] bArr = this.c;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    public final long W0() throws InvalidProtocolBufferException {
        int i = this.f;
        if (this.d - i < 8) {
            throw InvalidProtocolBufferException.f();
        }
        this.f = i + 8;
        byte[] bArr = this.c;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int X0() {
        int i;
        int i2 = this.f;
        int i3 = this.d;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.c;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f = i4;
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
                this.f = i5;
                return i;
            }
        }
        return (int) Z0();
    }

    public final long Y0() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f;
        int i2 = this.d;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.c;
            byte b = bArr[i];
            if (b >= 0) {
                this.f = i3;
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
                this.f = i4;
                return j;
            }
        }
        return Z0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    public final long Z0() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f;
            if (i2 == this.d) {
                throw InvalidProtocolBufferException.f();
            }
            this.f = i2 + 1;
            byte b = this.c[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public final void a1() {
        int i = this.d + this.e;
        this.d = i;
        int i2 = this.h;
        if (i <= i2) {
            this.e = 0;
            return;
        }
        int i3 = i - i2;
        this.e = i3;
        this.d = i - i3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    public final void b1(int i) throws InvalidProtocolBufferException {
        if (i >= 0) {
            int i2 = this.d;
            int i3 = this.f;
            if (i <= i2 - i3) {
                this.f = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw InvalidProtocolBufferException.f();
        }
        throw InvalidProtocolBufferException.d();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    @Override // p.jme
    public final void j0(int i) throws InvalidProtocolBufferException {
        if (this.g != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // p.jme
    public final int n0() {
        return this.f;
    }

    @Override // p.jme
    public final boolean o0() {
        return this.f == this.d;
    }

    @Override // p.jme
    public final void v0(int i) {
        this.h = i;
        a1();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    @Override // p.jme
    public final int y0(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i2 = this.f + i;
        int i3 = this.h;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.f();
        }
        this.h = i2;
        a1();
        return i3;
    }
}
