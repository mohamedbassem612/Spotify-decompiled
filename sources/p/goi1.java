package p;

import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import app.p000rive.semantics.SemanticState;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class goi1 extends cto1 {
    public final /* synthetic */ byte b;

    public /* synthetic */ goi1(byte b) {
        this.b = b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    /* JADX WARN: Code duplicated, block: B:106:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[LOOP:2: B:23:0x0055->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:80:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x012d A[SYNTHETIC] */
    public final String n(int i, byte[] bArr, int i2) throws InvalidProtocolBufferException {
        int i3;
        byte b;
        int i4;
        byte b2;
        byte b3;
        byte b4;
        switch (this.b) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    t8e1.n("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                    return null;
                }
                int i5 = i + i2;
                char[] cArr = new char[i2];
                int i6 = 0;
                while (i < i5) {
                    byte b5 = bArr[i];
                    if (b5 < 0) {
                        while (i < i5) {
                            i3 = i + 1;
                            b = bArr[i];
                            if (b < 0) {
                                i4 = i6 + 1;
                                cArr[i6] = (char) b;
                                while (i3 < i5) {
                                    b2 = bArr[i3];
                                    if (b2 >= 0) {
                                        i3++;
                                        cArr[i4] = (char) b2;
                                        i4++;
                                    } else {
                                        i6 = i4;
                                        i = i3;
                                    }
                                }
                                i6 = i4;
                                i = i3;
                            } else if (b < -32) {
                                if (i3 < i5) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                i += 2;
                                byte b6 = bArr[i3];
                                int i7 = i6 + 1;
                                if (b >= -62 || cso1.A(b6)) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                cArr[i6] = (char) ((b6 & 63) | ((b & 31) << 6));
                                i6 = i7;
                            } else {
                                if (b >= -16) {
                                    if (i3 < i5 - 2) {
                                        throw InvalidProtocolBufferException.a();
                                    }
                                    b4 = bArr[i3];
                                    int i8 = i + 3;
                                    byte b7 = bArr[i + 2];
                                    i += 4;
                                    byte b8 = bArr[i8];
                                    int i9 = i6 + 1;
                                    if (!cso1.A(b4)) {
                                        if ((((b4 + 112) + (b << 28)) >> 30) != 0 && !cso1.A(b7) && !cso1.A(b8)) {
                                            int i10 = ((b4 & 63) << 12) | ((b & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                                            cArr[i6] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                                            i6 += 2;
                                        }
                                    }
                                    throw InvalidProtocolBufferException.a();
                                }
                                if (i3 < i5 - 1) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                int i11 = i + 2;
                                b3 = bArr[i3];
                                i += 3;
                                byte b9 = bArr[i11];
                                int i12 = i6 + 1;
                                if (!cso1.A(b3) || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || cso1.A(b9)))) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                cArr[i6] = (char) (((b3 & 63) << 6) | ((b & 15) << 12) | (b9 & 63));
                                i6 = i12;
                            }
                        }
                        return new String(cArr, 0, i6);
                    }
                    i++;
                    cArr[i6] = (char) b5;
                    i6++;
                }
                while (i < i5) {
                    i3 = i + 1;
                    b = bArr[i];
                    if (b < 0) {
                        if (b < -32) {
                            if (i3 < i5) {
                                throw InvalidProtocolBufferException.a();
                            }
                            i += 2;
                            byte b10 = bArr[i3];
                            int i13 = i6 + 1;
                            if (b >= -62) {
                            }
                            throw InvalidProtocolBufferException.a();
                        }
                        if (b >= -16) {
                            if (i3 < i5 - 1) {
                                throw InvalidProtocolBufferException.a();
                            }
                            int i14 = i + 2;
                            b3 = bArr[i3];
                            i += 3;
                            byte b11 = bArr[i14];
                            int i15 = i6 + 1;
                            if (cso1.A(b3)) {
                            }
                            throw InvalidProtocolBufferException.a();
                        }
                        if (i3 < i5 - 2) {
                            throw InvalidProtocolBufferException.a();
                        }
                        b4 = bArr[i3];
                        int i16 = i + 3;
                        byte b12 = bArr[i + 2];
                        i += 4;
                        byte b13 = bArr[i16];
                        int i17 = i6 + 1;
                        if (!cso1.A(b4)) {
                            if ((((b4 + 112) + (b << 28)) >> 30) != 0) {
                            }
                        }
                        throw InvalidProtocolBufferException.a();
                    }
                    i4 = i6 + 1;
                    cArr[i6] = (char) b;
                    while (i3 < i5) {
                        b2 = bArr[i3];
                        if (b2 >= 0) {
                            i3++;
                            cArr[i4] = (char) b2;
                            i4++;
                        } else {
                            i6 = i4;
                            i = i3;
                        }
                    }
                    i6 = i4;
                    i = i3;
                }
                return new String(cArr, 0, i6);
            default:
                Charset charset = j290.a;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw InvalidProtocolBufferException.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x014d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0151  */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:75:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0182  */
    /* JADX WARN: Code duplicated, block: B:83:0x0187  */
    public final int o(String str, byte[] bArr, int i, int i2) {
        int i3;
        char cCharAt;
        int i4;
        char cCharAt2;
        long j;
        long j2;
        int i5;
        char cCharAt3;
        char c = 2048;
        char c2 = 57343;
        switch (this.b) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = i7 + i;
                    if (i8 >= i6 || (cCharAt2 = str.charAt(i7)) >= 128) {
                        if (i7 == length) {
                            return i + length;
                        }
                        i3 = i + i7;
                        while (i7 < length) {
                            cCharAt = str.charAt(i7);
                            if (cCharAt >= 128 && i3 < i6) {
                                bArr[i3] = (byte) cCharAt;
                                i3++;
                            } else if (cCharAt >= 2048 && i3 <= i6 - 2) {
                                int i9 = i3 + 1;
                                bArr[i3] = (byte) ((cCharAt >>> 6) | 960);
                                i3 += 2;
                                bArr[i9] = (byte) ((cCharAt & '?') | SemanticState.Focused);
                            } else {
                                if ((cCharAt < 55296 && 57343 >= cCharAt) || i3 > i6 - 3) {
                                    if (i3 > i6 - 4) {
                                        if (55296 <= cCharAt && cCharAt <= 57343 && ((i4 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt, str.charAt(i4)))) {
                                            throw new koi1(i7, length);
                                        }
                                        hhg1.d(cCharAt, i3);
                                        return 0;
                                    }
                                    int i10 = i7 + 1;
                                    if (i10 != str.length()) {
                                        char cCharAt4 = str.charAt(i10);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt4)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt4);
                                            bArr[i3] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | SemanticState.Focused);
                                            int i11 = i3 + 3;
                                            bArr[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | SemanticState.Focused);
                                            i3 += 4;
                                            bArr[i11] = (byte) ((codePoint & 63) | SemanticState.Focused);
                                            i7 = i10;
                                        } else {
                                            i7 = i10;
                                        }
                                    }
                                    throw new koi1(i7 - 1, length);
                                }
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i12 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | SemanticState.Focused);
                                i3 += 3;
                                bArr[i12] = (byte) ((cCharAt & '?') | SemanticState.Focused);
                            }
                            i7++;
                        }
                        return i3;
                    }
                    bArr[i8] = (byte) cCharAt2;
                    i7++;
                }
                if (i7 == length) {
                    return i + length;
                }
                i3 = i + i7;
                while (i7 < length) {
                    cCharAt = str.charAt(i7);
                    if (cCharAt >= 128) {
                        if (cCharAt >= 2048) {
                            if (cCharAt < 55296) {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i13 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | SemanticState.Focused);
                                i3 += 3;
                                bArr[i13] = (byte) ((cCharAt & '?') | SemanticState.Focused);
                            } else {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i14 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | SemanticState.Focused);
                                i3 += 3;
                                bArr[i14] = (byte) ((cCharAt & '?') | SemanticState.Focused);
                            }
                        } else if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i15 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | SemanticState.Focused);
                            i3 += 3;
                            bArr[i15] = (byte) ((cCharAt & '?') | SemanticState.Focused);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i16 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | SemanticState.Focused);
                            i3 += 3;
                            bArr[i16] = (byte) ((cCharAt & '?') | SemanticState.Focused);
                        }
                    } else if (cCharAt >= 2048) {
                        if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i17 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | SemanticState.Focused);
                            i3 += 3;
                            bArr[i17] = (byte) ((cCharAt & '?') | SemanticState.Focused);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i18 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | SemanticState.Focused);
                            i3 += 3;
                            bArr[i18] = (byte) ((cCharAt & '?') | SemanticState.Focused);
                        }
                    } else if (cCharAt < 55296) {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i19 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | SemanticState.Focused);
                        i3 += 3;
                        bArr[i19] = (byte) ((cCharAt & '?') | SemanticState.Focused);
                    } else {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i110 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | SemanticState.Focused);
                        i3 += 3;
                        bArr[i110] = (byte) ((cCharAt & '?') | SemanticState.Focused);
                    }
                    i7++;
                }
                return i3;
            default:
                long j3 = i;
                long j4 = ((long) i2) + j3;
                int length2 = str.length();
                if (length2 <= i2 && bArr.length - i2 >= i) {
                    int i20 = 0;
                    while (true) {
                        j = 1;
                        if (i20 < length2 && (cCharAt3 = str.charAt(i20)) < 128) {
                            blh1.k(bArr, j3, (byte) cCharAt3);
                            i20++;
                            j3 = 1 + j3;
                        }
                    }
                    if (i20 != length2) {
                        while (i20 < length2) {
                            char cCharAt5 = str.charAt(i20);
                            if (cCharAt5 < 128 && j3 < j4) {
                                blh1.k(bArr, j3, (byte) cCharAt5);
                                j2 = j;
                                j3 += j;
                            } else if (cCharAt5 >= c || j3 > j4 - 2) {
                                j2 = j;
                                if ((cCharAt5 < 55296 || c2 < cCharAt5) && j3 <= j4 - 3) {
                                    blh1.k(bArr, j3, (byte) ((cCharAt5 >>> '\f') | 480));
                                    long j5 = j3 + 2;
                                    blh1.k(bArr, j3 + j2, (byte) (((cCharAt5 >>> 6) & 63) | SemanticState.Focused));
                                    j3 += 3;
                                    blh1.k(bArr, j5, (byte) ((cCharAt5 & '?') | SemanticState.Focused));
                                } else {
                                    if (j3 <= j4 - 4) {
                                        int i21 = i20 + 1;
                                        if (i21 != length2) {
                                            char cCharAt6 = str.charAt(i21);
                                            if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                                int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                                blh1.k(bArr, j3, (byte) ((codePoint2 >>> 18) | 240));
                                                blh1.k(bArr, j3 + j2, (byte) (((codePoint2 >>> 12) & 63) | SemanticState.Focused));
                                                long j6 = j3 + 3;
                                                blh1.k(bArr, j3 + 2, (byte) (((codePoint2 >>> 6) & 63) | SemanticState.Focused));
                                                j3 += 4;
                                                blh1.k(bArr, j6, (byte) ((codePoint2 & 63) | SemanticState.Focused));
                                                i20 = i21;
                                            } else {
                                                i20 = i21;
                                            }
                                        }
                                        throw new koi1(i20 - 1, length2);
                                    }
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i5 = i20 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
                                        throw new koi1(i20, length2);
                                    }
                                    t8e1.k(cCharAt5, j3);
                                }
                            } else {
                                j2 = j;
                                long j7 = j3 + j2;
                                blh1.k(bArr, j3, (byte) ((cCharAt5 >>> 6) | 960));
                                j3 += 2;
                                blh1.k(bArr, j7, (byte) ((cCharAt5 & '?') | SemanticState.Focused));
                            }
                            i20++;
                            j = j2;
                            c = 2048;
                            c2 = 57343;
                        }
                    }
                    return (int) j3;
                }
                t8e1.j(str.charAt(length2 - 1), i + i2);
                return 0;
        }
    }
}
