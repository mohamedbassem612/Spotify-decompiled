package androidx.glance.appwidget.protobuf;

import androidx.car.app.model.Alert;
import app.p000rive.semantics.SemanticState;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p.eg;
import p.fhc;
import p.gvg;
import p.j290;
import p.ngc;
import p.roi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c extends ngc {
    public final FileInputStream c;
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    public c(FileInputStream fileInputStream) {
        super((byte) 1);
        this.j = Alert.DURATION_SHOW_INDEFINITELY;
        Charset charset = j290.a;
        this.c = fileInputStream;
        this.d = new byte[SemanticState.Obscured];
        this.e = 0;
        this.g = 0;
        this.i = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final byte[] B(int i) throws InvalidProtocolBufferException, IOException {
        byte[] bArrC = C(i);
        if (bArrC != null) {
            return bArrC;
        }
        int i2 = this.g;
        int i3 = this.e;
        int length = i3 - i2;
        this.i += i3;
        this.g = 0;
        this.e = 0;
        ArrayList<byte[]> arrayListD = D(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListD) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final byte[] C(int i) throws InvalidProtocolBufferException, IOException {
        if (i == 0) {
            return j290.b;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.c();
        }
        int i2 = this.i;
        int i3 = this.g;
        int i4 = i2 + i3 + i;
        if (i4 - Alert.DURATION_SHOW_INDEFINITELY > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.j;
        if (i4 > i5) {
            L((i5 - i2) - i3);
            throw InvalidProtocolBufferException.d();
        }
        int i6 = this.e - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.c;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e) {
                e.a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, this.g, bArr, 0, i6);
        this.i += this.e;
        this.g = 0;
        this.e = 0;
        while (i6 < i) {
            try {
                int i8 = fileInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.d();
                }
                this.i += i8;
                i6 += i8;
            } catch (InvalidProtocolBufferException e2) {
                e2.a = true;
                throw e2;
            }
        }
        return bArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final ArrayList D(int i) throws InvalidProtocolBufferException, IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, SemanticState.Obscured);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.c.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw InvalidProtocolBufferException.d();
                }
                this.i += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final int E() throws InvalidProtocolBufferException {
        int i = this.g;
        if (this.e - i < 4) {
            K(4);
            i = this.g;
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final long F() throws InvalidProtocolBufferException {
        int i = this.g;
        if (this.e - i < 8) {
            K(8);
            i = this.g;
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final long I() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.g == this.e) {
                K(1);
            }
            int i2 = this.g;
            this.g = i2 + 1;
            byte b = this.d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.b();
    }

    public final void J() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = this.i + i;
        int i3 = this.j;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f = i4;
        this.e = i - i4;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void K(int i) throws InvalidProtocolBufferException {
        if (M(i)) {
            return;
        }
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - this.i) - this.g) {
            throw InvalidProtocolBufferException.d();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void L(int i) throws InvalidProtocolBufferException {
        int i2 = this.e;
        int i3 = this.g;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.g = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.c;
        if (i < 0) {
            throw InvalidProtocolBufferException.c();
        }
        int i5 = this.i;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.j;
        if (i7 > i8) {
            L((i8 - i5) - i3);
            throw InvalidProtocolBufferException.d();
        }
        this.i = i6;
        this.e = 0;
        this.g = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
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
                } catch (InvalidProtocolBufferException e) {
                    e.a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.i += i4;
                J();
                throw th;
            }
        }
        this.i += i4;
        J();
        if (i4 >= i) {
            return;
        }
        int i9 = this.e;
        int i10 = i9 - this.g;
        this.g = i9;
        K(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.e;
            if (i11 <= i12) {
                this.g = i11;
                return;
            } else {
                i10 += i12;
                this.g = i12;
                K(1);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final boolean M(int i) throws InvalidProtocolBufferException, IOException {
        FileInputStream fileInputStream = this.c;
        int i2 = this.g;
        int i3 = i2 + i;
        int i4 = this.e;
        if (i3 <= i4) {
            eg.m(gvg.e(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.i;
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - i5) - i2 && i5 + i2 + i <= this.j) {
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
            try {
                int i6 = fileInputStream.read(bArr, i4, Math.min(bArr.length - i4, (Alert.DURATION_SHOW_INDEFINITELY - i5) - i4));
                if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i6 + "\nThe InputStream implementation is buggy.");
                }
                if (i6 > 0) {
                    this.e += i6;
                    J();
                    if (this.e >= i) {
                        return true;
                    }
                    return M(i);
                }
            } catch (InvalidProtocolBufferException e) {
                e.a = true;
                throw e;
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void a(int i) throws InvalidProtocolBufferException {
        if (this.h != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int d() {
        return this.i + this.g;
    }

    public final boolean e() {
        return this.g == this.e && !M(1);
    }

    public final void f(int i) {
        this.j = i;
        J();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final int g(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.c();
        }
        int i2 = this.i + this.g + i;
        if (i2 < 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int i3 = this.j;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.d();
        }
        this.j = i2;
        J();
        return i3;
    }

    public final boolean h() {
        return H() != 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final fhc i() throws InvalidProtocolBufferException, IOException {
        int iG = G();
        int i = this.e;
        int i2 = this.g;
        int i3 = i - i2;
        byte[] bArr = this.d;
        if (iG <= i3 && iG > 0) {
            fhc fhcVarD = fhc.d(i2, bArr, iG);
            this.g += iG;
            return fhcVarD;
        }
        if (iG == 0) {
            return fhc.c;
        }
        if (iG < 0) {
            throw InvalidProtocolBufferException.c();
        }
        byte[] bArrC = C(iG);
        if (bArrC != null) {
            return fhc.d(0, bArrC, bArrC.length);
        }
        int i4 = this.g;
        int i5 = this.e;
        int length = i5 - i4;
        this.i += i5;
        this.g = 0;
        this.e = 0;
        ArrayList<byte[]> arrayListD = D(iG - length);
        byte[] bArr2 = new byte[iG];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListD) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        fhc fhcVar = fhc.c;
        return new fhc(bArr2);
    }

    public final double j() {
        return Double.longBitsToDouble(F());
    }

    public final int k() {
        return G();
    }

    public final int l() {
        return E();
    }

    public final long m() {
        return F();
    }

    public final float n() {
        return Float.intBitsToFloat(E());
    }

    public final int o() {
        return G();
    }

    public final long p() {
        return H();
    }

    public final int q() {
        return E();
    }

    public final long r() {
        return F();
    }

    public final int s() {
        int iG = G();
        return (-(iG & 1)) ^ (iG >>> 1);
    }

    public final long t() {
        long jH = H();
        return (-(jH & 1)) ^ (jH >>> 1);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final String u() throws InvalidProtocolBufferException {
        int iG = G();
        byte[] bArr = this.d;
        if (iG > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iG <= i - i2) {
                String str = new String(bArr, i2, iG, j290.a);
                this.g += iG;
                return str;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG < 0) {
            throw InvalidProtocolBufferException.c();
        }
        if (iG > this.e) {
            return new String(B(iG), j290.a);
        }
        K(iG);
        String str2 = new String(bArr, this.g, iG, j290.a);
        this.g += iG;
        return str2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final String v() throws InvalidProtocolBufferException, IOException {
        int iG = G();
        int i = this.g;
        int i2 = this.e;
        int i3 = i2 - i;
        byte[] bArrB = this.d;
        if (iG <= i3 && iG > 0) {
            this.g = i + iG;
        } else {
            if (iG == 0) {
                return "";
            }
            if (iG < 0) {
                throw InvalidProtocolBufferException.c();
            }
            i = 0;
            if (iG <= i2) {
                K(iG);
                this.g = iG;
            } else {
                bArrB = B(iG);
            }
        }
        return roi1.a.n(i, bArrB, iG);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final int w() throws InvalidProtocolBufferException {
        if (e()) {
            this.h = 0;
            return 0;
        }
        int iG = G();
        this.h = iG;
        if ((iG >>> 3) != 0) {
            return iG;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public final int x() {
        return G();
    }

    public final long y() {
        return H();
    }
}
