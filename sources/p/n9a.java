package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class n9a {
    public static final l9a e = new l9a(false, false, -1);
    public static final byte[] f = {13, 10};
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;

    static {
        new n9a(true, false, -1);
        new n9a(false, true, 76);
        new n9a(false, true, 64);
    }

    public n9a(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
        if (z && z2) {
            hhg1.n("Failed requirement.");
            throw null;
        }
        this.d = i / 4;
    }

    public static byte[] a(n9a n9aVar, CharSequence charSequence, int i, int i2) {
        byte[] bytes;
        int i3 = 0;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int length = charSequence.length();
        n9aVar.getClass();
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            eqr0.o(i, length, str.length());
            bytes = str.substring(i, length).getBytes(nne.e);
        } else {
            eqr0.o(i, length, charSequence.length());
            byte[] bArr = new byte[length - i];
            while (i < length) {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt <= 255) {
                    bArr[i3] = (byte) cCharAt;
                    i3++;
                } else {
                    bArr[i3] = 63;
                    i3++;
                }
                i++;
            }
            bytes = bArr;
        }
        return b(n9aVar, bytes);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x00f3 A[EDGE_INSN: B:114:0x00f3->B:60:0x00f3 BREAK  A[LOOP:1: B:55:0x00e2->B:59:0x00f0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2 A[ADDED_TO_REGION, LOOP:1: B:55:0x00e2->B:59:0x00f0, LOOP_START, PHI: r13
      0x00e2: PHI (r13v15 int) = (r13v12 int), (r13v16 int) binds: [B:53:0x00df, B:59:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0 A[LOOP:1: B:55:0x00e2->B:59:0x00f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x010c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0116  */
    /* JADX WARN: Code duplicated, block: B:71:0x011a  */
    /* JADX WARN: Code duplicated, block: B:75:0x014c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0158  */
    /* JADX WARN: Code duplicated, block: B:78:0x0168  */
    public static byte[] b(n9a n9aVar, byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        char c;
        int i7;
        int i8;
        int length = bArr.length;
        boolean z = n9aVar.b;
        boolean z2 = n9aVar.b;
        eqr0.o(0, length, bArr.length);
        int i9 = -2;
        int i10 = 1;
        if (length == 0) {
            i2 = 0;
        } else {
            if (length == 1) {
                hhg1.n(f4i1.c(length, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
                return null;
            }
            if (z) {
                i = length;
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = u9a.b[bArr[i11] & 255];
                    if (i12 < 0) {
                        if (i12 == -2) {
                            i -= length - i11;
                            break;
                        }
                        i--;
                    }
                }
            } else if (bArr[length - 1] == 61) {
                i = length - 1;
                if (bArr[length - 2] == 61) {
                    i = length - 2;
                }
            } else {
                i = length;
            }
            i2 = (int) ((((long) i) * 6) / 8);
        }
        byte[] bArr2 = new byte[i2];
        int[] iArr2 = n9aVar.a ? u9a.d : u9a.b;
        int i13 = -8;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = -8;
        while (true) {
            i10 = i10;
            if (i15 >= length) {
                i3 = 0;
                break;
            }
            if (i17 == i13) {
                i4 = 8;
                int i18 = i15 + 3;
                if (i18 < length) {
                    int i19 = iArr2[bArr[i15] & 255];
                    iArr = iArr2;
                    int i20 = i15 + 4;
                    int i21 = (iArr[bArr[i15 + 2] & 255] << 6) | (iArr2[bArr[i15 + 1] & 255] << 12) | (i19 << 18) | iArr[bArr[i18] & 255];
                    if (i21 >= 0) {
                        bArr2[i14] = (byte) (i21 >> 16);
                        int i22 = i14 + 2;
                        bArr2[i14 + 1] = (byte) (i21 >> 8);
                        i14 += 3;
                        bArr2[i22] = (byte) i21;
                        iArr2 = iArr;
                        i15 = i20;
                    }
                    i9 = -2;
                    i13 = -8;
                }
                i5 = bArr[i15] & 255;
                i6 = iArr[i5];
                if (i6 < 0) {
                    c = '=';
                    i15++;
                    i16 = (i16 << 6) | i6;
                    i7 = i17 + 6;
                    if (i7 >= 0) {
                        bArr2[i14] = (byte) (i16 >>> i7);
                        i16 &= (i10 << i7) - 1;
                        i17 -= 2;
                        i14++;
                    } else {
                        i17 = i7;
                    }
                } else {
                    if (i6 == -2) {
                        if (i17 != -8) {
                            hhg1.n(f4i1.c(i15, "Redundant pad character at index "));
                            return null;
                        }
                        if (i17 == -6) {
                            i15++;
                        } else if (i17 == -4) {
                            if (i17 != -2) {
                                eg.m("Unreachable");
                                return null;
                            }
                            i15++;
                        } else {
                            i8 = i15 + 1;
                            if (z2) {
                                while (i8 < length) {
                                    if (u9a.b[bArr[i8] & 255] != -1) {
                                        break;
                                    }
                                    i8++;
                                }
                            }
                            if (i8 != length || bArr[i8] != 61) {
                                hhg1.n(f4i1.c(i8, "Missing one pad character at index "));
                                return null;
                            }
                            i15 = i8 + 1;
                        }
                        i3 = i10;
                        i9 = -2;
                        break;
                    }
                    c = '=';
                    if (z) {
                        char c2 = (char) i5;
                        eth.h(i4);
                        throw new IllegalArgumentException("Invalid symbol '" + c2 + "'(" + Integer.toString(i5, i4) + ") at index " + i15);
                    }
                    i15++;
                }
                iArr2 = iArr;
                i9 = -2;
                i13 = -8;
            } else {
                i4 = 8;
            }
            iArr = iArr2;
            i5 = bArr[i15] & 255;
            i6 = iArr[i5];
            if (i6 < 0) {
                c = '=';
                i15++;
                i16 = (i16 << 6) | i6;
                i7 = i17 + 6;
                if (i7 >= 0) {
                    bArr2[i14] = (byte) (i16 >>> i7);
                    i16 &= (i10 << i7) - 1;
                    i17 -= 2;
                    i14++;
                } else {
                    i17 = i7;
                }
            } else {
                if (i6 == -2) {
                    if (i17 != -8) {
                        hhg1.n(f4i1.c(i15, "Redundant pad character at index "));
                        return null;
                    }
                    if (i17 == -6) {
                        i15++;
                    } else {
                        if (i17 == -4) {
                            i8 = i15 + 1;
                            if (z2) {
                                while (i8 < length) {
                                    if (u9a.b[bArr[i8] & 255] != -1) {
                                        break;
                                        break;
                                    }
                                    i8++;
                                }
                            }
                            if (i8 != length) {
                            }
                            hhg1.n(f4i1.c(i8, "Missing one pad character at index "));
                            return null;
                        }
                        if (i17 != -2) {
                            eg.m("Unreachable");
                            return null;
                        }
                        i15++;
                    }
                    i3 = i10;
                    i9 = -2;
                    break;
                }
                c = '=';
                if (z) {
                    char c3 = (char) i5;
                    eth.h(i4);
                    throw new IllegalArgumentException("Invalid symbol '" + c3 + "'(" + Integer.toString(i5, i4) + ") at index " + i15);
                }
                i15++;
            }
            iArr2 = iArr;
            i9 = -2;
            i13 = -8;
        }
        if (i17 == i9) {
            hhg1.n("The last unit of input does not have enough bits");
            return null;
        }
        if (i17 != -8 && i3 == 0) {
            hhg1.n("The padding option is set to PRESENT, but the input is not properly padded");
            return null;
        }
        if (i16 != 0) {
            hhg1.n("The pad bits must be zeros");
            return null;
        }
        if (z2) {
            while (i15 < length) {
                if (u9a.b[bArr[i15] & 255] != -1) {
                    break;
                }
                i15++;
            }
        }
        if (i15 >= length) {
            if (i14 == i2) {
                return bArr2;
            }
            eg.m("Check failed.");
            return null;
        }
        int i23 = bArr[i15] & 255;
        StringBuilder sb = new StringBuilder("Symbol '");
        sb.append((char) i23);
        sb.append("'(");
        eth.h(8);
        sb.append(Integer.toString(i23, 8));
        sb.append(") at index ");
        hhg1.n(gvg.j(sb, i15 - 1, " is prohibited after the pad character"));
        return null;
    }

    public static String c(n9a n9aVar, byte[] bArr) {
        int i;
        int length = bArr.length;
        int length2 = bArr.length;
        n9aVar.getClass();
        eqr0.o(0, length, length2);
        int iD = n9aVar.d(length);
        byte[] bArr2 = new byte[iD];
        eqr0.o(0, length, bArr.length);
        int iD2 = n9aVar.d(length);
        if (iD < 0) {
            eg.g(f4i1.c(iD, "destination offset: 0, destination size: "));
            return null;
        }
        if (iD2 < 0 || iD2 > iD) {
            eg.g(cy30.i(iD, "The destination array does not have enough capacity, destination offset: 0, destination size: ", iD2, ", capacity needed: "));
            return null;
        }
        byte[] bArr3 = n9aVar.a ? u9a.c : u9a.a;
        int i2 = n9aVar.b ? n9aVar.d : Integer.MAX_VALUE;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = i3 + 2;
            if (i >= length) {
                break;
            }
            int iMin = Math.min((length - i3) / 3, i2);
            for (int i5 = 0; i5 < iMin; i5++) {
                int i6 = bArr[i3] & 255;
                int i7 = i3 + 2;
                int i8 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i9 = (i8 << 8) | (i6 << 16) | (bArr[i7] & 255);
                bArr2[i4] = bArr3[i9 >>> 18];
                bArr2[i4 + 1] = bArr3[(i9 >>> 12) & 63];
                int i10 = i4 + 3;
                bArr2[i4 + 2] = bArr3[(i9 >>> 6) & 63];
                i4 += 4;
                bArr2[i10] = bArr3[i9 & 63];
            }
            if (iMin == i2 && i3 != length) {
                int i11 = i4 + 1;
                byte[] bArr4 = f;
                bArr2[i4] = bArr4[0];
                i4 += 2;
                bArr2[i11] = bArr4[1];
            }
        }
        int i12 = length - i3;
        if (i12 == 1) {
            int i13 = (bArr[i3] & 255) << 4;
            bArr2[i4] = bArr3[i13 >>> 6];
            bArr2[i4 + 1] = bArr3[i13 & 63];
            bArr2[i4 + 2] = 61;
            bArr2[i4 + 3] = 61;
            i3++;
        } else if (i12 == 2) {
            int i14 = ((bArr[i3 + 1] & 255) << 2) | ((bArr[i3] & 255) << 10);
            bArr2[i4] = bArr3[i14 >>> 12];
            bArr2[i4 + 1] = bArr3[(i14 >>> 6) & 63];
            bArr2[i4 + 2] = bArr3[i14 & 63];
            bArr2[i4 + 3] = 61;
            i3 = i;
        }
        if (i3 == length) {
            return new String(bArr2, nne.e);
        }
        eg.m("Check failed.");
        return null;
    }

    public final int d(int i) {
        int iX = (i / 3) * 4;
        if (i % 3 != 0) {
            iX += 4;
        }
        if (iX < 0) {
            hhg1.n("Input is too big");
            return 0;
        }
        if (this.b) {
            iX = cy30.x(iX - 1, this.c, 2, iX);
        }
        if (iX >= 0) {
            return iX;
        }
        hhg1.n("Input is too big");
        return 0;
    }
}
