package androidx.datastore.preferences.protobuf;

import androidx.car.app.model.Alert;
import app.p000rive.semantics.SemanticState;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p.eg;
import p.gvg;
import p.ihc;
import p.jme;
import p.n290;
import p.uoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c extends jme {
    public final FileInputStream c;
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int t;

    public c(FileInputStream fileInputStream) {
        super((byte) 1);
        this.t = Alert.DURATION_SHOW_INDEFINITELY;
        Charset charset = n290.a;
        this.c = fileInputStream;
        this.d = new byte[SemanticState.Obscured];
        this.e = 0;
        this.g = 0;
        this.i = 0;
    }

    @Override // p.jme
    public final boolean A0() {
        return b1() != 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    @Override // p.jme
    public final ihc B0() throws InvalidProtocolBufferException, IOException {
        int iA1 = a1();
        int i = this.e;
        int i2 = this.g;
        int i3 = i - i2;
        byte[] bArr = this.d;
        if (iA1 <= i3 && iA1 > 0) {
            ihc ihcVarB = ihc.b(i2, bArr, iA1);
            this.g += iA1;
            return ihcVarB;
        }
        if (iA1 == 0) {
            return ihc.c;
        }
        byte[] bArrW0 = W0(iA1);
        if (bArrW0 != null) {
            return ihc.b(0, bArrW0, bArrW0.length);
        }
        int i4 = this.g;
        int i5 = this.e;
        int length = i5 - i4;
        this.i += i5;
        this.g = 0;
        this.e = 0;
        ArrayList<byte[]> arrayListX0 = X0(iA1 - length);
        byte[] bArr2 = new byte[iA1];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListX0) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        ihc ihcVar = ihc.c;
        return new ihc(bArr2);
    }

    @Override // p.jme
    public final double C0() {
        return Double.longBitsToDouble(Z0());
    }

    @Override // p.jme
    public final int D0() {
        return a1();
    }

    @Override // p.jme
    public final int E0() {
        return Y0();
    }

    @Override // p.jme
    public final long F0() {
        return Z0();
    }

    @Override // p.jme
    public final float G0() {
        return Float.intBitsToFloat(Y0());
    }

    @Override // p.jme
    public final int H0() {
        return a1();
    }

    @Override // p.jme
    public final long I0() {
        return b1();
    }

    @Override // p.jme
    public final int J0() {
        return Y0();
    }

    @Override // p.jme
    public final long K0() {
        return Z0();
    }

    @Override // p.jme
    public final int L0() {
        int iA1 = a1();
        return (-(iA1 & 1)) ^ (iA1 >>> 1);
    }

    @Override // p.jme
    public final long M0() {
        long jB1 = b1();
        return (-(jB1 & 1)) ^ (jB1 >>> 1);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    @Override // p.jme
    public final String N0() throws InvalidProtocolBufferException {
        int iA1 = a1();
        byte[] bArr = this.d;
        if (iA1 > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iA1 <= i - i2) {
                String str = new String(bArr, i2, iA1, n290.a);
                this.g += iA1;
                return str;
            }
        }
        if (iA1 == 0) {
            return "";
        }
        if (iA1 > this.e) {
            return new String(V0(iA1), n290.a);
        }
        e1(iA1);
        String str2 = new String(bArr, this.g, iA1, n290.a);
        this.g += iA1;
        return str2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    @Override // p.jme
    public final String O0() throws InvalidProtocolBufferException, IOException {
        int iA1 = a1();
        int i = this.g;
        int i2 = this.e;
        int i3 = i2 - i;
        byte[] bArrV0 = this.d;
        if (iA1 <= i3 && iA1 > 0) {
            this.g = i + iA1;
        } else {
            if (iA1 == 0) {
                return "";
            }
            i = 0;
            if (iA1 <= i2) {
                e1(iA1);
                this.g = iA1;
            } else {
                bArrV0 = V0(iA1);
            }
        }
        return uoi1.a.s(i, bArrV0, iA1);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    @Override // p.jme
    public final int P0() throws InvalidProtocolBufferException {
        if (o0()) {
            this.h = 0;
            return 0;
        }
        int iA1 = a1();
        this.h = iA1;
        if ((iA1 >>> 3) != 0) {
            return iA1;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    @Override // p.jme
    public final int Q0() {
        return a1();
    }

    @Override // p.jme
    public final long R0() {
        return b1();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.jme
    public final boolean T0(int i) throws InvalidProtocolBufferException, InvalidProtocolBufferException.InvalidWireTypeException {
        int iP0;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.e - this.g;
            byte[] bArr = this.d;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.g;
                    this.g = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.c();
            }
            while (i3 < 10) {
                if (this.g == this.e) {
                    e1(1);
                }
                int i6 = this.g;
                this.g = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.c();
            return true;
        }
        if (i2 == 1) {
            f1(8);
            return true;
        }
        if (i2 == 2) {
            f1(a1());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            f1(4);
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
    public final byte[] V0(int i) throws InvalidProtocolBufferException, IOException {
        byte[] bArrW0 = W0(i);
        if (bArrW0 != null) {
            return bArrW0;
        }
        int i2 = this.g;
        int i3 = this.e;
        int length = i3 - i2;
        this.i += i3;
        this.g = 0;
        this.e = 0;
        ArrayList<byte[]> arrayListX0 = X0(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListX0) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    public final byte[] W0(int i) throws InvalidProtocolBufferException, IOException {
        if (i == 0) {
            return n290.b;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i2 = this.i;
        int i3 = this.g;
        int i4 = i2 + i3 + i;
        if (i4 - Alert.DURATION_SHOW_INDEFINITELY > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.t;
        if (i4 > i5) {
            f1((i5 - i2) - i3);
            throw InvalidProtocolBufferException.f();
        }
        int i6 = this.e - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.c;
        if (i7 >= 4096 && i7 > fileInputStream.available()) {
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, this.g, bArr, 0, i6);
        this.i += this.e;
        this.g = 0;
        this.e = 0;
        while (i6 < i) {
            int i8 = fileInputStream.read(bArr, i6, i - i6);
            if (i8 == -1) {
                throw InvalidProtocolBufferException.f();
            }
            this.i += i8;
            i6 += i8;
        }
        return bArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    public final ArrayList X0(int i) throws InvalidProtocolBufferException, IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, SemanticState.Obscured);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.c.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw InvalidProtocolBufferException.f();
                }
                this.i += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    public final int Y0() throws InvalidProtocolBufferException {
        int i = this.g;
        if (this.e - i < 4) {
            e1(4);
            i = this.g;
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    public final long Z0() throws InvalidProtocolBufferException {
        int i = this.g;
        if (this.e - i < 8) {
            e1(8);
            i = this.g;
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int a1() {
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
        return (int) c1();
    }

    public final long b1() {
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
        return c1();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    public final long c1() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.g == this.e) {
                e1(1);
            }
            int i2 = this.g;
            this.g = i2 + 1;
            byte b = this.d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public final void d1() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = this.i + i;
        int i3 = this.t;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f = i4;
        this.e = i - i4;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    public final void e1(int i) throws InvalidProtocolBufferException {
        if (g1(i)) {
            return;
        }
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - this.i) - this.g) {
            throw InvalidProtocolBufferException.f();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    public final void f1(int i) throws InvalidProtocolBufferException {
        int i2 = this.e;
        int i3 = this.g;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.g = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.c;
        if (i < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i5 = this.i;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.t;
        if (i7 > i8) {
            f1((i8 - i5) - i3);
            throw InvalidProtocolBufferException.f();
        }
        this.i = i6;
        this.e = 0;
        this.g = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                long jSkip = fileInputStream.skip(j);
                if (jSkip < 0 || jSkip > j) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                }
                if (jSkip == 0) {
                    break;
                } else {
                    i4 += (int) jSkip;
                }
            } catch (Throwable th) {
                this.i += i4;
                d1();
                throw th;
            }
        }
        this.i += i4;
        d1();
        if (i4 >= i) {
            return;
        }
        int i9 = this.e;
        int i10 = i9 - this.g;
        this.g = i9;
        e1(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.e;
            if (i11 <= i12) {
                this.g = i11;
                return;
            } else {
                i10 += i12;
                this.g = i12;
                e1(1);
            }
        }
    }

    public final boolean g1(int i) throws IOException {
        int i2 = this.g;
        int i3 = i2 + i;
        int i4 = this.e;
        if (i3 <= i4) {
            eg.m(gvg.e(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.i;
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - i5) - i2 && i5 + i2 + i <= this.t) {
            byte[] bArr = this.d;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.i + i2;
                this.i = i5;
                i4 = this.e - i2;
                this.e = i4;
                this.g = 0;
            }
            int iMin = Math.min(bArr.length - i4, (Alert.DURATION_SHOW_INDEFINITELY - i5) - i4);
            FileInputStream fileInputStream = this.c;
            int i6 = fileInputStream.read(bArr, i4, iMin);
            if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i6 + "\nThe InputStream implementation is buggy.");
            }
            if (i6 > 0) {
                this.e += i6;
                d1();
                if (this.e >= i) {
                    return true;
                }
                return g1(i);
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    @Override // p.jme
    public final void j0(int i) throws InvalidProtocolBufferException {
        if (this.h != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // p.jme
    public final int n0() {
        return this.i + this.g;
    }

    @Override // p.jme
    public final boolean o0() {
        return this.g == this.e && !g1(1);
    }

    @Override // p.jme
    public final void v0(int i) {
        this.t = i;
        d1();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    @Override // p.jme
    public final int y0(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i2 = this.i + this.g + i;
        int i3 = this.t;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.f();
        }
        this.t = i2;
        d1();
        return i3;
    }
}
