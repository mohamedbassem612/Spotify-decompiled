package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class fjs0 {
    public static final char[] c = {'+'};
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public boolean a;
    public Object b;

    public fjs0(String str, boolean z) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            hhg1.n("Alphanumeric characters are always 'safe' and should not be explicitly specified");
            throw null;
        }
        String strConcat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        if (z && strConcat.contains(" ")) {
            hhg1.n("plusForSpace cannot be specified when space is a 'safe' character");
            throw null;
        }
        this.a = z;
        char[] charArray = strConcat.toCharArray();
        int iMax = -1;
        for (char c2 : charArray) {
            iMax = Math.max((int) c2, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c3 : charArray) {
            zArr[c3] = true;
        }
        this.b = zArr;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:61:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0206  */
    /* JADX WARN: Multi-variable type inference failed */
    public String a(String str) {
        int i;
        String str2;
        int i2;
        int i3;
        int i4;
        Object[] objArr;
        int i5;
        int i6;
        char cCharAt;
        int i7;
        int i8;
        int length;
        int i9;
        char[] cArr;
        Object obj;
        int codePoint;
        int i10;
        boolean[] zArr = (boolean[]) this.b;
        str.getClass();
        int length2 = str.length();
        int i11 = 0;
        while (i11 < length2) {
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 >= zArr.length || !zArr[cCharAt2]) {
                int length3 = str.length();
                char[] cArrA = lct0.a();
                int i12 = 0;
                int length4 = 0;
                while (i11 < length3) {
                    if (i11 >= length3) {
                        eg.g("Index exceeds specified range");
                        return null;
                    }
                    int i13 = i11 + 1;
                    char cCharAt3 = str.charAt(i11);
                    if (cCharAt3 < 55296 || cCharAt3 > 57343) {
                        str2 = null;
                        i2 = 0;
                        i3 = cCharAt3;
                    } else {
                        str2 = null;
                        i2 = 0;
                        if (cCharAt3 > 56319) {
                            throw new IllegalArgumentException("Unexpected low surrogate character '" + cCharAt3 + "' with value " + ((int) cCharAt3) + " at index " + i11 + " in '" + ((Object) str) + "'");
                        }
                        if (i13 == length3) {
                            i10 = -cCharAt3;
                        } else {
                            char cCharAt4 = str.charAt(i13);
                            if (!Character.isLowSurrogate(cCharAt4)) {
                                throw new IllegalArgumentException("Expected low surrogate but got char '" + cCharAt4 + "' with value " + ((int) cCharAt4) + " at index " + i13 + " in '" + ((Object) str) + "'");
                            }
                            codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                        }
                    }
                    if (i3 < 0) {
                        i3 = codePoint;
                        i3 = i10;
                        hhg1.n("Trailing high surrogate at end of input");
                        return str2;
                    }
                    i3 = codePoint;
                    if (i3 >= zArr.length || !zArr[i3]) {
                        if (i3 == 32 && this.a) {
                            obj = c;
                        } else {
                            char[] cArr2 = d;
                            i4 = 1;
                            if (i3 <= 127) {
                                char[] cArr3 = new char[3];
                                cArr3[i2] = '%';
                                cArr3[2] = cArr2[i3 & 15];
                                cArr3[1] = cArr2[i3 >>> 4];
                                objArr = cArr3;
                            } else if (i3 <= 2047) {
                                char[] cArr4 = new char[6];
                                cArr4[i2] = '%';
                                cArr4[3] = '%';
                                cArr4[5] = cArr2[i3 & 15];
                                cArr4[4] = cArr2[((i3 >>> 4) & 3) | 8];
                                cArr4[2] = cArr2[(i3 >>> 6) & 15];
                                cArr4[1] = cArr2[12 | (i3 >>> 10)];
                                objArr = cArr4;
                            } else if (i3 <= 65535) {
                                char[] cArr5 = new char[9];
                                cArr5[i2] = '%';
                                cArr5[1] = 'E';
                                cArr5[3] = '%';
                                cArr5[6] = '%';
                                cArr5[8] = cArr2[i3 & 15];
                                cArr5[7] = cArr2[((i3 >>> 4) & 3) | 8];
                                cArr5[5] = cArr2[(i3 >>> 6) & 15];
                                cArr5[4] = cArr2[((i3 >>> 10) & 3) | 8];
                                cArr5[2] = cArr2[i3 >>> 12];
                                objArr = cArr5;
                            } else {
                                if (i3 > 1114111) {
                                    hhg1.n(f4i1.c(i3, "Invalid unicode character value "));
                                    return str2;
                                }
                                char[] cArr6 = new char[12];
                                cArr6[i2] = '%';
                                cArr6[1] = 'F';
                                cArr6[3] = '%';
                                cArr6[6] = '%';
                                cArr6[9] = '%';
                                cArr6[11] = cArr2[i3 & 15];
                                cArr6[10] = cArr2[((i3 >>> 4) & 3) | 8];
                                cArr6[8] = cArr2[(i3 >>> 6) & 15];
                                cArr6[7] = cArr2[((i3 >>> 10) & 3) | 8];
                                cArr6[5] = cArr2[(i3 >>> 12) & 15];
                                cArr6[4] = cArr2[((i3 >>> 16) & 3) | 8];
                                cArr6[2] = cArr2[(i3 >>> 18) & 7];
                                objArr = cArr6;
                            }
                        }
                        if (Character.isSupplementaryCodePoint(i3)) {
                            i5 = 2;
                        } else {
                            i5 = i4;
                        }
                        i6 = i5 + i11;
                        if (objArr != 0) {
                            i7 = i11 - i12;
                            i8 = length4 + i7;
                            length = objArr.length + i8;
                            if (cArrA.length < length) {
                                i9 = (length3 - i11) + length + 32;
                                if (i9 >= 0) {
                                    eg.f("Cannot increase internal buffer any further");
                                    return str2;
                                }
                                cArr = new char[i9];
                                if (length4 > 0) {
                                    int i14 = i2;
                                    System.arraycopy(cArrA, i14, cArr, i14, length4);
                                }
                                cArrA = cArr;
                            }
                            if (i7 > 0) {
                                str.getChars(i12, i11, cArrA, length4);
                                length4 = i8;
                            }
                            if (objArr.length > 0) {
                                System.arraycopy(objArr, 0, cArrA, length4, objArr.length);
                                length4 += objArr.length;
                            }
                            i12 = i6;
                        }
                        i11 = i6;
                        while (i11 < length3) {
                            cCharAt = str.charAt(i11);
                            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                                break;
                            }
                            i11++;
                        }
                    } else {
                        i3 = i10;
                        obj = str2;
                    }
                    i4 = 1;
                    objArr = obj;
                    if (Character.isSupplementaryCodePoint(i3)) {
                        i5 = 2;
                    } else {
                        i5 = i4;
                    }
                    i6 = i5 + i11;
                    if (objArr != 0) {
                        i7 = i11 - i12;
                        i8 = length4 + i7;
                        length = objArr.length + i8;
                        if (cArrA.length < length) {
                            i9 = (length3 - i11) + length + 32;
                            if (i9 >= 0) {
                                eg.f("Cannot increase internal buffer any further");
                                return str2;
                            }
                            cArr = new char[i9];
                            if (length4 > 0) {
                                int i15 = i2;
                                System.arraycopy(cArrA, i15, cArr, i15, length4);
                            }
                            cArrA = cArr;
                        }
                        if (i7 > 0) {
                            str.getChars(i12, i11, cArrA, length4);
                            length4 = i8;
                        }
                        if (objArr.length > 0) {
                            System.arraycopy(objArr, 0, cArrA, length4, objArr.length);
                            length4 += objArr.length;
                        }
                        i12 = i6;
                    }
                    i11 = i6;
                    while (i11 < length3) {
                        cCharAt = str.charAt(i11);
                        if (cCharAt >= zArr.length) {
                            break;
                        }
                        break;
                        break;
                    }
                }
                int i16 = length3 - i12;
                if (i16 > 0) {
                    int i17 = i16 + length4;
                    if (cArrA.length >= i17) {
                        i = 0;
                    } else {
                        if (i17 < 0) {
                            eg.f("Cannot increase internal buffer any further");
                            return null;
                        }
                        char[] cArr7 = new char[i17];
                        if (length4 > 0) {
                            i = 0;
                            System.arraycopy(cArrA, 0, cArr7, 0, length4);
                        } else {
                            i = 0;
                        }
                        cArrA = cArr7;
                    }
                    str.getChars(i12, length3, cArrA, length4);
                    length4 = i17;
                } else {
                    i = 0;
                }
                return new String(cArrA, i, length4);
            }
            i11++;
        }
        return str;
    }

    public void b() {
        this.a = true;
    }

    public void c() {
        this.a = false;
    }

    public void d() {
        this.a = false;
    }

    public void e(byte b) {
        ((o490) this.b).writeLong(b);
    }

    public void f(char c2) {
        ((o490) this.b).g(c2);
    }

    public void g(int i) {
        ((o490) this.b).writeLong(i);
    }

    public void h(long j) {
        ((o490) this.b).writeLong(j);
    }

    public void i(String str) {
        ((o490) this.b).s(str);
    }

    public void j(short s) {
        ((o490) this.b).writeLong(s);
    }

    public void k(String str) {
        ((o490) this.b).p(str);
    }

    public void n(kqo1 kqo1Var) {
        if (this.a) {
            vsn1.h();
            return;
        }
        try {
            ((iog1) this.b).b(r09.a(kqo1Var));
        } catch (Throwable unused) {
            vsn1.h();
        }
    }

    public void l() {
    }

    public void m() {
    }

    public fjs0(o490 o490Var) {
        this.b = o490Var;
        this.a = true;
    }

    public fjs0(List list, boolean z) {
        this.b = list;
        this.a = z;
        if (list.isEmpty()) {
            hhg1.n("credentialOptions should not be empty");
            throw null;
        }
    }
}
