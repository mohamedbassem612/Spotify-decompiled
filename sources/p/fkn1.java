package p;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class fkn1 {
    public static final /* synthetic */ int a = 0;

    static {
        int i = phn1.a;
    }

    public static boolean a(int i, byte[] bArr, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return true;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                i = i3;
            } else {
                if (b < -32) {
                    if (i3 < i2 && b >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return false;
                }
                if (b >= -16) {
                    if (i3 >= i2 - 2) {
                        return false;
                    }
                    int i4 = i + 2;
                    byte b2 = bArr[i3];
                    if (b2 <= -65) {
                        if ((((b2 + 112) + (b << 28)) >> 30) == 0) {
                            int i5 = i + 3;
                            if (bArr[i4] <= -65) {
                                i += 4;
                                if (bArr[i5] > -65) {
                                }
                            }
                        }
                    }
                    return false;
                }
                if (i3 >= i2 - 1) {
                    return false;
                }
                int i6 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65 || (b == -32 && b3 < -96)) {
                    return false;
                }
                if (b == -19 && b3 >= -96) {
                    return false;
                }
                i += 3;
                if (bArr[i6] > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 2048) {
                try {
                    int length2 = str.length();
                    while (i2 < length2) {
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 2048) {
                            i += (127 - cCharAt2) >>> 31;
                        } else {
                            i += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i2) < 65536) {
                                    throw new ekn1(qhn1.b(length2, i2, (byte) 32, "Unpaired surrogate at index ", " of "));
                                }
                                i2++;
                            }
                        }
                        i2++;
                    }
                    i3 += i;
                    break;
                } catch (ekn1 unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        long j = ((long) i3) + 4294967296L;
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 34);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0090  */
    /* JADX WARN: Code duplicated, block: B:44:0x0091 A[PHI: r5
      0x0091: PHI (r5v6 byte) = (r5v5 byte), (r5v9 byte) binds: [B:41:0x008c, B:43:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:84:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00a9 A[SYNTHETIC] */
    public static String c(int i, byte[] bArr, int i2) {
        if (i2 == 0) {
            return "";
        }
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) < 0) {
            t8e1.n("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (b < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                cArr[i4] = (char) b2;
                i4++;
                i = i5;
                while (i < i3) {
                    byte b3 = bArr[i];
                    if (b3 < 0) {
                        break;
                    }
                    i++;
                    cArr[i4] = (char) b3;
                    i4++;
                }
            } else {
                if (b2 >= -32) {
                    if (b2 >= -16) {
                        if (i5 >= i3 - 2) {
                            x4n1.g("Protocol message had invalid UTF-8.");
                            return null;
                        }
                        byte b4 = bArr[i5];
                        int i6 = i + 3;
                        byte b5 = bArr[i + 2];
                        i += 4;
                        byte b6 = bArr[i6];
                        if (!i3o1.q(b4)) {
                            if ((((b4 + 112) + (b2 << 28)) >> 30) == 0 && !i3o1.q(b5) && !i3o1.q(b6)) {
                                int i7 = ((b4 & 63) << 12) | ((b2 & 7) << 18) | ((b5 & 63) << 6) | (b6 & 63);
                                cArr[i4] = (char) ((i7 >>> 10) + 55232);
                                cArr[i4 + 1] = (char) ((i7 & 1023) + 56320);
                                i4 += 2;
                            }
                        }
                        x4n1.g("Protocol message had invalid UTF-8.");
                        return null;
                    }
                    if (i5 >= i3 - 1) {
                        x4n1.g("Protocol message had invalid UTF-8.");
                        return null;
                    }
                    int i8 = i4 + 1;
                    int i9 = i + 2;
                    byte b7 = bArr[i5];
                    i += 3;
                    byte b8 = bArr[i9];
                    if (!i3o1.q(b7)) {
                        if (b2 != -32) {
                            if (b2 != -19) {
                                if (!i3o1.q(b8)) {
                                    cArr[i4] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i4 = i8;
                                }
                            } else if (b7 < -96) {
                                b2 = -19;
                                if (!i3o1.q(b8)) {
                                    cArr[i4] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i4 = i8;
                                }
                            }
                        } else if (b7 >= -96) {
                            b2 = -32;
                            if (b2 != -19) {
                                if (!i3o1.q(b8)) {
                                    cArr[i4] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i4 = i8;
                                }
                            } else if (b7 < -96) {
                                b2 = -19;
                                if (!i3o1.q(b8)) {
                                    cArr[i4] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i4 = i8;
                                }
                            }
                        }
                    }
                    x4n1.g("Protocol message had invalid UTF-8.");
                    return null;
                }
                if (i5 >= i3) {
                    x4n1.g("Protocol message had invalid UTF-8.");
                    return null;
                }
                int i10 = i4 + 1;
                i += 2;
                byte b9 = bArr[i5];
                if (b2 < -62 || i3o1.q(b9)) {
                    x4n1.g("Protocol message had invalid UTF-8.");
                    return null;
                }
                cArr[i4] = (char) ((b9 & 63) | ((b2 & 31) << 6));
                i4 = i10;
            }
        }
        return new String(cArr, 0, i4);
    }
}
