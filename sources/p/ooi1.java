package p;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ooi1 extends gto1 {
    public static boolean D() {
        return clh1.f && clh1.e;
    }

    public static int E(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            gto1 gto1Var = soi1.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return soi1.b(i, clh1.e(j, bArr));
        }
        if (i2 == 2) {
            return soi1.c(i, clh1.e(j, bArr), clh1.e(j + 1, bArr));
        }
        hhg1.c();
        return 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    @Override // p.gto1
    public final String r(int i, byte[] bArr, int i2) throws InvalidProtocolBufferException {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            t8e1.n("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte bE = clh1.e(i, bArr);
            if (bE < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) bE;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte bE2 = clh1.e(i, bArr);
            if (bE2 >= 0) {
                int i7 = i5 + 1;
                cArr[i5] = (char) bE2;
                while (i6 < i3) {
                    byte bE3 = clh1.e(i6, bArr);
                    if (bE3 < 0) {
                        break;
                    }
                    i6++;
                    cArr[i7] = (char) bE3;
                    i7++;
                }
                i5 = i7;
                i = i6;
            } else if (bE2 < -32) {
                if (i6 >= i3) {
                    throw InvalidProtocolBufferException.a();
                }
                i += 2;
                eso1.x(bE2, clh1.e(i6, bArr), cArr, i5);
                i5++;
            } else if (bE2 < -16) {
                if (i6 >= i3 - 1) {
                    throw InvalidProtocolBufferException.a();
                }
                int i8 = i + 2;
                i += 3;
                eso1.w(bE2, clh1.e(i6, bArr), clh1.e(i8, bArr), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw InvalidProtocolBufferException.a();
                }
                byte bE4 = clh1.e(i6, bArr);
                int i9 = i + 3;
                byte bE5 = clh1.e(i + 2, bArr);
                i += 4;
                eso1.v(bE2, bE4, bE5, clh1.e(i9, bArr), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.loi1 */
    @Override // p.gto1
    public final int v(String str, byte[] bArr, int i, int i2) throws loi1 {
        long j;
        long j2;
        int i3;
        char cCharAt;
        long j3 = i;
        long j4 = ((long) i2) + j3;
        int length = str.length();
        if (length > i2 || bArr.length - i2 < i) {
            t8e1.j(str.charAt(length - 1), i + i2);
            return 0;
        }
        int i4 = 0;
        while (true) {
            j = 1;
            if (i4 >= length || (cCharAt = str.charAt(i4)) >= 128) {
                break;
            }
            clh1.k(bArr, j3, (byte) cCharAt);
            i4++;
            j3 = 1 + j3;
        }
        if (i4 == length) {
            return (int) j3;
        }
        while (i4 < length) {
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 < 128 && j3 < j4) {
                clh1.k(bArr, j3, (byte) cCharAt2);
                j2 = j;
                j3 += j;
            } else if (cCharAt2 >= 2048 || j3 > j4 - 2) {
                j2 = j;
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j3 > j4 - 3) {
                    if (j3 > j4 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                            throw new loi1(i4, length);
                        }
                        t8e1.k(cCharAt2, j3);
                        return 0;
                    }
                    int i5 = i4 + 1;
                    if (i5 != length) {
                        char cCharAt3 = str.charAt(i5);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            clh1.k(bArr, j3, (byte) ((codePoint >>> 18) | 240));
                            clh1.k(bArr, j3 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j5 = j3 + 3;
                            clh1.k(bArr, 2 + j3, (byte) (((codePoint >>> 6) & 63) | 128));
                            j3 += 4;
                            clh1.k(bArr, j5, (byte) ((codePoint & 63) | 128));
                            i4 = i5;
                        } else {
                            i4 = i5;
                        }
                    }
                    throw new loi1(i4 - 1, length);
                }
                clh1.k(bArr, j3, (byte) ((cCharAt2 >>> '\f') | 480));
                long j6 = 2 + j3;
                clh1.k(bArr, j3 + j2, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                j3 += 3;
                clh1.k(bArr, j6, (byte) ((cCharAt2 & '?') | 128));
            } else {
                j2 = j;
                long j7 = j3 + j2;
                clh1.k(bArr, j3, (byte) ((cCharAt2 >>> 6) | 960));
                j3 += 2;
                clh1.k(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
            }
            i4++;
            j = j2;
        }
        return (int) j3;
    }

    @Override // p.gto1
    public final int z(int i, byte[] bArr, int i2) {
        int i3;
        if ((i | i2 | (bArr.length - i2)) < 0) {
            t8e1.n("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
            return 0;
        }
        long j = i;
        int i4 = (int) (((long) i2) - j);
        if (i4 >= 16) {
            long j2 = j;
            i3 = 0;
            while (true) {
                if (i3 >= i4) {
                    i3 = i4;
                    break;
                }
                long j3 = j2 + 1;
                if (clh1.e(j2, bArr) < 0) {
                    break;
                }
                i3++;
                j2 = j3;
            }
        } else {
            i3 = 0;
        }
        int i5 = i4 - i3;
        long j4 = j + ((long) i3);
        while (true) {
            byte bE = 0;
            while (i5 > 0) {
                long j5 = j4 + 1;
                bE = clh1.e(j4, bArr);
                if (bE < 0) {
                    j4 = j5;
                    break;
                }
                i5--;
                j4 = j5;
            }
            if (i5 == 0) {
                return 0;
            }
            int i6 = i5 - 1;
            if (bE < -32) {
                if (i6 == 0) {
                    return bE;
                }
                i5 -= 2;
                if (bE < -62) {
                    return -1;
                }
                long j6 = j4 + 1;
                if (clh1.e(j4, bArr) > -65) {
                    return -1;
                }
                j4 = j6;
            } else if (bE < -16) {
                if (i6 < 2) {
                    return E(j4, bArr, bE, i6);
                }
                i5 -= 3;
                long j7 = j4 + 1;
                byte bE2 = clh1.e(j4, bArr);
                if (bE2 > -65) {
                    return -1;
                }
                if (bE == -32 && bE2 < -96) {
                    return -1;
                }
                if (bE == -19 && bE2 >= -96) {
                    return -1;
                }
                j4 += 2;
                if (clh1.e(j7, bArr) > -65) {
                    return -1;
                }
            } else {
                if (i6 < 3) {
                    return E(j4, bArr, bE, i6);
                }
                i5 -= 4;
                long j8 = j4 + 1;
                byte bE3 = clh1.e(j4, bArr);
                if (bE3 > -65) {
                    return -1;
                }
                if ((((bE3 + 112) + (bE << 28)) >> 30) != 0) {
                    return -1;
                }
                long j9 = 2 + j4;
                if (clh1.e(j8, bArr) > -65) {
                    return -1;
                }
                j4 += 3;
                if (clh1.e(j9, bArr) > -65) {
                    return -1;
                }
            }
        }
    }
}
